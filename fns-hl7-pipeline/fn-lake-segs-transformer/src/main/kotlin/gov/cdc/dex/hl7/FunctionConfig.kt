package gov.cdc.dex.hl7

import gov.cdc.dex.azure.EventHubSender
import gov.cdc.dex.azure.RedisProxy
import gov.cdc.dex.mmg.MmgUtil

class FunctionConfig {

    val evHubSender: EventHubSender

    val eventHubSendOkName = System.getenv("EventHubSendOkName")
    val eventHubSendErrsName = System.getenv("EventHubSendErrsName")

    init {
         //Init Event Hub connections
        val evHubConnStr = System.getenv("EventHubConnectionString")
        evHubSender = EventHubSender(evHubConnStr)

    }
}