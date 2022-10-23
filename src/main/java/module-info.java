module com.arena_returns.simplenet {
    requires org.slf4j;
    requires com.arena_returns.pbbl;

    exports com.arena_returns.simplenet;
    exports com.arena_returns.simplenet.packet;
    exports com.arena_returns.simplenet.utility.exposed.consumer;
    exports com.arena_returns.simplenet.utility.exposed.cryptography;
    exports com.arena_returns.simplenet.utility.exposed.data;
    exports com.arena_returns.simplenet.utility.exposed.predicate;
}
