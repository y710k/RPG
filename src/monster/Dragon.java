package monster;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{
	public Dragon(String name, String weapon) {
		super(name,weapon);
		hp = Dice.get(270, 330);
		offensive = Dice.get(12, 18);
	}

}


/*
1. monstersパッケージ内に作成します。
2. Monsterクラスを継承します。
3. 引数にname, weaponの2つだけを持つコンストラクタを定義します。
4. コンストラクタの中で、name, weaponの値を設定するために、Monsterクラスに定義したコンストラクタを利用してください。
5. コンストラクタの中で、ヒットポイントの値は乱数を振って決定します。（乱数の具体的は範囲は後述）
6. コンストラクタの中で、攻撃力の値は乱数を振って決定します。（乱数の具体的は範囲は後述）
*/

/*
ヒットポイントの乱数範囲
270～330
攻撃力の乱数範囲
12～18
*/