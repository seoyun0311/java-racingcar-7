package racingcar.Controller;

import racingcar.Model.WinGenerator;
import racingcar.View.InputView;
import racingcar.View.OutputView;

import java.util.List;

public class RacingController {
    private final List<ForwardController> cars;
    private final int attempts;

    public RacingController() {
        this.cars = InputView.getCars();
        this.attempts = InputView.getAttempts();
    }

    private void playRound() {
        for (ForwardController car : cars) {
            car.move();
        }
    }

    private void showFinalWinners() {
        List<String> winners = WinGenerator.findWinners(cars);
        OutputView.showWinners(winners);
    }

}