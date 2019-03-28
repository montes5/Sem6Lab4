<%@ page import="rmilab.Client" %>
<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<jsp:include page="../html/pageBegin.jsp"></jsp:include>
<jsp:include page="../html/pages/page1.jsp"></jsp:include>
<div class="mdl-textfield mdl-js-textfield">
    <textarea class="mdl-textfield__input" type="text" rows= "3" id="sample5" readonly><%= new Client().getResult(request) %></textarea>
    <label class="mdl-textfield__label" for="sample5"></label>
</div>
<jsp:include page="../html/pageEnd.jsp"></jsp:include>