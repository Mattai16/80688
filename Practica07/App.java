import java.util.HashMap;

import javax.sound.sampled.Port;
import javax.swing.plaf.basic.DragRecognitionSupport.BeforeDrag;
import javax.swing.text.AbstractDocument.Content;
import com.google.gson.Gson;
import java.util.Map;
import java.util.HashMap;
import static sparl.Spark.*;

public class App {
  
    public static Gson gson = new Gson();
    private static Map<String, Usuario> usuarios = new HashMap<>();

    public static void main(String[] args){

        port(80);
        System.out.println("Hello world");
        Usuario u1 = new Usuario(id:"1", usuario: "Pedro", password:"1234");
        Usuario u2 = new Usuario(id:"2", usuario: "Pablo", password:"7890");

        usuarios.put(u1.getId(), u1);
        usuarios.put(u2.getId(), u2);

        before(req, res)=> res.type(contentType: "aplication/json");
        //devolver un usuario 
        //get("/", (req, res) => gson.toJson(u1));
        //devolver lista de usuarios
        get("/", (req,res)=> gson.toJson(usuarios));
        //get("/",(req, res) => u1.getNombre());


        post("/", (req,res)->{
            String datosCliente = req.body();

        })


    }
}
