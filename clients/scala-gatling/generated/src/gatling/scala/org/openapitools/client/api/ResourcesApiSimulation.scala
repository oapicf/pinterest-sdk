package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ResourcesApiSimulation extends Simulation {

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
    val adAccountCountriesGetPerSecond = config.getDouble("performance.operationsPerSecond.adAccountCountriesGet") * rateMultiplier * instanceMultiplier
    val deliveryMetricsGetPerSecond = config.getDouble("performance.operationsPerSecond.deliveryMetricsGet") * rateMultiplier * instanceMultiplier
    val interestTargetingOptionsGetPerSecond = config.getDouble("performance.operationsPerSecond.interestTargetingOptionsGet") * rateMultiplier * instanceMultiplier
    val leadFormQuestionsGetPerSecond = config.getDouble("performance.operationsPerSecond.leadFormQuestionsGet") * rateMultiplier * instanceMultiplier
    val metricsReadyStateGetPerSecond = config.getDouble("performance.operationsPerSecond.metricsReadyStateGet") * rateMultiplier * instanceMultiplier
    val targetingOptionsGetPerSecond = config.getDouble("performance.operationsPerSecond.targetingOptionsGet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val delivery_metrics/getQUERYFeeder = csv(userDataDirectory + File.separator + "deliveryMetricsGet-queryParams.csv").random
    val interest_targeting_options/getPATHFeeder = csv(userDataDirectory + File.separator + "interestTargetingOptionsGet-pathParams.csv").random
    val metrics_ready_state/getQUERYFeeder = csv(userDataDirectory + File.separator + "metricsReadyStateGet-queryParams.csv").random
    val targeting_options/getQUERYFeeder = csv(userDataDirectory + File.separator + "targetingOptionsGet-queryParams.csv").random
    val targeting_options/getPATHFeeder = csv(userDataDirectory + File.separator + "targetingOptionsGet-pathParams.csv").random

    // Setup all scenarios

    
    val scnadAccountCountriesGet = scenario("adAccountCountriesGetSimulation")
        .exec(http("adAccountCountriesGet")
        .httpRequest("GET","/resources/ad_account_countries")
)

    // Run scnadAccountCountriesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountCountriesGet.inject(
        rampUsersPerSec(1) to(adAccountCountriesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountCountriesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountCountriesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeliveryMetricsGet = scenario("deliveryMetricsGetSimulation")
        .feed(delivery_metrics/getQUERYFeeder)
        .exec(http("deliveryMetricsGet")
        .httpRequest("GET","/resources/delivery_metrics")
        .queryParam("report_type","${report_type}")
)

    // Run scndeliveryMetricsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeliveryMetricsGet.inject(
        rampUsersPerSec(1) to(deliveryMetricsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deliveryMetricsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(deliveryMetricsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scninterestTargetingOptionsGet = scenario("interestTargetingOptionsGetSimulation")
        .feed(interest_targeting_options/getPATHFeeder)
        .exec(http("interestTargetingOptionsGet")
        .httpRequest("GET","/resources/targeting/interests/${interest_id}")
)

    // Run scninterestTargetingOptionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scninterestTargetingOptionsGet.inject(
        rampUsersPerSec(1) to(interestTargetingOptionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(interestTargetingOptionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(interestTargetingOptionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnleadFormQuestionsGet = scenario("leadFormQuestionsGetSimulation")
        .exec(http("leadFormQuestionsGet")
        .httpRequest("GET","/resources/lead_form_questions")
)

    // Run scnleadFormQuestionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnleadFormQuestionsGet.inject(
        rampUsersPerSec(1) to(leadFormQuestionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(leadFormQuestionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(leadFormQuestionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetricsReadyStateGet = scenario("metricsReadyStateGetSimulation")
        .feed(metrics_ready_state/getQUERYFeeder)
        .exec(http("metricsReadyStateGet")
        .httpRequest("GET","/resources/metrics_ready_state")
        .queryParam("date","${date}")
)

    // Run scnmetricsReadyStateGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetricsReadyStateGet.inject(
        rampUsersPerSec(1) to(metricsReadyStateGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metricsReadyStateGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metricsReadyStateGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntargetingOptionsGet = scenario("targetingOptionsGetSimulation")
        .feed(targeting_options/getQUERYFeeder)
        .feed(targeting_options/getPATHFeeder)
        .exec(http("targetingOptionsGet")
        .httpRequest("GET","/resources/targeting/${targeting_type}")
        .queryParam("oauth_signature","${oauth_signature}")
        .queryParam("timestamp","${timestamp}")
        .queryParam("client_id","${client_id}")
)

    // Run scntargetingOptionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntargetingOptionsGet.inject(
        rampUsersPerSec(1) to(targetingOptionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(targetingOptionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(targetingOptionsGetPerSecond) to(1) during(rampDownSeconds)
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
