package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class KeywordsApiSimulation extends Simulation {

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
    val countryKeywordsMetricsGetPerSecond = config.getDouble("performance.operationsPerSecond.countryKeywordsMetricsGet") * rateMultiplier * instanceMultiplier
    val keywordsCreatePerSecond = config.getDouble("performance.operationsPerSecond.keywordsCreate") * rateMultiplier * instanceMultiplier
    val keywordsGetPerSecond = config.getDouble("performance.operationsPerSecond.keywordsGet") * rateMultiplier * instanceMultiplier
    val keywordsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.keywordsUpdate") * rateMultiplier * instanceMultiplier
    val trendingKeywordsListPerSecond = config.getDouble("performance.operationsPerSecond.trendingKeywordsList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val country_keywords_metrics/getQUERYFeeder = csv(userDataDirectory + File.separator + "countryKeywordsMetricsGet-queryParams.csv").random
    val country_keywords_metrics/getPATHFeeder = csv(userDataDirectory + File.separator + "countryKeywordsMetricsGet-pathParams.csv").random
    val keywords/createPATHFeeder = csv(userDataDirectory + File.separator + "keywordsCreate-pathParams.csv").random
    val keywords/getQUERYFeeder = csv(userDataDirectory + File.separator + "keywordsGet-queryParams.csv").random
    val keywords/getPATHFeeder = csv(userDataDirectory + File.separator + "keywordsGet-pathParams.csv").random
    val keywords/updatePATHFeeder = csv(userDataDirectory + File.separator + "keywordsUpdate-pathParams.csv").random
    val trending_keywords/listQUERYFeeder = csv(userDataDirectory + File.separator + "trendingKeywordsList-queryParams.csv").random
    val trending_keywords/listPATHFeeder = csv(userDataDirectory + File.separator + "trendingKeywordsList-pathParams.csv").random

    // Setup all scenarios

    
    val scncountryKeywordsMetricsGet = scenario("countryKeywordsMetricsGetSimulation")
        .feed(country_keywords_metrics/getQUERYFeeder)
        .feed(country_keywords_metrics/getPATHFeeder)
        .exec(http("countryKeywordsMetricsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/keywords/metrics")
        .queryParam("country_code","${country_code}")
        .queryParam("keywords","${keywords}")
)

    // Run scncountryKeywordsMetricsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncountryKeywordsMetricsGet.inject(
        rampUsersPerSec(1) to(countryKeywordsMetricsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(countryKeywordsMetricsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(countryKeywordsMetricsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnkeywordsCreate = scenario("keywordsCreateSimulation")
        .feed(keywords/createPATHFeeder)
        .exec(http("keywordsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/keywords")
)

    // Run scnkeywordsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnkeywordsCreate.inject(
        rampUsersPerSec(1) to(keywordsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(keywordsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(keywordsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnkeywordsGet = scenario("keywordsGetSimulation")
        .feed(keywords/getQUERYFeeder)
        .feed(keywords/getPATHFeeder)
        .exec(http("keywordsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/keywords")
        .queryParam("match_types","${match_types}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("campaign_id","${campaign_id}")
        .queryParam("ad_group_id","${ad_group_id}")
        .queryParam("page_size","${page_size}")
)

    // Run scnkeywordsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnkeywordsGet.inject(
        rampUsersPerSec(1) to(keywordsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(keywordsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(keywordsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnkeywordsUpdate = scenario("keywordsUpdateSimulation")
        .feed(keywords/updatePATHFeeder)
        .exec(http("keywordsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/keywords")
)

    // Run scnkeywordsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnkeywordsUpdate.inject(
        rampUsersPerSec(1) to(keywordsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(keywordsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(keywordsUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntrendingKeywordsList = scenario("trendingKeywordsListSimulation")
        .feed(trending_keywords/listQUERYFeeder)
        .feed(trending_keywords/listPATHFeeder)
        .exec(http("trendingKeywordsList")
        .httpRequest("GET","/trends/keywords/${region}/top/${trend_type}")
        .queryParam("ages","${ages}")
        .queryParam("limit","${limit}")
        .queryParam("interests","${interests}")
        .queryParam("genders","${genders}")
        .queryParam("normalize_against_group","${normalize_against_group}")
)

    // Run scntrendingKeywordsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntrendingKeywordsList.inject(
        rampUsersPerSec(1) to(trendingKeywordsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(trendingKeywordsListPerSecond) during(durationSeconds),
        rampUsersPerSec(trendingKeywordsListPerSecond) to(1) during(rampDownSeconds)
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
