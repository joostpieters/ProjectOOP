package hillbillies.part1;

import hillbillies.common.internal.HillbilliesApplication;
import hillbillies.common.internal.controller.GameController;
import hillbillies.common.internal.ui.HillbilliesView;
import hillbillies.part1.facade.Facade;
import hillbillies.part1.facade.IFacade;
import hillbillies.part1.internal.Part1Options;
import hillbillies.part1.internal.controller.GameControllerPart1;
import hillbillies.part1.internal.ui.HillbilliesViewPart1;
import javafx.application.Application;

public class Part1 extends HillbilliesApplication<Part1Options, IFacade> {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	protected IFacade createFacade() {
		return new hillbillies.part1.facade.Facade();
	}
	
	@Override
	protected GameController<IFacade> createController(IFacade facade, Part1Options options) {
		return new GameControllerPart1(facade, options);
	}
	
	@Override
	protected HillbilliesView createView(GameController<IFacade> game, Part1Options options) {
		return new HillbilliesViewPart1(game.createViewProviders(), options);
	}
	
	@Override
	protected Part1Options createOptions() {
		Part1Options options = new Part1Options();
		// set your preferred defaults here, e.g.,
		options.gridEnabled().setValue(true);
		return options;
	}
	
	@Override
	protected String getTitle() {
		return super.getTitle() + " - Part 1";
	}

}
