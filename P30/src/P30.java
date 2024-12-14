class P30 {
    public static void main(String[] args) {
        Car car1 = new Car();

        try {
            car1.setCar(1234, -10.0); // 故意輸入負汽油量以觸發異常
        } catch (CarException e) {
            System.out.println("拋出 " + e + " 了");
        }

        car1.show(); // 顯示車輛資訊
    }
}

class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("已生產了汽車");
    }

    public void setCar(int n, double g) throws CarException {
        if (g < 0) {
            throw new CarException("汽油量不能為負數: " + g);
        } else {
            num = n;
            gas = g;
            System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
        }
    }

    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}

class CarException extends Exception {
    public CarException(String message) {
        super(message); // 傳遞訊息到 Exception 類別
    }
}
