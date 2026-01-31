package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CatalogFeedsApiSimulation extends Simulation {

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
    val feedProcessingResultsListPerSecond = config.getDouble("performance.operationsPerSecond.feedProcessingResultsList") * rateMultiplier * instanceMultiplier
    val feedsCreatePerSecond = config.getDouble("performance.operationsPerSecond.feedsCreate") * rateMultiplier * instanceMultiplier
    val feedsDeletePerSecond = config.getDouble("performance.operationsPerSecond.feedsDelete") * rateMultiplier * instanceMultiplier
    val feedsGetPerSecond = config.getDouble("performance.operationsPerSecond.feedsGet") * rateMultiplier * instanceMultiplier
    val feedsIngestPerSecond = config.getDouble("performance.operationsPerSecond.feedsIngest") * rateMultiplier * instanceMultiplier
    val feedsListPerSecond = config.getDouble("performance.operationsPerSecond.feedsList") * rateMultiplier * instanceMultiplier
    val feedsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.feedsUpdate") * rateMultiplier * instanceMultiplier
    val itemsIssuesListPerSecond = config.getDouble("performance.operationsPerSecond.itemsIssuesList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val feed_processing_results/listQUERYFeeder = csv(userDataDirectory + File.separator + "feedProcessingResultsList-queryParams.csv").random
    val feed_processing_results/listPATHFeeder = csv(userDataDirectory + File.separator + "feedProcessingResultsList-pathParams.csv").random
    val feeds/createQUERYFeeder = csv(userDataDirectory + File.separator + "feedsCreate-queryParams.csv").random
    val feeds/deleteQUERYFeeder = csv(userDataDirectory + File.separator + "feedsDelete-queryParams.csv").random
    val feeds/deletePATHFeeder = csv(userDataDirectory + File.separator + "feedsDelete-pathParams.csv").random
    val feeds/getQUERYFeeder = csv(userDataDirectory + File.separator + "feedsGet-queryParams.csv").random
    val feeds/getPATHFeeder = csv(userDataDirectory + File.separator + "feedsGet-pathParams.csv").random
    val feeds/ingestQUERYFeeder = csv(userDataDirectory + File.separator + "feedsIngest-queryParams.csv").random
    val feeds/ingestPATHFeeder = csv(userDataDirectory + File.separator + "feedsIngest-pathParams.csv").random
    val feeds/listQUERYFeeder = csv(userDataDirectory + File.separator + "feedsList-queryParams.csv").random
    val feeds/updateQUERYFeeder = csv(userDataDirectory + File.separator + "feedsUpdate-queryParams.csv").random
    val feeds/updatePATHFeeder = csv(userDataDirectory + File.separator + "feedsUpdate-pathParams.csv").random
    val items_issues/listQUERYFeeder = csv(userDataDirectory + File.separator + "itemsIssuesList-queryParams.csv").random
    val items_issues/listPATHFeeder = csv(userDataDirectory + File.separator + "itemsIssuesList-pathParams.csv").random

    // Setup all scenarios

    
    val scnfeedProcessingResultsList = scenario("feedProcessingResultsListSimulation")
        .feed(feed_processing_results/listQUERYFeeder)
        .feed(feed_processing_results/listPATHFeeder)
        .exec(http("feedProcessingResultsList")
        .httpRequest("GET","/catalogs/feeds/${feed_id}/processing_results")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnfeedProcessingResultsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedProcessingResultsList.inject(
        rampUsersPerSec(1) to(feedProcessingResultsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedProcessingResultsListPerSecond) during(durationSeconds),
        rampUsersPerSec(feedProcessingResultsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsCreate = scenario("feedsCreateSimulation")
        .feed(feeds/createQUERYFeeder)
        .exec(http("feedsCreate")
        .httpRequest("POST","/catalogs/feeds")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnfeedsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsCreate.inject(
        rampUsersPerSec(1) to(feedsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(feedsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsDelete = scenario("feedsDeleteSimulation")
        .feed(feeds/deleteQUERYFeeder)
        .feed(feeds/deletePATHFeeder)
        .exec(http("feedsDelete")
        .httpRequest("DELETE","/catalogs/feeds/${feed_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnfeedsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsDelete.inject(
        rampUsersPerSec(1) to(feedsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(feedsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsGet = scenario("feedsGetSimulation")
        .feed(feeds/getQUERYFeeder)
        .feed(feeds/getPATHFeeder)
        .exec(http("feedsGet")
        .httpRequest("GET","/catalogs/feeds/${feed_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnfeedsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsGet.inject(
        rampUsersPerSec(1) to(feedsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(feedsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsIngest = scenario("feedsIngestSimulation")
        .feed(feeds/ingestQUERYFeeder)
        .feed(feeds/ingestPATHFeeder)
        .exec(http("feedsIngest")
        .httpRequest("POST","/catalogs/feeds/${feed_id}/ingest")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnfeedsIngest with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsIngest.inject(
        rampUsersPerSec(1) to(feedsIngestPerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsIngestPerSecond) during(durationSeconds),
        rampUsersPerSec(feedsIngestPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsList = scenario("feedsListSimulation")
        .feed(feeds/listQUERYFeeder)
        .exec(http("feedsList")
        .httpRequest("GET","/catalogs/feeds")
        .queryParam("catalog_id","${catalog_id}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnfeedsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsList.inject(
        rampUsersPerSec(1) to(feedsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsListPerSecond) during(durationSeconds),
        rampUsersPerSec(feedsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsUpdate = scenario("feedsUpdateSimulation")
        .feed(feeds/updateQUERYFeeder)
        .feed(feeds/updatePATHFeeder)
        .exec(http("feedsUpdate")
        .httpRequest("PATCH","/catalogs/feeds/${feed_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnfeedsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsUpdate.inject(
        rampUsersPerSec(1) to(feedsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(feedsUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemsIssuesList = scenario("itemsIssuesListSimulation")
        .feed(items_issues/listQUERYFeeder)
        .feed(items_issues/listPATHFeeder)
        .exec(http("itemsIssuesList")
        .httpRequest("GET","/catalogs/processing_results/${processing_result_id}/item_issues")
        .queryParam("item_validation_issue","${item_validation_issue}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("item_numbers","${item_numbers}")
        .queryParam("page_size","${page_size}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnitemsIssuesList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemsIssuesList.inject(
        rampUsersPerSec(1) to(itemsIssuesListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemsIssuesListPerSecond) during(durationSeconds),
        rampUsersPerSec(itemsIssuesListPerSecond) to(1) during(rampDownSeconds)
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
