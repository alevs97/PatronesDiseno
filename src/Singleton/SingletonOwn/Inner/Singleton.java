package Singleton.SingletonOwn.Inner;

class Singleton {

    private static class SingletonHolder {
        public static Singleton instance = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
