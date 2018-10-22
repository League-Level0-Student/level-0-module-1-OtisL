void setup(){
 PImage face = loadImage("face.jpg");
 size(800,800);
 face.resize(800,800);
 image(face,0,0);
}

void draw(){
  fill(mouseX, mouseY, 0);
  ellipse(216, 263, 50, 50);
  ellipse(434, 190, 50, 50);
  fill(0,0,0);
  ellipse(216, 263, 10, 10);
  ellipse(434, 190, 10, 10);
}