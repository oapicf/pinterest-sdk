package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class LeadAdsApiSimulation extends Simulation {

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
    val adAccountsSubscriptionsDelByIdPerSecond = config.getDouble("performance.operationsPerSecond.adAccountsSubscriptionsDelById") * rateMultiplier * instanceMultiplier
    val adAccountsSubscriptionsGetByIdPerSecond = config.getDouble("performance.operationsPerSecond.adAccountsSubscriptionsGetById") * rateMultiplier * instanceMultiplier
    val adAccountsSubscriptionsGetListPerSecond = config.getDouble("performance.operationsPerSecond.adAccountsSubscriptionsGetList") * rateMultiplier * instanceMultiplier
    val adAccountsSubscriptionsPostPerSecond = config.getDouble("performance.operationsPerSecond.adAccountsSubscriptionsPost") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val ad_accounts_subscriptions/del_by_idPATHFeeder = csv(userDataDirectory + File.separator + "adAccountsSubscriptionsDelById-pathParams.csv").random
    val ad_accounts_subscriptions/get_by_idPATHFeeder = csv(userDataDirectory + File.separator + "adAccountsSubscriptionsGetById-pathParams.csv").random
    val ad_accounts_subscriptions/get_listQUERYFeeder = csv(userDataDirectory + File.separator + "adAccountsSubscriptionsGetList-queryParams.csv").random
    val ad_accounts_subscriptions/get_listPATHFeeder = csv(userDataDirectory + File.separator + "adAccountsSubscriptionsGetList-pathParams.csv").random
    val ad_accounts_subscriptions/postPATHFeeder = csv(userDataDirectory + File.separator + "adAccountsSubscriptionsPost-pathParams.csv").random

    // Setup all scenarios

    
    val scnadAccountsSubscriptionsDelById = scenario("adAccountsSubscriptionsDelByIdSimulation")
        .feed(ad_accounts_subscriptions/del_by_idPATHFeeder)
        .exec(http("adAccountsSubscriptionsDelById")
        .httpRequest("DELETE","/ad_accounts/${ad_account_id}/leads/subscriptions/${subscription_id}")
)

    // Run scnadAccountsSubscriptionsDelById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsSubscriptionsDelById.inject(
        rampUsersPerSec(1) to(adAccountsSubscriptionsDelByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsSubscriptionsDelByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsSubscriptionsDelByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadAccountsSubscriptionsGetById = scenario("adAccountsSubscriptionsGetByIdSimulation")
        .feed(ad_accounts_subscriptions/get_by_idPATHFeeder)
        .exec(http("adAccountsSubscriptionsGetById")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/leads/subscriptions/${subscription_id}")
)

    // Run scnadAccountsSubscriptionsGetById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsSubscriptionsGetById.inject(
        rampUsersPerSec(1) to(adAccountsSubscriptionsGetByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsSubscriptionsGetByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsSubscriptionsGetByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadAccountsSubscriptionsGetList = scenario("adAccountsSubscriptionsGetListSimulation")
        .feed(ad_accounts_subscriptions/get_listQUERYFeeder)
        .feed(ad_accounts_subscriptions/get_listPATHFeeder)
        .exec(http("adAccountsSubscriptionsGetList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/leads/subscriptions")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnadAccountsSubscriptionsGetList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsSubscriptionsGetList.inject(
        rampUsersPerSec(1) to(adAccountsSubscriptionsGetListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsSubscriptionsGetListPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsSubscriptionsGetListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadAccountsSubscriptionsPost = scenario("adAccountsSubscriptionsPostSimulation")
        .feed(ad_accounts_subscriptions/postPATHFeeder)
        .exec(http("adAccountsSubscriptionsPost")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/leads/subscriptions")
)

    // Run scnadAccountsSubscriptionsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsSubscriptionsPost.inject(
        rampUsersPerSec(1) to(adAccountsSubscriptionsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsSubscriptionsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsSubscriptionsPostPerSecond) to(1) during(rampDownSeconds)
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
