package kadai_015;
		
		public class Car_Chapter15{
			private int gear ;
			private int speed ;
			
			public Car_Chapter15() {
				this.gear =1;
				this.speed =10;
			}
			
			
			public void gearChange(int afterGear) {
				int previousGear =this.gear;
				this.gear =afterGear;
				this.speed= switch(this.gear) {
				case 1 -> this.speed = 10;
				case 2 -> this.speed = 20;
				case 3 -> this.speed = 30;
				case 4 -> this.speed = 40;
				case 5 -> this.speed = 50;
				default -> this.speed = 10;
				
				};
				System.out.println("ギア"+ previousGear +"から" + afterGear +"に変更されました。");
			}
			
	
			
			public void run() {

				System.out.println("速度は時速" + this.speed + "kmです");
			
				}
			public static void main(String[] args) {
				Car_Chapter15 car = new Car_Chapter15();
				car.gearChange(3);
				car.run();
			}


				
			}
		
			


