package colorexeption;

public class color {
	private String colorName;
    public void setColorName(String colorName) throws InvalidColorException {
        if (colorName.equalsIgnoreCase("red") || colorName.equalsIgnoreCase("green") || colorName.equalsIgnoreCase("white")) {
            this.colorName = colorName;
        } else {
            throw new InvalidColorException("Invalid color! Please enter only 'red', 'green', or 'white'.");
        }
    }
    public String getColorName() {
        return colorName;
    }
    @Override
    public String toString() {
        return "Color: " + colorName;
    }
    public static void main(String[] args) {
        color color = new color();

        try {
            // Setting valid color
            color.setColorName("red");
            System.out.println(color);

            // Setting invalid color
            color.setColorName("blue");
            System.out.println(color); 
        } catch (InvalidColorException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
