package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ConversionTagsApiSimulation extends Simulation {

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
    val conversionTagsCreatePerSecond = config.getDouble("performance.operationsPerSecond.conversionTagsCreate") * rateMultiplier * instanceMultiplier
    val conversionTagsGetPerSecond = config.getDouble("performance.operationsPerSecond.conversionTagsGet") * rateMultiplier * instanceMultiplier
    val conversionTagsListPerSecond = config.getDouble("performance.operationsPerSecond.conversionTagsList") * rateMultiplier * instanceMultiplier
    val ocpmEligibleConversionTagsGetPerSecond = config.getDouble("performance.operationsPerSecond.ocpmEligibleConversionTagsGet") * rateMultiplier * instanceMultiplier
    val pageVisitConversionTagsGetPerSecond = config.getDouble("performance.operationsPerSecond.pageVisitConversionTagsGet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val conversion_tags/createPATHFeeder = csv(userDataDirectory + File.separator + "conversionTagsCreate-pathParams.csv").random
    val conversion_tags/getPATHFeeder = csv(userDataDirectory + File.separator + "conversionTagsGet-pathParams.csv").random
    val conversion_tags/listQUERYFeeder = csv(userDataDirectory + File.separator + "conversionTagsList-queryParams.csv").random
    val conversion_tags/listPATHFeeder = csv(userDataDirectory + File.separator + "conversionTagsList-pathParams.csv").random
    val ocpm_eligible_conversion_tags/getPATHFeeder = csv(userDataDirectory + File.separator + "ocpmEligibleConversionTagsGet-pathParams.csv").random
    val page_visit_conversion_tags/getQUERYFeeder = csv(userDataDirectory + File.separator + "pageVisitConversionTagsGet-queryParams.csv").random
    val page_visit_conversion_tags/getPATHFeeder = csv(userDataDirectory + File.separator + "pageVisitConversionTagsGet-pathParams.csv").random

    // Setup all scenarios

    
    val scnconversionTagsCreate = scenario("conversionTagsCreateSimulation")
        .feed(conversion_tags/createPATHFeeder)
        .exec(http("conversionTagsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/conversion_tags")
)

    // Run scnconversionTagsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconversionTagsCreate.inject(
        rampUsersPerSec(1) to(conversionTagsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(conversionTagsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(conversionTagsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconversionTagsGet = scenario("conversionTagsGetSimulation")
        .feed(conversion_tags/getPATHFeeder)
        .exec(http("conversionTagsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/conversion_tags/${conversion_tag_id}")
)

    // Run scnconversionTagsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconversionTagsGet.inject(
        rampUsersPerSec(1) to(conversionTagsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(conversionTagsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(conversionTagsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconversionTagsList = scenario("conversionTagsListSimulation")
        .feed(conversion_tags/listQUERYFeeder)
        .feed(conversion_tags/listPATHFeeder)
        .exec(http("conversionTagsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/conversion_tags")
        .queryParam("filter_deleted","${filter_deleted}")
)

    // Run scnconversionTagsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconversionTagsList.inject(
        rampUsersPerSec(1) to(conversionTagsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(conversionTagsListPerSecond) during(durationSeconds),
        rampUsersPerSec(conversionTagsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnocpmEligibleConversionTagsGet = scenario("ocpmEligibleConversionTagsGetSimulation")
        .feed(ocpm_eligible_conversion_tags/getPATHFeeder)
        .exec(http("ocpmEligibleConversionTagsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/conversion_tags/ocpm_eligible")
)

    // Run scnocpmEligibleConversionTagsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnocpmEligibleConversionTagsGet.inject(
        rampUsersPerSec(1) to(ocpmEligibleConversionTagsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(ocpmEligibleConversionTagsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(ocpmEligibleConversionTagsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpageVisitConversionTagsGet = scenario("pageVisitConversionTagsGetSimulation")
        .feed(page_visit_conversion_tags/getQUERYFeeder)
        .feed(page_visit_conversion_tags/getPATHFeeder)
        .exec(http("pageVisitConversionTagsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/conversion_tags/page_visit")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnpageVisitConversionTagsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpageVisitConversionTagsGet.inject(
        rampUsersPerSec(1) to(pageVisitConversionTagsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pageVisitConversionTagsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(pageVisitConversionTagsGetPerSecond) to(1) during(rampDownSeconds)
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
