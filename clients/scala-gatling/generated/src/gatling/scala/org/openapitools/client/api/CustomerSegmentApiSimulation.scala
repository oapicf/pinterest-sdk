package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CustomerSegmentApiSimulation extends Simulation {

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
    val customerSegmentCreatePerSecond = config.getDouble("performance.operationsPerSecond.customerSegmentCreate") * rateMultiplier * instanceMultiplier
    val customerSegmentListPerSecond = config.getDouble("performance.operationsPerSecond.customerSegmentList") * rateMultiplier * instanceMultiplier
    val customerSegmentUpdatePerSecond = config.getDouble("performance.operationsPerSecond.customerSegmentUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val customer_segment/createPATHFeeder = csv(userDataDirectory + File.separator + "customerSegmentCreate-pathParams.csv").random
    val customer_segment/listQUERYFeeder = csv(userDataDirectory + File.separator + "customerSegmentList-queryParams.csv").random
    val customer_segment/listPATHFeeder = csv(userDataDirectory + File.separator + "customerSegmentList-pathParams.csv").random
    val customer_segment/updatePATHFeeder = csv(userDataDirectory + File.separator + "customerSegmentUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scncustomerSegmentCreate = scenario("customerSegmentCreateSimulation")
        .feed(customer_segment/createPATHFeeder)
        .exec(http("customerSegmentCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/customer_segments")
)

    // Run scncustomerSegmentCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncustomerSegmentCreate.inject(
        rampUsersPerSec(1) to(customerSegmentCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(customerSegmentCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(customerSegmentCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncustomerSegmentList = scenario("customerSegmentListSimulation")
        .feed(customer_segment/listQUERYFeeder)
        .feed(customer_segment/listPATHFeeder)
        .exec(http("customerSegmentList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/customer_segments")
        .queryParam("bookmark","${bookmark}")
        .queryParam("include_sizing","${include_sizing}")
        .queryParam("page_size","${page_size}")
        .queryParam("order","${order}")
        .queryParam("search_query","${search_query}")
)

    // Run scncustomerSegmentList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncustomerSegmentList.inject(
        rampUsersPerSec(1) to(customerSegmentListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(customerSegmentListPerSecond) during(durationSeconds),
        rampUsersPerSec(customerSegmentListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncustomerSegmentUpdate = scenario("customerSegmentUpdateSimulation")
        .feed(customer_segment/updatePATHFeeder)
        .exec(http("customerSegmentUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/customer_segments")
)

    // Run scncustomerSegmentUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncustomerSegmentUpdate.inject(
        rampUsersPerSec(1) to(customerSegmentUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(customerSegmentUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(customerSegmentUpdatePerSecond) to(1) during(rampDownSeconds)
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
