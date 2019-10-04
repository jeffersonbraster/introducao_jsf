package converter;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidades.Cidades;
import jpautil.jpautil;

@FacesConverter(forClass = Cidades.class, value = "cidadeConverter")
public class CidadesConverter implements Converter, Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2679166109630976699L;

	@Override
	/* Retorna obejto inteiro */
	public Object getAsObject(FacesContext context, UIComponent component,
			String codigoCidade) {

		EntityManager entityManager = jpautil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Cidades cidade = (Cidades) entityManager.find(Cidades.class,
				Long.parseLong(codigoCidade));

		return cidade;

	}

	@Override
	/* Retorna apenas o código em String */
	public String getAsString(FacesContext context, UIComponent component,
			Object cidade) {
		
			if (cidade == null){
				return null;
			}
			
			if (cidade instanceof Cidades){
				return ((Cidades) cidade).getId().toString();
			}else {
				return cidade.toString();
			}

	
	}

}
