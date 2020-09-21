package com.amazon.amazonproject.ModelPack;

public class orderclass 
{
	private String brandname,color,processor,graphic,generation,os;
	private int item,ram,rom;
	private double price,weight;
	
	
	public orderclass(String brandname, String color, String processor, String graphic, String generation, String os,
			int item, int ram, int rom, double price, double weight) {
		super();
		this.brandname = brandname;
		this.color = color;
		this.processor = processor;
		this.graphic = graphic;
		this.generation = generation;
		this.os = os;
		this.item = item;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
		this.weight = weight;
	}

	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
