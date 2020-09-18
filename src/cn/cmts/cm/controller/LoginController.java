package cn.cmts.cm.controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import cn.cmts.cm.service.ITestService;

/**
 * 用户登录
 * 
 * 
 */
@Controller
public class LoginController
{

    // 日志操作类
    private static Logger logger = Logger.getLogger(LoginController.class);
    
    @Autowired
    private ITestService service;
    
    /**
     * @see 跳转到首页面
     * @return
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    @ResponseBody
    public String index()
    {
    	
        
        int count = service.queryCount();
        System.out.println(count);
        
        return count+"";
    }
    
    
}
