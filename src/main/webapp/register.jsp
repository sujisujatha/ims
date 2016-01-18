<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Student Registration</h1>

	<form action="register.htm" method="post">
		First Name:<input type="text" name="firstName">
		<button type="button" class="btn btn-success">Register</button>
	</form>

	<form id="contactForm" method="post" class="form-horizontal">
		<div class="form-group">
			<label class="col-md-3 control-label">Full name</label>
			<div class="col-md-6">
				<input type="text" class="form-control" name="fullName" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-3 control-label">Email</label>
			<div class="col-md-6">
				<input type="text" class="form-control" name="email" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-3 control-label">Title</label>
			<div class="col-md-6">
				<input type="text" class="form-control" name="title" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-3 control-label">Content</label>
			<div class="col-md-6">
				<textarea class="form-control" name="content" rows="5"></textarea>
			</div>
		</div>
		<div class="form-group">
			<label for="sel1">Select list:</label>
			<div class="col-md-6">
				<select class="form-control" id="sel1">

					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
				</select>
			</div>
		</div>
		<!-- #messages is where the messages are placed inside -->
		<div class="form-group">
			<div class="col-md-9 col-md-offset-3">
				<div id="messages"></div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-9 col-md-offset-3">
				<button type="submit" class="btn btn-default">Validate</button>
			</div>
		</div>
	</form>
</body>
</html>