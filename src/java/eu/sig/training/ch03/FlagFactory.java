package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        switch (nationality) {
            case DUTCH:    return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
            case GERMAN:   return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
            case BELGIAN:  return Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
            case FRENCH:   return Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
            case ITALIAN:  return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
            case ROMANIA:  return Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
            case IRELAND:  return Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
            case HUNGARIAN:return Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
            case BULGARIAN:return Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
            case RUSSIA:   return Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
            case UNCLASSIFIED:
            default:       return Arrays.asList(Color.GRAY);
        }
        return result;
    }
    // end::getFlag[]

}