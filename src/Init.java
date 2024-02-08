import java.util.ArrayList;
public class Init {
    public static State[] States() {
        ArrayList<State> states1 = new ArrayList<State>();

        states1.add(new State("q0", true, false));
        states1.add(new State("q1", false, false));
        states1.add(new State("q2", false, false));
        states1.add(new State("q3", false, false));
        states1.add(new State("q4", false, false));
        states1.add(new State("q5", false, false));
        states1.add(new State("q6", false, false));
        states1.add(new State("q7", false, false));
        states1.add(new State("q8", false, false));
        states1.add(new State("q9", false, false));
        states1.add(new State("q10", false, false));
        states1.add(new State("q11", false, false));
        states1.add(new State("q12", false, false));
        states1.add(new State("q13", false, false));
        states1.add(new State("q14", false, false));
        states1.add(new State("q15", false, false));
        states1.add(new State("q16", false, false));
        states1.add(new State("q17", false, false));
        states1.add(new State("q18", false, false));
        states1.add(new State("q19", false, false));
        states1.add(new State("q20", false, false));
        states1.add(new State("q21", false, false));
        states1.add(new State("q22", false, false));
        states1.add(new State("q23", false, false));
        states1.add(new State("q24", false, false));
        states1.add(new State("q25", false, false));
        states1.add(new State("q26", false, false));
        states1.add(new State("q27", false, false));
        states1.add(new State("q28", false, false));
        states1.add(new State("q29", false, false));
        states1.add(new State("q30", false, false));
        states1.add(new State("q31", false, false));
        states1.add(new State("q32", false, false));
        states1.add(new State("q33", false, false));
        states1.add(new State("q34", false, false));
        states1.add(new State("q35", false, false));
        states1.add(new State("q36", false, false));
        states1.add(new State("q37", false, false));
        states1.add(new State("q38", false, false));
        states1.add(new State("q39", false, false));
        states1.add(new State("q40", false, false));
        states1.add(new State("q41", false, false));
        states1.add(new State("q42", false, true));

        State[] states2 = new State[states1.size()];
        for (int i = 0; i < states1.size(); i++)
            states2[i] = states1.get(i);

        return states2;
    }

    public static Rule[] Rules() {
        State[] states = States();
        ArrayList<Rule> rules1 = new ArrayList<Rule>();

        rules1.add(new Rule(states[0], "*", states[1], "*", TapeOperation.L));
        rules1.add(new Rule(states[1], "#", states[2], "#", TapeOperation.L));
        rules1.add(new Rule(states[2], "#", states[3], "0", TapeOperation.R));
        rules1.add(new Rule(states[3], "#", states[4], "#", TapeOperation.R));
        rules1.add(new Rule(states[4], "#", states[5], "#", TapeOperation.L));
        rules1.add(new Rule(states[4], "x", states[5], "x", TapeOperation.L));
        rules1.add(new Rule(states[4], "0", states[4], "0", TapeOperation.R));
        rules1.add(new Rule(states[4], "1", states[4], "1", TapeOperation.R));
        rules1.add(new Rule(states[5], "0", states[6], "x", TapeOperation.R));
        rules1.add(new Rule(states[5], "1", states[10], "x", TapeOperation.R));
        rules1.add(new Rule(states[6], "#", states[6], "#", TapeOperation.R));
        rules1.add(new Rule(states[6], "x", states[6], "x", TapeOperation.R));
        rules1.add(new Rule(states[6], "*", states[7], "*", TapeOperation.R));
        rules1.add(new Rule(states[7], "#", states[8], "0", TapeOperation.L));
        rules1.add(new Rule(states[7], "*", states[7], "*", TapeOperation.R));
        rules1.add(new Rule(states[8], "#", states[9], "#", TapeOperation.L));
        rules1.add(new Rule(states[8], "*", states[8], "*", TapeOperation.L));
        rules1.add(new Rule(states[9], "#", states[39], "#", TapeOperation.R));
        rules1.add(new Rule(states[9], "x", states[9], "x", TapeOperation.L));
        rules1.add(new Rule(states[9], "0", states[5], "0", TapeOperation.S));
        rules1.add(new Rule(states[9], "1", states[5], "1", TapeOperation.S));
        rules1.add(new Rule(states[10], "#", states[10], "#", TapeOperation.R));
        rules1.add(new Rule(states[10], "x", states[10], "x", TapeOperation.R));
        rules1.add(new Rule(states[10], "*", states[11], "*", TapeOperation.R));
        rules1.add(new Rule(states[11], "#", states[12], "#", TapeOperation.L));
        rules1.add(new Rule(states[11], "*", states[11], "*", TapeOperation.R));
        rules1.add(new Rule(states[12], "0", states[13], "o", TapeOperation.L));
        rules1.add(new Rule(states[12], "1", states[22], "i", TapeOperation.L));
        rules1.add(new Rule(states[12], "o", states[12], "o", TapeOperation.L));
        rules1.add(new Rule(states[12], "i", states[12], "i", TapeOperation.L));
        rules1.add(new Rule(states[12], "#", states[32], "#", TapeOperation.R));
        rules1.add(new Rule(states[13], "#", states[14], "#", TapeOperation.L));
        rules1.add(new Rule(states[13], "*", states[13], "*", TapeOperation.L));
        rules1.add(new Rule(states[14], "#", states[14], "#", TapeOperation.L));
        rules1.add(new Rule(states[14], "*", states[15], "*", TapeOperation.L));
        rules1.add(new Rule(states[15], "#", states[16], "#", TapeOperation.L));
        rules1.add(new Rule(states[15], "*", states[15], "*", TapeOperation.L));
        rules1.add(new Rule(states[16], "o", states[16], "o", TapeOperation.L));
        rules1.add(new Rule(states[16], "i", states[16], "i", TapeOperation.L));
        rules1.add(new Rule(states[16], "0", states[17], "o", TapeOperation.R));
        rules1.add(new Rule(states[16], "1", states[17], "i", TapeOperation.R));
        rules1.add(new Rule(states[16], "#", states[17], "o", TapeOperation.R));
        rules1.add(new Rule(states[17], "#", states[18], "#", TapeOperation.R));
        rules1.add(new Rule(states[17], "*", states[17], "*", TapeOperation.R));
        rules1.add(new Rule(states[18], "#", states[18], "#", TapeOperation.R));
        rules1.add(new Rule(states[18], "*", states[19], "*", TapeOperation.R));
        rules1.add(new Rule(states[19], "#", states[20], "#", TapeOperation.R));
        rules1.add(new Rule(states[19], "*", states[19], "*", TapeOperation.R));
        rules1.add(new Rule(states[20], "#", states[20], "#", TapeOperation.R));
        rules1.add(new Rule(states[20], "*", states[21], "*", TapeOperation.R));
        rules1.add(new Rule(states[21], "#", states[12], "#", TapeOperation.L));
        rules1.add(new Rule(states[21], "*", states[21], "*", TapeOperation.R));
        rules1.add(new Rule(states[22], "#", states[23], "#", TapeOperation.L));
        rules1.add(new Rule(states[22], "*", states[22], "*", TapeOperation.L));
        rules1.add(new Rule(states[23], "#", states[23], "#", TapeOperation.L));
        rules1.add(new Rule(states[23], "*", states[24], "*", TapeOperation.L));
        rules1.add(new Rule(states[24], "#", states[25], "#", TapeOperation.L));
        rules1.add(new Rule(states[24], "*", states[24], "*", TapeOperation.L));
        rules1.add(new Rule(states[25], "o", states[25], "o", TapeOperation.L));
        rules1.add(new Rule(states[25], "i", states[25], "i", TapeOperation.L));
        rules1.add(new Rule(states[25], "#", states[27], "i", TapeOperation.R));
        rules1.add(new Rule(states[25], "0", states[27], "i", TapeOperation.R));
        rules1.add(new Rule(states[25], "1", states[26], "o", TapeOperation.L));
        rules1.add(new Rule(states[26], "0", states[27], "1", TapeOperation.R));
        rules1.add(new Rule(states[26], "1", states[26], "0", TapeOperation.L));
        rules1.add(new Rule(states[26], "#", states[27], "1", TapeOperation.R));
        rules1.add(new Rule(states[27], "#", states[28], "#", TapeOperation.R));
        rules1.add(new Rule(states[27], "*", states[27], "*", TapeOperation.R));
        rules1.add(new Rule(states[28], "#", states[28], "#", TapeOperation.R));
        rules1.add(new Rule(states[28], "*", states[29], "*", TapeOperation.R));
        rules1.add(new Rule(states[29], "#", states[30], "#", TapeOperation.R));
        rules1.add(new Rule(states[29], "*", states[29], "*", TapeOperation.R));
        rules1.add(new Rule(states[30], "#", states[30], "#", TapeOperation.R));
        rules1.add(new Rule(states[30], "*", states[31], "*", TapeOperation.R));
        rules1.add(new Rule(states[31], "#", states[12], "#", TapeOperation.L));
        rules1.add(new Rule(states[31], "*", states[31], "*", TapeOperation.R));
        rules1.add(new Rule(states[32], "i", states[32], "1", TapeOperation.R));
        rules1.add(new Rule(states[32], "o", states[32], "0", TapeOperation.R));
        rules1.add(new Rule(states[32], "#", states[33], "#", TapeOperation.L));
        rules1.add(new Rule(states[33], "#", states[34], "#", TapeOperation.L));
        rules1.add(new Rule(states[33], "*", states[33], "*", TapeOperation.L));
        rules1.add(new Rule(states[34], "#", states[34], "#", TapeOperation.L));
        rules1.add(new Rule(states[34], "*", states[35], "*", TapeOperation.L));
        rules1.add(new Rule(states[35], "#", states[36], "#", TapeOperation.L));
        rules1.add(new Rule(states[35], "*", states[35], "*", TapeOperation.L));
        rules1.add(new Rule(states[36], "o", states[36], "0", TapeOperation.L));
        rules1.add(new Rule(states[36], "i", states[36], "1", TapeOperation.L));
        rules1.add(new Rule(states[36], "*", states[37], "*", TapeOperation.R));
        rules1.add(new Rule(states[37], "#", states[38], "#", TapeOperation.R));
        rules1.add(new Rule(states[37], "*", states[37], "*", TapeOperation.R));
        rules1.add(new Rule(states[38], "#", states[6], "#", TapeOperation.R));
        rules1.add(new Rule(states[38], "*", states[38], "*", TapeOperation.R));
        rules1.add(new Rule(states[39], "x", states[39], "#", TapeOperation.R));
        rules1.add(new Rule(states[39], "#", states[40], "#", TapeOperation.R));
        rules1.add(new Rule(states[40], "#", states[41], "#", TapeOperation.L));
        rules1.add(new Rule(states[40], "*", states[40], "#", TapeOperation.R));
        rules1.add(new Rule(states[41], "#", states[42], "#", TapeOperation.L));


        Rule[] rules2 = new Rule[rules1.size()];
        for (int i = 0; i < rules1.size(); i++)
            rules2[i] = rules1.get(i);

        return rules2;
    }
}
