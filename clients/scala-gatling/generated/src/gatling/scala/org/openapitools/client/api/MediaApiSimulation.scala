package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class MediaApiSimulation extends Simulation {

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
    val mediaCreatePerSecond = config.getDouble("performance.operationsPerSecond.mediaCreate") * rateMultiplier * instanceMultiplier
    val mediaGetPerSecond = config.getDouble("performance.operationsPerSecond.mediaGet") * rateMultiplier * instanceMultiplier
    val mediaListPerSecond = config.getDouble("performance.operationsPerSecond.mediaList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val media/getPATHFeeder = csv(userDataDirectory + File.separator + "mediaGet-pathParams.csv").random
    val media/listQUERYFeeder = csv(userDataDirectory + File.separator + "mediaList-queryParams.csv").random

    // Setup all scenarios

    
    val scnmediaCreate = scenario("mediaCreateSimulation")
        .exec(http("mediaCreate")
        .httpRequest("POST","/media")
)

    // Run scnmediaCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmediaCreate.inject(
        rampUsersPerSec(1) to(mediaCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(mediaCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(mediaCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmediaGet = scenario("mediaGetSimulation")
        .feed(media/getPATHFeeder)
        .exec(http("mediaGet")
        .httpRequest("GET","/media/${media_id}")
)

    // Run scnmediaGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmediaGet.inject(
        rampUsersPerSec(1) to(mediaGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(mediaGetPerSecond) during(durationSeconds),
        rampUsersPerSec(mediaGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmediaList = scenario("mediaListSimulation")
        .feed(media/listQUERYFeeder)
        .exec(http("mediaList")
        .httpRequest("GET","/media")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnmediaList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmediaList.inject(
        rampUsersPerSec(1) to(mediaListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(mediaListPerSecond) during(durationSeconds),
        rampUsersPerSec(mediaListPerSecond) to(1) during(rampDownSeconds)
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
