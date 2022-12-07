<!-- Cross-Site Request Forgery (CSRF) is an application security vulnerability that permits an attacker to force another logged-in user of the application to perform actions within that application without realising. The classic example is Bob and Alice both being logged-in users of an online banking application, and Bob tricks Alice into making a funds transfer to Bob's account with CSRF. Importantly, in CSRF attacks the attacker does not have a direct mechanism for seeing the application's response to the victim.  -->
<form action="/ideas/delete_all" method="post">
    <input type="hidden" name="scope" value="all">
    <button class="button redB" id="delete_button" style="margin:5px;">Delete All</button>
    <input type="hidden" name="csrf-token" value="uRARsEXKdVjX6iUnQkDcfHiNqvG">
</form>