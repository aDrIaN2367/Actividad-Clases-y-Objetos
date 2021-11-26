public class main {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente();

        cliente.setNombre("Indra");
        cliente.setCiudad("Madrid");
        cliente.setPresupuesto(10000);

        
        System.out.println("El cliente "+cliente.getNombre()+"-"+cliente.getCiudad()+" tiene "+cliente.getPresupuesto()+" euros de presupuesto");


        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Vass");
        cliente2.setCiudad("Valencia");
        cliente2.setPresupuesto(12000);

        System.out.println("El cliente "+cliente2.getNombre()+"-"+cliente2.getCiudad()+" tiene "+cliente2.getPresupuesto()+" euros de presupuesto");

        



    }

    
}
