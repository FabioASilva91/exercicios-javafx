package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle{
	

	private static int i = 0;
	
	private String[] cores = {
			"#836FFF", "#008B8B", "#F4A460",
			"#FF6347", "#FFFF00", "#B0E0E6"
	};
	
	public Quadrado() {
		this(100, 100);
	}
	
	public Quadrado(int largura, int altura) {
		
		
		setWidth(largura);
		setHeight(altura);
		
		setFill(Color.web(cores[i]));
		if (i == 6 ) i = 0;
	}
	


}
