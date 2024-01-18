$(document).ready(function () {
  //Llamada a la API
  $.get("URL_DE_TU_API", function (data) {

    var tableHtml = "<table class='table'><thead><tr><th>Home Team</th><th>Away Team</th><th>Home Score</th><th>Away Score</th><th>Status</th></tr></thead><tbody>";

    data.matches.forEach(function (match) {
      tableHtml += `<tr><td>${match["Home Team"]}</td><td>${match["Away Team"]}</td><td>${match["Home Score"]}</td><td>${match["Away Score"]}</td><td>${match["Status"]}</td></tr>`;
    });

    tableHtml += "</tbody></table>";


    $("#liveScoresTable").html(tableHtml);
  });
});
