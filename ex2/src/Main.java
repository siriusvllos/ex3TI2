import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World");

        get("/formulario", (req, res) -> {
            return "<form action='/consulta' method='post'>" +
                    "Nome: <input type='text' name='nome'><br>" +
                    "<input type='submit' value='Consultar'>" +
                    "</form>";
        });

        post("/consulta", (req, res) -> {
            String nome = req.queryParams("nome");
            return "Consulta para " + nome;
        });
    }