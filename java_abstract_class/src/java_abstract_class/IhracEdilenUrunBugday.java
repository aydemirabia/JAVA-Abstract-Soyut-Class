package java_abstract_class;
import java_abstract_class.Tedarikci;

public class IhracEdilenUrunBugday extends Tedarikci{
	@Override
	double urunAl(int urunTonMiktari) {
		return urunTonMiktari * 58000;
	}
}
