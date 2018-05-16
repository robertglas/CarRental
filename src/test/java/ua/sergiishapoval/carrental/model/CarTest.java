package ua.sergiishapoval.carrental.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Robert Glas
 */
public class CarTest {
	private Car car;
	private Integer id;
    private String model;
    private String brand;
    private String className;
    private Double price;
    private Boolean isAutomat;
    private Boolean isDiesel;
    private Boolean hasCondition;
    private Integer doorQty;

	@Before
	public void setUp() {
	    this.id = 1001;
	    this.model = "H2 Speed";
   		this.brand = "Pininfarina";
    	this.className = "Hypercar";
    	this.price = 5000000.00;
    	this.isAutomat = true;
    	this.isDiesel = false;
    	this.hasCondition = true;
    	this.doorQty = 2;
    	this.car = new Car(this.id, this.model, this.brand, this.className, this.price, 
    		this.isAutomat, this.isDiesel, this.hasCondition, this.doorQty);
	}
	
	@Test
	public void testGetId() {
		assertThat(this.car.getId(), is(this.id));
	}

	@Test
    public void testSetId() {
		Integer new_id = 2;
        this.car.setId(new_id);
        assertThat(this.car.getId(), is(new_id));
    }
	
	@Test
	public void testGetModel() {
		assertThat(this.car.getModel(), is(this.model));
	}

    @Test
	public void testSetModel() {
    	String new_model = "H2 turbo";
    	this.car.setModel(new_model);
    	assertThat(this.car.getModel(), is(new_model));
    }

    @Test
    public void testGetPrice() {
    	assertThat(this.car.getPrice(), is(this.price));
    }

    @Test
    public void testGetIsAutomat() {
        assertThat(this.car.getIsAutomat(), is(this.isAutomat));
    }
    
    @Test
    public void testGetIsDiesel() {
    	assertThat(this.car.getIsDiesel(), is(this.isDiesel));
    }
    
    @Test
    public void testGetHasCondition() {
    	assertThat(this.car.getHasCondition(), is(this.hasCondition));
    }

    @Test
    public void getDoorQty() {
    	assertThat(this.car.getDoorQty(), is(this.doorQty));
    }

    @Test
    public void getBrand() {
    	assertThat(this.car.getBrand(), is(this.brand));
    }

    @Test
    public void getClassName() {
    	assertThat(this.car.getClassName(), is(this.className));
    }

}
