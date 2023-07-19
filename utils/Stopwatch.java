package utils;

/**
 * @param
 * @author chenx
 * @return  程序执行用户（单位: 秒）
 * @description 一个计算程序执行时长的工具
 * @create 2022-04-27 2:59
 */
public class Stopwatch {
    private final long start;
    public Stopwatch() {
//        执行构造器时为开始时间
        start = System.currentTimeMillis();
    }
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
