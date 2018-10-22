void setup(){
  size(400,400);
  fill(#9D9120);
  ellipse(200,200,200,200);
}
//To add bolts, do right click
//To add Floppy Disks, use left click
void draw(){
  PImage floppy = loadImage("disk.png");
  PImage bolts = loadImage("bolts.png");
  floppy.resize(30,30);
  if(mousePressed && (mouseButton == LEFT)){
    image(floppy, mouseX, mouseY);
  }
  bolts.resize(30,30);
  if(mousePressed && (mouseButton == RIGHT)){
    image(bolts, mouseX, mouseY);
  }
}