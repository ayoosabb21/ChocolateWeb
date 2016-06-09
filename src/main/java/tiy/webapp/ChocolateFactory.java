package tiy.webapp;

/**
 * Created by willi on 6/3/2016.
 */
public class ChocolateFactory {
            public int smalls;
            public int bigs;
            public boolean hasSolution = false;

    public  ChocolateFactory(int smalls, int bigs) {


    }
        public void setNoSolution () {
            smalls = -1;
            bigs = -1;
            hasSolution = false;
        }

        public void setSolution ( int smalls, int bigs){
            hasSolution = true;
            this.smalls = smalls;
            this.bigs = bigs;
        }

    }

