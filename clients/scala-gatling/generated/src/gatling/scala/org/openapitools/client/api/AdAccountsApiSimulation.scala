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
    val adAccountTargetingAnalyticsGetPerSecond = config.getDouble("performance.operationsPerSecond.adAccountTargetingAnalyticsGet") * rateMultiplier * instanceMultiplier
    val adAccountsCreatePerSecond = config.getDouble("performance.operationsPerSecond.adAccountsCreate") * rateMultiplier * instanceMultiplier
    val adAccountsGetPerSecond = config.getDouble("performance.operationsPerSecond.adAccountsGet") * rateMultiplier * instanceMultiplier
    val adAccountsListPerSecond = config.getDouble("performance.operationsPerSecond.adAccountsList") * rateMultiplier * instanceMultiplier
    val analyticsCreateMmmReportPerSecond = config.getDouble("performance.operationsPerSecond.analyticsCreateMmmReport") * rateMultiplier * instanceMultiplier
    val analyticsCreateReportPerSecond = config.getDouble("performance.operationsPerSecond.analyticsCreateReport") * rateMultiplier * instanceMultiplier
    val analyticsCreateTemplateReportPerSecond = config.getDouble("performance.operationsPerSecond.analyticsCreateTemplateReport") * rateMultiplier * instanceMultiplier
    val analyticsGetMmmReportPerSecond = config.getDouble("performance.operationsPerSecond.analyticsGetMmmReport") * rateMultiplier * instanceMultiplier
    val analyticsGetReportPerSecond = config.getDouble("performance.operationsPerSecond.analyticsGetReport") * rateMultiplier * instanceMultiplier
    val sandboxDeletePerSecond = config.getDouble("performance.operationsPerSecond.sandboxDelete") * rateMultiplier * instanceMultiplier
    val templatesListPerSecond = config.getDouble("performance.operationsPerSecond.templatesList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val ad_account/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "adAccountAnalytics-queryParams.csv").random
    val ad_account/analyticsPATHFeeder = csv(userDataDirectory + File.separator + "adAccountAnalytics-pathParams.csv").random
    val ad_account_targeting_analytics/getQUERYFeeder = csv(userDataDirectory + File.separator + "adAccountTargetingAnalyticsGet-queryParams.csv").random
    val ad_account_targeting_analytics/getPATHFeeder = csv(userDataDirectory + File.separator + "adAccountTargetingAnalyticsGet-pathParams.csv").random
    val ad_accounts/getPATHFeeder = csv(userDataDirectory + File.separator + "adAccountsGet-pathParams.csv").random
    val ad_accounts/listQUERYFeeder = csv(userDataDirectory + File.separator + "adAccountsList-queryParams.csv").random
    val analytics/create_mmm_reportPATHFeeder = csv(userDataDirectory + File.separator + "analyticsCreateMmmReport-pathParams.csv").random
    val analytics/create_reportPATHFeeder = csv(userDataDirectory + File.separator + "analyticsCreateReport-pathParams.csv").random
    val analytics/create_template_reportQUERYFeeder = csv(userDataDirectory + File.separator + "analyticsCreateTemplateReport-queryParams.csv").random
    val analytics/create_template_reportPATHFeeder = csv(userDataDirectory + File.separator + "analyticsCreateTemplateReport-pathParams.csv").random
    val analytics/get_mmm_reportQUERYFeeder = csv(userDataDirectory + File.separator + "analyticsGetMmmReport-queryParams.csv").random
    val analytics/get_mmm_reportPATHFeeder = csv(userDataDirectory + File.separator + "analyticsGetMmmReport-pathParams.csv").random
    val analytics/get_reportQUERYFeeder = csv(userDataDirectory + File.separator + "analyticsGetReport-queryParams.csv").random
    val analytics/get_reportPATHFeeder = csv(userDataDirectory + File.separator + "analyticsGetReport-pathParams.csv").random
    val sandbox/deletePATHFeeder = csv(userDataDirectory + File.separator + "sandboxDelete-pathParams.csv").random
    val templates/listQUERYFeeder = csv(userDataDirectory + File.separator + "templatesList-queryParams.csv").random
    val templates/listPATHFeeder = csv(userDataDirectory + File.separator + "templatesList-pathParams.csv").random

    // Setup all scenarios

    
    val scnadAccountAnalytics = scenario("adAccountAnalyticsSimulation")
        .feed(ad_account/analyticsQUERYFeeder)
        .feed(ad_account/analyticsPATHFeeder)
        .exec(http("adAccountAnalytics")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/analytics")
        .queryParam("start_date","${start_date}")
        .queryParam("view_window_days","${view_window_days}")
        .queryParam("granularity","${granularity}")
        .queryParam("end_date","${end_date}")
        .queryParam("columns","${columns}")
        .queryParam("conversion_report_time","${conversion_report_time}")
        .queryParam("engagement_window_days","${engagement_window_days}")
        .queryParam("click_window_days","${click_window_days}")
)

    // Run scnadAccountAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountAnalytics.inject(
        rampUsersPerSec(1) to(adAccountAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadAccountTargetingAnalyticsGet = scenario("adAccountTargetingAnalyticsGetSimulation")
        .feed(ad_account_targeting_analytics/getQUERYFeeder)
        .feed(ad_account_targeting_analytics/getPATHFeeder)
        .exec(http("adAccountTargetingAnalyticsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/targeting_analytics")
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
)

    // Run scnadAccountTargetingAnalyticsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountTargetingAnalyticsGet.inject(
        rampUsersPerSec(1) to(adAccountTargetingAnalyticsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountTargetingAnalyticsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountTargetingAnalyticsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadAccountsCreate = scenario("adAccountsCreateSimulation")
        .exec(http("adAccountsCreate")
        .httpRequest("POST","/ad_accounts")
)

    // Run scnadAccountsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsCreate.inject(
        rampUsersPerSec(1) to(adAccountsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadAccountsGet = scenario("adAccountsGetSimulation")
        .feed(ad_accounts/getPATHFeeder)
        .exec(http("adAccountsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}")
)

    // Run scnadAccountsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsGet.inject(
        rampUsersPerSec(1) to(adAccountsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadAccountsList = scenario("adAccountsListSimulation")
        .feed(ad_accounts/listQUERYFeeder)
        .exec(http("adAccountsList")
        .httpRequest("GET","/ad_accounts")
        .queryParam("include_shared_accounts","${include_shared_accounts}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnadAccountsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsList.inject(
        rampUsersPerSec(1) to(adAccountsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsListPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnanalyticsCreateMmmReport = scenario("analyticsCreateMmmReportSimulation")
        .feed(analytics/create_mmm_reportPATHFeeder)
        .exec(http("analyticsCreateMmmReport")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/mmm_reports")
)

    // Run scnanalyticsCreateMmmReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnanalyticsCreateMmmReport.inject(
        rampUsersPerSec(1) to(analyticsCreateMmmReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(analyticsCreateMmmReportPerSecond) during(durationSeconds),
        rampUsersPerSec(analyticsCreateMmmReportPerSecond) to(1) during(rampDownSeconds)
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

    
    val scnanalyticsCreateTemplateReport = scenario("analyticsCreateTemplateReportSimulation")
        .feed(analytics/create_template_reportQUERYFeeder)
        .feed(analytics/create_template_reportPATHFeeder)
        .exec(http("analyticsCreateTemplateReport")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/templates/${template_id}/reports")
        .queryParam("end_date","${end_date}")
        .queryParam("granularity","${granularity}")
        .queryParam("start_date","${start_date}")
)

    // Run scnanalyticsCreateTemplateReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnanalyticsCreateTemplateReport.inject(
        rampUsersPerSec(1) to(analyticsCreateTemplateReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(analyticsCreateTemplateReportPerSecond) during(durationSeconds),
        rampUsersPerSec(analyticsCreateTemplateReportPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnanalyticsGetMmmReport = scenario("analyticsGetMmmReportSimulation")
        .feed(analytics/get_mmm_reportQUERYFeeder)
        .feed(analytics/get_mmm_reportPATHFeeder)
        .exec(http("analyticsGetMmmReport")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/mmm_reports")
        .queryParam("token","${token}")
)

    // Run scnanalyticsGetMmmReport with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnanalyticsGetMmmReport.inject(
        rampUsersPerSec(1) to(analyticsGetMmmReportPerSecond) during(rampUpSeconds),
        constantUsersPerSec(analyticsGetMmmReportPerSecond) during(durationSeconds),
        rampUsersPerSec(analyticsGetMmmReportPerSecond) to(1) during(rampDownSeconds)
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

    
    val scnsandboxDelete = scenario("sandboxDeleteSimulation")
        .feed(sandbox/deletePATHFeeder)
        .exec(http("sandboxDelete")
        .httpRequest("DELETE","/ad_accounts/${ad_account_id}/sandbox")
)

    // Run scnsandboxDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsandboxDelete.inject(
        rampUsersPerSec(1) to(sandboxDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(sandboxDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(sandboxDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntemplatesList = scenario("templatesListSimulation")
        .feed(templates/listQUERYFeeder)
        .feed(templates/listPATHFeeder)
        .exec(http("templatesList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/templates")
        .queryParam("page_size","${page_size}")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scntemplatesList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntemplatesList.inject(
        rampUsersPerSec(1) to(templatesListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(templatesListPerSecond) during(durationSeconds),
        rampUsersPerSec(templatesListPerSecond) to(1) during(rampDownSeconds)
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
