package cn.wolfcode.crud.util;

public class StringUtils {

	private StringUtils() {
	}

	public static boolean hasLength(String str) {
		return str != null && str.trim().length() != 0;
	}
}
