package org.learning;

//class that is used to create and return object based on passed argument in constructor
public class SpeakerFactory {
    private Speaker speaker;
    private String speaker_name;
    public Speaker getSpeaker(String speaker_name){
        this.speaker_name = speaker_name.toLowerCase();
        if (speaker_name.equals("boat"))
            return new Boat();
        else if (speaker_name.equals("sony"))
            return new Sony();
        else return null;
    }
}
