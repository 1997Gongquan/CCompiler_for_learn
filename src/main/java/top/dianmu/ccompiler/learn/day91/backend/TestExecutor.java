package top.dianmu.ccompiler.learn.day91.backend;

public class TestExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		executeChildren(root);
		copyChild(root, root.getChildren().get(0));
		
		return root;
	}

}