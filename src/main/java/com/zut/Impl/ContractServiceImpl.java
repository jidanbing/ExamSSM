package com.zut.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zut.dao.ContractDao;
import com.zut.pojo.Contract;
import com.zut.service.ContractService;

/**
 * ��ContractService��ʵ����
 * @author ��˧��
 *
 */
//�����
@Service
public class ContractServiceImpl implements ContractService{

	//����ע��
	@Autowired
	private ContractDao conDao;
	
	/**
	 * ��ContractService�ķ�����д������ʵ���书��
	 * 
	 */
	@Override
	public List<Contract> findConAll() {
		List<Contract> cons = conDao.findConAll();
		return cons;
	}

	@Override
	public Contract findConById(int id) {
		Contract con = conDao.findConById(id);
		return con;
	}

	@Override
	public void updateCon(Contract contract) {
		conDao.updateCon(contract);
		
	}

	@Override
	public void deleteCon(int id) {
		conDao.deleteCon(id);
		
	}

}
