package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CampaignsApiSimulation extends Simulation {

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
    val campaignTargetingAnalyticsGetPerSecond = config.getDouble("performance.operationsPerSecond.campaignTargetingAnalyticsGet") * rateMultiplier * instanceMultiplier
    val campaignsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.campaignsAnalytics") * rateMultiplier * instanceMultiplier
    val campaignsCreatePerSecond = config.getDouble("performance.operationsPerSecond.campaignsCreate") * rateMultiplier * instanceMultiplier
    val campaignsGetPerSecond = config.getDouble("performance.operationsPerSecond.campaignsGet") * rateMultiplier * instanceMultiplier
    val campaignsListPerSecond = config.getDouble("performance.operationsPerSecond.campaignsList") * rateMultiplier * instanceMultiplier
    val campaignsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.campaignsUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val campaign_targeting_analytics/getQUERYFeeder = csv(userDataDirectory + File.separator + "campaignTargetingAnalyticsGet-queryParams.csv").random
    val campaign_targeting_analytics/getPATHFeeder = csv(userDataDirectory + File.separator + "campaignTargetingAnalyticsGet-pathParams.csv").random
    val campaigns/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "campaignsAnalytics-queryParams.csv").random
    val campaigns/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "campaignsAnalytics-pathParams.csv").random
    val campaigns/createPATHFeeder = csv(userDataDirectory + File.separator + "campaignsCreate-pathParams.csv").random
    val campaigns/getPATHFeeder = csv(userDataDirectory + File.separator + "campaignsGet-pathParams.csv").random
    val campaigns/listQUERYFeeder = csv(userDataDirectory + File.separator + "campaignsList-queryParams.csv").random
    val campaigns/listPATHFeeder = csv(userDataDirectory + File.separator + "campaignsList-pathParams.csv").random
    val campaigns/updatePATHFeeder = csv(userDataDirectory + File.separator + "campaignsUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scncampaignTargetingAnalyticsGet = scenario("campaignTargetingAnalyticsGetSimulation")
        .feed(campaign_targeting_analytics/getQUERYFeeder)
        .feed(campaign_targeting_analytics/getPATHFeeder)
        .exec(http("campaignTargetingAnalyticsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/campaigns/targeting_analytics")
        .queryParam("campaign_ids","${campaign_ids}")
        .queryParam("targeting_types","${targeting_types}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("columns","${columns}")
        .queryParam("granularity","${granularity}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("attribution_types","${attribution_types}")
        .queryParam("start_date","${start_date}")
        .queryParam("end_date","${end_date}")
)

    // Run scncampaignTargetingAnalyticsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncampaignTargetingAnalyticsGet.inject(
        rampUsersPerSec(1) to(campaignTargetingAnalyticsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(campaignTargetingAnalyticsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(campaignTargetingAnalyticsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncampaignsAnalytics = scenario("campaignsAnalyticsSimulation")
        .feed(campaigns/analyticsQUERYFeeder)
        .feed(campaigns/analyticsPATHFeeder)
        .exec(http("campaignsAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/campaigns/analytics")
        .queryParam("campaign_ids","${campaign_ids}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("columns","${columns}")
        .queryParam("granularity","${granularity}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("start_date","${start_date}")
        .queryParam("end_date","${end_date}")
)

    // Run scncampaignsAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncampaignsAnalytics.inject(
        rampUsersPerSec(1) to(campaignsAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(campaignsAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(campaignsAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncampaignsCreate = scenario("campaignsCreateSimulation")
        .feed(campaigns/createPATHFeeder)
        .exec(http("campaignsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/campaigns")
)

    // Run scncampaignsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncampaignsCreate.inject(
        rampUsersPerSec(1) to(campaignsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(campaignsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(campaignsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncampaignsGet = scenario("campaignsGetSimulation")
        .feed(campaigns/getPATHFeeder)
        .exec(http("campaignsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/campaigns/${campaign_id}")
)

    // Run scncampaignsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncampaignsGet.inject(
        rampUsersPerSec(1) to(campaignsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(campaignsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(campaignsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncampaignsList = scenario("campaignsListSimulation")
        .feed(campaigns/listQUERYFeeder)
        .feed(campaigns/listPATHFeeder)
        .exec(http("campaignsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/campaigns")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("entity_statuses","${entity_statuses}")
        .queryParam("page_size","${page_size}")
        .queryParam("campaign_ids","${campaign_ids}")
)

    // Run scncampaignsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncampaignsList.inject(
        rampUsersPerSec(1) to(campaignsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(campaignsListPerSecond) during(durationSeconds),
        rampUsersPerSec(campaignsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncampaignsUpdate = scenario("campaignsUpdateSimulation")
        .feed(campaigns/updatePATHFeeder)
        .exec(http("campaignsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/campaigns")
)

    // Run scncampaignsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncampaignsUpdate.inject(
        rampUsersPerSec(1) to(campaignsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(campaignsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(campaignsUpdatePerSecond) to(1) during(rampDownSeconds)
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
