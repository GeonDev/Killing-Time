package park.L1.prgraommers;


class Solution {
	public boolean solution(String s) {
		return 0 == s.chars()
				.filter(c -> c < '0' || c > '9')
				.count()
				&& (s.length() == 4 || s.length() == 6);
	}
}

//이보시게 윤상님 뭐 하려는 건지는 알려줘 ㅠㅠ