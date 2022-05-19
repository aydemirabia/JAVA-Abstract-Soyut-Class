package java_abstract_class;
import java_abstract_class.Tedarikci;
public class IthalEdilenUrunMisir extends Tedarikci {
	@Override
	double urunAl(int urunTonMiktari) {
		return urunTonMiktari * 21800;
	}

}
