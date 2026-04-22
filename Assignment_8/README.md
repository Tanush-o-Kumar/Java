Create an inventory management system using the following design patterns:

Singleton
Adapter
Iterator
The InventoryManager class should be defined as a Singleton to ensure that all products added to the inventory are held by one single instance of InventoryManager class.

Create an interface named Product and declare a displayDetails() method inside it.

Create a LegacyItem class with following attributes: itemId and description.

Define one parameterized constructor and a print() method inside this class.

Create a ProductAdapter class that implements Product interface.

Declare a private attribute of type LegacyItem inside this class.

The constructor of this class accepts an object of LegacyItem as a parameter.

Override the displayDetails() method of Product interface inside the ProductAdapter class which in turn calls print() method from LegacyItem class.

Now define another class NewProduct that implements Product interface. The constructor of this class accepts only the name of the product. Create a private String type attribute called name to store the product name.

Override the displayDetails() method in NewProduct class to print the name of the new product.

Inside the InventoryManager class declare a List of Product objects.

Inside the constructor of InventoryManager, initialize the List object to a new ArrayList.

Define addProduct() method inside InventoryManager which adds a new Product object to the ArrayList.

Also define a method returnInventory() that returns a Product Iterator type object.

Inside your main() method, create a single instance of InventoryManager class.

Add products to the InventoryManager instance using add methods of both NewProduct and LegacyItem classes.

Iterate through the inventory using the Product Iterator type object, hasNext() and next() methods. 

Call displayDetails() method to print the product details.
