package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ProductTagsApiSimulation extends Simulation {

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
    val productTagsBulkAddPerSecond = config.getDouble("performance.operationsPerSecond.productTagsBulkAdd") * rateMultiplier * instanceMultiplier
    val productTagsBulkDeletePerSecond = config.getDouble("performance.operationsPerSecond.productTagsBulkDelete") * rateMultiplier * instanceMultiplier
    val productTagsListPerSecond = config.getDouble("performance.operationsPerSecond.productTagsList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val product_tags/bulk_addPATHFeeder = csv(userDataDirectory + File.separator + "productTagsBulkAdd-pathParams.csv").random
    val product_tags/bulk_deletePATHFeeder = csv(userDataDirectory + File.separator + "productTagsBulkDelete-pathParams.csv").random
    val product_tags/listPATHFeeder = csv(userDataDirectory + File.separator + "productTagsList-pathParams.csv").random

    // Setup all scenarios

    
    val scnproductTagsBulkAdd = scenario("productTagsBulkAddSimulation")
        .feed(product_tags/bulk_addPATHFeeder)
        .exec(http("productTagsBulkAdd")
        .httpRequest("POST","/pins/${pin_id}/product_tags")
)

    // Run scnproductTagsBulkAdd with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductTagsBulkAdd.inject(
        rampUsersPerSec(1) to(productTagsBulkAddPerSecond) during(rampUpSeconds),
        constantUsersPerSec(productTagsBulkAddPerSecond) during(durationSeconds),
        rampUsersPerSec(productTagsBulkAddPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnproductTagsBulkDelete = scenario("productTagsBulkDeleteSimulation")
        .feed(product_tags/bulk_deletePATHFeeder)
        .exec(http("productTagsBulkDelete")
        .httpRequest("POST","/pins/${pin_id}/product_tags/bulk-delete")
)

    // Run scnproductTagsBulkDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductTagsBulkDelete.inject(
        rampUsersPerSec(1) to(productTagsBulkDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(productTagsBulkDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(productTagsBulkDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnproductTagsList = scenario("productTagsListSimulation")
        .feed(product_tags/listPATHFeeder)
        .exec(http("productTagsList")
        .httpRequest("GET","/pins/${pin_id}/product_tags")
)

    // Run scnproductTagsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductTagsList.inject(
        rampUsersPerSec(1) to(productTagsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(productTagsListPerSecond) during(durationSeconds),
        rampUsersPerSec(productTagsListPerSecond) to(1) during(rampDownSeconds)
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
