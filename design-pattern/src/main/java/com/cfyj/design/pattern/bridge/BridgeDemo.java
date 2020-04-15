//package com.cfyj.design.pattern.bridge;
//
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Map;
//
///**
// * 桥接模式
// * @author chenfeng
// *	模式电脑和操作系统之间的桥接模式
// *
// */
//public class BridgeDemo {
//
//	public static void main(String[] args) {
//		
//		ComputerAbstraction maccomputer = new MacComputerAbstraction();
//		ComputerAbstraction windowscomputer = new HuaWeiComputerAbstraction();
//		OSOperatingystemImplementor implementor1 = new OSOperatingystemImplementor();
//		LinuxOperatingystemImplementor implementor2= new LinuxOperatingystemImplementor();
//		maccomputer.setImplementor(implementor2);
//		maccomputer.open();
//		
//		windowscomputer.setImplementor(implementor1);
//		windowscomputer.open();
//		Map  map = Collections.synchronizedMap(map);
//	}
//}
//
///**
// * 电脑类,内部维护了接口-操作系统
// * @author chenfeng
// *
// */
//abstract class ComputerAbstraction{
//	 OperatingystemImplementor implementor;
//	
//	public void setImplementor(OperatingystemImplementor implementor) {
//		this.implementor = implementor;
//	}
// abstract void open() ;
//}
//
///**
// * 操作系统接口,
// * @author chenfeng
// *
// */
//interface	OperatingystemImplementor{
//	void start();
//}
///**
// *具体品牌的电脑
// * @author chenfeng
// *
// */
//class MacComputerAbstraction extends	ComputerAbstraction{
//
//	@Override
//	void open() {
//		System.out.println("mac电脑开机");
//		implementor.start();
//	}
//	
//}
//
//class HuaWeiComputerAbstraction extends	ComputerAbstraction{
//
//	@Override
//	void open() {
//		System.out.println("华为电脑开机");
//		implementor.start();
//	}
//}
//
//class OSOperatingystemImplementor implements OperatingystemImplementor{
//
//	@Override
//	public void start() {
//		System.out.println("启动MacOS系统");
//	}
//}
//
//class LinuxOperatingystemImplementor implements OperatingystemImplementor{
//
//	@Override
//	public void start() {
//		System.out.println("启动Linux系统");
//	}
//}
//
//class WindowsOperatingystemImplementor implements OperatingystemImplementor{
//
//	@Override
//	public void start() {
//		System.out.println("启动Windows系统");
//	}
//}
//
//
