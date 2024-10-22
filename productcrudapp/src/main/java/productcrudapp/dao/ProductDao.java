package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);

	}

	// get all products
	public List<Product> getProducts() {
		List<Product> product = this.hibernateTemplate.loadAll(Product.class);
		return product;
	}

	// delete single product
	@Transactional
	public void deleteProduct(int pid) {
		Product product = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
	}

	// get single product
	public Product getProductById(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		return product;

	}

}
