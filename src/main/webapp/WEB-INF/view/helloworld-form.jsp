<html>
<head>
<title>Hello world Input form</title>
</head>
<!-- 
here if we add /processform then url will turn into  http://localhost:8080/processform?studentName=sss from http://localhost:8080/SpringMVCDemo/processform?studentName=ss-->
<!--  processform or ./processform is relative to controller url from where this page came from -->
<form action="processform" method="GET">
	<input type="text" name="studentName" placeholder="What's your name?" />
	<input type="submit" />
</form>
<br>
<label>Controller demo with model </label>


<form action="processform-model" method="GET">
	<input type="text" name="studentName" placeholder="What's your name?" />
	<input type="submit" />
</form>


<label>Controller demo with model- @RequestParam </label>

<form action="processform-model-requestparam" method="GET">
	<input type="text" name="studentName" placeholder="What's your name?" />
	<input type="submit" />
</form>
</html>