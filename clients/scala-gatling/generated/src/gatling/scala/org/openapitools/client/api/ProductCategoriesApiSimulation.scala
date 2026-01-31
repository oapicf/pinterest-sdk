package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ProductCategoriesApiSimulation extends Simulation {

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
    val trendsFeaturedTopicsListPerSecond = config.getDouble("performance.operationsPerSecond.trendsFeaturedTopicsList") * rateMultiplier * instanceMultiplier
    val trendsProductCategoriesDetailsListPerSecond = config.getDouble("performance.operationsPerSecond.trendsProductCategoriesDetailsList") * rateMultiplier * instanceMultiplier
    val trendsProductCategoriesTrendingListPerSecond = config.getDouble("performance.operationsPerSecond.trendsProductCategoriesTrendingList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val trends_featured_topics/listQUERYFeeder = csv(userDataDirectory + File.separator + "trendsFeaturedTopicsList-queryParams.csv").random
    val trends_product_categories_details/listQUERYFeeder = csv(userDataDirectory + File.separator + "trendsProductCategoriesDetailsList-queryParams.csv").random
    val trends_product_categories_trending/listQUERYFeeder = csv(userDataDirectory + File.separator + "trendsProductCategoriesTrendingList-queryParams.csv").random

    // Setup all scenarios

    
    val scntrendsFeaturedTopicsList = scenario("trendsFeaturedTopicsListSimulation")
        .feed(trends_featured_topics/listQUERYFeeder)
        .exec(http("trendsFeaturedTopicsList")
        .httpRequest("GET","/trends/topics/featured")
        .queryParam("interest","${interest}")
        .queryParam("region","${region}")
)

    // Run scntrendsFeaturedTopicsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntrendsFeaturedTopicsList.inject(
        rampUsersPerSec(1) to(trendsFeaturedTopicsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(trendsFeaturedTopicsListPerSecond) during(durationSeconds),
        rampUsersPerSec(trendsFeaturedTopicsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntrendsProductCategoriesDetailsList = scenario("trendsProductCategoriesDetailsListSimulation")
        .feed(trends_product_categories_details/listQUERYFeeder)
        .exec(http("trendsProductCategoriesDetailsList")
        .httpRequest("GET","/trends/product_categories/details")
        .queryParam("product_categories","${product_categories}")
        .queryParam("engagement_type","${engagement_type}")
        .queryParam("region","${region}")
        .queryParam("lookback_window","${lookback_window}")
)

    // Run scntrendsProductCategoriesDetailsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntrendsProductCategoriesDetailsList.inject(
        rampUsersPerSec(1) to(trendsProductCategoriesDetailsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(trendsProductCategoriesDetailsListPerSecond) during(durationSeconds),
        rampUsersPerSec(trendsProductCategoriesDetailsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntrendsProductCategoriesTrendingList = scenario("trendsProductCategoriesTrendingListSimulation")
        .feed(trends_product_categories_trending/listQUERYFeeder)
        .exec(http("trendsProductCategoriesTrendingList")
        .httpRequest("GET","/trends/product_categories/trending")
        .queryParam("genders","${genders}")
        .queryParam("verticals","${verticals}")
        .queryParam("engagement_type","${engagement_type}")
        .queryParam("region","${region}")
        .queryParam("ages","${ages}")
)

    // Run scntrendsProductCategoriesTrendingList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntrendsProductCategoriesTrendingList.inject(
        rampUsersPerSec(1) to(trendsProductCategoriesTrendingListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(trendsProductCategoriesTrendingListPerSecond) during(durationSeconds),
        rampUsersPerSec(trendsProductCategoriesTrendingListPerSecond) to(1) during(rampDownSeconds)
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
