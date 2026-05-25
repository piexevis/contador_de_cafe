import javax.swing.*; // libreria para ver y crear toda la visual o interface como ustedes digan a esta mrd
public class Contador extends JFrame { // herencia para hacer la ventana con JFrame
    private JLabel Label1, Label2; //Text 1 (pos creo que es obvio, no?), Text 2 (diversion XD) (pd2: tuve que ponerle un for para no poner tanto linea con label?)
    private JButton Button1, Button2; // boton para aumentar el contador, reset, por si acaso supongo
    private int Count = 0; // contador para el cafe
    public Contador(){
        setLayout(null);
        //declaraciones
        Label1 = new JLabel("cantidad de cafe consumido " + Count); //texto 1 para llevar la cuenta :P
        Label2 = new JLabel("un cafe no te haria mal");
        Button1 = new JButton("tomar cafe");
        Button2 = new JButton("resetear contador");
        //posicones
        Label1.setBounds(10, 20, 200, 30);
        add(Label1);
        Button1.setBounds(10, 60, 100, 30);
        add(Button1);
        Label2.setBounds(10, 120, 450, 30);
        add(Label2);
        Button2.setBounds(120, 60, 100, 30);
        add(Button2);
        //acciones
        Button1.addActionListener(aument_cont -> {
            Count++; //el contrador aumenta en 1
            Label1.setText("cantidad de cafe consumido " +Count);
            switch (Count) { //dependiendo del caso diferente mensaje
                case 5 -> Label2.setText("ey... podrias calmarte un poco, no?");
                case 10 -> Label2.setText("creo que tu presion esta bastante alta");
                case 15 -> Label2.setText("wow, si que debes de tener una tarea importante para tanto cafe");
                case 20 -> Label2.setText("hola? taquicardia acercandose?");
                case 21 -> Label2.setText("sigues vivo?");
            }
        });
        Button2.addActionListener(resetear -> { //pos... para reiniciar el contador, ya lo dije antes, no?
            Count = 0;
            Label1.setText("cantidad de cafe consumido " +Count);
            Label2.setText("un cafe no te haria mal");
        });
    }
  
    public static void main(String[] args) {
        Contador count1= new Contador();
        count1.setBounds(100, 100, 480, 200); //dimensiones para que no sea un microbio
        count1.setVisible(true);//para que sea visible la ventana, obvio
        count1.setLocationRelativeTo(null); //para que aparezca en el centro, mish
        count1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para poder cerrar la ventana
    }
}
/*
    setLayout(null); hacerlo todo manual
    setLayout(new FlowLayout()); de izquierda a derecha
    setLayout(new BorderLayout()); por zonas ->
        add(Label1, BorderLayout.NORTH);   arriba
        add(Button1, BorderLayout.CENTER); centro
        add(Label2, BorderLayout.SOUTH);   abajo
    setLayout(new GridLayout(3, 2)); como una tabla 3 filas, 2 columnas
*/

