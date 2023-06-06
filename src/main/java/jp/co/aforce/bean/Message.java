package jp.co.aforce.bean;

import java.io.Serializable;

public class Message implements Serializable {
	
	private String WCMM1;
	private String WCMM2;
	
	public String EWMM1 = "会員情報が既に存在します。";
	
	public String IWMM1 = "会員情報を登録しました。";
	public String IWMM2 ="会員情報を更新しました。";
	public String IWMM3 ="会員情報を削除しました。";
	
	public String WWMM1 ="会員情報が存在しません。";
	
	
	public String getWCMM1() {
		return WCMM1;
	}
	public void setWCMM1(String WCMM1) {
		this.WCMM1 = WCMM1 + "は必須項目です";
	}
	
	
	public String getWCMM2() {
		return WCMM2;
	}
	public void setWCMM2(String WCMM2) {
		this.WCMM2 = "会員情報の" + WCMM2 +"に失敗しました。";
	}
}
