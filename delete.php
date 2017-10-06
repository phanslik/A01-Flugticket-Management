<?php
include 'connection.php';

$id = $_POST['motherfuckingiddestodesofdoom'];

try {

    $sql = "DELETE FROM passengers WHERE id=".$id;

    $conn->exec($sql);
    echo "<br/>Record deleted successfully";
    }
catch(PDOException $e)
    {
    echo $sql . "<br>" . $e->getMessage();
    }

$conn = null;

?>
<br/>
<a href="persanzeige.php">Personen anzeigen</a>
