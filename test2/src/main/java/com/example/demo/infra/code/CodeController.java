package com.example.demo.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

	@Autowired
	CodeService service;
	
	@RequestMapping("codeXdmList")
	public String codeXdmList(Model model) {
		
		model.addAttribute("list", service.selectList());
		
		return "codeXdmList";
	}
	
	@RequestMapping("codeView")
	public String codeView(CodeDto dto ,Model model) {
		
		model.addAttribute("oneList", service.selectOne(dto));
		
		return "codeView";
		
		
	}
	
	@RequestMapping("codeCorrection")
	public String codeCorrection(CodeDto dto, Model model) {
		
		model.addAttribute("oneList", service.selectOne(dto));
		
		return "codeCorrection";
		
	}
	
	@RequestMapping("codeRegistration")
	public String codeRegistration (CodeDto dto, Model model) {
		
		model.addAttribute("oneList", service.selectOne(dto));
		
		return "codeRegistration";
		
	}
	@RequestMapping("codeInsert")
	public String codeInsert (CodeDto dto) {
		
		service.insert(dto);
		
		return "redirect:/codeXdmList";
	}
	
	@RequestMapping("codeUpdate")
	public String codeUpdate (CodeDto dto) {
		
		service.update(dto);
		
		return "redirect:/codeXdmList";
		
	}
	
	@RequestMapping("deleteNyUpdate")
	public String deleteNyUpdate (CodeDto dto) {
		
		service.deleteNyUpdate(dto);
		
		return "redirect:/codeXdmList";
	}
	
	@RequestMapping("codeDelete")
	public String delete (CodeDto dto) {
		
		service.codeDelete(dto);
		
		return "redirect:/codeXdmList";
	}
	
}
