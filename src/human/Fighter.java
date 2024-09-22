package human;

import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	public Fighter(String name , String weapon) {
		super(name,weapon);
		hp = Dice.get(240, 300);
		offensive = Dice.get(17, 23);
	}

}


/*
1. humansパッケージ内に作成します。
2. Humanクラスを継承します。
3. 引数にname, weaponの2つだけを持つコンストラクタを定義します。
4. コンストラクタの中で、name, weaponの値を設定するために、Humanクラスに定義したコンストラクタを利用してください。
5. コンストラクタの中で、ヒットポイントの値は乱数を振って決定します。（乱数の具体的は範囲は後述）
6. コンストラクタの中で、攻撃力の値は乱数を振って決定します。（乱数の具体的は範囲は後述）
*/

/*
ヒットポイントの乱数範囲
240～300
攻撃力の乱数範囲
17～23
*/