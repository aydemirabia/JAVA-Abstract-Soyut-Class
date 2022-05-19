package java_abstract_class;
import java_abstract_class.Tedarikci;

public class IhracEdilenUrunFindik extends Tedarikci {
	@Override
	double urunAl(int urunTonMiktari) {
		return urunTonMiktari * 43500;
	}
}
