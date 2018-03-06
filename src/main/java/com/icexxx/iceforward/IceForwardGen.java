package com.icexxx.iceforward;

public class IceForwardGen {
    public static String gen() {
        StringBuilder sb = new StringBuilder();
        sb.append("    <servlet>\n");
        sb.append("        <servlet-name>iceforward</servlet-name>\n");
        sb.append("        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>\n");
        sb.append("    </servlet>\n");
        sb.append("    <servlet-mapping>\n");
        sb.append("        <servlet-name>iceforward</servlet-name>\n");
        sb.append("        <url-pattern>/jsp/*</url-pattern>\n");
        sb.append("    </servlet-mapping>");
        return sb.toString();
    }

    public static String pom() {
        StringBuilder sb = new StringBuilder();
        sb.append("    <dependency>\n");
        sb.append("        <groupId>org.apache.tomcat</groupId>\n");
        sb.append("        <artifactId>tomcat-jasper</artifactId>\n");
        sb.append("        <artifactId>7.0.0</artifactId>\n");
        sb.append("    </dependency>");
        return sb.toString();
    }

    public static String annotation() {
        return "@WebServlet(value = { \"/main.jsp\", \"/first.jsp\", \"/jsp.jsp\", \"/WEB-INF/jsp/*\" })";
    }
}
