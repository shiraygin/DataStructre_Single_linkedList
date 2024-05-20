
package datastructrelinkedlist;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author zainab
 */
public class DatastructreLinkedList {
    
    static SingleLinkedList perfumeList = new SingleLinkedList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        		SingleLinkedList.Perfume perfume1 = new SingleLinkedList.Perfume(
	    "Coco Mademoiselle", // Name
	    null, // Next reference
	    2001, // Born year
	    "PM001" // ID
	);

	perfume1.Category = "Chypre";
	perfume1.Manufacturer = "Chanel";
	perfume1.Price = 105.0;
	perfume1.description.add("Coco Mademoiselle is a sophisticated, oriental fragrance with a touch of freshness.");
	perfume1.ingredients.add("Orange");
	perfume1.ingredients.add("Rose");
	perfume1.ingredients.add("Vanilla");
	perfume1.availability.add("Chanel Boutiques");
	perfume1.availability.add("Luxury Department Stores");

	perfumeList.head = perfume1;
	perfumeList.tail = perfume1;
	perfumeList.size++;

	// Perfume 2
	SingleLinkedList.Perfume perfume2 = new SingleLinkedList.Perfume(
	    "Dolce & Gabbana Light Blue", // Name
	    null, // Next reference
	    2001, // Born year
	    "PM002" // ID
	);

	perfume2.Category = "Citrus";
	perfume2.Manufacturer = "Dolce & Gabbana";
	perfume2.Price = 75.0;
	perfume2.description.add("Light Blue is a refreshing, floral-fruity scent, capturing the essence of the Mediterranean.");
	perfume2.ingredients.add("Apple");
	perfume2.ingredients.add("Bamboo");
	perfume2.ingredients.add("Cedar");
	perfume2.availability.add("Online Retailers");
	perfume2.availability.add("Luxury Department Stores");

	// Link perfume2 to the end of the list
	perfumeList.tail.next = perfume2;
	perfumeList.tail = perfume2;
	perfumeList.size++;

	// Perfume 3
	SingleLinkedList.Perfume perfume3 = new SingleLinkedList.Perfume(
	    "Black Opium", // Name
	    null, // Next reference
	    2014, // Born year
	    "PM003" // ID
	);

	perfume3.Category = "Oriental";
	perfume3.Manufacturer = "Yves Saint Laurent";
	perfume3.Price = 90.0;
	perfume3.description.add("Black Opium is a seductive, addictive fragrance with notes of coffee and vanilla.");
	perfume3.ingredients.add("Coffee");
	perfume3.ingredients.add("Orange Blossom");
	perfume3.ingredients.add("Patchouli");
	perfume3.availability.add("Online Retailers");
	perfume3.availability.add("Luxury Department Stores");

	// Link perfume3 to the end of the list
	perfumeList.tail.next = perfume3;
	perfumeList.tail = perfume3;
	perfumeList.size++;

	// Perfume 4
	SingleLinkedList.Perfume perfume4 = new SingleLinkedList.Perfume(
	    "Good Girl", // Name
	    null, // Next reference
	    2016, // Born year
	    "PM004" // ID
	);

	perfume4.Category = "Oriental Floral";
	perfume4.Manufacturer = "Carolina Herrera";
	perfume4.Price = 120.0;
	perfume4.description.add("Good Girl is a bold, sensual fragrance, encapsulated in a striking stiletto-shaped bottle.");
	perfume4.ingredients.add("Tonka Bean");
	perfume4.ingredients.add("Tuberose");
	perfume4.ingredients.add("Cacao");
	perfume4.availability.add("Online Retailers");
	perfume4.availability.add("Luxury Department Stores");

	// Link perfume4 to the end of the list
	perfumeList.tail.next = perfume4;
	perfumeList.tail = perfume4;
	perfumeList.size++;

	// Perfume 5
	SingleLinkedList.Perfume perfume5 = new SingleLinkedList.Perfume(
	    "Flowerbomb", // Name
	    null, // Next reference
	    2005, // Born year
	    "PM005" // ID
	);

	perfume5.Category = "Floral";
	perfume5.Manufacturer = "Viktor & Rolf";
	perfume5.Price = 115.0;
	perfume5.description.add("Flowerbomb is a floral explosion, featuring notes of jasmine, rose, and orchid.");
	perfume5.ingredients.add("Jasmine");
	perfume5.ingredients.add("Rose");
	perfume5.ingredients.add("Patchouli");
	perfume5.availability.add("Online Retailers");
	perfume5.availability.add("Luxury Department Stores");

	// Link perfume5 to the end of the list
	perfumeList.tail.next = perfume5;
	perfumeList.tail = perfume5;
	perfumeList.size++;

	// Perfume 6
	SingleLinkedList.Perfume perfume6 = new SingleLinkedList.Perfume(
	    "La Vie Est Belle", // Name
	    null, // Next reference
	    2012, // Born year
	    "PM006" // ID
	);

	perfume6.Category = "Floral Fruity Gourmand";
	perfume6.Manufacturer = "Lancôme";
	perfume6.Price = 98.0;
	perfume6.description.add("La Vie Est Belle is a sweet, feminine fragrance with iris and vanilla as its key notes.");
	perfume6.ingredients.add("Iris");
	perfume6.ingredients.add("Orange Blossom");
	perfume6.ingredients.add("Vanilla");
	perfume6.availability.add("Online Retailers");
	perfume6.availability.add("Luxury Department Stores");

	// Link perfume6 to the end of the list
	perfumeList.tail.next = perfume6;
	perfumeList.tail = perfume6;
	perfumeList.size++;

	// Perfume 7
	SingleLinkedList.Perfume perfume7 = new SingleLinkedList.Perfume(
	    "Angel", // Name
	    null, // Next reference
	    1992, // Born year
	    "PM007" // ID
	);

	perfume7.Category = "Oriental Vanilla";
	perfume7.Manufacturer = "Thierry Mugler";
	perfume7.Price = 120.0;
	perfume7.description.add("Angel is a bold, iconic fragrance with a unique blend of sweet and spicy notes.");
	perfume7.ingredients.add("Berries");
	perfume7.ingredients.add("Caramel");
	perfume7.ingredients.add("Patchouli");
	perfume7.availability.add("Online Retailers");
	perfume7.availability.add("Luxury Department Stores");

	// Link perfume7 to the end of the list
	perfumeList.tail.next = perfume7;
	perfumeList.tail = perfume7;
	perfumeList.size++;

	// Perfume 8
	SingleLinkedList.Perfume perfume8 = new SingleLinkedList.Perfume(
	    "Black Orchid", // Name
	    null, // Next reference
	    2006, // Born year
	    "PM008" // ID
	);

	perfume8.Category = "Oriental Chypre";
	perfume8.Manufacturer = "Tom Ford";
	perfume8.Price = 135.0;
	perfume8.description.add("Black Orchid is a luxurious, sensual fragrance, combining floral and dark accords.");
	perfume8.ingredients.add("Black Truffle");
	perfume8.ingredients.add("Black Orchid");
	perfume8.ingredients.add("Patchouli");
	perfume8.availability.add("Online Retailers");
	perfume8.availability.add("Luxury Department Stores");

	// Link perfume8 to the end of the list
	perfumeList.tail.next = perfume8;
	perfumeList.tail = perfume8;
	perfumeList.size++;

	// Perfume 9
	SingleLinkedList.Perfume perfume9 = new SingleLinkedList.Perfume(
	    "Sauvage", // Name
	    null, // Next reference
	    2015, // Born year
	    "PM009" // ID
	);

	perfume9.Category = "Woody Aromatic";
	perfume9.Manufacturer = "Dior";
	perfume9.Price = 95.0;
	perfume9.description.add("Sauvage is a fresh, spicy fragrance with hints of bergamot and ambergris.");
	perfume9.ingredients.add("Bergamot");
	perfume9.ingredients.add("Pepper");
	perfume9.ingredients.add("Ambergris");
	perfume9.availability.add("Online Retailers");
	perfume9.availability.add("Luxury Department Stores");

	// Link perfume9 to the end of the list
	perfumeList.tail.next = perfume9;
	perfumeList.tail = perfume9;
	perfumeList.size++;

	// Perfume 10
	SingleLinkedList.Perfume perfume10 = new SingleLinkedList.Perfume(
	    "One Million", // Name
	    null, // Next reference
	    2008, // Born year
	    "PM010" // ID
	);

	perfume10.Category = "Woody Spicy";
	perfume10.Manufacturer = "Paco Rabanne";
	perfume10.Price = 90.0;
	perfume10.description.add("One Million is a bold, masculine fragrance with notes of cinnamon and leather.");
	perfume10.ingredients.add("Cinnamon");
	perfume10.ingredients.add("Leather");
	perfume10.ingredients.add("Amber");
	perfume10.availability.add("Online Retailers");
	perfume10.availability.add("Luxury Department Stores");

	// Link perfume10 to the end of the list
	perfumeList.tail.next = perfume10;
	perfumeList.tail = perfume10;
	perfumeList.size++;


        
        

    
        
    
        //the program
        
        
       
        
    StartPageInterface startPage = new StartPageInterface();
    startPage.setVisible(true);

        do {
        
        JFrame menuFrame = new JFrame("Menu");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(500, 500);
        
        
    } while (true);
}//main method
    
   
    
}//main class


class SingleLinkedList<E>{
    
   
    
 static class Perfume<E>{
     E Perfume;
     Perfume<E> next;
    
    String id , name, Category, Manufacturer;
    double Price;
    int BornYear;
    ArrayList<String> description = new ArrayList<>();
    ArrayList<String> ingredients = new ArrayList<>();
    ArrayList<String> availability = new ArrayList<>();
    
    Date currentDate = new Date();
    int age ;
    
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("ID: ").append(id).append("\n");
    sb.append("Name: ").append(Perfume).append("\n"); 
    sb.append("Category: ").append(Category).append("\n");
    sb.append("Manufacturer: ").append(Manufacturer).append("\n");
    sb.append("Price: ").append(Price).append("\n");
    sb.append("Born Year: ").append(BornYear).append("\n");
    sb.append("Description: ").append(description).append("\n");
    sb.append("Ingredients: ").append(ingredients).append("\n");
    sb.append("Availability: ").append(availability).append("\n");
    sb.append("Age: ").append(age).append(" years\n");
    return sb.toString();
}

    
    
    
    
    
    public Perfume(E Perfume , Perfume<E> next, int bornYear,
    String id ){//constructur
        
        if (id == null || id.isEmpty()) {
                throw new IllegalArgumentException("ID cannot be null or empty");
            }
            if (!isIdUnique(next, id)) {
                throw new IllegalArgumentException("ID must be unique");
            }
        this.Perfume = Perfume;
        this.next = next;
        this.BornYear = bornYear;
        age = currentDate.getYear() - BornYear;
        this.id = id;
    }
    
    private boolean isIdUnique(Perfume<E> head, String id) {
            Perfume<E> current = head;
            while (current != null) {
                if (current.id.equals(id)) {
                    return false; // ID is not unique
                }
                current = current.next;
            }
            return true; // ID is unique
        }
    
    
    public E getElement(){return this.Perfume;}
    
    public void setNext(Perfume<E> n){
        this.next = n;
    }}

 Perfume<E> head = null;
 Perfume<E> tail = null;
 int size = 0;
 
 

public SingleLinkedList(){/*contstructor*/}

void AddFirst(Perfume v) {
        v.next = head;
        head = v;
        size++;
        
        
    }

//public void addDescription(String desc, String nodeId) {
//    Perfume<E> current = head;
//    while (current != null) {
//        if (current.id.equals(nodeId)) {
//            current.description.add(desc);
//            return; // Exit the method after adding description to the specified node
//        }
//        current = current.next;
//    }
//    System.out.println("Error: No node found with the given id");
//}
//
//public void addIngredient(String ingredient, String nodeId) {
//            Perfume<E> current = head;
//            while (current != null) {
//                if (current.id.equals(nodeId)) {
//                    current.ingredients.add(ingredient);
//                    return; // Exit the method after adding ingredient to the specified node
//                }
//                current = current.next;
//            }
//            System.out.println("Error: No node found with the given id");
//        }
//
// public void addAvailability(String store, String nodeId) {
//            Perfume<E> current = head;
//            while (current != null) {
//                if (current.id.equals(nodeId)) {
//                    current.availability.add(store);
//                    return; // Exit the method after adding availability to the specified node
//                }
//                current = current.next;
//            }
//            System.out.println("Error: No node found with the given id");
//        }
    

 
 
 void addNewPerfume(SingleLinkedList perfumeList) {
    // Prompt the user to enter perfume details
    String name = JOptionPane.showInputDialog("Enter perfume name:");
    String category = JOptionPane.showInputDialog("Enter perfume category:");
    String manufacturer = JOptionPane.showInputDialog("Enter perfume manufacturer:");
    double price = Double.parseDouble(JOptionPane.showInputDialog("Enter perfume price:"));
    int bornYear = Integer.parseInt(JOptionPane.showInputDialog("Enter perfume born year:"));
    String id = JOptionPane.showInputDialog("Enter perfume ID:");

    // Create a new perfume object
    SingleLinkedList.Perfume newPerfume = new SingleLinkedList.Perfume(
        name, // Element 
        null, // Next reference 
        bornYear,
        id
    );

    newPerfume.name = name;
    newPerfume.Category = category;
    newPerfume.Manufacturer = manufacturer;
    newPerfume.Price = price;

    // Add the new perfume to the beginning of the list
    perfumeList.AddFirst(newPerfume);
    JOptionPane.showMessageDialog(null, "Perfume added successfully!");
}
 
 
void removePerfume() {
    // Prompt the user to enter the ID of the perfume to be removed
    String id = JOptionPane.showInputDialog("Enter the ID of the perfume to remove:");

    if (head == null) {
        // The list is empty, so there's nothing to remove
        return;
    }

    // If the node to be removed is the head node
    if (head.id.equals(id)) {
        head = head.next;
        if (head == null) {
            // If the list becomes empty after removing the head node, update the tail
            tail = null;
        }
        size--;
        JOptionPane.showMessageDialog(null, "Perfume removed successfully!");
        return;
    }//head case

    // Search for the node to be removed
    SingleLinkedList.Perfume current = head;
    while (current.next != null) {
        if (current.next.id.equals(id)) {
            current.next = current.next.next;
            if (current.next == null) {
                // If the removed node was the tail node, update the tail reference
                tail = current;
            }
            size--;
            JOptionPane.showMessageDialog(null, "Perfume removed successfully!");
            return;
        }
        current = current.next;
    }

    // If the perfume with the provided ID is not found
    JOptionPane.showMessageDialog(null, "Perfume with ID " + id + " not found!");
}

void searchForPerfume(SingleLinkedList perfumeList) {
    // Prompt the user to enter search criteria
    String criteria = JOptionPane.showInputDialog("Enter search criteria (name, category, etc.):");

    // Start from the head of the list
    SingleLinkedList.Perfume current = perfumeList.head;
    boolean foundPerfume = false;

    // Iterate through all perfumes in the list
    while (current != null) {
        // Convert perfume details to lowercase for case-insensitive comparison
        String perfumeName = String.valueOf(current.Perfume).toLowerCase();
        String category = String.valueOf(current.Category).toLowerCase();
        String manufacturer = String.valueOf(current.Manufacturer).toLowerCase();

        // Check if the current perfume matches the search criteria
        if (perfumeName.contains(criteria.toLowerCase()) || 
            category.contains(criteria.toLowerCase()) ||
            manufacturer.contains(criteria.toLowerCase())) {
            // Display information about the perfume
            JOptionPane.showMessageDialog(null, current.toString());
            foundPerfume = true;
        }
        current = current.next; // Move to the next node
    }

    // If no perfume matches the search criteria, inform the user
    if (!foundPerfume) {
        JOptionPane.showMessageDialog(null, "No perfumes found matching the search criteria: " + criteria);
    }
}




void displayAllPerfumes(SingleLinkedList perfumeList) {
    // Create a text area to display perfumes
    JTextArea textArea = new JTextArea(20, 40); // 20 rows and 40 columns
    textArea.setEditable(false); // Make the text area read-only

    // Create a scroll pane and add the text area to it
    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    // Add perfume information to the text area
    SingleLinkedList.Perfume current = perfumeList.head;
    while (current != null) {
        textArea.append(current.toString() + "\n\n"); // Append perfume info with a newline separator
        current = current.next;
    }

    // Create a frame to display the scroll pane
    JFrame frame = new JFrame("All Perfumes");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this frame
    frame.add(scrollPane); // Add scroll pane to the frame
    frame.pack(); // Adjust frame size
    frame.setLocationRelativeTo(null); // Center the frame on the screen
    frame.setVisible(true); // Show the frame
}

void checkPerfumeAvailability(SingleLinkedList perfumeList) {
    // Prompt the user to enter the name of the perfume to check availability
    String name = JOptionPane.showInputDialog("Enter the name of the perfume to check availability:");

    // Start from the head of the list
    SingleLinkedList.Perfume current = perfumeList.head;
    boolean foundPerfume = false;

    // Iterate through all perfumes in the list
    while (current != null) {
        // Check if the current perfume matches the provided name
        if (current.Perfume.equals(name)) {
            // Display the availability of the perfume
            StringBuilder availabilityInfo = new StringBuilder("Availability of perfume " + current.Perfume + ":\n");
            for (int i = 0; i < current.availability.size(); i++) {
                availabilityInfo.append("- ").append(current.availability.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, availabilityInfo.toString());
            foundPerfume = true;
            break; // Exit the loop once the perfume is found
        }
        current = current.next; // Move to the next node
    }

    // If no perfume found with the provided name, inform the user
    if (!foundPerfume) {
        JOptionPane.showMessageDialog(null, "Perfume with name " + name + " not found!");
    }
}





void updateInventory(SingleLinkedList perfumeList) {
    // Prompt the user to enter the ID of the perfume to update
    String id = JOptionPane.showInputDialog("Enter the ID of the perfume to update:");

    // Find the perfume with the provided ID
    SingleLinkedList.Perfume current = perfumeList.head;
    while (current != null) {
        if (current.id.equals(id)) {
            // Prompt the user to choose which attribute they want to update
            String[] options = {"Name", "Category", "Manufacturer", "Price", "Born Year"};
            int choice = JOptionPane.showOptionDialog(null, "Which attribute do you want to update?", "Update Attribute",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            // Update the selected attribute based on the user's choice
            switch (choice) {
                case 0: // Update Name
                    String newName = JOptionPane.showInputDialog("Enter the new name of the perfume:");
                    current.Perfume = newName;
                    break;
                case 1: // Update Category
                    String newCategory = JOptionPane.showInputDialog("Enter the new category of the perfume:");
                    current.Category = newCategory;
                    break;
                case 2: // Update Manufacturer
                    String newManufacturer = JOptionPane.showInputDialog("Enter the new manufacturer of the perfume:");
                    current.Manufacturer = newManufacturer;
                    break;
                case 3: // Update Price
                    double newPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the new price of the perfume:"));
                    current.Price = newPrice;
                    break;
                case 4: // Update Born Year
                    int newBornYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the new born year of the perfume:"));
                    current.BornYear = newBornYear;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice!");
                    return;
            }

            // Inform the user that the attribute has been updated
            JOptionPane.showMessageDialog(null, "Perfume attribute updated successfully!");
            return;
        }
        current = current.next;
    }

    // If the perfume with the provided ID is not found
    JOptionPane.showMessageDialog(null, "Perfume with ID " + id + " not found!");
}




String generateIngredientRecommendations(SingleLinkedList perfumeList, String ingredient) {
    // Initialize a string to store recommendations
    StringBuilder recommendations = new StringBuilder("Recommendations for perfumes containing  " + ingredient + "Scent"+":\n");

    // Start from the head of the list
    SingleLinkedList.Perfume current = perfumeList.head;
    boolean foundPerfumeWithIngredient = false;

    // Iterate through all perfumes in the list
    while (current != null) {
        if (current.ingredients.contains(ingredient)) {
            // Append information about the perfume to the recommendations string
            recommendations.append("Name: ").append(current.Perfume).append(", Price: ").append(current.Price).append("\n"); 
            foundPerfumeWithIngredient = true;
        }
        current = current.next; // Move to the next node
    }

    // If no perfumes found containing the specified ingredient, inform the user
    if (!foundPerfumeWithIngredient) {
        recommendations.append("No perfumes found containing ingredient ").append(ingredient).append("!");
    }

    return recommendations.toString();
}




}//linked

class StartPageInterface extends JFrame {

    public StartPageInterface() {
        setTitle("Perfume Warehouse Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700); // Phone-sized frame

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon("bb.jpg");
                // Draw the background image
                g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        panel.setOpaque(true);
        
        add(panel);
        
        panel.setLayout(new BorderLayout()); // Set layout manager to BorderLayout
        
        // Create a panel for the content
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add welcome label
        JLabel welcomeLabel = new JLabel("Welcome");
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24)); // Set font to bold and size 24
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(welcomeLabel);
        
        panel.add(Box.createVerticalStrut(50));

        // Add squared picture with border
        JLabel pictureLabel = new JLabel();
        pictureLabel.setPreferredSize(new Dimension(100, 100)); // Set picture size
        pictureLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Add border
        pictureLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

// Load the image from a file
        ImageIcon imageIcon = new ImageIcon("startpage.jpg");

// Set the icon of the label
        pictureLabel.setIcon(imageIcon);

        panel.add(pictureLabel);
        panel.add(Box.createVerticalStrut(30));

        // Add button
        JButton startButton = new JButton("Start");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Dispose the start page
        dispose(); 
        new Menue();
        
        
    }});
        panel.add(startButton);
        panel.add(Box.createVerticalStrut(20));

        add(panel);
        
       
        
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
        
    }}

class Menue extends JFrame{
    static int userChoice;
    Menue(){
        
        // Create a new frame for the menu
        JFrame menuFrame = new JFrame("Menu");
        
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(500, 700); // Phone-sized frame
        
       JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

       JLabel menuLabel = new JLabel("Perfume Warehouse Management System Menu");
       JLabel menu = new JLabel ("<html>"
        + "1- Add a new perfume<br>"
        + "2- Remove a perfume<br>"
        + "3- Search for a perfume<br>"
        + "4- Display all perfumes<br>"
        + "5- Check Stores of a perfume<br>"
        + "6- Update a prefume<br>"
        + "7- Get recommendations<br>"
        + "0- Exit<br>"
        + "</html>");
        menuLabel.setFont(new Font("Serif", Font.BOLD, 24));
//        menuLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        menu.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        menuPanel.add(menuLabel);
        menuPanel.add(menu);
        
        JTextField textField = new JTextField(20); // 20 columns wide
        menuPanel.add(textField);
        
        menuFrame.setLocationRelativeTo(null);
       
        
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                String text = textField.getText();
                text = text.trim();
                try {
                    int choice = Integer.parseInt(text);
                    setUserChoice(choice);
                   
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(menuFrame, "Invalid input! Please enter a valid number.");
                }
                
                handleUserChoice(userChoice ,DatastructreLinkedList.perfumeList);
                
                 
        
            }
        });
        menuPanel.add(submitButton);

        menuFrame.setContentPane(menuPanel);
        menuFrame.revalidate(); // Refresh the frame to display the new panel

        // Display the menu frame
        menuFrame.setVisible(true);
        
    }
    
    void handleUserChoice(int choice, SingleLinkedList perfumeList) {
        try {
    switch (choice) {
        case 1:
            perfumeList.addNewPerfume(perfumeList);
            break;
        case 2:
            perfumeList.removePerfume();
            break;
        case 3:
            perfumeList.searchForPerfume(perfumeList);
            break;
        case 4:
            perfumeList.displayAllPerfumes(perfumeList);
            break;
        case 5:
            perfumeList.checkPerfumeAvailability(perfumeList);
            break;
        case 6:
            perfumeList.updateInventory(perfumeList);
            break;
        case 7:
            String category = JOptionPane.showInputDialog("what smell would you like?");
            String recommendations = perfumeList.generateIngredientRecommendations(perfumeList, category);
            JOptionPane.showMessageDialog(null, recommendations);
            break;
        case 0:
            System.out.println("Exiting...");
            System.exit(0);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Invalid choice! Please enter a valid option.");
    }}catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
    }

}
    
    void setUserChoice(int choice) {
        this.userChoice = choice;
    }
    
    static int getUserChoice(){
        return userChoice;
    }
}


