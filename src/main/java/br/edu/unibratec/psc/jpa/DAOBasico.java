
package br.edu.unibratec.psc.jpa;

import javax.persistence.EntityManager;


public class DAOBasico {
    
    public void inserir(classeTeste teste){
        EntityManager em = UtilJPA.getEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(teste);
        
        em.getTransaction().commit();
        
    }
    
    public classeTeste consultarPorchavePrimaria(Class classe, Object PrimaryKey){
        classeTeste teste =  (classeTeste)UtilJPA.getEntityManager().find(classe, PrimaryKey);
        
        return teste;
    }
    
}
