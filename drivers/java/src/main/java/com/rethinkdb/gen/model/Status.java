// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/Enum.java

package com.rethinkdb.gen.model;

public enum Status {

    READY_FOR_OUTDATED_READS("ready_for_outdated_reads"),
    READY_FOR_READS("ready_for_reads"),
    READY_FOR_WRITES("ready_for_writes"),
    ALL_REPLICAS_READY("all_replicas_ready");

    public final String value;

    private Status(String value){
        this.value = value;
    }

    public static Status fromValue(String value) {
        switch (value) {
            case "ready_for_outdated_reads": return Status.READY_FOR_OUTDATED_READS;
            case "ready_for_reads": return Status.READY_FOR_READS;
            case "ready_for_writes": return Status.READY_FOR_WRITES;
            case "all_replicas_ready": return Status.ALL_REPLICAS_READY;
            default:
                throw new IllegalArgumentException(String.format(
                "%s is not a legal value for Status", value));
        }
    }

}
