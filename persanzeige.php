<form action="persanzeige.php" method="post">
  <p>Flightnumber: <input type="text" name="flightnumber" /></p>
  <p><input type="submit" /></p>
</form>
<?php

  echo "</br>";
  include 'connection.php';

  if($_POST['flightnumber']!= NULL)
  {
    class TableRows extends RecursiveIteratorIterator
      {
        function __construct($it)
          {
            parent::__construct($it, self::LEAVES_ONLY);
          }

          function current()
          {
            return "<td style='width:150px;border:1px solid black;'>" . parent::current(). "</td>";
          }

          function beginChildren()
          {
            echo "<tr>";
          }

          function endChildren()
          {
            echo "</tr>" . "\n";
          }
        }


        echo "<table style='border: solid 1px black;'>";
        echo "<tr><th>Airline</th><th>flightnr</th><th>departure_time</th><th>departure_airport</th><th>destination_time</th><th>destination_airport</th><th>planetype</th></tr>";

        try
        {
          $stmt = $conn->prepare("SELECT * FROM flights where flightnr=".$_POST['flightnumber']);
          $stmt->execute();

          $result = $stmt->setFetchMode(PDO::FETCH_ASSOC);
          foreach(new TableRows(new RecursiveArrayIterator($stmt->fetchAll())) as $k=>$v)
          {
            echo $v;
          }
        }
        catch(PDOException $e)
        {
          echo "Error: " . $e->getMessage();
        }

        echo "</table>";


        $stmt = $conn->prepare("SELECT * FROM passengers where flightnr=".$_POST['flightnumber']." order by rownr,seatposition asc");

        if ($stmt->execute())
        {
          echo "<table style='border: solid 1px black;'>";

          echo "<tr><th>id</th><th>firstname</th><th>lastname</th><th>airline</th><th>flightnr</th><th>rownr</th><th>seatposition</th><th>Button</th></tr>";
          while ($row = $stmt->fetch(PDO::FETCH_ASSOC))
          {
            echo "<tr>";
  	        echo "<th style='width:150px;border:1px solid black;font-weight: normal;'>".$row['id']."</th>";
  	        echo "<th style='width:150px;border:1px solid black;font-weight: normal;'>".$row['firstname']."</th>";
  	        echo "<th style='width:150px;border:1px solid black;font-weight: normal;'>".$row['lastname']."</th>";
  	        echo "<th style='width:150px;border:1px solid black;font-weight: normal;'>".$row['airline']."</th>";
  	        echo "<th style='width:150px;border:1px solid black;font-weight: normal;'>".$row['flightnr']."</th>";
  	        echo "<th style='width:150px;border:1px solid black;font-weight: normal;'>".$row['rownr']."</th>";
            echo "<th style='width:150px;border:1px solid black;font-weight: normal;'>".$row['seatposition']."</th>";
            echo "<th> <form action='delete.php' method='post'><button type='submit' name='motherfuckingiddestodesofdoom' id='".$row['id']."' value='".$row['id']."'>Delete</button></form></th>";
            echo "</tr>";
          }

          echo "</table>";
        }

      }

?>
