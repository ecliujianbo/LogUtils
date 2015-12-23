package com.liu.loglibs;

import android.util.Log;

/**
 * 调试程序信息,通过双击log日志，跳转到源码相应的位置
 *
 * 通过LogUtil.TAG来设置过滤的TAG
 * 
 * @author liu 2013-6-5
 */
public class LogUtil {

	public static String TAG = "liu";

	public final static boolean DEBUG = true;

	public static void logV(String strLog) {
		if (DEBUG) {
			StackTraceElement invoker = getInvoker();
			// Log.v(TAG, "【" + className + "." + invoker.getMethodName() + ":"
			// + invoker.getLineNumber() + "】" + strLog);
			Log.d(TAG, getLogString(invoker, strLog));
		}
	}

	public static void logD(String strLog) {
		if (DEBUG) {
			StackTraceElement invoker = getInvoker();
			Log.d(TAG, getLogString(invoker, strLog));
		}
	}

	public static void logI(String strLog) {
		if (DEBUG) {
			StackTraceElement invoker = getInvoker();
			Log.i(TAG, getLogString(invoker, strLog));
		}
	}

	public static void logE(Exception e) {
		if (DEBUG) {
			StackTraceElement invoker = getInvoker();
			Log.e(TAG, getLogString(invoker, e.toString()));
		}
	}

	public static void logE(String strLog) {
		if (DEBUG) {
			StackTraceElement invoker = getInvoker();
			Log.e(TAG, getLogString(invoker, strLog));
		}
	}

	private static StackTraceElement getInvoker() {
		return Thread.currentThread().getStackTrace()[4];
	}

	private static String getLogString(StackTraceElement methodStack, String message) {
		String log = message;
		if (log == null) {
			log = "";
		}
		return callLogDetail(methodStack) + '\n' + log;
	}

	/**
	 * Realization of double click jump events.
	 * 
	 * @return
	 */
	private static String callLogDetail(StackTraceElement methodStack) {
		String result = "at ";
		// StackTraceElement thisMethodStack = (new
		// Exception()).getStackTrace()[2];
		result += methodStack.getClassName() + ".";
		result += methodStack.getMethodName();
		result += "(" + methodStack.getFileName();
		result += ":" + methodStack.getLineNumber() + ") ";
		return result;
	}
}
