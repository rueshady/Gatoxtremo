package main;

import java.util.Scanner;

public class Char {
	static char a='-';
	static char b='-';
	static char c='-';
	static char d='-';
	static char e='-';
	static char f='-';
	static char g='-';
	static char h='-';
	static char i='-';
	static int contadormortal=0;
	static boolean ganador=true;
	static int m=0;
	static int n=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Bienvenido a GATOMANIA v4.20 PreAlfa! \n Para dar cordenadas precione 1,2,3 de enter y despues de nuevo 1,2,3 \n las columnas estan ordenadas de izquierda a derecha y las filas de arriba hacia abajo");
			while (ganador){
				imprimirGato();
				n=sc.nextInt();
				m=sc.nextInt();
				modificarCharX(n,m); //1
				imprimirGato();
				n=sc.nextInt();
				m=sc.nextInt();
				modificarCharO(n,m); //
				imprimirGato();
				contadormortal=contadormortal+1;
				ganador();
				if (contadormortal==9){
					ganador=true;
					System.out.println("No hay ganador reinicie el progrma para volver a jugar");
			}
		}
		sc1.close();
		sc.close();
	}
	private static void modificarCharO(int x, int y) {

		if (x==1&&y==1&&a=='-'){
			a='O';} else if(a!='-'&& a!='O'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}	
		if(x==1&&y==2&&b=='-'&& b!='O'){
			b='O';} else if(b!='-'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}
		if(x==1&&y==3&&c=='-'&& c!='O'){
			c='O';} else if(c!='-'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}
	if (x==2&&y==1&&d=='-'){
			d='O';} else if(d!='-' && d!='O'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}	
		if(x==2&&y==2&&e=='-'){
			e='O';} else if(e!='-'&& e!='O'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}
		if(x==2&&y==3&&f=='-'){
			f='O';} else if(f!='-'&& f!='O'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}
	if (x==3&&y==1&&g=='-'){
			g='O';} else if(g!='-'&& g!='O'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}	
		if(x==3&&y==2&&h=='-'){
			h='O';} else if(h!='-'&& h!='O'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}
		if(x==3&&y==3&&i=='-'&& i!='O'){
			i='O';} else if(i!='-'){
				System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
			}
	}
	public static void modificarCharX( int x, int y){
		if (x==1&&y==1&&a=='-'){
				a='X';} else if(a!='-'&& a!='X'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}	
			if(x==1&&y==2&&b=='-'&& b!='X'){
				b='X';} else if(b!='-'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}
			if(x==1&&y==3&&c=='-'&& c!='X'){
				c='X';} else if(c!='-'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}
		if (x==2&&y==1&&d=='-'){
				d='X';} else if(d!='-' && d!='X'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}	
			if(x==2&&y==2&&e=='-'){
				e='X';} else if(e!='-'&& e!='X'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}
			if(x==2&&y==3&&f=='-'){
				f='X';} else if(f!='-'&& f!='X'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}
		if (x==3&&y==1&&g=='-'){
				g='X';} else if(g!='-'&& g!='X'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}	
			if(x==3&&y==2&&h=='-'){
				h='X';} else if(h!='-'&& h!='X'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}
			if(x==3&&y==3&&i=='-'&& i!='X'){
				i='X';} else if(i!='-'){
					System.out.println("Esta casilla ya ha sido moficada, usted pierde un turno por no poner atención");
				}
	}
	public static void imprimirGato(){
		System.out.print("\n");
		System.out.println(" "+ a +" | "+ b +" | "+ c);
		System.out.println("----------");
		System.out.println(" "+ d +" | "+ e +" | "+ f);
		System.out.println("----------");
		System.out.println(" "+ g +" | "+ h +" | "+ i);
	}
	public static void ganador(){
		if(a=='X'){
			if(b=='X'){
				if(c=='X'){
					System.out.println("El jugador X ha ganador");
					ganador=false;
				}
			}
			
		}
		if(d=='X'){
			if(e=='X'){
				if(f=='X'){
					System.out.println("El jugador X ha ganado");
					ganador=false;
				}
			}
			
		}
		if(g=='X'){
			if(h=='X'){
				if(i=='X'){
					System.out.println("El jugador X ha ganado");
					ganador=false;
				}
			}
		}
		if(a=='X'){
			if(d=='X'){
				if(g=='X'){
					System.out.println("El jugador X ha ganado");
					ganador=false;
				}
			}
			if(b=='X'){
				if(e=='X'){
					if(h=='X'){
						System.out.println("El jugador X ha ganado");
						ganador=false;
					}
				}
				
			}
			if(c=='X'){
				if(f=='X'){
					if(i=='X'){
						System.out.println("El jugador X ha ganado");
						ganador=false;
					}
				}
				
			}
			if(a=='X'){
				if(e=='X'){
					if(i=='X'){
						System.out.println("El jugador X ha ganado");
						ganador=false;
					}
				}
			}
			if(g=='X'){
				if(e=='X'){
					if(c=='X'){
						System.out.println("El jugador X ha ganado");
						ganador=false;
					}
				}
				
			}
		}
		if(a=='O'){
			if(b=='O'){
				if(c=='O'){
					System.out.println("El jugador O ha ganador");
					ganador=false;
				}
			}
			
		}
		if(d=='O'){
			if(e=='O'){
				if(f=='O'){
					System.out.println("El jugador O ha ganado");
					ganador=false;
				}
			}
			
		}
		if(g=='O'){
			if(h=='O'){
				if(i=='O'){
					System.out.println("El jugador O ha ganado");
					ganador=false;
				}
			}
		}
		if(a=='O'){
			if(d=='O'){
				if(g=='O'){
					System.out.println("El jugador O ha ganado");
					ganador=false;
				}
			}
			if(b=='O'){
				if(e=='O'){
					if(h=='O'){
						System.out.println("El jugador O ha ganado");
						ganador=false;
					}
				}
				
			}
			if(c=='O'){
				if(f=='O'){
					if(i=='O'){
						System.out.println("El jugador O ha ganado");
						ganador=false;
					}
				}
				
			}
			if(a=='O'){
				if(e=='O'){
					if(i=='O'){
						System.out.println("El jugador O ha ganado");
						ganador=false;
					}
				}
			}
			if(g=='O'){
				if(e=='O'){
					if(c=='O'){
						System.out.println("El jugador O ha ganado");
						ganador=false;
					}
				}
				
			}
		}
	}
}
