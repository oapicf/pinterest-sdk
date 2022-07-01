package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class PinsApiSimulation extends Simulation {

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
    val pinsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.pinsAnalytics") * rateMultiplier * instanceMultiplier
    val pinsCreatePerSecond = config.getDouble("performance.operationsPerSecond.pinsCreate") * rateMultiplier * instanceMultiplier
    val pinsDeletePerSecond = config.getDouble("performance.operationsPerSecond.pinsDelete") * rateMultiplier * instanceMultiplier
    val pinsGetPerSecond = config.getDouble("performance.operationsPerSecond.pinsGet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val pins/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "pinsAnalytics-queryParams.csv").random
    val pins/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "pinsAnalytics-pathParams.csv").random
    val pins/deletePATHFeeder = csv(userDataDirectory + File.separator + "pinsDelete-pathParams.csv").random
    val pins/getQUERYFeeder = csv(userDataDirectory + File.separator + "pinsGet-queryParams.csv").random
    val pins/getPATHFeeder = csv(userDataDirectory + File.separator + "pinsGet-pathParams.csv").random

    // Setup all scenarios

    
    val scnpinsAnalytics = scenario("pinsAnalyticsSimulation")
        .feed(pins/analyticsQUERYFeeder)
        .feed(pins/analyticsPATHFeeder)
        .exec(http("pinsAnalytics")
        .httpRequest("GET","/pins/${pin_id}/analytics")
        .queryParam("end_date","${end_date}")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("app_types","${app_types}")
        .queryParam("start_date","${start_date}")
        .queryParam("split_field","${split_field}")
        .queryParam("metric_types","${metric_types}")
)

    // Run scnpinsAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpinsAnalytics.inject(
        rampUsersPerSec(1) to(pinsAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pinsAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(pinsAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpinsCreate = scenario("pinsCreateSimulation")
        .exec(http("pinsCreate")
        .httpRequest("POST","/pins")
)

    // Run scnpinsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpinsCreate.inject(
        rampUsersPerSec(1) to(pinsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pinsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(pinsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpinsDelete = scenario("pinsDeleteSimulation")
        .feed(pins/deletePATHFeeder)
        .exec(http("pinsDelete")
        .httpRequest("DELETE","/pins/${pin_id}")
)

    // Run scnpinsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpinsDelete.inject(
        rampUsersPerSec(1) to(pinsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pinsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(pinsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpinsGet = scenario("pinsGetSimulation")
        .feed(pins/getQUERYFeeder)
        .feed(pins/getPATHFeeder)
        .exec(http("pinsGet")
        .httpRequest("GET","/pins/${pin_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnpinsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpinsGet.inject(
        rampUsersPerSec(1) to(pinsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pinsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(pinsGetPerSecond) to(1) during(rampDownSeconds)
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
