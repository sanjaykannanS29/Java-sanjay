interface father{
    int a = 10;
    abstract void call();
}

interface mother{
    int a = 10;
    abstract void call();
}

class calll implements father,mother{
    public void call(){
        System.out.println("calling");
    }
}

class soninterface extends calll{
    public static void main(String[] args){
        calll obj = new calll();
        obj.call();
        System.out.println("Value of a: " + father.a);
    }
}