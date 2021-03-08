package com.lhb.idworker;

/**
 * Generate ID
 * @author lianghuaibin
 * @since 1.0.0(Jun 26, 2015)
 */
public interface IdWorker {

    int MIN_HANDLER_ID = IdWorkerHandler.MIN_WORKER_INDEX;

    int MAX_HANDLER_ID = IdWorkerHandler.MAX_WORKER_INDEX;

    long nextId();
}