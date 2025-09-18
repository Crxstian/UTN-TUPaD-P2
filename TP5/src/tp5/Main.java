/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

/**
 *
 * @author Cristian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ------------------ Ejercicio 1
        System.out.println("Ejercicio 1 --------------------------------");
        // Crear titular
        Titular titular = new Titular("Cristian siles", "12345678");

        // Crear pasaporte (con foto incluida, por composición)
        Pasaporte pasaporte = new Pasaporte("A12345", 
                                            "16/09/2025", 
                                            "foto.jpg", 
                                            "JPG");

        // Vincular titular con pasaporte (asociación bidireccional)
        pasaporte.setTitular(titular);

        // Mostrar datos
        System.out.println("Pasaporte: " + pasaporte.getNumero() + 
                           ", Fecha emisión: " + pasaporte.getFechaEmision());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre() + 
                           " (DNI: " + pasaporte.getTitular().getDni() + ")");
        System.out.println("Foto: " + pasaporte.getFoto().getImagen() + 
                           " (" + pasaporte.getFoto().getFormato() + ")");

        // Comprobar bidireccionalidad
        System.out.println("El pasaporte del titular es: " +
                           titular.getPasaporte().getNumero());
        
        
        
        // ------------------ Ejercicio 2---------------------------------------
        System.out.println("Ejercicio 2 --------------------------------");
        // 1) Crear batería independiente (agregación)
        Bateria batA = new Bateria("BN-45", "4000mAh");
        Bateria batB = new Bateria("HB436", "5000mAh");

        // 2) Crear celular con batería A
        Celular cel1 = new Celular("356789012345678", "Motorola", "G54", batA);

        // 3) Crear usuario y vincularlo con el celular (bidireccional)
        Usuario u1 = new Usuario("Ana Gómez", "12345678");
        cel1.setUsuario(u1);

        // 4) Mostrar datos y comprobar bidireccionalidad
        System.out.println("CEL1 IMEI: " + cel1.getImei());
        System.out.println("CEL1 Usuario: " + cel1.getUsuario().getNombre());
        System.out.println("U1 -> Celular IMEI: " + u1.getCelular().getImei());
        System.out.println("CEL1 Batería: " + cel1.getBateria().getModelo() + " (" + cel1.getBateria().getCapacidad() + ")");
        System.out.println("----");

        // 5) Reemplazar la batería (agregación permite intercambio)
        cel1.setBateria(batB);
        System.out.println("CEL1 Batería (reemplazada): " + cel1.getBateria().getModelo() + " (" + cel1.getBateria().getCapacidad() + ")");
        System.out.println("----");

        // 6) Crear otro celular SIN batería y asignarla luego
        Celular cel2 = new Celular("864209876543210", "Samsung", "A34", null);
        System.out.println("CEL2 Batería inicial: " + (cel2.getBateria() == null ? "SIN batería" : cel2.getBateria().getModelo()));
        cel2.setBateria(new Bateria("EB-BA34", "4800mAh"));
        System.out.println("CEL2 Batería ahora: " + cel2.getBateria().getModelo() + " (" + cel2.getBateria().getCapacidad() + ")");

        // 7) Asignar usuario a cel2 desde el lado Usuario
        Usuario u2 = new Usuario("Luis Pérez", "87654321");
        u2.setCelular(cel2); // set desde el otro extremo
        System.out.println("CEL2 Usuario: " + cel2.getUsuario().getNombre());
        System.out.println("U2 -> Celular IMEI: " + u2.getCelular().getImei());   

        // ------------------ Ejercicio 3---------------------------------------
        System.out.println("Ejercicio 3 --------------------------------");
        
        Editorial planeta = new Editorial("Planeta", "Av. Corrientes 123");
        Autor borges = new Autor("Jorge L. Borges", "Argentina");

        // Libro conoce a Autor y a Editorial
        Libro ficciones = new Libro("Ficciones", "978-950-49-1234-5", borges, planeta);

        System.out.println("Libro: " + ficciones.getTitulo() + " (ISBN " + ficciones.getIsbn() + ")");
        System.out.println("Autor: " + ficciones.getAutor().getNombre() + " - " + ficciones.getAutor().getNacionalidad());
        System.out.println("Editorial: " + ficciones.getEditorial().getNombre());
        System.out.println("----");

        // Agregación: puedo reemplazar la editorial
        Editorial sudamericana = new Editorial("Sudamericana", "Calle San Martín 456");
        ficciones.setEditorial(sudamericana);
        System.out.println("Nueva editorial del libro: " + ficciones.getEditorial().getNombre());
        System.out.println("----");

        // Otro libro con el MISMO autor y otra editorial
        Libro elAleph = new Libro("El Aleph", "978-950-07-5678-9", borges, new Editorial("Emecé", "Av. Santa Fe 789"));
        System.out.println("Otro libro: " + elAleph.getTitulo() + " - Autor: " + elAleph.getAutor().getNombre());
        System.out.println("Editorial del otro libro: " + elAleph.getEditorial().getNombre());

        // Notá que Autor NO conoce sus libros (unidireccional)
        // borges.getLibros() // <- no existe (a propósito)
        
        // ------------------ Ejercicio 4---------------------------------------
        System.out.println("Ejercicio 4 --------------------------------");
        
        // 1) Bancos (agregación: pueden vivir independientes de la tarjeta)
        Banco bbva = new Banco("BBVA", "30-12345678-9");
        Banco santander = new Banco("Santander", "30-87654321-0");

        // 2) Tarjeta asociada inicialmente a BBVA
        TarjetaDeCredito t1 = new TarjetaDeCredito("4509 1234 5678 9010", "12/28", bbva);

        // 3) Cliente y vínculo bidireccional
        Cliente cli = new Cliente("María López", "12345678");
        t1.setCliente(cli); // esto sincroniza también cli.setTarjetaDeCredito(this)

        // 4) Mostrar datos y verificar bidireccionalidad
        System.out.println("Tarjeta: " + t1.getNumero() + " (vence " + t1.getFechaVencimiento() + ")");
        System.out.println("Cliente: " + t1.getCliente().getNombre() + " - DNI " + t1.getCliente().getDni());
        System.out.println("Banco actual: " + t1.getBanco().getNombre());
        System.out.println("Verificación ↔: tarjeta del cliente = " + cli.getTarjetaDeCredito().getNumero());

        // 5) Agregación: puedo cambiar el banco sin afectar al resto
        t1.setBanco(santander);
        System.out.println("Banco actualizado: " + t1.getBanco().getNombre());
        
        // ------------------ Ejercicio 5---------------------------------------
        System.out.println("Ejercicio 5 --------------------------------");
                // 1) Crear propietario
        Propietario prop = new Propietario("Sofía Ruiz", "38123456");

        // 2) Crear computadora (con PlacaMadre por COMPOSICIÓN)
        //    Ojo: la placa se crea dentro de Computadora (no desde afuera)
        Computadora pc = new Computadora(
                "Lenovo", 
                "SN-ABC-001122",
                "B550-A Pro",
                "AMD B550"
        );
        // 3) Vincular asociación bidireccional Computadora ↔ Propietario
        pc.setPropietario(prop);

        // 4) Mostrar datos de la computadora y su placa madre (composición)
        System.out.println("PC Marca: " + pc.getMarca());
        System.out.println("PC Nº Serie: " + pc.getNumeroSerie());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo() +
                           " (" + pc.getPlacaMadre().getChipset() + ")");

        // 5) Verificar bidireccionalidad
        System.out.println("Propietario de la PC: " + pc.getPropietario().getNombre() +
                           " - DNI " + pc.getPropietario().getDni());
        System.out.println("La PC del propietario: " + prop.getComputadora().getNumeroSerie());

        // al ser COMPOSICIÓN, no hay setter público para cambiar la placa madre.
        // Si queremos reemplazarla, tendríamos que agregar un método específico en Computadora
        
        // ------------------ Ejercicio 6---------------------------------------
        System.out.println("Ejercicio 6 --------------------------------");
        
        // 1) Agregación: la Mesa existe independiente
        Mesa mesa10 = new Mesa(10, 4);

        // 2) Creamos la Reserva con su mesa
        Reserva reserva = new Reserva("2025-09-20", "21:00", mesa10);

        // 3) Unidireccional: Reserva conoce al Cliente (Cliente no conoce la reserva)
        ClienteEj6 clienteEj6 = new ClienteEj6("Carla Díaz", "11-5555-6666");
        reserva.setCliente(clienteEj6);

        // 4) Mostrar datos (desde Reserva accedemos a Cliente y Mesa)
        System.out.println("Reserva: " + reserva.getFecha() + " " + reserva.getHora());
        System.out.println("Cliente: " + reserva.getCliente().getNombre() + " (" + reserva.getCliente().getTelefono() + ")");
        System.out.println("Mesa: N°" + reserva.getMesa().getNumero() + " (capacidad " + reserva.getMesa().getCapacidad() + ")");
        System.out.println("----");

        // 5) Agregación: puedo cambiar la mesa sin afectar al cliente
        Mesa mesa15 = new Mesa(15, 6);
        reserva.setMesa(mesa15);
        System.out.println("Mesa actualizada: N°" + reserva.getMesa().getNumero() + " (capacidad " + reserva.getMesa().getCapacidad() + ")");
        
        // ------------------ Ejercicio 7---------------------------------------
        System.out.println("Ejercicio 7 --------------------------------");
        // 1) Agregación: el Motor vive independiente
        Motor m1 = new Motor("Nafta 2.0", "MTR-001");
        Motor m2 = new Motor("Diésel 2.2", "MTR-777");

        // 2) Crear Vehículo con su Motor
        Vehiculo v1 = new Vehiculo("AB123CD", "Focus II", m1);

        // 3) Crear Conductor y vincular (bidireccional)
        Conductor c1 = new Conductor("Juan Pérez", "B-123456");
        v1.setConductor(c1);  // sincroniza ambos lados

        // 4) Mostrar datos: desde Vehículo accedemos a Motor y Conductor
        System.out.println("Vehículo: " + v1.getPatente() + " - " + v1.getModelo());
        System.out.println("Motor: " + v1.getMotor().getTipo() + " (" + v1.getMotor().getNumeroSerie() + ")");
        System.out.println("Conductor: " + v1.getConductor().getNombre() + " - Licencia " + v1.getConductor().getLicencia());
        System.out.println("Verificación ↔: vehículo de c1 = " + c1.getVehiculo().getPatente());
        System.out.println("----");

        // 5) Agregación: reemplazar motor del vehículo
        v1.setMotor(m2);
        System.out.println("Motor actualizado: " + v1.getMotor().getTipo() + " (" + v1.getMotor().getNumeroSerie() + ")");

        // ------------------ Ejercicio 8---------------------------------------
        System.out.println("Ejercicio 8 --------------------------------");
        // 1) Usuario independiente (agregación)
        UsuarioEj8 usuarioEj8 = new UsuarioEj8("Ana Gómez", "ana@example.com");

        // 2) Documento crea su FirmaDigital por COMPOSICIÓN
        Documento doc = new Documento(
                "Contrato", 
                "Contenido del contrato...",
                usuarioEj8,                 
                "HASH-ABC-123",     
                "2025-09-18"
        );
        // 3) Mostrar datos del Documento y su Firma (composición)
        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Contenido: " + doc.getContenido());
        System.out.println("Firma -> hash: " + doc.getFirmaDigital().getCodigoHash() +
                           ", fecha: " + doc.getFirmaDigital().getFecha());
        System.out.println("Firmado por: " + doc.getFirmaDigital().getUsuario().getNombre() +
                           " (" + doc.getFirmaDigital().getUsuario().getEmail() + ")");
        System.out.println("----");

        // 4) Agregación en FirmaDigital: puedo cambiar el USUARIO firmante
        UsuarioEj8 usuario2Ej8 = new UsuarioEj8("Luis Pérez", "luis@example.com");
        FirmaDigital nuevaFirma = new FirmaDigital("HASH-XYZ-999", "2025-10-01", usuario2Ej8);

        // esto usa el setter y reemplaza la firma completa en el documento
        doc.setFirmaDigital(nuevaFirma);

        System.out.println("Firma actualizada -> hash: " + doc.getFirmaDigital().getCodigoHash() +
                           ", fecha: " + doc.getFirmaDigital().getFecha());
        System.out.println("Nuevo firmante: " + doc.getFirmaDigital().getUsuario().getNombre() +
                           " (" + doc.getFirmaDigital().getUsuario().getEmail() + ")");
        
                // ------------------ Ejercicio 9---------------------------------------
        System.out.println("Ejercicio 9 --------------------------------");
        
         // 1) Crear Paciente y Profesional (no conocen a la Cita)
        Paciente pac = new Paciente("Carla Díaz", "OSDE 310");
        Profesional prof = new Profesional("Dr. Gómez", "Clínica Médica");

        // 2) Crear Cita y asignar paciente y profesional
        CitaMedica citaMedica = new CitaMedica("2025-09-21", "10:30");
        citaMedica.setPaciente(pac);
        citaMedica.setProfesional(prof);

        // 3) Mostrar datos (navegación solo desde Cita -> Paciente/Profesional)
        System.out.println("Cita 1: " + citaMedica.getFecha() + " " + citaMedica.getHora());
        System.out.println("Paciente: " + citaMedica.getPaciente().getNombre() + " (OS: " + citaMedica.getPaciente().getObraSocial() + ")");
        System.out.println("Profesional: " + citaMedica.getProfesional().getNombre() + " - " + citaMedica.getProfesional().getEspecialidad());
        System.out.println("----");

        // 4) Otra cita con el mismo profesional (muestra que pueden compartirse)
        CitaMedica c2 = new CitaMedica("2025-09-21", "11:00");
        c2.setPaciente(new Paciente("Luis Pérez", "Swiss Medical 300"));
        c2.setProfesional(prof); // mismo profesional

        System.out.println("Cita 2: " + c2.getFecha() + " " + c2.getHora());
        System.out.println("Paciente: " + c2.getPaciente().getNombre() + " (OS: " + c2.getPaciente().getObraSocial() + ")");
        System.out.println("Profesional: " + c2.getProfesional().getNombre() + " - " + c2.getProfesional().getEspecialidad());

        // ------------------ Ejercicio 10---------------------------------------
        System.out.println("Ejercicio 10 --------------------------------");
        
                // 1) Crear titular
        TitularEj10 titularEj10 = new TitularEj10("María López", "12345678");

        // 2) Crear cuenta (la ClaveSeguridad se crea por COMPOSICIÓN dentro del constructor)
        CuentaBancaria cuenta = new CuentaBancaria(
                "0000003100000000000001",
                25000.00,
                "K3Y-001",
                "2025-09-18"
        );

        // 3) Vincular cuenta ↔ titular (BIDIRECCIONAL)
        cuenta.setTitular(titularEj10);

        // 4) Verificaciones y salida
        // Composición: la clave existe y fue creada dentro de la cuenta
        System.out.println("Clave creada? " + (cuenta.getClaveSeguridad() != null));
        System.out.println("Clave: " + cuenta.getClaveSeguridad().getCodigo() +
                           " | Última mod.: " + cuenta.getClaveSeguridad().getUltimaModificacion());

        // Bidireccionalidad: ambos extremos se referencian
        boolean ladoCuenta = cuenta.getTitular() == titularEj10;
        boolean ladoTitular = titularEj10.getCuentaBancaria() == cuenta;
        System.out.println("Bidireccional OK? " + (ladoCuenta && ladoTitular));

        // Datos de la cuenta
        System.out.println("CBU: " + cuenta.getCbu() + " | Saldo: " + cuenta.getSaldo());

        // Acceso cruzado desde el Titular a su cuenta (comprueba el ↔)
        System.out.println("CBU visto desde el Titular: " + titularEj10.getCuentaBancaria().getCbu());
        
        // ------------------ Ejercicio 11---------------------------------------
        System.out.println("Ejercicio 11 --------------------------------");
        // Artista (independiente)
        Artista artista = new Artista("Daft Punk", "Electrónica");

        // Canciones que conocen a su Artista (unidireccional)
        Cancion cancion1 = new Cancion("Harder, Better, Faster, Stronger");
        cancion1.setArtista(artista);

        Cancion cancion2 = new Cancion("One More Time");
        cancion2.setArtista(artista); // mismo artista en otra canción

        // Reproductor (depende de la canción solo en el método)
        Reproductor reproductor = new Reproductor();

        // Dependencia de uso: el reproductor usa la canción como parámetro
        reproductor.reproducir(cancion1);
        reproductor.reproducir(cancion2);

        // También puede reproducir una canción "al vuelo" (sin guardar referencia)
        reproductor.reproducir(new Cancion("Tema suelto"));

        // Mostrar asociación unidireccional desde Cancion -> Artista
        System.out.println("Artista de c1: " + cancion1.getArtista().getNombre() +
                           " (" + cancion1.getArtista().getGenero() + ")");
        System.out.println("Artista de c2: " + cancion2.getArtista().getNombre());
        
        // ------------------ Ejercicio 12---------------------------------------
        System.out.println("Ejercicio 12 --------------------------------");
        Contribuyente c = new Contribuyente("Ana Gómez", "20-12345678-3");
        Impuesto imp = new Impuesto(15000.0);
        imp.setContribuyente(c);

        Calculadora calc = new Calculadora();
        calc.calcular(imp);
        
        
        // ------------------ Ejercicio 13---------------------------------------
        System.out.println("Ejercicio 13 --------------------------------");
        // 1) Crear un usuario (vive independiente)
        UsuarioEj13 user = new UsuarioEj13("Ana Gómez", "ana@example.com");

        // 2) Probar la DEPENDENCIA DE CREACIÓN:
        //    GeneradorQR crea un CodigoQR "al vuelo" dentro del método (no lo retorna ni lo guarda).
        GeneradorQR gen = new GeneradorQR();
        gen.generar("ABC-123-QR", user); // imprime confirmación

        System.out.println("----");

        // 3) Probar la ASOCIACIÓN UNIDIRECCIONAL CodigoQR -> Usuario:
        //    Creamos un QR manualmente y verificamos que conoce al Usuario.
        CodigoQR qr = new CodigoQR("XYZ-999-QR", user);
        System.out.println("QR valor: " + qr.getValor());
        System.out.println("QR asociado a: " + qr.getUsuarioEj13().getNombre() +
                           " (" + qr.getUsuarioEj13().getEmail() + ")");
        
        // ------------------ Ejercicio 14---------------------------------------
        System.out.println("Ejercicio 14 --------------------------------");        
        // 1) Proyecto independiente
        Proyecto p1 = new Proyecto("Corto Publicitario", "3:20");

        // 2) Editor que EXPORTA (dependencia de creación)
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4 1080p", p1); // Crea el Render internamente y lo informa

        System.out.println("----");

        // 3) Asociación unidireccional Render -> Proyecto (creación manual para mostrar navegación)
        Render r2 = new Render("MOV 4K", p1);
        System.out.println("Render r2: " + r2.getFormato() + " | Proyecto: " + r2.getProyecto().getNombre());

    }
    
}
