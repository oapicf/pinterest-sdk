package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ConversionsApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://api.pinterest.com/v5")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val advertiserDefinedEventsCreatePerSecond = config.getDouble("performance.operationsPerSecond.advertiserDefinedEventsCreate") * rateMultiplier * instanceMultiplier
    val advertiserDefinedEventsDeletePerSecond = config.getDouble("performance.operationsPerSecond.advertiserDefinedEventsDelete") * rateMultiplier * instanceMultiplier
    val advertiserDefinedEventsGetPerSecond = config.getDouble("performance.operationsPerSecond.advertiserDefinedEventsGet") * rateMultiplier * instanceMultiplier
    val advertiserDefinedEventsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.advertiserDefinedEventsUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val advertiser_defined_events/createPATHFeeder = csv(userDataDirectory + File.separator + "advertiserDefinedEventsCreate-pathParams.csv").random
    val advertiser_defined_events/deleteQUERYFeeder = csv(userDataDirectory + File.separator + "advertiserDefinedEventsDelete-queryParams.csv").random
    val advertiser_defined_events/deletePATHFeeder = csv(userDataDirectory + File.separator + "advertiserDefinedEventsDelete-pathParams.csv").random
    val advertiser_defined_events/getPATHFeeder = csv(userDataDirectory + File.separator + "advertiserDefinedEventsGet-pathParams.csv").random
    val advertiser_defined_events/updatePATHFeeder = csv(userDataDirectory + File.separator + "advertiserDefinedEventsUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scnadvertiserDefinedEventsCreate = scenario("advertiserDefinedEventsCreateSimulation")
        .feed(advertiser_defined_events/createPATHFeeder)
        .exec(http("advertiserDefinedEventsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/advertiser_defined_events")
)

    // Run scnadvertiserDefinedEventsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadvertiserDefinedEventsCreate.inject(
        rampUsersPerSec(1) to(advertiserDefinedEventsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(advertiserDefinedEventsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(advertiserDefinedEventsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadvertiserDefinedEventsDelete = scenario("advertiserDefinedEventsDeleteSimulation")
        .feed(advertiser_defined_events/deleteQUERYFeeder)
        .feed(advertiser_defined_events/deletePATHFeeder)
        .exec(http("advertiserDefinedEventsDelete")
        .httpRequest("DELETE","/ad_accounts/${ad_account_id}/advertiser_defined_events")
        .queryParam("event_names","${event_names}")
)

    // Run scnadvertiserDefinedEventsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadvertiserDefinedEventsDelete.inject(
        rampUsersPerSec(1) to(advertiserDefinedEventsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(advertiserDefinedEventsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(advertiserDefinedEventsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadvertiserDefinedEventsGet = scenario("advertiserDefinedEventsGetSimulation")
        .feed(advertiser_defined_events/getPATHFeeder)
        .exec(http("advertiserDefinedEventsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/advertiser_defined_events")
)

    // Run scnadvertiserDefinedEventsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadvertiserDefinedEventsGet.inject(
        rampUsersPerSec(1) to(advertiserDefinedEventsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(advertiserDefinedEventsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(advertiserDefinedEventsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadvertiserDefinedEventsUpdate = scenario("advertiserDefinedEventsUpdateSimulation")
        .feed(advertiser_defined_events/updatePATHFeeder)
        .exec(http("advertiserDefinedEventsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/advertiser_defined_events")
)

    // Run scnadvertiserDefinedEventsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadvertiserDefinedEventsUpdate.inject(
        rampUsersPerSec(1) to(advertiserDefinedEventsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(advertiserDefinedEventsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(advertiserDefinedEventsUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
