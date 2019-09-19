package exercicios;

import java.util.Scanner;

public class lista_exercicios {
	public static void main(String[] args){
	    //q1();
		//q2();
		//q3();
		//q4();
		//q5();
		//q6();
		//q7();
		//q8();
		//q9();
		//q10();
		//q11();
		//q12();
		//q13();
		//q14();
		//q15();
		//q16();
		//q17();
		//q18();
		//q19();
		//q20();
		//q21();
		//q22();
	}

	static Scanner sc = new Scanner(System.in);
	
	
	
	static void q1(){
		System.out.println("digite os valores: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("soma: "+(num1+num2));
		System.out.println("subtração: "+(num1-num2));
		System.out.println("divisão: "+(num1/num2));
		System.out.println("multiplição: "+(num1*num2));
	}
	
	static void q2(){
		System.out.println("Km percorrido: ");
		double km = sc.nextDouble();
		System.out.println("combustivel em L: ");
		double litros = sc.nextDouble();
		System.out.println("seu carro tem um custo médio de :"+(km/litros));
	}
	
	static void q3(){
        String nome;
        double salarioFixo;
        double vendas;
        double salarioFinal;
        
        System.out.println("Digite Nome: ");
        nome = sc.nextLine();
        System.out.println("Digite Salario: ");
        salarioFixo = sc.nextDouble();
        System.out.println("Digite NÃºmero de Vendas: ");
        vendas = sc.nextDouble();
    
        salarioFinal = salarioFixo+(vendas*0.15);
        
        System.out.println("Nome "+nome+"\nSalario Fixo: "+salarioFixo+"\nSalario Final: "+salarioFinal);
    }
	
	static void q4(){
        System.out.println("Insira a Temperatura: ");
        double celsius = sc.nextDouble();
        
        System.out.println("Em F Ã©: "+ (9*celsius+160)/5);
    }
    
    static void q5(){
        System.out.println("Digite a contaÃ§Ã£o: ");
        double cotacao = sc.nextDouble();
        System.out.println("Digite a dolar: ");
        double dolar = sc.nextDouble();
        System.out.println("Real: "+(cotacao*dolar));
    }
    
    static void q6(){

    System.out.println("valor depositado");
    double valorPolpanca = sc.nextDouble();
    System.out.println("seu rendimento Ã© de: "+(valorPolpanca * 0.07));
    
    
}
    
    static void q7(){
        System.out.println("valor da compra: ");
        double prestao =sc.nextDouble();
        System.out.println("a prestaÃ§ao fica de :"+prestao/5);
    }
    
    static void q8(){
        System.out.println("custo do produto");
        double custo = sc.nextDouble();
        System.out.println("percentual de :");
        double percentual = sc.nextDouble();
        System.out.println("valor do produto Ã© de :"+(custo*percentual));
}
    
    static void q9(){
        System.out.println("Custo de fabrica: ");
        double custoFabrica = sc.nextDouble();
        double consumidor = (custoFabrica+((custoFabrica * 0.45)+custoFabrica) * 0.28);
        System.out.println("Valor final :"+ consumidor);
}
    
    static void q10(){
        int A = 10;
        int B = 20;
        int aux;
        aux = A;
        A = B;
        B = aux;
              
        System.out.println("A: "+A+"\nB: "+B);
}
    
    static void q11(){
        int a = 100;
        int b = 120;
        
        System.out.println("B: "+ b);
        b = 234;
        System.out.println("A: "+a+"\n"+ "B: "+b);
        
        int A = 23;
        int B = 56;
        int C = A+B;
        B = 34;
        A = 67;
        System.out.println("\nA: "+ A+"\nB: "+ B+"\nC: "+ C);
        
        int A1 = 300;
        int B1 = 200;
        int C1 = A1 + B1;
        System.out.println("C: "+C1);
        B1 = 140;
        System.out.println("B: "+B1+"C"+C1);
        C1 = A1 + B1;
        System.out.println("\nA: "+A1+"\nB: "+B1+"\nC: "+C1);
    }
	
	static void q12(){
		double a =(4/2)+(2/4);
		double A = 4/2+2/4;
		double b = 4/(2+2)/4;
		double B = 4/2+2/4;
		double c = (4+2)*2-4;
		double C = 4+2*2-4;
		
		System.out.println("a "+a+" = A "+A);
		System.out.println("b "+b+" = B "+B);
		System.out.println("c "+c+" = C "+C);
	}
	
	static void q13(){

		double a = 6*(3+2);
		double b = 2+(6*(3+2)); 
		double c = 2+(3*6)/(2+4);
		double d = 2*(8/(3+1));
		double e = 3+(16-2)/(2*(9-2));
		double f = (6/3)+(8/2);
		double g = ((3+(8/2))*4)+(3*2);
		double h = (6*(3*3)+6)-10; 
		double i = (((10*8)+3)*9); 
		double j = ((-12)*(-4))+(3*(-4));
		
		
		System.out.println("na = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		System.out.println("d = " +d);
		System.out.println("e = " +e);
		System.out.println("f = " +f);
		System.out.println("g = " +g);
		System.out.println("h = " +h);
		System.out.println("i = " +i);
		System.out.println("j = " +j);
	}
	
	static void q14(){
		
		System.out.println("digite um numero: ");
		int valor = sc.nextInt(); 
		System.out.println("antecessor :"+(valor-1)+" sucessor :"+(valor+1));
		
	}
	
	static void q15(){
		
		System.out.println("valor da base: ");
		double base = sc.nextDouble();
		System.out.println("valor da altura: ");
		double altura = sc.nextDouble();
		System.out.println("È um retangulo de area :"+(base*altura));
		
	}

	static void q16(){
		
		System.out.println("anos:");
		int anos = sc.nextInt();
		System.out.println("meses:");
		int meses = sc.nextInt();
		System.out.println("dias:");
		int dias = sc.nextInt();
		
		int dias_anos = (anos *365);
		int dias_meses = (meses *30);
		System.out.println("você tem:"+(dias_anos+dias_meses+dias)+" dias de vida");
		
	}
	
	static void q17(){

		
		System.out.println("eleitores: ");
		int eleitores = sc.nextInt();
		System.out.println("votos brancos: ");
		int votosBrancos = sc.nextInt();
		System.out.println("votoas nulos:");
		int nulos = sc.nextInt();
		int porBrancos = ((100*votosBrancos)/eleitores);
		int porNulos = ((100*nulos)/eleitores);
		
		System.out.println("em uma cidade com"+eleitores+"\n teve"+porBrancos+"% de votos brancos \n e "+porNulos+"% de nulos");
		
		
	}

	static void q18(){
		
		System.out.println("salario atual:");
		double salario = sc.nextInt();
		System.out.println("Reajuste: ");
		double reajuste = sc.nextDouble();
		System.out.println("seu novo salario é de:"+(salario +(salario *reajuste)));
		
	}
	
	static void q19(){
		 System.out.println("Custo de fabrica: ");
	        double custoFabrica = sc.nextDouble();
	        double consumidor = (custoFabrica+((custoFabrica * 0.45)+custoFabrica) * 0.28);
	        System.out.println("Valor final :"+ consumidor);
	}
	
	static void q20(){
		Scanner sc = new Scanner(System.in);
		System.out.println("salrio fixo:");
		double salario = sc.nextDouble();
		System.out.println("total de vendas em reais: ");
		double vendas = sc.nextDouble();
		System.out.println("carros vendidos: ");
		double carrosVendidos = sc.nextDouble();
		System.out.println("comissão em reais: ");
		double comissao = sc.nextDouble();
		
		double salarioFinal =(((carrosVendidos*comissao)+(vendas*0.05))+salario);
		System.out.println("terar um salario final de :"+salarioFinal);
	}
	
	static void q21(){
		System.out.println("digite um valor: ");
		int valor = sc.nextInt();
		if(valor>10){
			System.out.println("valor maior que 10");
		}else{
			System.out.println("valor menor que 10");
		}
	}

	static void q22(){
		System.out.println("digite: ");
		int valor = sc.nextInt();
		if(valor>=0){
			System.out.println("valor possitivo");
		}else{
			System.out.println("valor negativo");
		}


	}
}

