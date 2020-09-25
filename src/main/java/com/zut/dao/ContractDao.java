package com.zut.dao;

import com.zut.pojo.Contract;

import java.util.List;

public interface ContractDao {

	/**
	 * ��������Contract
	 */
	List<Contract> findConAll();
	
	/**
	 * ����id����Contract
	 */
	Contract findConById(int id);
	
	/**
	 * ����id�޸�Contract
	 */
	void updateCon(Contract contract);
	
	/**
	 * ����idɾ��Contract
	 */
	void deleteCon(int id);
	
}
