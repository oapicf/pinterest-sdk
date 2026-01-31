package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class IntegrationsApiSimulation extends Simulation {

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
    val integrationsCommerceDelPerSecond = config.getDouble("performance.operationsPerSecond.integrationsCommerceDel") * rateMultiplier * instanceMultiplier
    val integrationsCommerceGetPerSecond = config.getDouble("performance.operationsPerSecond.integrationsCommerceGet") * rateMultiplier * instanceMultiplier
    val integrationsCommercePatchPerSecond = config.getDouble("performance.operationsPerSecond.integrationsCommercePatch") * rateMultiplier * instanceMultiplier
    val integrationsCommercePostPerSecond = config.getDouble("performance.operationsPerSecond.integrationsCommercePost") * rateMultiplier * instanceMultiplier
    val integrationsGetByIdPerSecond = config.getDouble("performance.operationsPerSecond.integrationsGetById") * rateMultiplier * instanceMultiplier
    val integrationsGetListPerSecond = config.getDouble("performance.operationsPerSecond.integrationsGetList") * rateMultiplier * instanceMultiplier
    val integrationsLogsPostPerSecond = config.getDouble("performance.operationsPerSecond.integrationsLogsPost") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val integrations_commerce/delPATHFeeder = csv(userDataDirectory + File.separator + "integrationsCommerceDel-pathParams.csv").random
    val integrations_commerce/getPATHFeeder = csv(userDataDirectory + File.separator + "integrationsCommerceGet-pathParams.csv").random
    val integrations_commerce/patchPATHFeeder = csv(userDataDirectory + File.separator + "integrationsCommercePatch-pathParams.csv").random
    val integrations/get_by_idPATHFeeder = csv(userDataDirectory + File.separator + "integrationsGetById-pathParams.csv").random
    val integrations/get_listQUERYFeeder = csv(userDataDirectory + File.separator + "integrationsGetList-queryParams.csv").random

    // Setup all scenarios

    
    val scnintegrationsCommerceDel = scenario("integrationsCommerceDelSimulation")
        .feed(integrations_commerce/delPATHFeeder)
        .exec(http("integrationsCommerceDel")
        .httpRequest("DELETE","/integrations/commerce/${external_business_id}")
)

    // Run scnintegrationsCommerceDel with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnintegrationsCommerceDel.inject(
        rampUsersPerSec(1) to(integrationsCommerceDelPerSecond) during(rampUpSeconds),
        constantUsersPerSec(integrationsCommerceDelPerSecond) during(durationSeconds),
        rampUsersPerSec(integrationsCommerceDelPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnintegrationsCommerceGet = scenario("integrationsCommerceGetSimulation")
        .feed(integrations_commerce/getPATHFeeder)
        .exec(http("integrationsCommerceGet")
        .httpRequest("GET","/integrations/commerce/${external_business_id}")
)

    // Run scnintegrationsCommerceGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnintegrationsCommerceGet.inject(
        rampUsersPerSec(1) to(integrationsCommerceGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(integrationsCommerceGetPerSecond) during(durationSeconds),
        rampUsersPerSec(integrationsCommerceGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnintegrationsCommercePatch = scenario("integrationsCommercePatchSimulation")
        .feed(integrations_commerce/patchPATHFeeder)
        .exec(http("integrationsCommercePatch")
        .httpRequest("PATCH","/integrations/commerce/${external_business_id}")
)

    // Run scnintegrationsCommercePatch with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnintegrationsCommercePatch.inject(
        rampUsersPerSec(1) to(integrationsCommercePatchPerSecond) during(rampUpSeconds),
        constantUsersPerSec(integrationsCommercePatchPerSecond) during(durationSeconds),
        rampUsersPerSec(integrationsCommercePatchPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnintegrationsCommercePost = scenario("integrationsCommercePostSimulation")
        .exec(http("integrationsCommercePost")
        .httpRequest("POST","/integrations/commerce")
)

    // Run scnintegrationsCommercePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnintegrationsCommercePost.inject(
        rampUsersPerSec(1) to(integrationsCommercePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(integrationsCommercePostPerSecond) during(durationSeconds),
        rampUsersPerSec(integrationsCommercePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnintegrationsGetById = scenario("integrationsGetByIdSimulation")
        .feed(integrations/get_by_idPATHFeeder)
        .exec(http("integrationsGetById")
        .httpRequest("GET","/integrations/${id}")
)

    // Run scnintegrationsGetById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnintegrationsGetById.inject(
        rampUsersPerSec(1) to(integrationsGetByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(integrationsGetByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(integrationsGetByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnintegrationsGetList = scenario("integrationsGetListSimulation")
        .feed(integrations/get_listQUERYFeeder)
        .exec(http("integrationsGetList")
        .httpRequest("GET","/integrations")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnintegrationsGetList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnintegrationsGetList.inject(
        rampUsersPerSec(1) to(integrationsGetListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(integrationsGetListPerSecond) during(durationSeconds),
        rampUsersPerSec(integrationsGetListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnintegrationsLogsPost = scenario("integrationsLogsPostSimulation")
        .exec(http("integrationsLogsPost")
        .httpRequest("POST","/integrations/logs")
)

    // Run scnintegrationsLogsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnintegrationsLogsPost.inject(
        rampUsersPerSec(1) to(integrationsLogsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(integrationsLogsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(integrationsLogsPostPerSecond) to(1) during(rampDownSeconds)
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
