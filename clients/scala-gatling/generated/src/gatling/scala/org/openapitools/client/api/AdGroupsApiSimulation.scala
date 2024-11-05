package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class AdGroupsApiSimulation extends Simulation {

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
    val adGroupsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.adGroupsAnalytics") * rateMultiplier * instanceMultiplier
    val adGroupsAudienceSizingPerSecond = config.getDouble("performance.operationsPerSecond.adGroupsAudienceSizing") * rateMultiplier * instanceMultiplier
    val adGroupsBidFloorGetPerSecond = config.getDouble("performance.operationsPerSecond.adGroupsBidFloorGet") * rateMultiplier * instanceMultiplier
    val adGroupsCreatePerSecond = config.getDouble("performance.operationsPerSecond.adGroupsCreate") * rateMultiplier * instanceMultiplier
    val adGroupsGetPerSecond = config.getDouble("performance.operationsPerSecond.adGroupsGet") * rateMultiplier * instanceMultiplier
    val adGroupsListPerSecond = config.getDouble("performance.operationsPerSecond.adGroupsList") * rateMultiplier * instanceMultiplier
    val adGroupsTargetingAnalyticsGetPerSecond = config.getDouble("performance.operationsPerSecond.adGroupsTargetingAnalyticsGet") * rateMultiplier * instanceMultiplier
    val adGroupsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.adGroupsUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val ad_groups/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "adGroupsAnalytics-queryParams.csv").random
    val ad_groups/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsAnalytics-pathParams.csv").random
    val ad_groups/audience_sizingPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsAudienceSizing-pathParams.csv").random
    val ad_groups_bid_floor/getPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsBidFloorGet-pathParams.csv").random
    val ad_groups/createPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsCreate-pathParams.csv").random
    val ad_groups/getPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsGet-pathParams.csv").random
    val ad_groups/listQUERYFeeder = csv(userDataDirectory + File.separator + "adGroupsList-queryParams.csv").random
    val ad_groups/listPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsList-pathParams.csv").random
    val ad_groups_targeting_analytics/getQUERYFeeder = csv(userDataDirectory + File.separator + "adGroupsTargetingAnalyticsGet-queryParams.csv").random
    val ad_groups_targeting_analytics/getPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsTargetingAnalyticsGet-pathParams.csv").random
    val ad_groups/updatePATHFeeder = csv(userDataDirectory + File.separator + "adGroupsUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scnadGroupsAnalytics = scenario("adGroupsAnalyticsSimulation")
        .feed(ad_groups/analyticsQUERYFeeder)
        .feed(ad_groups/analyticsPATHFeeder)
        .exec(http("adGroupsAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ad_groups/analytics")
        .queryParam("start_date","${start_date}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("granularity","${granularity}")
        .queryParam("end_date","${end_date}")
        .queryParam("columns","${columns}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("ad_group_ids","${ad_group_ids}")
)

    // Run scnadGroupsAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsAnalytics.inject(
        rampUsersPerSec(1) to(adGroupsAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsAudienceSizing = scenario("adGroupsAudienceSizingSimulation")
        .feed(ad_groups/audience_sizingPATHFeeder)
        .exec(http("adGroupsAudienceSizing")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/ad_groups/audience_sizing")
)

    // Run scnadGroupsAudienceSizing with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsAudienceSizing.inject(
        rampUsersPerSec(1) to(adGroupsAudienceSizingPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsAudienceSizingPerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsAudienceSizingPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsBidFloorGet = scenario("adGroupsBidFloorGetSimulation")
        .feed(ad_groups_bid_floor/getPATHFeeder)
        .exec(http("adGroupsBidFloorGet")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/bid_floor")
)

    // Run scnadGroupsBidFloorGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsBidFloorGet.inject(
        rampUsersPerSec(1) to(adGroupsBidFloorGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsBidFloorGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsBidFloorGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsCreate = scenario("adGroupsCreateSimulation")
        .feed(ad_groups/createPATHFeeder)
        .exec(http("adGroupsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/ad_groups")
)

    // Run scnadGroupsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsCreate.inject(
        rampUsersPerSec(1) to(adGroupsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsGet = scenario("adGroupsGetSimulation")
        .feed(ad_groups/getPATHFeeder)
        .exec(http("adGroupsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ad_groups/${ad_group_id}")
)

    // Run scnadGroupsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsGet.inject(
        rampUsersPerSec(1) to(adGroupsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsList = scenario("adGroupsListSimulation")
        .feed(ad_groups/listQUERYFeeder)
        .feed(ad_groups/listPATHFeeder)
        .exec(http("adGroupsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ad_groups")
        .queryParam("translate_interests_to_names","${translate_interests_to_names}")
        .queryParam("ad_group_ids","${ad_group_ids}")
        .queryParam("campaign_ids","${campaign_ids}")
        .queryParam("page_size","${page_size}")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("entity_statuses","${entity_statuses}")
)

    // Run scnadGroupsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsList.inject(
        rampUsersPerSec(1) to(adGroupsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsListPerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsTargetingAnalyticsGet = scenario("adGroupsTargetingAnalyticsGetSimulation")
        .feed(ad_groups_targeting_analytics/getQUERYFeeder)
        .feed(ad_groups_targeting_analytics/getPATHFeeder)
        .exec(http("adGroupsTargetingAnalyticsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ad_groups/targeting_analytics")
        .queryParam("start_date","${start_date}")
        .queryParam("targeting_types","${targeting_types}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("attribution_types","${attribution_types}")
        .queryParam("granularity","${granularity}")
        .queryParam("end_date","${end_date}")
        .queryParam("columns","${columns}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("ad_group_ids","${ad_group_ids}")
)

    // Run scnadGroupsTargetingAnalyticsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsTargetingAnalyticsGet.inject(
        rampUsersPerSec(1) to(adGroupsTargetingAnalyticsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsTargetingAnalyticsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsTargetingAnalyticsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsUpdate = scenario("adGroupsUpdateSimulation")
        .feed(ad_groups/updatePATHFeeder)
        .exec(http("adGroupsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/ad_groups")
)

    // Run scnadGroupsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsUpdate.inject(
        rampUsersPerSec(1) to(adGroupsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsUpdatePerSecond) to(1) during(rampDownSeconds)
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
