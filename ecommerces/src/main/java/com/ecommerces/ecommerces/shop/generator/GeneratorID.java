package com.ecommerces.ecommerces.shop.generator;

import java.io.Serializable;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneratorID implements IdentifierGenerator, Configurable {
    private String prefix;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
		String queryOnString = String.format("select %s from %s",session.getEntityPersister(obj.getClass().getName(),
				obj).getIdentifierPropertyName(),obj.getClass().getSimpleName());
		log.info("GeneratorID: Query >> " + queryOnString);
		// Session sessionD = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		Query<String> query = session.createQuery(queryOnString);

		String value = (String) query.uniqueResult();
		if (value == null) {
			return 1;
		}
		// return (Integer.parseInt(value) + 1);
		return prefix + "-" + (Integer.parseInt(value) + 1);
	}

    @Override
    public void configure(Type type, Properties properties,ServiceRegistry serviceRegistry) throws MappingException {
        prefix = properties.getProperty("prefix");
    }
}