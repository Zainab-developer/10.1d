<?php

  require 'conn.php';

  $email=$_POST['email'];
  $password=md5($_POST['password']);

  $checkUser="SELECT * FROM creat_user WHERE email='$email'";

  $result=mysqli_query($conn,$checkUser);



  if(mysqli_num_rows($result)>0){ 

    $checkUserquery="SELECT id, username, email FROM creat_user WHERE email='$email' and password='$password'";
    $resultant=mysqli_query($conn,$checkUserquery);

    if(mysqli_num_rows($resultant)>0){

      while($row=$resultant->fetch_assoc())
      
      $response['user']=$row;
      $response['error']="200";
      $response['message']="login success";
    }
    else{
      $response['user']=(object)[];
      $response['error']="400";
      $response['message']="Wrong credentials";

    }
   
    
  }
  else{

    $response['user']=(object)[];
    $response['error']="400";
  	$response['message']="user does not exist";


  }

  echo json_encode($response);
    
?>