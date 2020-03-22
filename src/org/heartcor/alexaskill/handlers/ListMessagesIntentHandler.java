package org.heartcor.alexaskill.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class ListMessagesIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("LIST_MESSAGES"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Du hast keine Benachrichtigungen!";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .build();
    }
}
