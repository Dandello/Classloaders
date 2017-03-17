package ru.sbt;

public class Main {

    public static void main(String[] args)  {
        ClassLoader pluginManager = new PluginManager(
                "/Users/a302/IdeaProjects/ClassLoaders/PluginManager/out/production/PluginManager",
                Main.class.getClassLoader());
        ;
        try {
            ru.sbt.pluginRootDirectory.PluginOne.PluginOne pluginOne =
                  (ru.sbt.pluginRootDirectory.PluginOne.PluginOne) pluginManager.loadClass("ru.sbt.pluginRootDirectory.PluginOne.PluginOne").newInstance();
            pluginOne.doUsefull();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
