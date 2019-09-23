package kr.co.itcen.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.itcen.guestbook.dao.GuestBookDao;
import kr.co.itcen.guestbook.vo.GuestBookVo;

@Controller
public class GuestbookController {
	@Autowired 
	private GuestBookDao guestbookDao;
	
	@RequestMapping({"", "/list"})
	public String index(Model model) {
		List<GuestBookVo> list= guestbookDao.getList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
}
