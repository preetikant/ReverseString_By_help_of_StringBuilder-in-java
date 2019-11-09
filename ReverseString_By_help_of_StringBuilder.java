class ReverseString_By_help_of_StringBuilder{
	public static void main(String[] args) {
		String str = "PreetiKant";
		StringBuilder sbdr = new StringBuilder(str);
		// //append to String into StringBuilder
		// sbdr.append(sbdr);
		// //reverse string
		sbdr.reverse();
		System.out.println(sbdr);
	}
}