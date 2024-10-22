package com.srikanth.spEL;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srikanth/spEL/StereoConfig.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.out.println(demo);

		SpelExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression("10+99");
		System.out.println(expression.getValue());
	}

}
