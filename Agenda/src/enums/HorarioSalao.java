package enums;

public enum HorarioSalao {
	HORA_08("08:00"),
	HORA_09("09:00"),
	HORA_10("10:00"),
	HORA_11("11:00"),
	HORA_12("12:00"),
	HORA_14("14:00"),
	HORA_15("15:00"),
	HORA_16("16:00"),
	HORA_17("17:00"),
	HORA_18("18:00");
	
	private final String horario;
	
	HorarioSalao(String horario){
		this.horario = horario;
	}
	
	public String getHorario() {
		return horario;
	}
	
	@Override
	public String toString() {
		return horario;
	}
}
