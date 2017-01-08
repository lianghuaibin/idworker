package com.jd.jrrisk.web.idworker;

/**
 * IdWorkerBuilder
 *
 * @author lianghuaibin(5/1/16)
 */
public class IdWorkerFactory {

    public static IdWorker create(int ... indexes) {
        return new StardardIdWorker(indexes);
    }
}
