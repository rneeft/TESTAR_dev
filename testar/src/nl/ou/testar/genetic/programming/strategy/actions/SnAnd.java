package nl.ou.testar.genetic.programming.strategy.actions;

import nl.ou.testar.genetic.programming.strategy.StrategyGuiState;
import nl.ou.testar.genetic.programming.strategy.actionTypes.StrategyNode;
import nl.ou.testar.genetic.programming.strategy.actionTypes.StrategyNodeBoolean;

import java.util.List;

public class SnAnd extends StrategyNodeBoolean {
    private StrategyNodeBoolean child;
    private StrategyNodeBoolean child1;

    public SnAnd(final List<StrategyNode> children) {
        super(children);
        this.child = (StrategyNodeBoolean) children.get(0);
        this.child1 = (StrategyNodeBoolean) children.get(1);
    }

    public boolean getValue(final StrategyGuiState state) {
        return this.child.getValue(state) && this.child1.getValue(state);
    }
}
