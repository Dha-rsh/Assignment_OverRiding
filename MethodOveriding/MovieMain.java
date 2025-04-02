package MethodOveriding;


class Movie {
 String title;

 public Movie(String title) {
     this.title = title;
 }

 public void play() {
     System.out.println("Playing the movie: " + title);
 }
}


class RomComMovie extends Movie {
 public RomComMovie(String title) {
     super(title);
 }

 @Override
 public void play() {
     System.out.println("Playing a romantic and comedy movie: " + title);
 }
}


class ThrillerMovie extends Movie {
 public ThrillerMovie(String title) {
     super(title);
 }

 @Override
 public void play() {
     System.out.println("Playing an thriller movie: " + title);
 }
}


class HorrorMovie extends Movie {
 public HorrorMovie(String title) {
     super(title);
 }

 @Override
 public void play() {
     System.out.println("Playing a  horror movie: " + title);
 }
}


public class MovieMain {
 public static void main(String[] args) {
     Movie movie1 = new RomComMovie("Oh My Kadavule");
     Movie movie2 = new ThrillerMovie("yavarum nalam");
     Movie movie3 = new HorrorMovie("The Conjuring");

   
     movie1.play();
     System.out.println("--------------------");
     movie2.play();
     System.out.println("--------------------");
     movie3.play();
 }
}

