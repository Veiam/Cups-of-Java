<!-- Clickjacking, also known as a "UI redress attack", is when an attacker uses multiple transparent or opaque layers to trick a user into clicking on a button or link on another page when they were intending to click on the the top level page. Thus, the attacker is "hijacking" clicks meant for their page and routing them to another page, most likely owned by another application, domain, or both. -->
<IfModule mod_headers.so>
    Header set X-Frame-Options "deny"
    Header set Content-Security-Policy: frame-optins 'deny';
    Header set X-Content-Security-policy; frame-options 'deny';
</IfModule>