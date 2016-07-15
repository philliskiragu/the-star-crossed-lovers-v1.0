package org.renpy.android;

public class Constants {
	// Used by the google play store.
    public static String PLAY_BASE64_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhtafYVwl3dTLEDbHJ0Ntwl+XuyejEEVJhHP9p6fzKUSuyBkmJ9p6mV9btYBSG8k0YEUK4iai69qU1501JcEq8i8GQfF8hkSTk0pGsUD+cDy4Mk5vsE8n6u/Epj1pw+wD+kseySPdnAhj4lHMeF7jASldEN+Wum/ZNPRNd9xTVXZLpqPQKDjsttFi9966c2zKGU4bR/fjHVQ1twbemH0lTd2RZ/zuwsD/9C3nsDHqpEkWRFkeII3GO+okmJJFtmw2jnm/jGuxW9DXIxGwAxwjNHAvai6q2rp+tK0P67myCj2u64t41eCrai7jbIb1NG60/UWfdMMnWJRy9JYp6H8XRQIDAQAB";
    public static byte[] PLAY_SALT = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

    // Used by the expansion downloader.
    public static int fileVersion = 100;
    public static int fileSize = 0;

    // Used by the in-app purchasing code.
    public static String store = "play";
}