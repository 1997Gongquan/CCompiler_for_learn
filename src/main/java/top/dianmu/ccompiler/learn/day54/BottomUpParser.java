package top.dianmu.ccompiler.learn.day54;


public class BottomUpParser {
    public static void main(String[] args) {
    	ProductionManager productionManager = ProductionManager.getProductionManager();
    	productionManager.initProductions();
    	productionManager.printAllProductions();
    	
    	GrammarStateManager stateManager = GrammarStateManager.getGrammarManager();
    	stateManager.buildTransitionStateMachine();
    }
}