package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ProductGroupPromotionsApiSimulation extends Simulation {

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
    val productGroupPromotionsCreatePerSecond = config.getDouble("performance.operationsPerSecond.productGroupPromotionsCreate") * rateMultiplier * instanceMultiplier
    val productGroupPromotionsGetPerSecond = config.getDouble("performance.operationsPerSecond.productGroupPromotionsGet") * rateMultiplier * instanceMultiplier
    val productGroupPromotionsListPerSecond = config.getDouble("performance.operationsPerSecond.productGroupPromotionsList") * rateMultiplier * instanceMultiplier
    val productGroupPromotionsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.productGroupPromotionsUpdate") * rateMultiplier * instanceMultiplier
    val productGroupsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.productGroupsAnalytics") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val product_group_promotions/createPATHFeeder = csv(userDataDirectory + File.separator + "productGroupPromotionsCreate-pathParams.csv").random
    val product_group_promotions/getPATHFeeder = csv(userDataDirectory + File.separator + "productGroupPromotionsGet-pathParams.csv").random
    val product_group_promotions/listQUERYFeeder = csv(userDataDirectory + File.separator + "productGroupPromotionsList-queryParams.csv").random
    val product_group_promotions/listPATHFeeder = csv(userDataDirectory + File.separator + "productGroupPromotionsList-pathParams.csv").random
    val product_group_promotions/updatePATHFeeder = csv(userDataDirectory + File.separator + "productGroupPromotionsUpdate-pathParams.csv").random
    val product_groups/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "productGroupsAnalytics-queryParams.csv").random
    val product_groups/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "productGroupsAnalytics-pathParams.csv").random

    // Setup all scenarios

    
    val scnproductGroupPromotionsCreate = scenario("productGroupPromotionsCreateSimulation")
        .feed(product_group_promotions/createPATHFeeder)
        .exec(http("productGroupPromotionsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/product_group_promotions")
)

    // Run scnproductGroupPromotionsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductGroupPromotionsCreate.inject(
        rampUsersPerSec(1) to(productGroupPromotionsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(productGroupPromotionsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(productGroupPromotionsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnproductGroupPromotionsGet = scenario("productGroupPromotionsGetSimulation")
        .feed(product_group_promotions/getPATHFeeder)
        .exec(http("productGroupPromotionsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/product_group_promotions/${product_group_promotion_id}")
)

    // Run scnproductGroupPromotionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductGroupPromotionsGet.inject(
        rampUsersPerSec(1) to(productGroupPromotionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(productGroupPromotionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(productGroupPromotionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnproductGroupPromotionsList = scenario("productGroupPromotionsListSimulation")
        .feed(product_group_promotions/listQUERYFeeder)
        .feed(product_group_promotions/listPATHFeeder)
        .exec(http("productGroupPromotionsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/product_group_promotions")
        .queryParam("ad_group_id","${ad_group_id}")
        .queryParam("page_size","${page_size}")
        .queryParam("product_group_promotion_ids","${product_group_promotion_ids}")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("entity_statuses","${entity_statuses}")
)

    // Run scnproductGroupPromotionsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductGroupPromotionsList.inject(
        rampUsersPerSec(1) to(productGroupPromotionsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(productGroupPromotionsListPerSecond) during(durationSeconds),
        rampUsersPerSec(productGroupPromotionsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnproductGroupPromotionsUpdate = scenario("productGroupPromotionsUpdateSimulation")
        .feed(product_group_promotions/updatePATHFeeder)
        .exec(http("productGroupPromotionsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/product_group_promotions")
)

    // Run scnproductGroupPromotionsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductGroupPromotionsUpdate.inject(
        rampUsersPerSec(1) to(productGroupPromotionsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(productGroupPromotionsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(productGroupPromotionsUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnproductGroupsAnalytics = scenario("productGroupsAnalyticsSimulation")
        .feed(product_groups/analyticsQUERYFeeder)
        .feed(product_groups/analyticsPATHFeeder)
        .exec(http("productGroupsAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/product_groups/analytics")
        .queryParam("start_date","${start_date}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("granularity","${granularity}")
        .queryParam("product_group_ids","${product_group_ids}")
        .queryParam("end_date","${end_date}")
        .queryParam("columns","${columns}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("click_window_days","${click_window_days}")
)

    // Run scnproductGroupsAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductGroupsAnalytics.inject(
        rampUsersPerSec(1) to(productGroupsAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(productGroupsAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(productGroupsAnalyticsPerSecond) to(1) during(rampDownSeconds)
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
