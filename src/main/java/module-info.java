module com.arenareturns.simplenet {
    requires org.slf4j;
    requires com.github.pbbl;

    exports com.arenareturns.simplenet;
    exports com.arenareturns.simplenet.packet;
    exports com.arenareturns.simplenet.utility.exposed.consumer;
    exports com.arenareturns.simplenet.utility.exposed.cryptography;
    exports com.arenareturns.simplenet.utility.exposed.data;
    exports com.arenareturns.simplenet.utility.exposed.predicate;
}
