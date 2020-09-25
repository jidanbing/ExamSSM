package com.zut.service;

import java.util.List;

import com.zut.pojo.Contract;

public interface ContractService {

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
