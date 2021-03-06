package seedu.address.testutil;

import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EVENT_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TIME;

import seedu.address.logic.commands.AddEventCommand;
import seedu.address.model.event.Event;

/**
 * A utility class for Events. Note that this is different from EventsUtil.java, hence the different naming, as this is
 * for the
 * Events-related
 * functions in EventsPlus+.
 */

public class ScheduledEventUtil {

    /**
     * Returns an add command string for adding the {@code event}.
     */
    public static String getAddEventCommand(Event event) {
        return AddEventCommand.COMMAND_WORD + " " + getEventDetails(event);
    }

    /**
     * Returns the part of command string for the given {@code event}'s details.
     */
    public static String getEventDetails(Event event) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_NAME + event.getEventName().eventName + " ");
        sb.append(PREFIX_EVENT_DESCRIPTION + event.getEventDescription().eventDescription + " ");
        sb.append(PREFIX_DATE + event.getEventDate().eventDate.toString() + " ");
        // replace extra colon to simulate user input
        sb.append(PREFIX_TIME + event.getEventTime().eventTime.toString().replace(":", "") + " ");
        sb.append(PREFIX_ADDRESS + event.getEventAddress().eventAddress + " ");

        return sb.toString();
    }
}
