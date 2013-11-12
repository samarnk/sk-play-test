package model;

import java.util.ArrayList;
import java.util.List;

public class Province {
	
	int provinceId;
	String provinceName;
	
	public Province() {
		
	}
	
	public Province(int provinceId, String provinceName){
		this.provinceId = provinceId;
		this.provinceName = provinceName;
	}
	
	public int getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	public static List<Province> findAllProvince(){
		
		List<Province> provinces = new ArrayList<Province>();
		  
		provinces.add(new Province(1,"กรุงเทพมหานคร"));
		provinces.add(new Province(2,"เชียงใหม่"));
		provinces.add(new Province(3,"เชียงราย"));
		provinces.add(new Province(4,"ลำปาง"));
		provinces.add(new Province(5,"ลำพูน"));
			
		return provinces;
		
	}
	

}
