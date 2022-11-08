package ru.mirea.task6.prac6.computer;

public class Computer {
    private Name name;
    private int number;
    private Monitor monitor;
    private Memory memory;
    private Processor processor;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name=" + name +
                ", number=" + number +
                ", monitor=" + monitor +
                ", memory=" + memory +
                ", processor=" + processor +
                '}';
    }

    public Computer(Name name, int number, Monitor monitor, Memory memory, Processor processor) {
        this.name = name;
        this.number = number;
        this.monitor = monitor;
        this.memory = memory;
        this.processor = processor;
    }
}
