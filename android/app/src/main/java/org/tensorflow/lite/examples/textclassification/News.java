package org.tensorflow.lite.examples.textclassification;

public class News {
    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getFakeOutput() {
        return fakeOutput;
    }

    public void setFakeOutput(String fakeOutput) {
        this.fakeOutput = fakeOutput;
    }

    public String getRealOutput() {
        return realOutput;
    }

    public void setRealOutput(String realOutput) {
        this.realOutput = realOutput;
    }

    String userInput, fakeOutput, realOutput;

    public News(String userInput, String fakeOutput, String realOutput) {
        this.userInput = userInput;
        this.fakeOutput = fakeOutput;
        this.realOutput = realOutput;
    }
}
