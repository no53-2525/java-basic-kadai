package kadai_015;
		
		public class Car_Chapter15{
			private int gear ;
			private int speed ;
			
			public Car_Chapter15() {
				this.gear =1;
				this.speed =10;
			}
			
			public void changeGear(int afterGear) {
				if((gear >5)||(gear <=0)) {
					System.out.println("ギアを調整してください");

				}
				System.out.println("ギア"+this.gear+"から"+ afterGear +"に切り替えました。");
				 	this.speed = afterGear *10;
			}
			
			public void displaySpeed() {

				System.out.println("時速は" + this.speed + "kmです");
			
				}
			public static void main(String[] args) {
				Car_Chapter15 car = new Car_Chapter15();
				car.changeGear(0);
				car.displaySpeed();
			}


				
			}
		
			


