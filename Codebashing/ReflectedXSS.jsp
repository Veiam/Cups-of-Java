<!-- Unlike Persistent XSS, with Reflected Cross-site Scripting (XSS) attacker-supplied script code is never stored within the application itself. Instead the attacker crafts a malicious request to the application to illicit a single HTTP response by the application that contains the attacker's supplied script code. Successful attacks require victim users to open a maliciously crafted link (which is very easy to do). -->
<c:when test="${f:h(allRecordCount) != 0}">
    <jsp:include page="searchResults.jsp" />
</c:when>
<c:otherwise>
    <h4>No results found for: </h4>
    <p><em><strong>
                <c:out value="${<%= request.getParameter(" search") %>}"/>
            </strong></em></p>
    <!-- <p><em>
            <strong>
                <%= request.getParameter("search") %>
            </strong>
        </em></p> -->
</c:otherwise>