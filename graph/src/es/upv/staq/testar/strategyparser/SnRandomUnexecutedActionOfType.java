package es.upv.staq.testar.strategyparser;

import java.util.ArrayList;

import org.fruit.alayer.Action;

import es.upv.staq.testar.algorithms.StateManager;

public class SnRandomUnexecutedActionOfType extends StrategyNodeAction {
	StrategyNodeActiontype child1;
	
	public SnRandomUnexecutedActionOfType(ArrayList<StrategyNode> children) {
		super(children);
		child1 = (StrategyNodeActiontype)children.get(0);
	}

	@Override
	public Action getAction(StateManager state) {
		return state.getRandomAction(child1.getActiontype(state), "UNEX");
	}

}
