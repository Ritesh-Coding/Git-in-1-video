class Service{
    int serve;

    public Service(){
        serve = 1.1;
    }
    public void getService(){
        System.out.print(serve);
    }

    public static void main(String []args) {
        Service s = new Service();
        s.getService();
            
    }
}