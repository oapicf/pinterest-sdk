package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class TargetingTemplateApiSimulation extends Simulation {

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
    val targetingTemplateCreatePerSecond = config.getDouble("performance.operationsPerSecond.targetingTemplateCreate") * rateMultiplier * instanceMultiplier
    val targetingTemplateListPerSecond = config.getDouble("performance.operationsPerSecond.targetingTemplateList") * rateMultiplier * instanceMultiplier
    val targetingTemplateUpdatePerSecond = config.getDouble("performance.operationsPerSecond.targetingTemplateUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val targeting_template/createPATHFeeder = csv(userDataDirectory + File.separator + "targetingTemplateCreate-pathParams.csv").random
    val targeting_template/listQUERYFeeder = csv(userDataDirectory + File.separator + "targetingTemplateList-queryParams.csv").random
    val targeting_template/listPATHFeeder = csv(userDataDirectory + File.separator + "targetingTemplateList-pathParams.csv").random
    val targeting_template/updatePATHFeeder = csv(userDataDirectory + File.separator + "targetingTemplateUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scntargetingTemplateCreate = scenario("targetingTemplateCreateSimulation")
        .feed(targeting_template/createPATHFeeder)
        .exec(http("targetingTemplateCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/targeting_templates")
)

    // Run scntargetingTemplateCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntargetingTemplateCreate.inject(
        rampUsersPerSec(1) to(targetingTemplateCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(targetingTemplateCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(targetingTemplateCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntargetingTemplateList = scenario("targetingTemplateListSimulation")
        .feed(targeting_template/listQUERYFeeder)
        .feed(targeting_template/listPATHFeeder)
        .exec(http("targetingTemplateList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/targeting_templates")
        .queryParam("search_query","${search_query}")
        .queryParam("include_sizing","${include_sizing}")
        .queryParam("page_size","${page_size}")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scntargetingTemplateList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntargetingTemplateList.inject(
        rampUsersPerSec(1) to(targetingTemplateListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(targetingTemplateListPerSecond) during(durationSeconds),
        rampUsersPerSec(targetingTemplateListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntargetingTemplateUpdate = scenario("targetingTemplateUpdateSimulation")
        .feed(targeting_template/updatePATHFeeder)
        .exec(http("targetingTemplateUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/targeting_templates")
)

    // Run scntargetingTemplateUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntargetingTemplateUpdate.inject(
        rampUsersPerSec(1) to(targetingTemplateUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(targetingTemplateUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(targetingTemplateUpdatePerSecond) to(1) during(rampDownSeconds)
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
