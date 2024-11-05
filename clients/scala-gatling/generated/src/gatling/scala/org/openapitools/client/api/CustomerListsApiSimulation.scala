package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CustomerListsApiSimulation extends Simulation {

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
    val customerListsCreatePerSecond = config.getDouble("performance.operationsPerSecond.customerListsCreate") * rateMultiplier * instanceMultiplier
    val customerListsGetPerSecond = config.getDouble("performance.operationsPerSecond.customerListsGet") * rateMultiplier * instanceMultiplier
    val customerListsListPerSecond = config.getDouble("performance.operationsPerSecond.customerListsList") * rateMultiplier * instanceMultiplier
    val customerListsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.customerListsUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val customer_lists/createPATHFeeder = csv(userDataDirectory + File.separator + "customerListsCreate-pathParams.csv").random
    val customer_lists/getPATHFeeder = csv(userDataDirectory + File.separator + "customerListsGet-pathParams.csv").random
    val customer_lists/listQUERYFeeder = csv(userDataDirectory + File.separator + "customerListsList-queryParams.csv").random
    val customer_lists/listPATHFeeder = csv(userDataDirectory + File.separator + "customerListsList-pathParams.csv").random
    val customer_lists/updatePATHFeeder = csv(userDataDirectory + File.separator + "customerListsUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scncustomerListsCreate = scenario("customerListsCreateSimulation")
        .feed(customer_lists/createPATHFeeder)
        .exec(http("customerListsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/customer_lists")
)

    // Run scncustomerListsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncustomerListsCreate.inject(
        rampUsersPerSec(1) to(customerListsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(customerListsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(customerListsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncustomerListsGet = scenario("customerListsGetSimulation")
        .feed(customer_lists/getPATHFeeder)
        .exec(http("customerListsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}")
)

    // Run scncustomerListsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncustomerListsGet.inject(
        rampUsersPerSec(1) to(customerListsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(customerListsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(customerListsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncustomerListsList = scenario("customerListsListSimulation")
        .feed(customer_lists/listQUERYFeeder)
        .feed(customer_lists/listPATHFeeder)
        .exec(http("customerListsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/customer_lists")
        .queryParam("page_size","${page_size}")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scncustomerListsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncustomerListsList.inject(
        rampUsersPerSec(1) to(customerListsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(customerListsListPerSecond) during(durationSeconds),
        rampUsersPerSec(customerListsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncustomerListsUpdate = scenario("customerListsUpdateSimulation")
        .feed(customer_lists/updatePATHFeeder)
        .exec(http("customerListsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}")
)

    // Run scncustomerListsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncustomerListsUpdate.inject(
        rampUsersPerSec(1) to(customerListsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(customerListsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(customerListsUpdatePerSecond) to(1) during(rampDownSeconds)
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
