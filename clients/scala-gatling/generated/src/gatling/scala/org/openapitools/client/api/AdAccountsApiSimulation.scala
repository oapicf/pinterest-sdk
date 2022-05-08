package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class AdAccountsApiSimulation extends Simulation {

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
    val adAccountAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.adAccountAnalytics") * rateMultiplier * instanceMultiplier
    val adAccountsListPerSecond = config.getDouble("performance.operationsPerSecond.adAccountsList") * rateMultiplier * instanceMultiplier
    val adGroupsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.adGroupsAnalytics") * rateMultiplier * instanceMultiplier
    val adGroupsListPerSecond = config.getDouble("performance.operationsPerSecond.adGroupsList") * rateMultiplier * instanceMultiplier
    val adsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.adsAnalytics") * rateMultiplier * instanceMultiplier
    val adsListPerSecond = config.getDouble("performance.operationsPerSecond.adsList") * rateMultiplier * instanceMultiplier
    val analyticsCreateReportPerSecond = config.getDouble("performance.operationsPerSecond.analyticsCreateReport") * rateMultiplier * instanceMultiplier
    val analyticsGetReportPerSecond = config.getDouble("performance.operationsPerSecond.analyticsGetReport") * rateMultiplier * instanceMultiplier
    val campaignsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.campaignsAnalytics") * rateMultiplier * instanceMultiplier
    val campaignsListPerSecond = config.getDouble("performance.operationsPerSecond.campaignsList") * rateMultiplier * instanceMultiplier
    val productGroupsAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.productGroupsAnalytics") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val ad_account/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "adAccountAnalytics-queryParams.csv").random
    val ad_account/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "adAccountAnalytics-pathParams.csv").random
    val ad_accounts/listQUERYFeeder = csv(userDataDirectory + File.separator + "adAccountsList-queryParams.csv").random
    val ad_groups/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "adGroupsAnalytics-queryParams.csv").random
    val ad_groups/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsAnalytics-pathParams.csv").random
    val ad_groups/listQUERYFeeder = csv(userDataDirectory + File.separator + "adGroupsList-queryParams.csv").random
    val ad_groups/listPATHFeeder = csv(userDataDirectory + File.separator + "adGroupsList-pathParams.csv").random
    val ads/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "adsAnalytics-queryParams.csv").random
    val ads/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "adsAnalytics-pathParams.csv").random
    val ads/listQUERYFeeder = csv(userDataDirectory + File.separator + "adsList-queryParams.csv").random
    val ads/listPATHFeeder = csv(userDataDirectory + File.separator + "adsList-pathParams.csv").random
    val analytics/create_reportPATHFeeder = csv(userDataDirectory + File.separator + "analyticsCreateReport-pathParams.csv").random
    val analytics/get_reportQUERYFeeder = csv(userDataDirectory + File.separator + "analyticsGetReport-queryParams.csv").random
    val analytics/get_reportPATHFeeder = csv(userDataDirectory + File.separator + "analyticsGetReport-pathParams.csv").random
    val campaigns/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "campaignsAnalytics-queryParams.csv").random
    val campaigns/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "campaignsAnalytics-pathParams.csv").random
    val campaigns/listQUERYFeeder = csv(userDataDirectory + File.separator + "campaignsList-queryParams.csv").random
    val campaigns/listPATHFeeder = csv(userDataDirectory + File.separator + "campaignsList-pathParams.csv").random
    val product_groups/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "productGroupsAnalytics-queryParams.csv").random
    val product_groups/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "productGroupsAnalytics-pathParams.csv").random

    // Setup all scenarios

    
    val scnadAccountAnalytics = scenario("adAccountAnalyticsSimulation")
        .feed(ad_account/analyticsQUERYFeeder)
        .feed(ad_account/analyticsPATHFeeder)
        .exec(http("adAccountAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/analytics")
        .queryParam("columns","${columns}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("start_date","${start_date}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("end_date","${end_date}")
        .queryParam("granularity","${granularity}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
)

    // Run scnadAccountAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountAnalytics.inject(
        rampUsersPerSec(1) to(adAccountAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadAccountsList = scenario("adAccountsListSimulation")
        .feed(ad_accounts/listQUERYFeeder)
        .exec(http("adAccountsList")
        .httpRequest("GET","/ad_accounts")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("include_shared_accounts","${include_shared_accounts}")
)

    // Run scnadAccountsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsList.inject(
        rampUsersPerSec(1) to(adAccountsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsListPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsAnalytics = scenario("adGroupsAnalyticsSimulation")
        .feed(ad_groups/analyticsQUERYFeeder)
        .feed(ad_groups/analyticsPATHFeeder)
        .exec(http("adGroupsAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ad_groups/analytics")
        .queryParam("columns","${columns}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("start_date","${start_date}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("end_date","${end_date}")
        .queryParam("ad_group_ids","${ad_group_ids}")
        .queryParam("granularity","${granularity}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
)

    // Run scnadGroupsAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsAnalytics.inject(
        rampUsersPerSec(1) to(adGroupsAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadGroupsList = scenario("adGroupsListSimulation")
        .feed(ad_groups/listQUERYFeeder)
        .feed(ad_groups/listPATHFeeder)
        .exec(http("adGroupsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ad_groups")
        .queryParam("order","${order}")
        .queryParam("campaign_ids","${campaign_ids}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("ad_group_ids","${ad_group_ids}")
        .queryParam("entity_statuses","${entity_statuses}")
        .queryParam("page_size","${page_size}")
        .queryParam("translate_interests_to_names","${translate_interests_to_names}")
)

    // Run scnadGroupsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadGroupsList.inject(
        rampUsersPerSec(1) to(adGroupsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adGroupsListPerSecond) during(durationSeconds),
        rampUsersPerSec(adGroupsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadsAnalytics = scenario("adsAnalyticsSimulation")
        .feed(ads/analyticsQUERYFeeder)
        .feed(ads/analyticsPATHFeeder)
        .exec(http("adsAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ads/analytics")
        .queryParam("columns","${columns}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("start_date","${start_date}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("end_date","${end_date}")
        .queryParam("ad_ids","${ad_ids}")
        .queryParam("granularity","${granularity}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
)

    // Run scnadsAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsAnalytics.inject(
        rampUsersPerSec(1) to(adsAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(adsAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadsList = scenario("adsListSimulation")
        .feed(ads/listQUERYFeeder)
        .feed(ads/listPATHFeeder)
        .exec(http("adsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ads")
        .queryParam("order","${order}")
        .queryParam("campaign_ids","${campaign_ids}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("ad_group_ids","${ad_group_ids}")
        .queryParam("entity_statuses","${entity_statuses}")
        .queryParam("ad_ids","${ad_ids}")
        .queryParam("page_size","${page_size}")
)

    // Run scnadsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsList.inject(
        rampUsersPerSec(1) to(adsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsListPerSecond) during(durationSeconds),
        rampUsersPerSec(adsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnanalyticsCreateReport = scenario("analyticsCreateReportSimulation")
        .feed(analytics/create_reportPATHFeeder)
        .exec(http("analyticsCreateReport")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/reports")
)

    // Run scnanalyticsCreateReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnanalyticsCreateReport.inject(
        rampUsersPerSec(1) to(analyticsCreateReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(analyticsCreateReportPerSecond) during(durationSeconds),
        rampUsersPerSec(analyticsCreateReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnanalyticsGetReport = scenario("analyticsGetReportSimulation")
        .feed(analytics/get_reportQUERYFeeder)
        .feed(analytics/get_reportPATHFeeder)
        .exec(http("analyticsGetReport")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/reports")
        .queryParam("token","${token}")
)

    // Run scnanalyticsGetReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnanalyticsGetReport.inject(
        rampUsersPerSec(1) to(analyticsGetReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(analyticsGetReportPerSecond) during(durationSeconds),
        rampUsersPerSec(analyticsGetReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncampaignsAnalytics = scenario("campaignsAnalyticsSimulation")
        .feed(campaigns/analyticsQUERYFeeder)
        .feed(campaigns/analyticsPATHFeeder)
        .exec(http("campaignsAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/campaigns/analytics")
        .queryParam("columns","${columns}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("start_date","${start_date}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("end_date","${end_date}")
        .queryParam("campaign_ids","${campaign_ids}")
        .queryParam("granularity","${granularity}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
)

    // Run scncampaignsAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncampaignsAnalytics.inject(
        rampUsersPerSec(1) to(campaignsAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(campaignsAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(campaignsAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncampaignsList = scenario("campaignsListSimulation")
        .feed(campaigns/listQUERYFeeder)
        .feed(campaigns/listPATHFeeder)
        .exec(http("campaignsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/campaigns")
        .queryParam("order","${order}")
        .queryParam("campaign_ids","${campaign_ids}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("entity_statuses","${entity_statuses}")
        .queryParam("page_size","${page_size}")
)

    // Run scncampaignsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncampaignsList.inject(
        rampUsersPerSec(1) to(campaignsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(campaignsListPerSecond) during(durationSeconds),
        rampUsersPerSec(campaignsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnproductGroupsAnalytics = scenario("productGroupsAnalyticsSimulation")
        .feed(product_groups/analyticsQUERYFeeder)
        .feed(product_groups/analyticsPATHFeeder)
        .exec(http("productGroupsAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/product_groups/analytics")
        .queryParam("columns","${columns}")
        .queryParam("click_window_days","${click_window_days}")
        .queryParam("start_date","${start_date}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("end_date","${end_date}")
        .queryParam("granularity","${granularity}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("product_group_ids","${product_group_ids}")
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
