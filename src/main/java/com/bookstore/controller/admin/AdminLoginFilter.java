/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package com.bookstore.controller.admin;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
@WebFilter(filterName = "AdminLoginFilter", urlPatterns = {"/admin/*"})
public class AdminLoginFilter implements Filter {
  
    private static final boolean debug = true;

    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured. 
    private FilterConfig filterConfig = null;

    public AdminLoginFilter() {
    }

    public void destroy() {
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) sr;
        HttpSession session = httpRequest.getSession(false);
        boolean loggedIn = session != null && session.getAttribute("useremail") != null;
        String loginURI = httpRequest.getContextPath() + "/admin/login";
        boolean logginRequest = httpRequest.getRequestURI().equals(loginURI);
        boolean logginPage = httpRequest.getRequestURI().endsWith("sign_in.jsp");
        Map<String, String> mapCountries = new HashMap<>();
        mapCountries.put("Afghanistan", "AF");
        mapCountries.put("Albania", "AL");
        mapCountries.put("Algeria", "DZ");
        mapCountries.put("Andorra", "AD");
        mapCountries.put("Angola", "AO");
        mapCountries.put("Antigua and Barbuda", "AG");
        mapCountries.put("Argentina", "AR");
        mapCountries.put("Armenia", "AM");
        mapCountries.put("Australia", "AU");
        mapCountries.put("Austria", "AT");
        mapCountries.put("Azerbaijan", "AZ");
        mapCountries.put("Bahamas", "BS");
        mapCountries.put("Bahrain", "BH");
        mapCountries.put("Bangladesh", "BD");
        mapCountries.put("Barbados", "BB");
        mapCountries.put("Belarus", "BY");
        mapCountries.put("Belgium", "BE");
        mapCountries.put("Belize", "BZ");
        mapCountries.put("Benin", "BJ");
        mapCountries.put("Bhutan", "BT");
        mapCountries.put("Bolivia", "BO");
        mapCountries.put("Bosnia and Herzegovina", "BA");
        mapCountries.put("Botswana", "BW");
        mapCountries.put("Brazil", "BR");
        mapCountries.put("Brunei", "BN");
        mapCountries.put("Bulgaria", "BG");
        mapCountries.put("Burkina Faso", "BF");
        mapCountries.put("Burundi", "BI");
        mapCountries.put("Cabo Verde", "CV");
        mapCountries.put("Cambodia", "KH");
        mapCountries.put("Cameroon", "CM");
        mapCountries.put("Canada", "CA");
        mapCountries.put("Central African Republic", "CF");
        mapCountries.put("Chad", "TD");
        mapCountries.put("Chile", "CL");
        mapCountries.put("China", "CN");
        mapCountries.put("Colombia", "CO");
        mapCountries.put("Comoros", "KM");
        mapCountries.put("Congo (Congo-Brazzaville)", "CG");
        mapCountries.put("Congo (Democratic Republic of the Congo)", "CD");
        mapCountries.put("Costa Rica", "CR");
        mapCountries.put("Croatia", "HR");
        mapCountries.put("Cuba", "CU");
        mapCountries.put("Cyprus", "CY");
        mapCountries.put("Czech Republic", "CZ");
        mapCountries.put("Denmark", "DK");
        mapCountries.put("Djibouti", "DJ");
        mapCountries.put("Dominica", "DM");
        mapCountries.put("Dominican Republic", "DO");
        mapCountries.put("Ecuador", "EC");
        mapCountries.put("Egypt", "EG");
        mapCountries.put("El Salvador", "SV");
        mapCountries.put("Equatorial Guinea", "GQ");
        mapCountries.put("Eritrea", "ER");
        mapCountries.put("Estonia", "EE");
        mapCountries.put("Eswatini", "SZ");
        mapCountries.put("Ethiopia", "ET");
        mapCountries.put("Fiji", "FJ");
        mapCountries.put("Finland", "FI");
        mapCountries.put("France", "FR");
        mapCountries.put("Gabon", "GA");
        mapCountries.put("Gambia", "GM");
        mapCountries.put("Georgia", "GE");
        mapCountries.put("Germany", "DE");
        mapCountries.put("Ghana", "GH");
        mapCountries.put("Greece", "GR");
        mapCountries.put("Grenada", "GD");
        mapCountries.put("Guatemala", "GT");
        mapCountries.put("Guinea", "GN");
        mapCountries.put("Guinea-Bissau", "GW");
        mapCountries.put("Guyana", "GY");
        mapCountries.put("Haiti", "HT");
        mapCountries.put("Honduras", "HN");
        mapCountries.put("Hungary", "HU");
        mapCountries.put("Iceland", "IS");
        mapCountries.put("India", "IN");
        mapCountries.put("Indonesia", "ID");
        mapCountries.put("Iran", "IR");
        mapCountries.put("Iraq", "IQ");
        mapCountries.put("Ireland", "IE");
        mapCountries.put("Israel", "IL");
        mapCountries.put("Italy", "IT");
        mapCountries.put("Jamaica", "JM");
        mapCountries.put("Japan", "JP");
        mapCountries.put("Jordan", "JO");
        mapCountries.put("Kazakhstan", "KZ");
        mapCountries.put("Kenya", "KE");
        mapCountries.put("Kiribati", "KI");
        mapCountries.put("Korea (North)", "KP");
        mapCountries.put("Korea (South)", "KR");
        mapCountries.put("Kuwait", "KW");
        mapCountries.put("Kyrgyzstan", "KG");
        mapCountries.put("Laos", "LA");
        mapCountries.put("Latvia", "LV");
        mapCountries.put("Lebanon", "LB");
        mapCountries.put("Lesotho", "LS");
        mapCountries.put("Liberia", "LR");
        mapCountries.put("Libya", "LY");
        mapCountries.put("Liechtenstein", "LI");
        mapCountries.put("Lithuania", "LT");
        mapCountries.put("Luxembourg", "LU");
        mapCountries.put("Madagascar", "MG");
        mapCountries.put("Malawi", "MW");
        mapCountries.put("Malaysia", "MY");
        mapCountries.put("Maldives", "MV");
        mapCountries.put("Mali", "ML");
        mapCountries.put("Malta", "MT");
        mapCountries.put("Marshall Islands", "MH");
        mapCountries.put("Mauritania", "MR");
        mapCountries.put("Mauritius", "MU");
        mapCountries.put("Mexico", "MX");
        mapCountries.put("Micronesia", "FM");
        mapCountries.put("Moldova", "MD");
        mapCountries.put("Monaco", "MC");
        mapCountries.put("Mongolia", "MN");
        mapCountries.put("Montenegro", "ME");
        mapCountries.put("Morocco", "MA");
        mapCountries.put("Mozambique", "MZ");
        mapCountries.put("Myanmar (formerly Burma)", "MM");
        mapCountries.put("Namibia", "NA");
        mapCountries.put("Nauru", "NR");
        mapCountries.put("Nepal", "NP");
        mapCountries.put("Netherlands", "NL");
        mapCountries.put("New Zealand", "NZ");
        mapCountries.put("Nicaragua", "NI");
        mapCountries.put("Niger", "NE");
        mapCountries.put("Nigeria", "NG");
        mapCountries.put("North Macedonia", "MK");
        mapCountries.put("Norway", "NO");
        mapCountries.put("Oman", "OM");
        mapCountries.put("Pakistan", "PK");
        mapCountries.put("Palau", "PW");
        mapCountries.put("Panama", "PA");
        mapCountries.put("Papua New Guinea", "PG");
        mapCountries.put("Paraguay", "PY");
        mapCountries.put("Peru", "PE");
        mapCountries.put("Philippines", "PH");
        mapCountries.put("Poland", "PL");
        mapCountries.put("Portugal", "PT");
        mapCountries.put("Qatar", "QA");
        mapCountries.put("Romania", "RO");
        mapCountries.put("Russia", "RU");
        mapCountries.put("Rwanda", "RW");
        mapCountries.put("Saint Kitts and Nevis", "KN");
        mapCountries.put("Saint Lucia", "LC");
        mapCountries.put("Saint Vincent and the Grenadines", "VC");
        mapCountries.put("Samoa", "WS");
        mapCountries.put("San Marino", "SM");
        mapCountries.put("Sao Tome and Principe", "ST");
        mapCountries.put("Saudi Arabia", "SA");
        mapCountries.put("Senegal", "SN");
        mapCountries.put("Serbia", "RS");
        mapCountries.put("Seychelles", "SC");
        mapCountries.put("Sierra Leone", "SL");
        mapCountries.put("Singapore", "SG");
        mapCountries.put("Slovakia", "SK");
        mapCountries.put("Slovenia", "SI");
        mapCountries.put("Solomon Islands", "SB");
        mapCountries.put("Somalia", "SO");
        mapCountries.put("South Africa", "ZA");
        mapCountries.put("South Sudan", "SS");
        mapCountries.put("Spain", "ES");
        mapCountries.put("Sri Lanka", "LK");
        mapCountries.put("Sudan", "SD");
        mapCountries.put("Suriname", "SR");
        mapCountries.put("Sweden", "SE");
        mapCountries.put("Switzerland", "CH");
        mapCountries.put("Syria", "SY");
        mapCountries.put("Taiwan", "TW");
        mapCountries.put("Tajikistan", "TJ");
        mapCountries.put("Tanzania", "TZ");
        mapCountries.put("Thailand", "TH");
        mapCountries.put("Timor-Leste", "TL");
        mapCountries.put("Togo", "TG");
        mapCountries.put("Tonga", "TO");
        mapCountries.put("Trinidad and Tobago", "TT");
        mapCountries.put("Tunisia", "TN");
        mapCountries.put("Turkey", "TR");
        mapCountries.put("Turkmenistan", "TM");
        mapCountries.put("Tuvalu", "TV");
        mapCountries.put("Uganda", "UG");
        mapCountries.put("Ukraine", "UA");
        mapCountries.put("United Arab Emirates", "AE");
        mapCountries.put("United Kingdom", "GB");
        mapCountries.put("United States", "US");
        mapCountries.put("Uruguay", "UY");
        mapCountries.put("Uzbekistan", "UZ");
        mapCountries.put("Vanuatu", "VU");
        mapCountries.put("Vatican City", "VA");
        mapCountries.put("Venezuela", "VE");
        mapCountries.put("Vietnam", "VN");
        mapCountries.put("Yemen", "YE");
        mapCountries.put("Zambia", "ZM");
        mapCountries.put("Zimbabwe", "ZW");
        httpRequest.setAttribute("mapCountries", mapCountries);
        if (loggedIn && (logginRequest || logginPage)) {
            RequestDispatcher requestDis = httpRequest.getRequestDispatcher("/admin/");
            requestDis.forward(sr, sr1);

        } else if (loggedIn || logginRequest) {
            fc.doFilter(sr, sr1);
        } else {
            RequestDispatcher requestDis = httpRequest.getRequestDispatcher("login.jsp");
            requestDis.forward(sr, sr1);
        }
    }
}
