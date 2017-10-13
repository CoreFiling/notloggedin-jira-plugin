// contextPath is a global variable provided by JIRA for constructing relative paths
var allowAnonymous = function(){
    return window.location.href.search("[?&]anonymous=true") != -1;
};

if (!allowAnonymous) {
  window.location.href = contextPath + "/login.jsp?os_destination=" + window.location.href
}
