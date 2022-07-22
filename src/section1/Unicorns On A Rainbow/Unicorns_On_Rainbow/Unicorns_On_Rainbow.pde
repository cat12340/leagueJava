PImage rainbow;
PImage unicorn;

void setup() {
 rainbow = loadImage("rainbow_.jpg");
 size(700,600);
 rainbow.resize(700,600);
 unicorn = loadImage("unicorn12.png");
}

void draw() {
  background(rainbow);
  image(unicorn, mouseX-139, mouseY-150);
}

  
