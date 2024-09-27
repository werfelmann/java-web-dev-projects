package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    private String movieGenre;

    public DVD(int averageSpinSpeedRPM, double storageCapacity, String contents, String name, String movieGenre) {
        super(averageSpinSpeedRPM, storageCapacity, contents, name);
        this.movieGenre = movieGenre;
    }

    @Override
    public String getDiscType() {
        return "DVD";
    }

    @Override
    public void spin() {
        System.out.println("The " + getMovieGenre() + " movie " + getName() + " is spinning");
    }

    @Override
    public void play() {
        System.out.println("The " + getMovieGenre() + " movie " + getName() + " is playing");
    }

    @Override
    public void pause() {
        System.out.println("The " + getMovieGenre() + " movie " + getName() + " is paused");
    }

    @Override
    public void stop() {
        System.out.println("The " + getMovieGenre() + " movie " + getName() + " is stopped");
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
