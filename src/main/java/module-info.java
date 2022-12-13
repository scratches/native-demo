module demo {
    exports com.example.demo;

    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.actuator;
    requires spring.boot.actuator.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires java.instrument;

    opens com.example.demo to //
            spring.core, spring.web, spring.beans, spring.context, spring.boot, com.fasterxml.jackson.databind;
}
