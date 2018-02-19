package model;

public enum TipoUnidadVenta {
    KILO;

    @Override
    public String toString() {
	String ret = "";
	switch (this) {
	case KILO:
	    ret = "kilo";
	    break;
	default:
	    ret = super.toString();
	    break;
	}
	return ret;
    }
}
