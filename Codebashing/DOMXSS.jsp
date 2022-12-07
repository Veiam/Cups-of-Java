<!-- Document Object Model (DOM) Based XSS is a type of XSS attack wherein the attacker's payload is executed as a result of modifying the DOM âenvironmentâ in the victimâs browser used by the original client side script, so that the client side code runs in an âunexpectedâ manner. That is, the page itself (the HTTP response that is) does not change, but the client side code contained in the page executes differently due to the malicious modifications that have occurred in the DOM environment.  -->
<h6>
    <script>
        var name = document.location.hash.split('#')[1];
        if (name.match(/^[a-zA-Z0-9]*$/)) {
            document.write("Hello " + name + "! Please login or signup to access news stories");
        }
        else {
            window.alert("Security error");
        }
    </script>
</h6>