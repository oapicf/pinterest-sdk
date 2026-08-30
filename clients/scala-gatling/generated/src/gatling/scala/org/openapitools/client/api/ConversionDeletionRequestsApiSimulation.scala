package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ConversionDeletionRequestsApiSimulation extends Simulation {

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
    val conversionDeletionRequestCreatePerSecond = config.getDouble("performance.operationsPerSecond.conversionDeletionRequestCreate") * rateMultiplier * instanceMultiplier
    val conversionDeletionRequestDeletePerSecond = config.getDouble("performance.operationsPerSecond.conversionDeletionRequestDelete") * rateMultiplier * instanceMultiplier
    val conversionDeletionRequestGetPerSecond = config.getDouble("performance.operationsPerSecond.conversionDeletionRequestGet") * rateMultiplier * instanceMultiplier
    val conversionDeletionRequestListPerSecond = config.getDouble("performance.operationsPerSecond.conversionDeletionRequestList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val conversion_deletion_request/createPATHFeeder = csv(userDataDirectory + File.separator + "conversionDeletionRequestCreate-pathParams.csv").random
    val conversion_deletion_request/deletePATHFeeder = csv(userDataDirectory + File.separator + "conversionDeletionRequestDelete-pathParams.csv").random
    val conversion_deletion_request/getPATHFeeder = csv(userDataDirectory + File.separator + "conversionDeletionRequestGet-pathParams.csv").random
    val conversion_deletion_request/listQUERYFeeder = csv(userDataDirectory + File.separator + "conversionDeletionRequestList-queryParams.csv").random
    val conversion_deletion_request/listPATHFeeder = csv(userDataDirectory + File.separator + "conversionDeletionRequestList-pathParams.csv").random

    // Setup all scenarios

    
    val scnconversionDeletionRequestCreate = scenario("conversionDeletionRequestCreateSimulation")
        .feed(conversion_deletion_request/createPATHFeeder)
        .exec(http("conversionDeletionRequestCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/conversion_deletion_requests")
)

    // Run scnconversionDeletionRequestCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconversionDeletionRequestCreate.inject(
        rampUsersPerSec(1) to(conversionDeletionRequestCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(conversionDeletionRequestCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(conversionDeletionRequestCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconversionDeletionRequestDelete = scenario("conversionDeletionRequestDeleteSimulation")
        .feed(conversion_deletion_request/deletePATHFeeder)
        .exec(http("conversionDeletionRequestDelete")
        .httpRequest("DELETE","/ad_accounts/${ad_account_id}/conversion_deletion_requests/${request_id}")
)

    // Run scnconversionDeletionRequestDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconversionDeletionRequestDelete.inject(
        rampUsersPerSec(1) to(conversionDeletionRequestDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(conversionDeletionRequestDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(conversionDeletionRequestDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconversionDeletionRequestGet = scenario("conversionDeletionRequestGetSimulation")
        .feed(conversion_deletion_request/getPATHFeeder)
        .exec(http("conversionDeletionRequestGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/conversion_deletion_requests/${request_id}")
)

    // Run scnconversionDeletionRequestGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconversionDeletionRequestGet.inject(
        rampUsersPerSec(1) to(conversionDeletionRequestGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(conversionDeletionRequestGetPerSecond) during(durationSeconds),
        rampUsersPerSec(conversionDeletionRequestGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconversionDeletionRequestList = scenario("conversionDeletionRequestListSimulation")
        .feed(conversion_deletion_request/listQUERYFeeder)
        .feed(conversion_deletion_request/listPATHFeeder)
        .exec(http("conversionDeletionRequestList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/conversion_deletion_requests")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("order","${order}")
)

    // Run scnconversionDeletionRequestList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconversionDeletionRequestList.inject(
        rampUsersPerSec(1) to(conversionDeletionRequestListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(conversionDeletionRequestListPerSecond) during(durationSeconds),
        rampUsersPerSec(conversionDeletionRequestListPerSecond) to(1) during(rampDownSeconds)
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
