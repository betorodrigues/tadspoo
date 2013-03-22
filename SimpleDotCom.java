public class SimpleDotCom {
	int [] locationCells;
	int numOfHits = 0;
	public void setLocationCells (int[] locs) {
		locationCells = locs;
}
	public String checkYourself (String stringGuess) {
		int guess = Integer.parseInt (stringGues);
		String result = "miss";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
				}
			} // fora do loop
			if (numOfHits ==
			locationCells.length) {
				result = "kill";
			}
			System.out.println (result);
			return result;
	}//fecha o metodo
}// fecha a classe