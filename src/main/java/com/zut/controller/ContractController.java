package com.zut.controller;

import com.zut.pojo.Contract;
import com.zut.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller//���Ʋ�
@RequestMapping("/contract")//·��խ��
public class ContractController {
	
	//����ע��
	@Autowired
	private ContractService conService;
	
	/**
	 * չʾ����
	 * @param model
	 * @return
	 */
	@RequestMapping("/showCon.action")
	public String showCon(Model model) {		
		List<Contract> cons = conService.findConAll();
		model.addAttribute("cons", cons);
		return "contract/showCon";
	}
	
	/**
	 * ��ת���޸Ľ��棬�����������contract��Ϣ
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/toUpdateCon.action")
	public String toUpdateCon(int id,Model model) {
		Contract contract=conService.findConById(id);
		model.addAttribute("contract", contract);
		return "contract/editCon";
	}
	
	/**
	 * �޸�contract�����ݣ�����ת��չʾ����
	 * @param contract
	 * @return
	 */
	@RequestMapping("/updateCon.action")
	public String updateCon(Contract contract) {
		//�޸�����
		conService.updateCon(contract);
		//�ض���չʾ����
		return "redirect:/contract/showCon.action";
	}
	
	/**
	 * ����idɾ��contract������ת��չʾ����
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteCon")
	public String deleteCon(int id) {
		
		//��������idɾ������
		conService.deleteCon(id);
		//�ض���չʾ����
		return "redirect:/contract/showCon.action";
	}
	
}
