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
		//q23();
		//q24();
		//q25();
		//q26();
		//q27();
		//q28();
		//q29();
		//q30();
		//q31();
		//q32();
		//q33();
		//q34();
		//q35();
		//q36();
		//q37();
		//q38();
		//q39();
		//q40();
		//q41();
		
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
        System.out.println("Digite o numero de Vendas: ");
        vendas = sc.nextDouble();
    
        salarioFinal = salarioFixo+(vendas*0.15);
        
        System.out.println("Nome "+nome+"\nSalario Fixo: "+salarioFixo+"\nSalario Final: "+salarioFinal);
    }
	
	static void q4(){
        System.out.println("Insira a Temperatura: ");
        double celsius = sc.nextDouble();
        
        System.out.println("temperatura em F: "+ (9*celsius+160)/5);
    }
    
    static void q5(){
        System.out.println("Digite a contação: ");
        double cotacao = sc.nextDouble();
        System.out.println("Digite a dolar: ");
        double dolar = sc.nextDouble();
        System.out.println("Real: "+(cotacao*dolar));
    }
    
    static void q6(){

    System.out.println("valor depositado");
    double valorPolpanca = sc.nextDouble();
    System.out.println("seu rendimento é de: "+(valorPolpanca * 0.07));
    
    
}
    
    static void q7(){
        System.out.println("valor da compra: ");
        double prestao =sc.nextDouble();
        System.out.println("a prestação fica de :"+prestao/5);
    }
    
    static void q8(){
        System.out.println("custo do produto");
        double custo = sc.nextDouble();
        System.out.println("percentual de :");
        double percentual = sc.nextDouble();
        System.out.println("valor do produto é de :"+(custo*percentual));
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

	static void q23(){
		System.out.println("maçãs compradas:");
		double maca = sc.nextDouble();
		if(maca <12){
			System.out.println("total a pagar"+(maca*1.30));
		}else{
			System.out.println("total a pagar"+(maca*1.00));
		}
	}

	static void q24(){
		System.out.println("notas:");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media =((nota1+nota2)/2);
		if(media >=6){
			System.out.println("aprovado com media: "+media);
		}else{
			System.out.println("reprovado com media: "+media);
		}
	}
	
	static void q25(){
		System.out.println("ano atual: ");
		int anoAtual = sc.nextInt();
		System.out.println("ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		int idade = (anoAtual-anoNascimento);
		if(idade >=16){
			System.out.println("pode votar nesse ano: ");
		}else{
			System.out.println("não pode votar nesse ano: ");
		}
		
		
	}
	
	static void q26(){
		System.out.println("valores:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		if(num1>num2){
			System.out.println(num1);
		}else{
			System.out.println(num2);
		}
	}

	static void q27(){
		System.out.println("valores:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		if(num1>num2){
			System.out.println(num2+"\n"+num1);
		}else{
			System.out.println(num1+"\n"+num2);
		}
	}
	
	static void q28(){
		System.out.println("inicio do jogo:");
		int inicio = sc.nextInt();
		System.out.println("final do jogo:");
		int finale = sc.nextInt();
		
		int horas = (finale-inicio);
		if(horas <24){
			System.out.println("o jogo esta no tempo, com "+horas+"horas");
		}else{
			System.out.println("limite de 24h exercido, o jogo esta com "+horas+"horas");
		}
		
	}
	
	static void q29(){
		double salarioHora, horasTrabalhadas, horasExtras, salarioHoraExtra;
		double salarioExtra, salarioFinal;
		System.out.println("horas trabalhadas");
		horasTrabalhadas =sc.nextDouble();
		System.out.println("salario por hora de trabalho:");
		salarioHora =sc.nextDouble();
		
		horasExtras =(horasTrabalhadas-160);
		salarioHoraExtra = (salarioHora+(salarioHora*0.5));
		salarioExtra = (salarioHoraExtra*horasExtras);
		salarioFinal = ((salarioHoraExtra * horasExtras)+(160*salarioHora));
		
		System.out.println("Salario: "+(160*salarioHora));
		System.out.println("salario das horas extras: "+salarioExtra);
		System.out.println("salario final "+salarioFinal);
		
	}
	
	static void q30(){
		System.out.println("seu nome:");
		String nome = sc.nextLine();
		System.out.println("sua altura:");
		double altura = sc.nextDouble();
		System.out.println("seu sexo:");
		String sexo = sc.nextLine();
		
		if(sexo == "m"){
			System.out.println("seu peso ideal: "+((72.7*altura)-58));
		}if (sexo == "f"){
			System.out.println("seu peso ideal: "+((62.1*altura)-44.7));
		}
	}

	static void q31(){
		System.out.println("salario fixo:");
		double salario = sc.nextDouble();
		System.out.println("valor das vendas :");
		double valorVendas = sc.nextDouble();
		if(valorVendas <=1500){
			double valorFinal = (salario+(valorVendas*0.3));
			System.out.println("salario final de: "+valorFinal);
		}else{
			double valorFinal = (salario+(valorVendas*0.5));
			System.out.println("salario final de : "+valorFinal);
		}
	}

	static void q32(){
		System.out.println("numero da conta: ");
		double conta = sc.nextDouble();
		System.out.println("seu saldo: ");
		double saldo = sc.nextDouble();
		System.out.println("seu debito: ");
		double debito= sc.nextDouble();
		System.out.println("seu credito: ");
		double credito = sc.nextDouble();
		
		double saldoAtual = ((saldo-debito)+credito);
		if(saldoAtual>0){
			System.out.println("saldo positivo de :"+saldoAtual);
		}else{
			System.out.println("saldo negativo de :"+saldoAtual);
		}
		
	}
	
	static void q33(){
		System.out.println("estoque atual: ");
		int atual = sc.nextInt();
		System.out.println("estoque maximo: ");
		double maxima = sc.nextDouble();
		System.out.println("estoque minimo: ");
		double minima = sc.nextDouble();
		
		double media = ((maxima+minima)/2);
		if(atual>=media){
			System.out.println("nao efetuar compra: ");			
		}else{
			System.out.println("efetuar compra: ");
		}
	}
	
	static void q34(){
		System.out.println("valor: ");
		double valor = sc.nextDouble();
		
		if(valor>=0){
			System.out.println("valor positivo: "+valor);
		}else{
			System.out.println("valor negativo: "+valor);
		}
		
	}
	
	static void q35(){
		System.out.println("valores : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3){
			System.out.println("maior: "+num1);
		}if(num1<num2 && num2>num3){
			System.out.println("maior: "+num2);
		}else{
			System.out.println("maior "+num3);
		}
		
	}
	
	static void q36(){
		System.out.println("valores : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num2>num3){
			System.out.println("soma: "+(num1+num2));
		}if(num1>num2 && num3>num2){
			System.out.println("soma: "+(num1+num3));
		}if(num2>num1 && num3>num1){
			System.out.println("soma: "+(num2+num3));
		}
	}
	
	static void q37(){
		System.out.println("valores : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num2>num3){
			System.out.println(num3+" "+ num2+" "+ num1);
		}if(num1>num2 && num3>num2){
			System.out.println(num2+" "+num3+" "+num1);
		}if(num2>num1 && num3>num1){
			System.out.println(num1+" "+num3+" "+num2);
		}
		
	}
	
	static void q38(){
		System.out.println("valores: ");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();
		
		if((lado1<(lado2+lado3))&&(lado2<(lado1+lado3))&&(lado3<(lado1+lado2))){
			System.out.println("é um triangulo valido ");
		}else{
			System.out.println("nao é um triangulo valido ");
		}
		
	}
	
	static void q39(){
		System.out.println("casa: ");
		String time1 = sc.nextLine();
		System.out.println("fora: ");
		String time2 = sc.nextLine();
		System.out.println("gols da casa: ");
		int gols1 = sc.nextInt();
		
		
		System.out.println("gols do visitante: ");
		int gols2 = sc.nextInt();
		
		if(gols1>gols2){
			System.out.println("o time "+time1+" ganhou");
		}if(gols1==gols2){
			System.out.println("EMPATE");
		}else{
			System.out.println("o time "+time2+" ganhou");
		}
	}
	
	static void q40(){
		System.out.println("valores: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2){
			System.out.println("primeiro maior que o segundo");
		}if(num2>num1){
			System.out.println("segundo maior que o primeiro");
		}if(num1 ==num2){
			System.out.println("numeros iguais");
		}
	}
	
	static void q41(){
		char resposta;
		System.out.println("x");
		double x = sc.nextDouble();
		System.out.println("y");
		double y = sc.nextDouble();
		
		double z =((x*y)+5);
		if(z<=0){
			resposta = 'A';
		}if(z>=100){
			resposta = 'B';
		}else{
			resposta = 'C';
		}
		System.out.println(z+" "+resposta);
	}
	
	
	
	
}

