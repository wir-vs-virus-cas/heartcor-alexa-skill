package org.heartcor.alexaskill;

import org.heartcor.alexaskill.handlers.CancelandStopIntentHandler;
import org.heartcor.alexaskill.handlers.FallbackIntentHandler;
import org.heartcor.alexaskill.handlers.HelpIntentHandler;
import org.heartcor.alexaskill.handlers.LaunchRequestHandler;
import org.heartcor.alexaskill.handlers.ListMessagesIntentHandler;
import org.heartcor.alexaskill.handlers.SessionEndedRequestHandler;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.servlet.SkillServlet;

public class HeartcorAlexaServlet extends SkillServlet {
	private static final long serialVersionUID = 229646772180860785L;

		public HeartcorAlexaServlet() {
			super(getSkill());
		}

	    @SuppressWarnings("unchecked")
		private static Skill getSkill() {
	        return Skills.standard()
	                .addRequestHandlers(
	                        new CancelandStopIntentHandler(),
	                        new FallbackIntentHandler(),
	                        new HelpIntentHandler(),
	                        new LaunchRequestHandler(),
	                        new SessionEndedRequestHandler(),
	                        new ListMessagesIntentHandler())
	                .withSkillId("amzn1.ask.skill.2ff75f31-3294-4be2-baca-c7fea1960453")
	                .build();
	    }
}
