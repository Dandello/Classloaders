package ru.sbt.pluginRootDirectory.PluginOne;

import ru.sbt.Plugin;

public class PluginOne implements Plugin{
    @Override
    public void doUsefull() {
        System.out.println("I am plugin one!");
    }
}
