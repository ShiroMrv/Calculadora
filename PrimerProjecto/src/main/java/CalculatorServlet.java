
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;


@WebServlet(name = "calculator", urlPatterns = {"/calculator"})
public class CalculatorServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  {
      String num1 = request.getParameter("num1");
      String num2 = request.getParameter("num2");
      String operator = request.getParameter("operator");
      
      BigDecimal result = BigDecimal.ZERO;
      
      if (num1 != null && num2 != null && operator != null){
      BigDecimal operand1 = new BigDecimal(num1);
      BigDecimal operand2 = new BigDecimal(num2);
      
      switch (operator) {
          case "add":
              result = operand1.add(operand2);
              break;
          case "subtract":
              result = operand1.subtract(operand2);
              break;
          case "multiply":
              result = operand1.multiply(operand2);
              break;
          case "divide":
              result = operand1.divide(operand2);
              break;
      }
      }
      request.setAttribute("result", result);
      
      request.getRequestDispatcher("calculator.jsp").forward(request ,response);
      
      
  }
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException{
  String num1 = request.getParameter("num1");
      String num2 = request.getParameter("num2");
      String operator = request.getParameter("operator");
      
      BigDecimal result = BigDecimal.ZERO;
      
      if (num1 != null && num2 != null && operator != null){
      BigDecimal operand1 = new BigDecimal(num1);
      BigDecimal operand2 = new BigDecimal(num2);
      
      switch (operator) {
          case "add":
              result = operand1.add(operand2);
              break;
          case "subtract":
              result = operand1.subtract(operand2);
              break;
          case "multiply":
              result = operand1.multiply(operand2);
              break;
          case "divide":
              result = operand1.divide(operand2);
              break;
      }
      }
      request.setAttribute("result", result);
      
      request.getRequestDispatcher("calculator.jsp").forward(request ,response);
      
  
  }
  
  }
  

