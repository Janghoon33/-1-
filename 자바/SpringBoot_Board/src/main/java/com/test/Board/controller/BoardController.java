package com.test.Board.controller;

import com.test.Board.entity.Board;
import com.test.Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") // -> localhost:8080/board/write
    public String boardWriteForm(){

        return "boardwrite"; // return 해줄 view 파일
    }

    @PostMapping("board/writedo")
    public String boardWriteDo(Board board){ // Entity를 그대로 매개변수로 받기

        boardService.write(board);

        return "";
    }

    @GetMapping("/board/list")
    public String boardList(Model model){

        model.addAttribute("list",boardService.boardList()); // boardService에서 boardList를 받아서 "list"라는 이름으로 넘기겠다

        return "boardList";
    }

}
