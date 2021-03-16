<html>
<head>
</head>
<title>
</title>
<body>
<form  name="abc"  action="#" method="POST">
<center><table border="1" width="60%" height="50%">
<tr> 
<td>rollno  </td>
<td> <input type="text" name="rollno" required> </td>
</tr>
<tr>  
<td> name </td>
<td> <input type="text" name="name" required> </td>
</tr>
<tr>
<td>  mark </td>
<td> <input type="text"  name="mark" required> </td>
</tr>
<tr>
<td> gender </td>
<td>  female <input type="radio" name="gender" value="female"> male  <input type="radio" name="gender" value="male"> </td>
</tr>
</table>
 <input type="submit" name="submit"> </center>

</form>
</body>
</html>

<?php
$conn=mysqli_connect("localhost","root","","student") or die ("connection failed");
if(isset($_POST["submit"]))
{
$rollno=$_POST["rollno"];
$name=$_POST["name"];
$mark=$_POST["mark"];
$gender=$_POST["gender"];
$sql="insert into stud values($rollno,'$name','$mark','$gender')";
if(mysqli_query($conn,$sql))
{
 echo ' <script>alert("NEW RECORD ADDED SUCCESSFULLY");</script>' ;
 header("location:display.php");
}
else
{
echo "error".mysqli_error($conn);
}
}


mysqli_close($conn);
?>