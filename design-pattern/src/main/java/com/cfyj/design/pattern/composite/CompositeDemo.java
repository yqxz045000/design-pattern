package com.cfyj.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合设计模式,模拟树形文件系统
 * 	理解:组合模式 从我现阶段的理解,更应该翻译为聚合模式,将个体聚合成为一个统一的整体,抽象其公有特性,对外具有一致的体现.
 * 
 * @author chenfeng
 *
 */
public class CompositeDemo {

	public static void main(String[] args) {

		FSComponent fs = initTree();
//		System.out.println("name:" + fs.name);
		fs.printFS();

	}

	public static FSComponent initTree() {
		FSLeaf fsLeaf_sf_qq = new FSLeaf("QQ");
		FSLeaf fsLeaf_sf_wx = new FSLeaf("WX");

		FSLeaf fsLeaf_dp_jdk = new FSLeaf("JDK");
		FSLeaf fsLeaf_dp_sts = new FSLeaf("STS");

		FSComposite fsComposite_sf = new FSComposite("软件集合");
		FSComposite fsComposite_dp = new FSComposite("开发集合");

		fsComposite_sf.add(fsLeaf_sf_qq);
		fsComposite_sf.add(fsLeaf_sf_wx);

		fsComposite_dp.add(fsLeaf_dp_jdk);
		fsComposite_dp.add(fsLeaf_dp_sts);

		FSComposite fsComposite_root = new FSComposite("C盘");
		fsComposite_root.add(fsComposite_sf);
		fsComposite_root.add(fsComposite_dp);

		return fsComposite_root;
	}

}

//抽象组件,对外呈现统一特性
abstract class FSComponent {
	String name;

	void add(FSComponent leaf) {
		throw new UnsupportedOperationException("不支持增加操作");
	}

	String name() {
		throw new UnsupportedOperationException("不支持获取名称操作");
	}

	void printFS() {
		throw new UnsupportedOperationException("不支持输出文件系统操作");
	}

}

//叶子节点,既最小原子节点
class FSLeaf extends FSComponent {

	private String content = "";

	// 修改文件内容
	public void vi(String content) {
		this.content = content;
		System.out.println("修改文件内容为:" + content);
	}

	public void print() {
		System.out.println(content);
	}

	FSLeaf(String name) {
		super.name = name;
	}
}

//组合构件,作为一个容器,聚合所有的叶子节点,并实现抽象定义
class FSComposite extends FSComponent {
	private List<FSComponent> leafList = new ArrayList<FSComponent>();

	@Override
	void add(FSComponent leaf) {
		leafList.add(leaf);
	}

	@Override
	String name() {
		return super.name;
	}

	@Override
	void printFS() {
		System.out.println( this.name);
		printFS(this, 0);
	}

	void printFS(FSComponent fs, int level) {
		++level;
		if (fs instanceof FSComposite) {
			FSComposite fsdir = (FSComposite) fs;
			for (int i = 0; i < fsdir.getLeafList().size(); i++) {

				System.out.println(getLevel(level)+ fsdir.getLeafList().get(i).name);
				if (fsdir.getLeafList().get(i) instanceof FSComposite) {
					printFS(fsdir.getLeafList().get(i), level);
				}

			}

		} else {
			System.out.println("name:" + fs.name);
		}

	}

	private String getLevel(int level) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < level; i++) {
			sb.append("- ");
		}
		return sb.toString();
	}

	FSComposite(String name) {
		super.name = name;
	}

	public List<FSComponent> getLeafList() {
		return leafList;
	}
}
