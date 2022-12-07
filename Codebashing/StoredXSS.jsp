<!-- Persistent Cross-Site Scripting (XSS) is an application vulnerability whereby a malicious user tricks a web application into storing attacker-supplied script code which is then later served to unsuspecting user(s) of the application. The attacker-supplied script code runs on the client-side system of other end user(s) of the application. This type of vulnerability is widespread and affects web applications that utilize (unvalidated) user-supplied input to generate (unencoded) application output, that is served to users.  -->
<table>
    <c:forEach var="contact" items="${contacts}">
        <tr>
            <!-- <td>${contact.name}</td>
            <td>${contact.title}</td>
            <td>${contact.number}</td> -->
            <td>
                <c:out value="${contact.name}" />
            </td>
            <td>
                <c:out value="${contact.title}" />
            </td>
            <td>
                <c:out value="${contact.number}" />
            </td>
        </tr>
    </c:forEach>
</table>