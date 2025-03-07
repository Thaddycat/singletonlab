class SingletonThread implements Runnable {
    @Override
    public void run() {
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        System.out.println("Singleton instance hashcode: " + singleton.hashCode());
    }
}