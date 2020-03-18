<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCustomerServiceImplProxyid" scope="session" class="com.mtit.group.service.CustomerServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCustomerServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCustomerServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCustomerServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.mtit.group.service.CustomerServiceImpl getCustomerServiceImpl10mtemp = sampleCustomerServiceImplProxyid.getCustomerServiceImpl();
if(getCustomerServiceImpl10mtemp == null){
%>
<%=getCustomerServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 17:
        gotMethod = true;
        String id_1id=  request.getParameter("id34");
        int id_1idTemp  = Integer.parseInt(id_1id);
        com.mtit.group.beans.Customer checkTheCutomerBill17mtemp = sampleCustomerServiceImplProxyid.checkTheCutomerBill(id_1idTemp);
if(checkTheCutomerBill17mtemp == null){
%>
<%=checkTheCutomerBill17mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">roomNumber:</TD>
<TD>
<%
if(checkTheCutomerBill17mtemp != null){
%>
<%=checkTheCutomerBill17mtemp.getRoomNumber()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(checkTheCutomerBill17mtemp != null){
%>
<%=checkTheCutomerBill17mtemp.getAge()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(checkTheCutomerBill17mtemp != null){
java.lang.String typename24 = checkTheCutomerBill17mtemp.getName();
        String tempResultname24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename24));
        %>
        <%= tempResultname24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">amount:</TD>
<TD>
<%
if(checkTheCutomerBill17mtemp != null){
%>
<%=checkTheCutomerBill17mtemp.getAmount()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">numberOfPeople:</TD>
<TD>
<%
if(checkTheCutomerBill17mtemp != null){
%>
<%=checkTheCutomerBill17mtemp.getNumberOfPeople()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">numberOfDays:</TD>
<TD>
<%
if(checkTheCutomerBill17mtemp != null){
%>
<%=checkTheCutomerBill17mtemp.getNumberOfDays()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">cid:</TD>
<TD>
<%
if(checkTheCutomerBill17mtemp != null){
%>
<%=checkTheCutomerBill17mtemp.getCid()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 36:
	gotMethod = true;
    com.mtit.group.beans.Employee[] getallEmployeedetails36mtemp = sampleCustomerServiceImplProxyid.getallEmployeedetails();
	if(getallEmployeedetails36mtemp == null){
	%>
	<%=getallEmployeedetails36mtemp %>
	<%
	}else{
        String tempreturnp37 = null;
        if(getallEmployeedetails36mtemp != null){
        java.util.List<com.mtit.group.beans.Employee> listreturnp37= java.util.Arrays.asList(getallEmployeedetails36mtemp);
        	//tempreturnp37 = listreturnp37.toString();
        	for(com.mtit.group.beans.Employee e :listreturnp37){
        		int eid = e.getEid();
        		String name = e.getName();
        		int age = e.getAge();
        		String marriageStatus = e.getMarriageStatus();
        		String address = e.getAddress();
        		float workinghoursperday = e.getWorkinghoursperday();
        		float amountperhour = e.getAmountperhour();
        		
        		%>
         		<%=eid %>::<%=name %>::<%=age %>::<%=marriageStatus %>::<%=address%>::<%=workinghoursperday*amountperhour*30 %>
         		<%
        	}
        }
}
break;
case 39:
        gotMethod = true;
        String eid_2id=  request.getParameter("eid56");
        int eid_2idTemp  = Integer.parseInt(eid_2id);
        com.mtit.group.beans.Employee checktheEmployeePayout39mtemp = sampleCustomerServiceImplProxyid.checktheEmployeePayout(eid_2idTemp);
if(checktheEmployeePayout39mtemp == null){
%>
<%=checktheEmployeePayout39mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">address:</TD>
<TD>
<%
if(checktheEmployeePayout39mtemp != null){
java.lang.String typeaddress42 = checktheEmployeePayout39mtemp.getAddress();
        String tempResultaddress42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddress42));
        %>
        <%= tempResultaddress42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">eid:</TD>
<TD>
<%
if(checktheEmployeePayout39mtemp != null){
%>
<%=checktheEmployeePayout39mtemp.getEid()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(checktheEmployeePayout39mtemp != null){
%>
<%=checktheEmployeePayout39mtemp.getAge()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(checktheEmployeePayout39mtemp != null){
java.lang.String typename48 = checktheEmployeePayout39mtemp.getName();
        String tempResultname48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename48));
        %>
        <%= tempResultname48 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workinghoursperday:</TD>
<TD>
<%
if(checktheEmployeePayout39mtemp != null){
%>
<%=checktheEmployeePayout39mtemp.getWorkinghoursperday()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">amountperhour:</TD>
<TD>
<%
if(checktheEmployeePayout39mtemp != null){
%>
<%=checktheEmployeePayout39mtemp.getAmountperhour()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">marriageStatus:</TD>
<TD>
<%
if(checktheEmployeePayout39mtemp != null){
java.lang.String typemarriageStatus54 = checktheEmployeePayout39mtemp.getMarriageStatus();
        String tempResultmarriageStatus54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemarriageStatus54));
        %>
        <%= tempResultmarriageStatus54 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 58:
        gotMethod = true;
        String pid_3id=  request.getParameter("pid61");
        int pid_3idTemp  = Integer.parseInt(pid_3id);
        boolean removepoolbooking58mtemp = sampleCustomerServiceImplProxyid.removepoolbooking(pid_3idTemp);
        String tempResultreturnp59 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removepoolbooking58mtemp));
        %>
        <%= tempResultreturnp59 %>
        <%
break;
case 63:
	gotMethod = true;
    com.mtit.group.beans.Customer[] getallCustomerdetails44mtemp = sampleCustomerServiceImplProxyid.getallCustomerdetails();
	if(getallCustomerdetails44mtemp == null){
	%>
	<%=getallCustomerdetails44mtemp %>
	<%
	}else{
        String tempreturnp45 = null;
        if(getallCustomerdetails44mtemp != null){
        java.util.List<com.mtit.group.beans.Customer> listreturnp45= java.util.Arrays.asList(getallCustomerdetails44mtemp);
         	//tempreturnp45 = listreturnp45.toString();
         	for(com.mtit.group.beans.Customer c : listreturnp45){
         		int cid = c.getCid();
         		String name = c.getName();
         		int age = c.getAge();
         		int roomNumber = c.getNumberOfDays();
         		int numberOfPeople = c.getNumberOfPeople();
         		int numberOfDays = c.getNumberOfDays();
         		double amount = c.getAmount();
         		%>
         		<%=cid %>::<%=name %>::<%=age %>::<%=roomNumber %>::<%=numberOfPeople*numberOfDays*amount%>
         		<%
         	}
        }
}
break;
case 66:
        gotMethod = true;
        String id_4id=  request.getParameter("id69");
        int id_4idTemp  = Integer.parseInt(id_4id);
        boolean removeCutomer66mtemp = sampleCustomerServiceImplProxyid.removeCutomer(id_4idTemp);
        String tempResultreturnp67 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeCutomer66mtemp));
        %>
        <%= tempResultreturnp67 %>
        <%
break;
case 71:
        gotMethod = true;
        String roomNumber_6id=  request.getParameter("roomNumber76");
        int roomNumber_6idTemp  = Integer.parseInt(roomNumber_6id);
        String age_7id=  request.getParameter("age78");
        int age_7idTemp  = Integer.parseInt(age_7id);
        String name_8id=  request.getParameter("name80");
            java.lang.String name_8idTemp = null;
        if(!name_8id.equals("")){
         name_8idTemp  = name_8id;
        }
        String amount_9id=  request.getParameter("amount82");
        double amount_9idTemp  = Double.parseDouble(amount_9id);
        String numberOfPeople_10id=  request.getParameter("numberOfPeople84");
        int numberOfPeople_10idTemp  = Integer.parseInt(numberOfPeople_10id);
        String numberOfDays_11id=  request.getParameter("numberOfDays86");
        int numberOfDays_11idTemp  = Integer.parseInt(numberOfDays_11id);
        String cid_12id=  request.getParameter("cid88");
        int cid_12idTemp  = Integer.parseInt(cid_12id);
        %>
        <jsp:useBean id="com1mtit1group1beans1Customer_5id" scope="session" class="com.mtit.group.beans.Customer" />
        <%
        com1mtit1group1beans1Customer_5id.setRoomNumber(roomNumber_6idTemp);
        com1mtit1group1beans1Customer_5id.setAge(age_7idTemp);
        com1mtit1group1beans1Customer_5id.setName(name_8idTemp);
        com1mtit1group1beans1Customer_5id.setAmount(amount_9idTemp);
        com1mtit1group1beans1Customer_5id.setNumberOfPeople(numberOfPeople_10idTemp);
        com1mtit1group1beans1Customer_5id.setNumberOfDays(numberOfDays_11idTemp);
        com1mtit1group1beans1Customer_5id.setCid(cid_12idTemp);
        boolean addCutomer71mtemp = sampleCustomerServiceImplProxyid.addCutomer(com1mtit1group1beans1Customer_5id);
        String tempResultreturnp72 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addCutomer71mtemp));
        %>
        <%= tempResultreturnp72 %>
        <%
break;
case 90:
        gotMethod = true;
        String address_14id=  request.getParameter("address95");
            java.lang.String address_14idTemp = null;
        if(!address_14id.equals("")){
         address_14idTemp  = address_14id;
        }
        String eid_15id=  request.getParameter("eid97");
        int eid_15idTemp  = Integer.parseInt(eid_15id);
        String age_16id=  request.getParameter("age99");
        int age_16idTemp  = Integer.parseInt(age_16id);
        String name_17id=  request.getParameter("name101");
            java.lang.String name_17idTemp = null;
        if(!name_17id.equals("")){
         name_17idTemp  = name_17id;
        }
        String workinghoursperday_18id=  request.getParameter("workinghoursperday103");
        float workinghoursperday_18idTemp  = Float.parseFloat(workinghoursperday_18id);
        String amountperhour_19id=  request.getParameter("amountperhour105");
        float amountperhour_19idTemp  = Float.parseFloat(amountperhour_19id);
        String marriageStatus_20id=  request.getParameter("marriageStatus107");
            java.lang.String marriageStatus_20idTemp = null;
        if(!marriageStatus_20id.equals("")){
         marriageStatus_20idTemp  = marriageStatus_20id;
        }
        %>
        <jsp:useBean id="com1mtit1group1beans1Employee_13id" scope="session" class="com.mtit.group.beans.Employee" />
        <%
        com1mtit1group1beans1Employee_13id.setAddress(address_14idTemp);
        com1mtit1group1beans1Employee_13id.setEid(eid_15idTemp);
        com1mtit1group1beans1Employee_13id.setAge(age_16idTemp);
        com1mtit1group1beans1Employee_13id.setName(name_17idTemp);
        com1mtit1group1beans1Employee_13id.setWorkinghoursperday(workinghoursperday_18idTemp);
        com1mtit1group1beans1Employee_13id.setAmountperhour(amountperhour_19idTemp);
        com1mtit1group1beans1Employee_13id.setMarriageStatus(marriageStatus_20idTemp);
        boolean addEmployee90mtemp = sampleCustomerServiceImplProxyid.addEmployee(com1mtit1group1beans1Employee_13id);
        String tempResultreturnp91 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addEmployee90mtemp));
        %>
        <%= tempResultreturnp91 %>
        <%
break;
case 109:
        gotMethod = true;
        String id_21id=  request.getParameter("id112");
        int id_21idTemp  = Integer.parseInt(id_21id);
        boolean removeEmployee109mtemp = sampleCustomerServiceImplProxyid.removeEmployee(id_21idTemp);
        String tempResultreturnp110 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeEmployee109mtemp));
        %>
        <%= tempResultreturnp110 %>
        <%
break;
case 114:
        gotMethod = true;
        String laid_23id=  request.getParameter("laid119");
        int laid_23idTemp  = Integer.parseInt(laid_23id);
        String eid_24id=  request.getParameter("eid121");
        int eid_24idTemp  = Integer.parseInt(eid_24id);
        String date_25id=  request.getParameter("date123");
            java.lang.String date_25idTemp = null;
        if(!date_25id.equals("")){
         date_25idTemp  = date_25id;
        }
        String reason_26id=  request.getParameter("reason125");
            java.lang.String reason_26idTemp = null;
        if(!reason_26id.equals("")){
         reason_26idTemp  = reason_26id;
        }
        %>
        <jsp:useBean id="com1mtit1group1beans1Applyleaves_22id" scope="session" class="com.mtit.group.beans.Applyleaves" />
        <%
        com1mtit1group1beans1Applyleaves_22id.setLaid(laid_23idTemp);
        com1mtit1group1beans1Applyleaves_22id.setEid(eid_24idTemp);
        com1mtit1group1beans1Applyleaves_22id.setDate(date_25idTemp);
        com1mtit1group1beans1Applyleaves_22id.setReason(reason_26idTemp);
        boolean addleavecard114mtemp = sampleCustomerServiceImplProxyid.addleavecard(com1mtit1group1beans1Applyleaves_22id);
        String tempResultreturnp115 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addleavecard114mtemp));
        %>
        <%= tempResultreturnp115 %>
        <%
break;
case 127:
        gotMethod = true;
        String leid_27id=  request.getParameter("leid138");
        int leid_27idTemp  = Integer.parseInt(leid_27id);
        com.mtit.group.beans.Applyleaves seeleavecrad127mtemp = sampleCustomerServiceImplProxyid.seeleavecrad(leid_27idTemp);
if(seeleavecrad127mtemp == null){
%>
<%=seeleavecrad127mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">laid:</TD>
<TD>
<%
if(seeleavecrad127mtemp != null){
%>
<%=seeleavecrad127mtemp.getLaid()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">eid:</TD>
<TD>
<%
if(seeleavecrad127mtemp != null){
%>
<%=seeleavecrad127mtemp.getEid()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">date:</TD>
<TD>
<%
if(seeleavecrad127mtemp != null){
java.lang.String typedate134 = seeleavecrad127mtemp.getDate();
        String tempResultdate134 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedate134));
        %>
        <%= tempResultdate134 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reason:</TD>
<TD>
<%
if(seeleavecrad127mtemp != null){
java.lang.String typereason136 = seeleavecrad127mtemp.getReason();
        String tempResultreason136 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereason136));
        %>
        <%= tempResultreason136 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 140:
	gotMethod = true;
    com.mtit.group.beans.Applyleaves[] seeallleavecard130mtemp = sampleCustomerServiceImplProxyid.seeallleavecard();
	if(seeallleavecard130mtemp == null){
	%>
	<%=seeallleavecard130mtemp %>
	<%
	}else{
    String tempreturnp131 = null;
    if(seeallleavecard130mtemp != null){
    java.util.List<com.mtit.group.beans.Applyleaves> listreturnp131= java.util.Arrays.asList(seeallleavecard130mtemp);
    //tempreturnp131 = listreturnp131.toString();
    for(com.mtit.group.beans.Applyleaves a : listreturnp131){
    	int id = a.getLaid();
    	int eid = a.getEid();
    	String reason = a.getReason();
    	String date= a.getDate();
    	%>
    	<%=id%>::<%=eid %>::<%=reason %>::<%=date %> 
    	<%
    	}
    }
}
break;
case 143:
        gotMethod = true;
        String leid_28id=  request.getParameter("leid146");
        int leid_28idTemp  = Integer.parseInt(leid_28id);
        boolean removeleaveCard143mtemp = sampleCustomerServiceImplProxyid.removeleaveCard(leid_28idTemp);
        String tempResultreturnp144 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeleaveCard143mtemp));
        %>
        <%= tempResultreturnp144 %>
        <%
break;
case 148:
        gotMethod = true;
        String pid_29id=  request.getParameter("pid159");
        int pid_29idTemp  = Integer.parseInt(pid_29id);
        com.mtit.group.beans.PoolUsage seepoolbooking148mtemp = sampleCustomerServiceImplProxyid.seepoolbooking(pid_29idTemp);
if(seepoolbooking148mtemp == null){
%>
<%=seepoolbooking148mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">hours:</TD>
<TD>
<%
if(seepoolbooking148mtemp != null){
%>
<%=seepoolbooking148mtemp.getHours()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reasontobook:</TD>
<TD>
<%
if(seepoolbooking148mtemp != null){
java.lang.String typereasontobook153 = seepoolbooking148mtemp.getReasontobook();
        String tempResultreasontobook153 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereasontobook153));
        %>
        <%= tempResultreasontobook153 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pid:</TD>
<TD>
<%
if(seepoolbooking148mtemp != null){
%>
<%=seepoolbooking148mtemp.getPid()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">day:</TD>
<TD>
<%
if(seepoolbooking148mtemp != null){
java.lang.String typeday157 = seepoolbooking148mtemp.getDay();
        String tempResultday157 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeday157));
        %>
        <%= tempResultday157 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 161:
	gotMethod = true;
    com.mtit.group.beans.PoolUsage[] seeallpoolusage66mtemp = sampleCustomerServiceImplProxyid.seeallpoolusage();
	if(seeallpoolusage66mtemp == null){
	%>
	<%=seeallpoolusage66mtemp %>
	<%
	}else{
        String tempreturnp67 = null;
        if(seeallpoolusage66mtemp != null){
        	java.util.List<com.mtit.group.beans.PoolUsage> listreturnp67= java.util.Arrays.asList(seeallpoolusage66mtemp);
    		//tempreturnp67 = listreturnp67.toString();
        	for(com.mtit.group.beans.PoolUsage p : listreturnp67){
        		int pid =  p.getPid();
        		String reasontobook = p.getReasontobook() ;
        		int hours = p.getHours();
        		String day = p.getDay();
        		%>
            	<%=pid%>::<%=reasontobook %>::<%=hours %>::<%=day%>
            	<%
	        }
		}
	}
break;
case 164:
        gotMethod = true;
        String hours_31id=  request.getParameter("hours169");
        int hours_31idTemp  = Integer.parseInt(hours_31id);
        String reasontobook_32id=  request.getParameter("reasontobook171");
            java.lang.String reasontobook_32idTemp = null;
        if(!reasontobook_32id.equals("")){
         reasontobook_32idTemp  = reasontobook_32id;
        }
        String pid_33id=  request.getParameter("pid173");
        int pid_33idTemp  = Integer.parseInt(pid_33id);
        String day_34id=  request.getParameter("day175");
            java.lang.String day_34idTemp = null;
        if(!day_34id.equals("")){
         day_34idTemp  = day_34id;
        }
        %>
        <jsp:useBean id="com1mtit1group1beans1PoolUsage_30id" scope="session" class="com.mtit.group.beans.PoolUsage" />
        <%
        com1mtit1group1beans1PoolUsage_30id.setHours(hours_31idTemp);
        com1mtit1group1beans1PoolUsage_30id.setReasontobook(reasontobook_32idTemp);
        com1mtit1group1beans1PoolUsage_30id.setPid(pid_33idTemp);
        com1mtit1group1beans1PoolUsage_30id.setDay(day_34idTemp);
        boolean addpoolbooking164mtemp = sampleCustomerServiceImplProxyid.addpoolbooking(com1mtit1group1beans1PoolUsage_30id);
        String tempResultreturnp165 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addpoolbooking164mtemp));
        %>
        <%= tempResultreturnp165 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>