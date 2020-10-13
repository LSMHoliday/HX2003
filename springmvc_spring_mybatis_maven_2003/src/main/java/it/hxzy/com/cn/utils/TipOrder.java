package it.hxzy.com.cn.utils;

public enum TipOrder {
	ONE(0, "course"), TWO(1, "grade"),
	THREE(2, "room"), FOUR(3, "times"),
	FIVE(4, "models");

	private int tip;
	private String name;

	private TipOrder(int tip, String name) {
		this.tip = tip;
		this.name = name;
	}

	public int getTip() {
		return tip;
	}

	public void setTip(int tip) {
		this.tip = tip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
