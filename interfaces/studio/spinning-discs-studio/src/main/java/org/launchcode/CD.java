package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    private String musicGenre;

    public CD(int averageSpinSpeedRPM, int storageCapacity, String contents, String name, String musicGenre) {
        super(averageSpinSpeedRPM, storageCapacity, contents, name);
        this.musicGenre = musicGenre;
    }

    @Override
    public String getContents() {
        return super.getContents();
    }

    @Override
    public String getDiscType() {
        return "CD";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void spin() {
        System.out.println(getName() + " is spinning");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }

    @Override
    public void pause() {
        System.out.println(getName() + " is paused");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " is stopped");
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
