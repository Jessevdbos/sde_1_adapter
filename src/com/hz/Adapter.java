package com.hz;

public class Adapter {

    String[] _converter = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always",
            "never done otherwise"};
    String _answer;

    public Adapter(String answer) {
        _answer = answer;
    }

    public boolean ReturnAnswer() {
        for (int j=0; j< _converter.length; j++) {
            if (_answer.equals(_converter[j])) {
                return true;
            }
        }

        return false;
    }
}
