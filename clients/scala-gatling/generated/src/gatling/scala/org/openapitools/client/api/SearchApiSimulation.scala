package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class SearchApiSimulation extends Simulation {

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
    val searchPartnerPinsPerSecond = config.getDouble("performance.operationsPerSecond.searchPartnerPins") * rateMultiplier * instanceMultiplier
    val searchUserBoardsGetPerSecond = config.getDouble("performance.operationsPerSecond.searchUserBoardsGet") * rateMultiplier * instanceMultiplier
    val searchUserPinsListPerSecond = config.getDouble("performance.operationsPerSecond.searchUserPinsList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val search_partner_pinsQUERYFeeder = csv(userDataDirectory + File.separator + "searchPartnerPins-queryParams.csv").random
    val search_user_boards/getQUERYFeeder = csv(userDataDirectory + File.separator + "searchUserBoardsGet-queryParams.csv").random
    val search_user_pins/listQUERYFeeder = csv(userDataDirectory + File.separator + "searchUserPinsList-queryParams.csv").random

    // Setup all scenarios

    
    val scnsearchPartnerPins = scenario("searchPartnerPinsSimulation")
        .feed(search_partner_pinsQUERYFeeder)
        .exec(http("searchPartnerPins")
        .httpRequest("GET","/search/partner/pins")
        .queryParam("limit","${limit}")
        .queryParam("country_code","${country_code}")
        .queryParam("term","${term}")
        .queryParam("locale","${locale}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnsearchPartnerPins with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsearchPartnerPins.inject(
        rampUsersPerSec(1) to(searchPartnerPinsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(searchPartnerPinsPerSecond) during(durationSeconds),
        rampUsersPerSec(searchPartnerPinsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsearchUserBoardsGet = scenario("searchUserBoardsGetSimulation")
        .feed(search_user_boards/getQUERYFeeder)
        .exec(http("searchUserBoardsGet")
        .httpRequest("GET","/search/boards")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("query","${query}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnsearchUserBoardsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsearchUserBoardsGet.inject(
        rampUsersPerSec(1) to(searchUserBoardsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(searchUserBoardsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(searchUserBoardsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsearchUserPinsList = scenario("searchUserPinsListSimulation")
        .feed(search_user_pins/listQUERYFeeder)
        .exec(http("searchUserPinsList")
        .httpRequest("GET","/search/pins")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("query","${query}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnsearchUserPinsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsearchUserPinsList.inject(
        rampUsersPerSec(1) to(searchUserPinsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(searchUserPinsListPerSecond) during(durationSeconds),
        rampUsersPerSec(searchUserPinsListPerSecond) to(1) during(rampDownSeconds)
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
