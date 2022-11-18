package ldsc.tf_lol;

import java.util.LinkedList;
import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

    String rutaDeAcceso = "C:\\Users\\Dihue\\Desktop\\Repositories\\Trabajo_Final_LSDC\\";

    public Ventana() {
        initComponents();
        logoIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\logo.gif"));
        funcionCamp();
        campeonIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\champ.png"));
        claseIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\def.png"));
    }

    public LinkedList<Personaje> funcionCamp() {

        LinkedList<Personaje> campeonesLista = new LinkedList<>();

        Personaje defaultPersonaje = new Personaje("(Elegir campeón)", " ", " ", 0, " ", " ");
        defaultPersonaje.agregarHabilidad(0, new Habilidad(" ", "P", 0));
        defaultPersonaje.agregarHabilidad(1, new Habilidad(" ", "P", 0));
        defaultPersonaje.agregarHabilidad(2, new Habilidad(" ", "P", 0));
        defaultPersonaje.agregarHabilidad(3, new Habilidad(" ", "P", 0));
        defaultPersonaje.agregarHabilidad(4, new Habilidad(" ", "P", 0));
        campeonesLista.add(defaultPersonaje);

        //CREACION DE CAMPEONES
        Personaje c1 = new Personaje("Ashe", "Como Hija del Hielo y madre de guerra de la tribu Avarosa, Ashe comanda la más grande horda en el norte. Estoica, inteligente e idealista, pero incómoda con su rol de líder, ella aprovecha las magias ancestrales de su linaje para portar un arco de Hielo Puro. Apoyada por la creencia de su gente que ella es el héroe mitológico reencarnado de Avarosa, Ashe espera unificar el Fréljord una vez más al retomar sus tierras antiguas y tribales.", "La Arquera de Hielo", 450, "Tirador", "Freljord");
        Personaje c2 = new Personaje("Gwen", "Gwen, una antigua muñeca que se transformó y cobró vida a través de la magia, usa las mismas herramientas que en su momento la crearon. Lleva el peso del amor de su creadora a cada paso, sin dar nada por sentado. Bajo su mando está la Niebla Sagrada, una magia antigua y protectora que bendijo las tijeras, las agujas y el hilo de coser de Gwen. Muchas cosas son nuevas para Gwen, pero sigue decidida a luchar con gozo por el bien que prevalece en un mundo roto.", "La Costurera Sagrada", 6300, "Luchador", "Islas de las Sombras");
        Personaje c3 = new Personaje("Hecarim", "Hecarim es una fusión espectral de un hombre y una bestia condenada a llevar las almas de los vivos por toda la eternidad. Cuando las Islas Bendecidas cayeron en oscuridad, este orgulloso caballero fue arrasado por la destructiva energía de la Ruina junto a su caballería y sus monturas. Ahora, cuando la Niebla Negra se esparce por Runaterra, él encabeza la devastadora carga, se deleita en la matanza que causa y aplasta al enemigo bajo sus pezuñas acorazadas.", "La Sombra de la Guerra", 3150, "Luchador", "Islas de las Sombras");
        Personaje c4 = new Personaje("Jhin", "Jhin es un psicópata meticuloso que cree que el asesinato es un arte. Alguna vez un prisionero jonio, pero liberado por elementos sombríos dentro del concejo líder de Jonia, el asesino en serie ahora presta sus servicios como sicario a esa camarilla. Utilizando su arma como un pincel, Jhin crea obras de arte brutales que horrorizan a sus víctimas y testigos. Mostrar sus obras de horripilante drama le causa un placer retorcido, lo que lo convierte en la mejor opción para mandar el más poderoso de los mensajes: el terror.", "El Virtuoso", 6300, "Tirador", "Jonia");
        Personaje c5 = new Personaje("Leona", "Leona es una guerrera imbuida con fuego solar y templaria de los Solari que defiende el Monte Targón con la Espada del Cénit y el Escudo del Amanecer. Su piel resplandece con el brillo de una estrella y sus ojos arden con el poder del aspecto celestial que lleva dentro. Leona, que viste una armadura de oro y soporta una terrible carga de conocimiento ancestral, lleva iluminación a algunos y muerte a otros.", "El Amanecer Radiante", 3150, "Tanque", "Targón");
        Personaje c6 = new Personaje("Lux", "Luxanna Guardia de la Corona proviene de Demacia, un reino aislado en el que la gente observa con terror y sospecha a las habilidades mágicas. Con el talento de manipular la luz a su voluntad, Lux creció temiendo que la descubrieran y exiliaran, lo que la obligó a mantener su poder en secreto para conservar el estado de nobleza de su familia. Sin embargo, su optimismo y resistencia la llevaron a aceptar sus talentos únicos y ahora los utiliza en secreto para servir a su tierra.", "La Dama Luminosa", 3150, "Mago", "Demacia");
        Personaje c7 = new Personaje("Pantheon", "Antaño un reticente huésped del Aspecto de la guerra, Atreus sobrevivió cuando el poder celestial en su interior fue asesinado, negándose a sucumbir ante un golpe que, de un desgarro, borró estrellas de los cielos. Con el tiempo, aprendió a aceptar el poder de su propia mortalidad, así como la terca resiliencia implícita en ella. Ahora, Atreus combate lo divino como el renacido Pantheon, con una voluntad implacable que alimenta las armas del aspecto caído en el campo de batalla.", "La Lanza Inquebrantable", 3150, "Asesino", "Targón");
        Personaje c8 = new Personaje("Rakan", "Tan impredecible como encantador, Rakan es un vastaya infame que siempre se mete en problemas, además de ser el mejor guerrero bailarín en la historia tribal de Lhotlan. Para los humanos de las tierras altas de Jonia, su nombre ha sido por mucho tiempo sinónimo de festivales salvajes, fiestas incontrolables y música anárquica. Pocos se imaginarían que este artista energético y viajero también es pareja de la rebelde Xayah, dedicado a su causa.", "El Encantador", 6300, "Soporte", "Jonia");
        Personaje c9 = new Personaje("Ryze", "Ryze, considerado por muchos como uno de los hechiceros más expertos en Runaterra, es un antiguo y endurecido archimago con una responsabilidad casi imposible de llevar. Armado con una constitución sin igual y una gran gama de conocimiento místico, se pasa la vida buscando Runas del Mundo, fragmentos de magia pura que alguna vez moldearon el mundo a partir de la nada. Debe recuperar esos glifos antes de que caigan en las manos equivocadas porque, aunque alguna vez se usaron para construir a Runaterra, también se pueden utilizar para destruirla.", "El Mago Rúnico", 450, "Mago", "Runeterra");
        Personaje c10 = new Personaje("Twisted Fate", "Twisted Fate es un afamado experto en juegos de cartas y estafador. Ha apostado y usado su encanto en gran parte del mundo conocido, lo que le ha hecho ganarse el odio y la admiración de ricos y tontos por igual. Rara vez se toma las cosas en serio, despierta cada día con una burlesca sonrisa y un descuidado aire de fanfarrón. Por donde se vea, Twisted Fate siempre tiene un as bajo la manga.", "El Maestro de las Cartas", 1350, "Mago", "Aguasturbias");
        Personaje c11 = new Personaje("Zac", "Zac es el producto de un derrame tóxico que pasó por una soldadura quimtech y que cayó en una caverna aislada en lo profundo del Sumidero de Zaun. A pesar de su humilde origen, Zac pasó de ser un fluido primigenio a un ser pensante que vive en las tuberías de la ciudad y que emerge de vez en cuando para ayudar a quienes lo necesitan o para reconstruir la infraestructura rota de Zaun.", "El Arma Secreta", 4800, "Tanque", "Zaun");
        Personaje c12 = new Personaje("Nocturne", "Nocturne, una fusión demoniaca traída de las pesadillas que aterran a todas las mentes conscientes, se convirtió en una fuerza primigenia de maldad pura. Su aspecto de caos líquido es el de una sombra sin rostro con ojos crueles y armado con unas cuchillas diabólicas. Después de liberarse a sí mismo del reino espiritual, Nocturne descendió al mundo de los despiertos para alimentarse del terror que prospera en la auténtica oscuridad.", "La Pesadilla Eterna", 3150, "Asesino", "Runeterra");
        Personaje c13 = new Personaje("Pyke", "Un reconocido arponero de los Muelles del Matadero de Aguasturbias, Pyke debió encontrarse con su fin en el estómago de un enorme leviatán... pero logró regresar. Ahora acecha los húmedos callejones y rincones de su anterior ciudad y usa sus nuevos dones sobrenaturales para dar fin a las vidas de quienes explotan a otros por dinero de manera rápida y violenta. Y así, una ciudad que era reconocida por cazar monstruos ahora está al acecho de uno.", "El Destripador del Muelle Rojo", 6300, "Asesino", "Aguasturbias");
        Personaje c14 = new Personaje("Jinx", "Jinx, una maniática e impulsiva criminal de Zaun, vive para sembrar el caos sin pararse a pensar en las consecuencias. Con un arsenal de juguetes letales a su disposición, desata las explosiones más brillantes y los estallidos más ruidosos para dejar un rastro de caos y pánico a su paso. Jinx detesta el aburrimiento y con una gran alegría deja su marca de pandemonio a dondequiera que vaya.", "La Bala Perdida", 4800, "Tirador", "Zaun");
        Personaje c15 = new Personaje("Rek'Sai", "Rek'Sai es una depredadora sin piedad y un engendro del Vacío que se mueve debajo de la tierra para emboscar y devorar a las presas desprevenidas. Su hambre insaciable ha dejado en calidad de desecho a regiones enteras del antes gran imperio de Shurima. Comerciantes, mercaderes y hasta caravanas armadas viajan se desvían cientos de kilómetros de su camino para evitar sus tierras de caza y las de sus descendientes. Todos saben que cuando Rek'Sai aparece en el horizonte, es una garantía que la muerte vendrá desde abajo.", "La Excavadora del Vacío", 4800, "Luchador", "El Vacío");
        Personaje c16 = new Personaje("Fiddlesticks", "Algo ha despertado en Runaterra. Algo ancestral. Algo terrible. El horror eterno conocido como Fiddlesticks acecha los bordes de la sociedad mortal, atraído por los espacios en donde la paranoia abunda, en los que se alimenta de sus aterradas víctimas. Acompañado de una guadaña dentada, la criatura demacrada y burda siega el miedo mismo y reduce a añicos las mentes de los desafortunados sobrevivientes tras su paso. Cuidado con el graznido del cuervo o con el suspiro de la forma que parece ser <i>casi</i> humana: Fiddlesticks ha vuelto.", "El Terror Ancestral", 1350, "Mago", "Runeterra");
        Personaje c17 = new Personaje("Bardo", "El Bardo es un viajero de un reino más allá de las estrellas y un agente de la serendipia quien lucha por conservar el balance donde sea que la vida resista la indiferencia del caos. Muchas canciones de Runaterra hablan sobre su extraordinaria naturaleza y todas ellas dicen que los artefactos de un inmenso poder mágico atraen al vagabundo cósmico. Rodeado por un alegre coro de espíritus de meeps, es imposible pensar que sus acciones son malévolas, ya que el Bardo siempre busca servir al bien de todos... a su extraña manera.", "El Guardián Trotamundos", 6300, "Soporte", "Runeterra");
        Personaje c18 = new Personaje("Shen", "Entre los secretos guerreros jonios conocidos como los Kinkou, Shen sirve como su líder, el Ojo del Crepúsculo. Desea mantenerse libre de las confusiones que provocan la emoción, los prejuicios y el ego, y camina por la senda oculta del juicio imparcial entre el mundo espiritual y el mundo real. Al estar encargado del balance entre ellos, Shen blande hojas de acero y energía arcana contra cualquiera que lo amenace.", "El Ojo del Crepúsculo", 3150, "Tanque", "Jonia");

        //CARGA DE ITEMS
        c1.agregarItem(new Item("Arcoescudo Inmortal", 3400));
        c1.agregarItem(new Item("Filo del Infinito", 3400));
        c1.agregarItem(new Item("Grebas del Berserker", 1100));

        c2.agregarItem(new Item("Agrietador", 3200));
        c2.agregarItem(new Item("Diente de Nashor", 3000));
        c2.agregarItem(new Item("Punteras de Acero Revestidas", 1100));

        c3.agregarItem(new Item("Cercenador Divino", 3300));
        c3.agregarItem(new Item("Danza de la Muerte", 3300));
        c3.agregarItem(new Item("Botas de Rapidez", 900));

        c4.agregarItem(new Item("Arcoescudo Inmortal", 3400));
        c4.agregarItem(new Item("Cañón de Fuego Rápido", 2500));
        c4.agregarItem(new Item("Grebas del Berserker", 1100));

        c5.agregarItem(new Item("Relicario de los Solari de Hierro", 2500));
        c5.agregarItem(new Item("Promesa del Caballero", 2300));
        c5.agregarItem(new Item("Botas de Movilidad", 1000));

        c6.agregarItem(new Item("Tempestad de Luden", 3200));
        c6.agregarItem(new Item("Enfoque al Horizonte", 3000));
        c6.agregarItem(new Item("Botas del Hechicero ", 1100));

        c7.agregarItem(new Item("Eclipse ", 3100));
        c7.agregarItem(new Item("Espada de la Penumbra", 2300));
        c7.agregarItem(new Item("Punteras de Acero Revestidas", 1100));

        c8.agregarItem(new Item("Canto de Guerra de Shurelya", 2500));
        c8.agregarItem(new Item("Pebetero Ardiente", 2300));
        c8.agregarItem(new Item("Botas de Movilidad", 1000));

        c9.agregarItem(new Item("Hielo Eterno", 2800));
        c9.agregarItem(new Item("Sombrero Mortífero de Rabadon", 3000));
        c9.agregarItem(new Item("Botas del Hechicero ", 1100));

        c10.agregarItem(new Item("Hielo Eterno", 2800));
        c10.agregarItem(new Item("Cañón de Fuego Rápido", 2500));
        c10.agregarItem(new Item("Botas del Hechicero ", 1100));

        c11.agregarItem(new Item("Guantelete de Fuego Escarchado", 2800));
        c11.agregarItem(new Item("Cota de Espinas", 2700));
        c11.agregarItem(new Item("Punteras de Acero Revestidas", 1100));

        c12.agregarItem(new Item("Filo Oscuro de Draktharr", 3100));
        c12.agregarItem(new Item("Arco Axiomático", 3000));
        c12.agregarItem(new Item("Punteras de Acero Revestidas", 1100));

        c13.agregarItem(new Item("Filo Oscuro de Draktharr", 3100));
        c13.agregarItem(new Item("Arco Axiomático", 3000));
        c13.agregarItem(new Item("Botas de Movilidad", 1000));

        c14.agregarItem(new Item("Fuerza del Viento", 3100));
        c14.agregarItem(new Item("Cañón de Fuego Rápido", 2500));
        c14.agregarItem(new Item("Grebas del Berserker", 1100));

        c15.agregarItem(new Item("Garra del Merodeador", 3100));
        c15.agregarItem(new Item("Filo de la Noche", 2900));
        c12.agregarItem(new Item("Punteras de Acero Revestidas", 1100));

        c16.agregarItem(new Item("Protocinturón Hextech", 3200));
        c16.agregarItem(new Item("Reloj de Arena de Zhonyas", 3000));
        c16.agregarItem(new Item("Grebas del Berserker", 1100));

        c17.agregarItem(new Item("Canto de Guerra de Shurelya", 2500));
        c17.agregarItem(new Item("Placa del Hombre Muerto", 2900));
        c17.agregarItem(new Item("Botas de Movilidad", 1000));

        c18.agregarItem(new Item("Guantelete de Fuego Escarchado", 2800));
        c18.agregarItem(new Item("Cota de Espinas", 2700));
        c18.agregarItem(new Item("Punteras de Acero Revestidas", 1100));

        //CARGA DE HABILIDADES
        c1.agregarHabilidad(0, new Habilidad("Tiro Escarchado", "P", 0));
        c1.agregarHabilidad(1, new Habilidad("Concentración de la Guardabosques", "Q", 50));
        c1.agregarHabilidad(2, new Habilidad("Descarga", "W", 75));
        c1.agregarHabilidad(3, new Habilidad("Tiro de Halcón", "E", 0));
        c1.agregarHabilidad(4, new Habilidad("Flecha de Cristal Encantada", "R", 100));

        c2.agregarHabilidad(0, new Habilidad("Mil Cortes", "P", 0));
        c2.agregarHabilidad(1, new Habilidad("¡A Cortar!", "Q", 40));
        c2.agregarHabilidad(2, new Habilidad("Niebla Sagrada", "W", 60));
        c2.agregarHabilidad(3, new Habilidad("Costura Letal", "E", 35));
        c2.agregarHabilidad(4, new Habilidad("Ráfaga de Agujas", "R", 100));

        c3.agregarHabilidad(0, new Habilidad("Sendero de Guerra", "P", 0));
        c3.agregarHabilidad(1, new Habilidad("Ataque de Furia", "Q", 30));
        c3.agregarHabilidad(2, new Habilidad("Espíritu del Terror", "W", 50));
        c3.agregarHabilidad(3, new Habilidad("Carga Devastadora", "E", 60));
        c3.agregarHabilidad(4, new Habilidad("Avalancha de Sombras", "R", 100));

        c4.agregarHabilidad(0, new Habilidad("Murmullo", "P", 0));
        c4.agregarHabilidad(1, new Habilidad("Granada Bailarina", "Q", 40));
        c4.agregarHabilidad(2, new Habilidad("Brote Mortal", "W", 50));
        c4.agregarHabilidad(3, new Habilidad("Audiencia Cautiva", "E", 30));
        c4.agregarHabilidad(4, new Habilidad("Llamado a Escena", "R", 100));

        c5.agregarHabilidad(0, new Habilidad("Luz Solar", "P", 0));
        c5.agregarHabilidad(1, new Habilidad("Escudo del Amanecer", "Q", 35));
        c5.agregarHabilidad(2, new Habilidad("Eclipse", "W", 60));
        c5.agregarHabilidad(3, new Habilidad("Espada del Cénit", "E", 60));
        c5.agregarHabilidad(4, new Habilidad("Llamarada Solar", "R", 100));

        c6.agregarHabilidad(0, new Habilidad("Iluminación", "P", 0));
        c6.agregarHabilidad(1, new Habilidad("Hechizo Luminoso", "Q", 50));
        c6.agregarHabilidad(2, new Habilidad("Barrera Prismática", "W", 60));
        c6.agregarHabilidad(3, new Habilidad("Singularidad Brillante", "E", 70));
        c6.agregarHabilidad(4, new Habilidad("Chispa Final", "R", 100));

        c7.agregarHabilidad(0, new Habilidad("Voluntad del Mortal", "P", 0));
        c7.agregarHabilidad(1, new Habilidad("Lanza Cometa", "Q", 30));
        c7.agregarHabilidad(2, new Habilidad("Salto con escudo", "W", 55));
        c7.agregarHabilidad(3, new Habilidad("Égida de Asalto", "E", 80));
        c7.agregarHabilidad(4, new Habilidad("Gran Descarga Estelar", "R", 100));

        c8.agregarHabilidad(0, new Habilidad("Plumas Encantadas", "P", 0));
        c8.agregarHabilidad(1, new Habilidad("Cálamo Reluciente", "Q", 60));
        c8.agregarHabilidad(2, new Habilidad("Gran Entrada", "W", 50));
        c8.agregarHabilidad(3, new Habilidad("Danza de Combate", "E", 40));
        c8.agregarHabilidad(4, new Habilidad("Celeridad", "R", 100));

        c9.agregarHabilidad(0, new Habilidad("Maestría Arcana", "P", 0));
        c9.agregarHabilidad(1, new Habilidad("Descarga Eléctrica", "Q", 40));
        c9.agregarHabilidad(2, new Habilidad("Prisión Rúnica", "W", 40));
        c9.agregarHabilidad(3, new Habilidad("Flujo de Hechizos", "E", 35));
        c9.agregarHabilidad(4, new Habilidad("Distorsión del Entorno", "R", 100));

        c10.agregarHabilidad(0, new Habilidad("Dados Cargados", "P", 0));
        c10.agregarHabilidad(1, new Habilidad("Comodines", "Q", 60));
        c10.agregarHabilidad(2, new Habilidad("Escoge una Carta", "W", 30));
        c10.agregarHabilidad(3, new Habilidad("Baraja Trucada", "E", 0));
        c10.agregarHabilidad(4, new Habilidad("Destino", "R", 100));

        c11.agregarHabilidad(0, new Habilidad("División Celular", "P", 0));
        c11.agregarHabilidad(1, new Habilidad("Golpes de Estiramiento", "Q", 0));
        c11.agregarHabilidad(2, new Habilidad("Materia Inestable", "W", 0));
        c11.agregarHabilidad(3, new Habilidad("Honda Elástica", "E", 0));
        c11.agregarHabilidad(4, new Habilidad("¡Rebotemos!", "R", 0));

        c12.agregarHabilidad(0, new Habilidad("Navajas de la Penumbra", "P", 0));
        c12.agregarHabilidad(1, new Habilidad("Portador del Anochecer", "Q", 60));
        c12.agregarHabilidad(2, new Habilidad("Manto de Oscuridad", "W", 50));
        c12.agregarHabilidad(3, new Habilidad("Horror Inenarrable", "E", 60));
        c12.agregarHabilidad(4, new Habilidad("Paranoia", "R", 100));

        c13.agregarHabilidad(0, new Habilidad("Don de los Ahogados", "P", 0));
        c13.agregarHabilidad(1, new Habilidad("Mondahuesos", "Q", 74));
        c13.agregarHabilidad(2, new Habilidad("Aguas Espectrales", "W", 50));
        c13.agregarHabilidad(3, new Habilidad("Corriente Fantasma", "E", 40));
        c13.agregarHabilidad(4, new Habilidad("De lo profundo", "R", 100));

        c14.agregarHabilidad(0, new Habilidad("¡Comienza a Emocionarte!", "P", 0));
        c14.agregarHabilidad(1, new Habilidad("¡Cambio de Armas!", "Q", 20));
        c14.agregarHabilidad(2, new Habilidad("¡Chispas!", "W", 50));
        c14.agregarHabilidad(3, new Habilidad("¡Mascafuegos!", "E", 90));
        c14.agregarHabilidad(4, new Habilidad("¡¡Supermegacohete Requetemortal!!", "R", 100));

        c15.agregarHabilidad(0, new Habilidad("Furia Xer'Sai", "P", 0));
        c15.agregarHabilidad(1, new Habilidad("Ira de la Reina/Rastreadora", "Q", 0));
        c15.agregarHabilidad(2, new Habilidad("Excavar/Emerger", "W", 0));
        c15.agregarHabilidad(3, new Habilidad("Mordedura Feroz/Túnel", "E", 0));
        c15.agregarHabilidad(4, new Habilidad("Impulso del Vacío", "R", 0));

        c16.agregarHabilidad(0, new Habilidad("Un Espantapájaros Inofensivo", "P", 0));
        c16.agregarHabilidad(1, new Habilidad("Aterrorizar", "Q", 65));
        c16.agregarHabilidad(2, new Habilidad("Extracción Abundante", "W", 60));
        c16.agregarHabilidad(3, new Habilidad("Cosechar", "E", 40));
        c16.agregarHabilidad(4, new Habilidad("Tormenta de Cuervos", "R", 100));

        c17.agregarHabilidad(0, new Habilidad("Llamado del Viajero", "P", 0));
        c17.agregarHabilidad(1, new Habilidad("Amarre Cósmico", "Q", 60));
        c17.agregarHabilidad(2, new Habilidad("Altar del Guardián", "W", 70));
        c17.agregarHabilidad(3, new Habilidad("Viaje Místico", "E", 30));
        c17.agregarHabilidad(4, new Habilidad("Destino Apacible", "R", 100));

        c18.agregarHabilidad(0, new Habilidad("Barrera de Ki", "P", 0));
        c18.agregarHabilidad(1, new Habilidad("Ataque de Crepúsculo", "Q", 0));
        c18.agregarHabilidad(2, new Habilidad("Refugio del Espíritu", "W", 0));
        c18.agregarHabilidad(3, new Habilidad("Ataque de Sombra", "E", 0));
        c18.agregarHabilidad(4, new Habilidad("Unidos", "R", 0));

        campeonesLista.add(c1);
        campeonesLista.add(c2);
        campeonesLista.add(c3);
        campeonesLista.add(c4);
        campeonesLista.add(c5);
        campeonesLista.add(c6);
        campeonesLista.add(c7);
        campeonesLista.add(c8);
        campeonesLista.add(c9);
        campeonesLista.add(c10);
        campeonesLista.add(c11);
        campeonesLista.add(c12);
        campeonesLista.add(c13);
        campeonesLista.add(c14);
        campeonesLista.add(c15);
        campeonesLista.add(c16);
        campeonesLista.add(c17);
        campeonesLista.add(c18);

        return campeonesLista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lista = new javax.swing.JComboBox<>();
        tituloPrograma = new javax.swing.JLabel();
        campeonNombre = new javax.swing.JTextField();
        campeonSubtitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        campeonDesc = new javax.swing.JTextArea();
        campeonRC = new javax.swing.JTextField();
        campeonIcon = new javax.swing.JLabel();
        habilidadesTag = new javax.swing.JLabel();
        pTag = new javax.swing.JLabel();
        qTag = new javax.swing.JLabel();
        wTag = new javax.swing.JLabel();
        eTag = new javax.swing.JLabel();
        rTag = new javax.swing.JLabel();
        pText = new javax.swing.JTextField();
        qText = new javax.swing.JTextField();
        wText = new javax.swing.JTextField();
        eText = new javax.swing.JTextField();
        logoIcon = new javax.swing.JLabel();
        rText = new javax.swing.JTextField();
        claseIcon = new javax.swing.JLabel();
        itemsTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsRecomendados = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        combateText = new javax.swing.JTextField();
        combate1 = new javax.swing.JComboBox<>();
        combate2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizador LoL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("ventanaPrincipal"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(7, 26, 37));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(7, 26, 37));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 142, 57), 3));
        jPanel2.setForeground(new java.awt.Color(147, 100, 49));
        jPanel2.setOpaque(false);

        lista.setBackground(new java.awt.Color(204, 204, 204));
        lista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lista.setForeground(new java.awt.Color(191, 142, 57));
        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elegir campeón)", "Ashe", "Bardo", "Fiddlesticks", "Gwen", "Hecarim", "Jhin", "Jinx", "Leona", "Lux", "Nocturne", "Pantheon", "Pyke", "Rek'Sai", "Ryze", "Shen", "Twisted Fate", "Zac" }));
        lista.setPreferredSize(new java.awt.Dimension(200, 30));
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        tituloPrograma.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        tituloPrograma.setForeground(new java.awt.Color(191, 142, 57));
        tituloPrograma.setText("Visualizador");

        campeonNombre.setEditable(false);
        campeonNombre.setBackground(new java.awt.Color(7, 26, 37));
        campeonNombre.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        campeonNombre.setForeground(new java.awt.Color(204, 204, 204));
        campeonNombre.setText("Campeón");
        campeonNombre.setBorder(null);
        campeonNombre.setCaretColor(new java.awt.Color(0, 0, 0));

        campeonSubtitulo.setEditable(false);
        campeonSubtitulo.setBackground(new java.awt.Color(7, 26, 37));
        campeonSubtitulo.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        campeonSubtitulo.setForeground(new java.awt.Color(204, 204, 204));
        campeonSubtitulo.setText("Subtitulo");
        campeonSubtitulo.setBorder(null);

        campeonDesc.setEditable(false);
        campeonDesc.setBackground(new java.awt.Color(7, 26, 37));
        campeonDesc.setColumns(20);
        campeonDesc.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        campeonDesc.setForeground(new java.awt.Color(204, 204, 204));
        campeonDesc.setLineWrap(true);
        campeonDesc.setRows(5);
        campeonDesc.setText("(Descripción)\n");
        campeonDesc.setWrapStyleWord(true);
        campeonDesc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 142, 57), 2, true));
        campeonDesc.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane2.setViewportView(campeonDesc);

        campeonRC.setEditable(false);
        campeonRC.setBackground(new java.awt.Color(7, 26, 37));
        campeonRC.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        campeonRC.setForeground(new java.awt.Color(204, 204, 204));
        campeonRC.setText("Clase - Región");
        campeonRC.setBorder(null);

        campeonIcon.setPreferredSize(new java.awt.Dimension(120, 120));

        habilidadesTag.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        habilidadesTag.setForeground(new java.awt.Color(191, 142, 57));
        habilidadesTag.setText("Habilidades");

        pTag.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pTag.setForeground(new java.awt.Color(191, 142, 57));
        pTag.setText("P:");

        qTag.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        qTag.setForeground(new java.awt.Color(191, 142, 57));
        qTag.setText("Q:");

        wTag.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        wTag.setForeground(new java.awt.Color(191, 142, 57));
        wTag.setText("W:");

        eTag.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eTag.setForeground(new java.awt.Color(191, 142, 57));
        eTag.setText("E:");

        rTag.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rTag.setForeground(new java.awt.Color(191, 142, 57));
        rTag.setText("R:");

        pText.setEditable(false);
        pText.setBackground(new java.awt.Color(7, 26, 37));
        pText.setForeground(new java.awt.Color(204, 204, 204));
        pText.setToolTipText("");
        pText.setBorder(null);

        qText.setEditable(false);
        qText.setBackground(new java.awt.Color(7, 26, 37));
        qText.setForeground(new java.awt.Color(204, 204, 204));
        qText.setBorder(null);

        wText.setEditable(false);
        wText.setBackground(new java.awt.Color(7, 26, 37));
        wText.setForeground(new java.awt.Color(204, 204, 204));
        wText.setBorder(null);

        eText.setEditable(false);
        eText.setBackground(new java.awt.Color(7, 26, 37));
        eText.setForeground(new java.awt.Color(204, 204, 204));
        eText.setBorder(null);

        rText.setEditable(false);
        rText.setBackground(new java.awt.Color(7, 26, 37));
        rText.setForeground(new java.awt.Color(204, 204, 204));
        rText.setBorder(null);

        claseIcon.setPreferredSize(new java.awt.Dimension(96, 96));

        itemsTitulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        itemsTitulo.setForeground(new java.awt.Color(191, 142, 57));
        itemsTitulo.setText("Items recomendados");

        itemsRecomendados.setEditable(false);
        itemsRecomendados.setBackground(new java.awt.Color(7, 26, 37));
        itemsRecomendados.setColumns(20);
        itemsRecomendados.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        itemsRecomendados.setForeground(new java.awt.Color(204, 204, 204));
        itemsRecomendados.setLineWrap(true);
        itemsRecomendados.setRows(5);
        itemsRecomendados.setWrapStyleWord(true);
        itemsRecomendados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 142, 57), 2, true));
        jScrollPane1.setViewportView(itemsRecomendados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(campeonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(claseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(logoIcon)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(wTag)
                                        .addComponent(eTag))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rTag)
                                        .addGap(4, 4, 4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                    .addComponent(wText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rText)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(habilidadesTag)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pTag)
                                    .addComponent(qTag))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qText)
                                    .addComponent(pText))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(itemsTitulo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campeonRC, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tituloPrograma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campeonSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campeonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloPrograma)
                    .addComponent(logoIcon))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campeonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(claseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campeonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campeonSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campeonRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(habilidadesTag)
                            .addComponent(itemsTitulo))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pTag)
                                    .addComponent(pText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qTag)
                                    .addComponent(qText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(wTag)
                                    .addComponent(wText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eTag)
                                    .addComponent(eText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rTag)
                                    .addComponent(rText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        combateText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        combateText.setPreferredSize(new java.awt.Dimension(100, 30));
        combateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combateTextActionPerformed(evt);
            }
        });

        combate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elegir campeón)", "Ashe", "Bardo", "Fiddlesticks", "Gwen", "Hecarim", "Jhin", "Jinx", "Leona", "Lux", "Nocturne", "Pantheon", "Pyke", "Rek'Sai", "Ryze", "Shen", "Twisted Fate", "Zac" }));
        combate1.setPreferredSize(new java.awt.Dimension(120, 30));
        combate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combate1ActionPerformed(evt);
            }
        });

        combate2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elegir campeón)", "Ashe", "Bardo", "Fiddlesticks", "Gwen", "Hecarim", "Jhin", "Jinx", "Leona", "Lux", "Nocturne", "Pantheon", "Pyke", "Rek'Sai", "Ryze", "Shen", "Twisted Fate", "Zac" }));
        combate2.setPreferredSize(new java.awt.Dimension(120, 30));
        combate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combate2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combate1, 0, 128, Short.MAX_VALUE)
                    .addComponent(combate2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(combate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(combateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(combate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 1001, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, 646, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        String campeonElegido = lista.getSelectedItem().toString();

        for (Personaje champ : funcionCamp()) {
            if (campeonElegido.equals(champ.getNombre())) {
                campeonNombre.setText(champ.getNombre());
                campeonDesc.setText(champ.getDescripcion());
                campeonSubtitulo.setText(champ.getSubtitulo());
                campeonRC.setText(champ.getTipo().getNombre() + " - " + champ.getTipo().getRegion());
                String nombreImg = champ.getNombre() + "Square.png";
                campeonIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\" + nombreImg));
                itemsRecomendados.setText(champ.mostrarItems());

                pText.setText(champ.mostrarHabilidad(0));
                qText.setText(champ.mostrarHabilidad(1));
                wText.setText(champ.mostrarHabilidad(2));
                eText.setText(champ.mostrarHabilidad(3));
                rText.setText(champ.mostrarHabilidad(4));

                //cambia el icono de clase según la clase
                if (champ.getTipo().getNombre().equals("Tirador")) {
                    claseIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\Tirador.png"));
                }
                if (champ.getTipo().getNombre().equals("Tanque")) {
                    claseIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\Tanque.png"));
                }
                if (champ.getTipo().getNombre().equals("Mago")) {
                    claseIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\Mago.png"));
                }
                if (champ.getTipo().getNombre().equals("Luchador")) {
                    claseIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\Luchador.png"));
                }
                if (champ.getTipo().getNombre().equals("Soporte")) {
                    claseIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\Soporte.png"));
                }
                if (champ.getTipo().getNombre().equals("Asesino")) {
                    claseIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\Asesino.png"));
                } else {
                    if (campeonElegido.equals("(Elegir campeón)")) {
                        campeonNombre.setText("Campeón");
                        campeonSubtitulo.setText("Subtítulo");
                        campeonDesc.setText("(Descripción)");
                        campeonRC.setText("Clase - Región");
                        campeonIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\champ.png"));
                        claseIcon.setIcon(new ImageIcon(rutaDeAcceso + "TF_LOL\\src\\main\\java\\ldsc\\resources\\def.png"));
                    }
                }
            }
        }
    }//GEN-LAST:event_listaActionPerformed

    private void combate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combate1ActionPerformed

        /*String campeonElegido1 = combate1.getSelectedItem().toString();
        
        
        String tipo1=null, tipo2=null, nombre1=null, nombre2=null;
        
        for(Personaje champ: funcionCamp()){
            if(campeonElegido1.equals(champ.getNombre())){
                nombre1= champ.getNombre();
                tipo1 = champ.getTipo().getNombre();
            }
        }
        
        if (tipo1.equals("Tirador")) {
            combateText.setText("T:" + nombre1);
        } else if (tipo1.equals("Mago")) {
            combateText.setText("M:" + nombre1);
        }
        else {
            combateText.setText("");
        }*/
        
        /*
        String campeonElegido1 = combate1.getSelectedItem().toString();
        String campeonElegido2 = combate2.getSelectedItem().toString();
        String tipo1=null, tipo2=null, nombre1=null, nombre2=null;
        
        for(Personaje champ: funcionCamp()){
            if(campeonElegido1.equals(champ.getNombre())){
                nombre1= champ.getNombre();
                tipo1 = champ.getTipo().getNombre();
            }
        }
        
        for(Personaje champ: funcionCamp()){
            if(campeonElegido2.equals(champ.getNombre())){
                nombre2 = champ.getNombre();
                tipo2 = champ.getTipo().getNombre();
            }
        }
        
        if (tipo1.equals("Asesino") && tipo2.equals("Soporte")) {
            combateText.setText(nombre1 + " gana");
        }
*/
        
    }//GEN-LAST:event_combate1ActionPerformed

    private void combate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combate2ActionPerformed
        /*String campeonElegido1 = combate2.getSelectedItem().toString();
        
        
        String tipo1=null, tipo2=null, nombre1=null, nombre2=null;
        
        for(Personaje champ: funcionCamp()){
            if(campeonElegido1.equals(champ.getNombre())){
                nombre1= champ.getNombre();
                tipo1 = champ.getTipo().getNombre();
            }
        }*/
        
        
    }//GEN-LAST:event_combate2ActionPerformed

    private void combateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combateTextActionPerformed
        /*String campeonElegido1 = combate1.getSelectedItem().toString();
        String campeonElegido2 = combate2.getSelectedItem().toString();
        String tipo1=null, tipo2=null, nombre1=null, nombre2=null;
        
        for(Personaje champ: funcionCamp()){
            if(campeonElegido1.equals(champ.getNombre())){
                nombre1= champ.getNombre();
                tipo1 = champ.getTipo().getNombre();
            }
        }
        
        for(Personaje champ: funcionCamp()){
            if(campeonElegido2.equals(champ.getNombre())){
                nombre2 = champ.getNombre();
                tipo2 = champ.getTipo().getNombre();
            }
        }
        
        if (tipo1.equals("Asesino")) {
            combateText.setText(nombre1 + " gana");
        }*/
    }//GEN-LAST:event_combateTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campeonDesc;
    private javax.swing.JLabel campeonIcon;
    private javax.swing.JTextField campeonNombre;
    private javax.swing.JTextField campeonRC;
    private javax.swing.JTextField campeonSubtitulo;
    private javax.swing.JLabel claseIcon;
    private javax.swing.JComboBox<String> combate1;
    private javax.swing.JComboBox<String> combate2;
    private javax.swing.JTextField combateText;
    private javax.swing.JLabel eTag;
    private javax.swing.JTextField eText;
    private javax.swing.JLabel habilidadesTag;
    private javax.swing.JTextArea itemsRecomendados;
    private javax.swing.JLabel itemsTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel pTag;
    private javax.swing.JTextField pText;
    private javax.swing.JLabel qTag;
    private javax.swing.JTextField qText;
    private javax.swing.JLabel rTag;
    private javax.swing.JTextField rText;
    private javax.swing.JLabel tituloPrograma;
    private javax.swing.JLabel wTag;
    private javax.swing.JTextField wText;
    // End of variables declaration//GEN-END:variables
}
