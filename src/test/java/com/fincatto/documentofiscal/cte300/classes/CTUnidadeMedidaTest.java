package com.fincatto.documentofiscal.cte300.classes;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.cte300.classes.CTUnidadeMedida;

public class CTUnidadeMedidaTest {

    @Test
    public void deveRepresentarOCodigoCorretamente() {
    	Assert.assertNull(CTUnidadeMedida.valueOfCodigo(null));
    	Assert.assertEquals("00", CTUnidadeMedida.M3.getCodigo());
    	Assert.assertEquals("01", CTUnidadeMedida.KG.getCodigo());
    	Assert.assertEquals("02", CTUnidadeMedida.TON.getCodigo());
    	Assert.assertEquals("03", CTUnidadeMedida.UNIDADE.getCodigo());
    	Assert.assertEquals("04", CTUnidadeMedida.LITROS.getCodigo());
    	Assert.assertEquals("05", CTUnidadeMedida.MMBTU.getCodigo());
	}

}
