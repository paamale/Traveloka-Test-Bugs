package TestRunnerFlightTicketBooking;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/FlightTicketBooking", glue = "FlightTicketBooking")
public class TestRun {
}
