package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class UserAccountApiSimulation extends Simulation {

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
    val userAccountAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.userAccountAnalytics") * rateMultiplier * instanceMultiplier
    val userAccountGetPerSecond = config.getDouble("performance.operationsPerSecond.userAccountGet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val user_account/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "userAccountAnalytics-queryParams.csv").random
    val user_account/getQUERYFeeder = csv(userDataDirectory + File.separator + "userAccountGet-queryParams.csv").random

    // Setup all scenarios

    
    val scnuserAccountAnalytics = scenario("userAccountAnalyticsSimulation")
        .feed(user_account/analyticsQUERYFeeder)
        .exec(http("userAccountAnalytics")
        .httpRequest("GET","/user_account/analytics")
        .queryParam("from_claimed_content","${from_claimed_content}")
        .queryParam("start_date","${start_date}")
        .queryParam("pin_format","${pin_format}")
        .queryParam("end_date","${end_date}")
        .queryParam("metric_types","${metric_types}")
        .queryParam("split_field","${split_field}")
        .queryParam("app_types","${app_types}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnuserAccountAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserAccountAnalytics.inject(
        rampUsersPerSec(1) to(userAccountAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userAccountAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(userAccountAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuserAccountGet = scenario("userAccountGetSimulation")
        .feed(user_account/getQUERYFeeder)
        .exec(http("userAccountGet")
        .httpRequest("GET","/user_account")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnuserAccountGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserAccountGet.inject(
        rampUsersPerSec(1) to(userAccountGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userAccountGetPerSecond) during(durationSeconds),
        rampUsersPerSec(userAccountGetPerSecond) to(1) during(rampDownSeconds)
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
