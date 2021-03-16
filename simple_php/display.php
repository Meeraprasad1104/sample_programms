<?php
$conn=mysqli_connect("localhost","root","","student") or die ("connection failed");
$sql1="select * from stud";
$result=mysqli_query($conn,$sql1);
if(mysqli_num_rows($result))
{
echo '<center><h1>student details </h1><table border="2" heigh="80%" width="60%"> <tr><th>Rollno</th><th>Name</th><th>Mark</th><th>Gender</th></tr>';
while($row=mysqli_fetch_assoc($result))
{
 echo '<tr><td>'.$row["rollno"].'</td><td>'.$row["name"].'</td><td>'.$row["mark"].'</td><td>'.$row["gender"].'</td></tr>';
}
echo '</table></center>';
}
else
{
echo '<script>alert("table empty");</script>';
}
mysqli_close($conn);
?>