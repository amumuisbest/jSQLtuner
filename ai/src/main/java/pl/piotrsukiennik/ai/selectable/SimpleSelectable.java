package pl.piotrsukiennik.ai.selectable;

import pl.piotrsukiennik.ai.id.Identifier;

/**
 * @author Piotr Sukiennik
 * @date 12.02.14
 */
public class SimpleSelectable<I extends Identifier> extends AbstractSelectable<I> implements Selectable<I> {

    public SimpleSelectable( I identifier, double fitness ) {
        super( identifier );
        this.fitness = fitness;
    }

    private double fitness;

    public double getFitness() {
        return fitness;
    }

    public void setFitness( double fitness ) {
        this.fitness = fitness;
    }


}
