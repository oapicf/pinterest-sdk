package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class AdsApiSimulation extends Simulation {

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
    val adPreviewsCreatePerSecond = config.getDouble("performance.operationsPerSecond.adPreviewsCreate") * rateMultiplier * instanceMultiplier
    val adTargetingAnalyticsGetPerSecond = config.getDouble("performance.operationsPerSecond.adTargetingAnalyticsGet") * rateMultiplier * instanceMultiplier
    val adsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.adsAnalytics") * rateMultiplier * instanceMultiplier
    val adsCreatePerSecond = config.getDouble("performance.operationsPerSecond.adsCreate") * rateMultiplier * instanceMultiplier
    val adsGetPerSecond = config.getDouble("performance.operationsPerSecond.adsGet") * rateMultiplier * instanceMultiplier
    val adsListPerSecond = config.getDouble("performance.operationsPerSecond.adsList") * rateMultiplier * instanceMultiplier
    val adsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.adsUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val ad_previews/createPATHFeeder = csv(userDataDirectory + File.separator + "adPreviewsCreate-pathParams.csv").random
    val ad_targeting_analytics/getQUERYFeeder = csv(userDataDirectory + File.separator + "adTargetingAnalyticsGet-queryParams.csv").random
    val ad_targeting_analytics/getPATHFeeder = csv(userDataDirectory + File.separator + "adTargetingAnalyticsGet-pathParams.csv").random
    val ads/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "adsAnalytics-queryParams.csv").random
    val ads/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "adsAnalytics-pathParams.csv").random
    val ads/createPATHFeeder = csv(userDataDirectory + File.separator + "adsCreate-pathParams.csv").random
    val ads/getPATHFeeder = csv(userDataDirectory + File.separator + "adsGet-pathParams.csv").random
    val ads/listQUERYFeeder = csv(userDataDirectory + File.separator + "adsList-queryParams.csv").random
    val ads/listPATHFeeder = csv(userDataDirectory + File.separator + "adsList-pathParams.csv").random
    val ads/updatePATHFeeder = csv(userDataDirectory + File.separator + "adsUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scnadPreviewsCreate = scenario("adPreviewsCreateSimulation")
        .feed(ad_previews/createPATHFeeder)
        .exec(http("adPreviewsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/ad_previews")
)

    // Run scnadPreviewsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadPreviewsCreate.inject(
        rampUsersPerSec(1) to(adPreviewsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(adPreviewsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(adPreviewsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadTargetingAnalyticsGet = scenario("adTargetingAnalyticsGetSimulation")
        .feed(ad_targeting_analytics/getQUERYFeeder)
        .feed(ad_targeting_analytics/getPATHFeeder)
        .exec(http("adTargetingAnalyticsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ads/targeting_analytics")
        .queryParam("targeting_types","${targeting_types}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("columns","${columns}")
        .queryParam("granularity","${granularity}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("ad_ids","${ad_ids}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("attribution_types","${attribution_types}")
        .queryParam("start_date","${start_date}")
        .queryParam("end_date","${end_date}")
)

    // Run scnadTargetingAnalyticsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadTargetingAnalyticsGet.inject(
        rampUsersPerSec(1) to(adTargetingAnalyticsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adTargetingAnalyticsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adTargetingAnalyticsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadsAnalytics = scenario("adsAnalyticsSimulation")
        .feed(ads/analyticsQUERYFeeder)
        .feed(ads/analyticsPATHFeeder)
        .exec(http("adsAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ads/analytics")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("columns","${columns}")
        .queryParam("granularity","${granularity}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("ad_ids","${ad_ids}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("start_date","${start_date}")
        .queryParam("end_date","${end_date}")
)

    // Run scnadsAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsAnalytics.inject(
        rampUsersPerSec(1) to(adsAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(adsAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadsCreate = scenario("adsCreateSimulation")
        .feed(ads/createPATHFeeder)
        .exec(http("adsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/ads")
)

    // Run scnadsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsCreate.inject(
        rampUsersPerSec(1) to(adsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(adsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadsGet = scenario("adsGetSimulation")
        .feed(ads/getPATHFeeder)
        .exec(http("adsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ads/${ad_id}")
)

    // Run scnadsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsGet.inject(
        rampUsersPerSec(1) to(adsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadsList = scenario("adsListSimulation")
        .feed(ads/listQUERYFeeder)
        .feed(ads/listPATHFeeder)
        .exec(http("adsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ads")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("entity_statuses","${entity_statuses}")
        .queryParam("ad_ids","${ad_ids}")
        .queryParam("ad_group_ids","${ad_group_ids}")
        .queryParam("page_size","${page_size}")
        .queryParam("campaign_ids","${campaign_ids}")
)

    // Run scnadsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsList.inject(
        rampUsersPerSec(1) to(adsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsListPerSecond) during(durationSeconds),
        rampUsersPerSec(adsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadsUpdate = scenario("adsUpdateSimulation")
        .feed(ads/updatePATHFeeder)
        .exec(http("adsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/ads")
)

    // Run scnadsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsUpdate.inject(
        rampUsersPerSec(1) to(adsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(adsUpdatePerSecond) to(1) during(rampDownSeconds)
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
