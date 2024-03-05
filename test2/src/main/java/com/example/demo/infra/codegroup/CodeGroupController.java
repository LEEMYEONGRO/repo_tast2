package com.example.demo.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;
	
	@RequestMapping("codeGroupXdmList")
	public String codeGroupXdmList(Model model) {
		
//		List<CodeGroupDto> codeGroupDtos = service.selectList();
//		
//		for(CodeGroupDto a: codeGroupDtos) {
//			System.out.println(a.getCodeType());
//		}
//		
		model.addAttribute("list", service.selectList());
				
				
		return "codeGroupXdmList";
		
	}
	
//	@RequestMapping("codeGroupView")
//	public String codeGroupView(CodeGroupDto dto) {
//		
//		System.out.println("dto.getSeq(): " + dto.getSeq());
//		System.out.println("dto.getCodeType(): " + dto.getCodeType());
//		System.out.println("dto.getDeleteNy(): " + dto.getDeleteNy());
//		
//		return "codeGroupView";
//	}
	
	@RequestMapping("codeGroupView")
	public String codeGroupView(CodeGroupDto dto, Model model) {
		
		model.addAttribute("oneList", service.selectOne(dto));
		
		return "codeGroupView";
		
		
	}
	
	@RequestMapping("codeGroupCorrection")
	public String codeGroupCorrection(CodeGroupDto dto, Model model) {
		
		model.addAttribute("oneList", service.selectOne(dto));
		
		return "codeGroupCorrection";
		
		
	}
	
	@RequestMapping("codeGroupRegistration")
	public String codeGroupRegistration(CodeGroupDto dto, Model model) {
		
		model.addAttribute("oneList", service.selectOne(dto));
		
		return "codeGroupRegistration";
		
		
	}
	
	@RequestMapping("codeGroupInsert")
	public String codeGroupInsert(CodeGroupDto dto) {
		
		service.insert(dto);
		
		return "redirect:/codeGroupXdmList";
		
	}
	
	@RequestMapping("codeGroupUpdate")
	public String codeGroupUpdate(CodeGroupDto dto) {
		
		service.update(dto);
		
		return "redirect:/codeGroupXdmList";
		
	}
	
	@RequestMapping("updateDeleteNy")
	public String updateDeleteNy(CodeGroupDto dto) {
		
		service.updateDeleteNy(dto);
		
		return "redirect:/codeGroupXdmList";
		
	}
	
	@RequestMapping("delete")
	public String delete(CodeGroupDto dto) {
		
		service.delete(dto);
		
		return "redirect:/codeGroupXdmList";
		
	}
	
	
}
