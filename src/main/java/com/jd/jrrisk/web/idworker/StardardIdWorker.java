package com.jd.jrrisk.web.idworker;

/**
 * StardardIdWorker
 *
 * @author lianghuaibin(5/1/16)
 */
public class StardardIdWorker implements IdWorker {

    private IdWorkerHandler handler;

    public StardardIdWorker(int ... indexes) {
        handler = new IdWorkerHandler(indexes);
    }

    public int getMaxIndex() {
        return IdWorkerHandler.MAX_WORKER_INDEX;
    }


    @Override
    public long nextId() {
        return this.handler.nextId();
    }

    public static void main(String[] args) {
        IdWorker idWorker = new StardardIdWorker();
        for (int i =0;i<10;i++){
            System.out.println(idWorker.nextId());
        }
    }
}
