import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class AutomataTest {
    @Test
    public void should_recognise_the_language_ends_with_1() throws Exception {
        Set<String> alphabets = new HashSet<>(2);
        alphabets.add("0");
        alphabets.add("1");

        Set<String> states = new HashSet<>(2);
        states.add("q1");
        states.add("q2");

        String initialState = "q1";

        Set<String> finalState = new HashSet<>(1);
        finalState.add("q2");

        Transition transitionFunction = new Transition();
        transitionFunction.add("q1", "0", "q1");
        transitionFunction.add("q1", "1", "q2");
        transitionFunction.add("q2", "0", "q1");
        transitionFunction.add("q2", "1", "q2");

        Automata automata = new Automata(states, alphabets, initialState, finalState, transitionFunction);

        assertEquals(true,  automata.isRecognising("01001"));
        assertEquals(false, automata.isRecognising("00110"));
        assertEquals(true, automata.isRecognising("1111111"));
        assertEquals(false, automata.isRecognising(""));

    }
}