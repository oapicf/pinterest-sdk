package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CatalogsApiSimulation extends Simulation {

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
    val catalogsCreatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsCreate") * rateMultiplier * instanceMultiplier
    val catalogsListPerSecond = config.getDouble("performance.operationsPerSecond.catalogsList") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupPinsListPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupPinsList") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsCreatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsCreate") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsCreateManyPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsCreateMany") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsDeletePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsDelete") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsDeleteManyPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsDeleteMany") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsGetPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsGet") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsListPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsList") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsProductCountsGetPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsProductCountsGet") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsUpdate") * rateMultiplier * instanceMultiplier
    val feedProcessingResultsListPerSecond = config.getDouble("performance.operationsPerSecond.feedProcessingResultsList") * rateMultiplier * instanceMultiplier
    val feedsCreatePerSecond = config.getDouble("performance.operationsPerSecond.feedsCreate") * rateMultiplier * instanceMultiplier
    val feedsDeletePerSecond = config.getDouble("performance.operationsPerSecond.feedsDelete") * rateMultiplier * instanceMultiplier
    val feedsGetPerSecond = config.getDouble("performance.operationsPerSecond.feedsGet") * rateMultiplier * instanceMultiplier
    val feedsIngestPerSecond = config.getDouble("performance.operationsPerSecond.feedsIngest") * rateMultiplier * instanceMultiplier
    val feedsListPerSecond = config.getDouble("performance.operationsPerSecond.feedsList") * rateMultiplier * instanceMultiplier
    val feedsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.feedsUpdate") * rateMultiplier * instanceMultiplier
    val itemsBatchGetPerSecond = config.getDouble("performance.operationsPerSecond.itemsBatchGet") * rateMultiplier * instanceMultiplier
    val itemsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.itemsBatchPost") * rateMultiplier * instanceMultiplier
    val itemsGetPerSecond = config.getDouble("performance.operationsPerSecond.itemsGet") * rateMultiplier * instanceMultiplier
    val itemsIssuesListPerSecond = config.getDouble("performance.operationsPerSecond.itemsIssuesList") * rateMultiplier * instanceMultiplier
    val itemsPostPerSecond = config.getDouble("performance.operationsPerSecond.itemsPost") * rateMultiplier * instanceMultiplier
    val productsByProductGroupFilterListPerSecond = config.getDouble("performance.operationsPerSecond.productsByProductGroupFilterList") * rateMultiplier * instanceMultiplier
    val reportsCreatePerSecond = config.getDouble("performance.operationsPerSecond.reportsCreate") * rateMultiplier * instanceMultiplier
    val reportsGetPerSecond = config.getDouble("performance.operationsPerSecond.reportsGet") * rateMultiplier * instanceMultiplier
    val reportsStatsPerSecond = config.getDouble("performance.operationsPerSecond.reportsStats") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val catalogs/createQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsCreate-queryParams.csv").random
    val catalogs/listQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsList-queryParams.csv").random
    val catalogs_product_group_pins/listQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupPinsList-queryParams.csv").random
    val catalogs_product_group_pins/listPATHFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupPinsList-pathParams.csv").random
    val catalogs_product_groups/createQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsCreate-queryParams.csv").random
    val catalogs_product_groups/create_manyQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsCreateMany-queryParams.csv").random
    val catalogs_product_groups/deleteQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsDelete-queryParams.csv").random
    val catalogs_product_groups/deletePATHFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsDelete-pathParams.csv").random
    val catalogs_product_groups/delete_manyQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsDeleteMany-queryParams.csv").random
    val catalogs_product_groups/getQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsGet-queryParams.csv").random
    val catalogs_product_groups/getPATHFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsGet-pathParams.csv").random
    val catalogs_product_groups/listQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsList-queryParams.csv").random
    val catalogs_product_groups/product_counts_getQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsProductCountsGet-queryParams.csv").random
    val catalogs_product_groups/product_counts_getPATHFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsProductCountsGet-pathParams.csv").random
    val catalogs_product_groups/updateQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsUpdate-queryParams.csv").random
    val catalogs_product_groups/updatePATHFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsUpdate-pathParams.csv").random
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
    val items_batch/getQUERYFeeder = csv(userDataDirectory + File.separator + "itemsBatchGet-queryParams.csv").random
    val items_batch/getPATHFeeder = csv(userDataDirectory + File.separator + "itemsBatchGet-pathParams.csv").random
    val items_batch/postQUERYFeeder = csv(userDataDirectory + File.separator + "itemsBatchPost-queryParams.csv").random
    val items/getQUERYFeeder = csv(userDataDirectory + File.separator + "itemsGet-queryParams.csv").random
    val items_issues/listQUERYFeeder = csv(userDataDirectory + File.separator + "itemsIssuesList-queryParams.csv").random
    val items_issues/listPATHFeeder = csv(userDataDirectory + File.separator + "itemsIssuesList-pathParams.csv").random
    val items/postQUERYFeeder = csv(userDataDirectory + File.separator + "itemsPost-queryParams.csv").random
    val products_by_product_group_filter/listQUERYFeeder = csv(userDataDirectory + File.separator + "productsByProductGroupFilterList-queryParams.csv").random
    val reports/createQUERYFeeder = csv(userDataDirectory + File.separator + "reportsCreate-queryParams.csv").random
    val reports/getQUERYFeeder = csv(userDataDirectory + File.separator + "reportsGet-queryParams.csv").random
    val reports/statsQUERYFeeder = csv(userDataDirectory + File.separator + "reportsStats-queryParams.csv").random

    // Setup all scenarios

    
    val scncatalogsCreate = scenario("catalogsCreateSimulation")
        .feed(catalogs/createQUERYFeeder)
        .exec(http("catalogsCreate")
        .httpRequest("POST","/catalogs")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsCreate.inject(
        rampUsersPerSec(1) to(catalogsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsList = scenario("catalogsListSimulation")
        .feed(catalogs/listQUERYFeeder)
        .exec(http("catalogsList")
        .httpRequest("GET","/catalogs")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scncatalogsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsList.inject(
        rampUsersPerSec(1) to(catalogsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsListPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupPinsList = scenario("catalogsProductGroupPinsListSimulation")
        .feed(catalogs_product_group_pins/listQUERYFeeder)
        .feed(catalogs_product_group_pins/listPATHFeeder)
        .exec(http("catalogsProductGroupPinsList")
        .httpRequest("GET","/catalogs/product_groups/${product_group_id}/products")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("pin_metrics","${pin_metrics}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scncatalogsProductGroupPinsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupPinsList.inject(
        rampUsersPerSec(1) to(catalogsProductGroupPinsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupPinsListPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupPinsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsCreate = scenario("catalogsProductGroupsCreateSimulation")
        .feed(catalogs_product_groups/createQUERYFeeder)
        .exec(http("catalogsProductGroupsCreate")
        .httpRequest("POST","/catalogs/product_groups")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsProductGroupsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsCreate.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsCreateMany = scenario("catalogsProductGroupsCreateManySimulation")
        .feed(catalogs_product_groups/create_manyQUERYFeeder)
        .exec(http("catalogsProductGroupsCreateMany")
        .httpRequest("POST","/catalogs/product_groups/multiple")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsProductGroupsCreateMany with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsCreateMany.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsCreateManyPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsCreateManyPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsCreateManyPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsDelete = scenario("catalogsProductGroupsDeleteSimulation")
        .feed(catalogs_product_groups/deleteQUERYFeeder)
        .feed(catalogs_product_groups/deletePATHFeeder)
        .exec(http("catalogsProductGroupsDelete")
        .httpRequest("DELETE","/catalogs/product_groups/${product_group_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsProductGroupsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsDelete.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsDeleteMany = scenario("catalogsProductGroupsDeleteManySimulation")
        .feed(catalogs_product_groups/delete_manyQUERYFeeder)
        .exec(http("catalogsProductGroupsDeleteMany")
        .httpRequest("DELETE","/catalogs/product_groups/multiple")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("id","${id}")
)

    // Run scncatalogsProductGroupsDeleteMany with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsDeleteMany.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsDeleteManyPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsDeleteManyPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsDeleteManyPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsGet = scenario("catalogsProductGroupsGetSimulation")
        .feed(catalogs_product_groups/getQUERYFeeder)
        .feed(catalogs_product_groups/getPATHFeeder)
        .exec(http("catalogsProductGroupsGet")
        .httpRequest("GET","/catalogs/product_groups/${product_group_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsProductGroupsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsGet.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsList = scenario("catalogsProductGroupsListSimulation")
        .feed(catalogs_product_groups/listQUERYFeeder)
        .exec(http("catalogsProductGroupsList")
        .httpRequest("GET","/catalogs/product_groups")
        .queryParam("feed_id","${feed_id}")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("catalog_id","${catalog_id}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("id","${id}")
)

    // Run scncatalogsProductGroupsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsList.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsListPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsProductCountsGet = scenario("catalogsProductGroupsProductCountsGetSimulation")
        .feed(catalogs_product_groups/product_counts_getQUERYFeeder)
        .feed(catalogs_product_groups/product_counts_getPATHFeeder)
        .exec(http("catalogsProductGroupsProductCountsGet")
        .httpRequest("GET","/catalogs/product_groups/${product_group_id}/product_counts")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsProductGroupsProductCountsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsProductCountsGet.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsProductCountsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsProductCountsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsProductCountsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsUpdate = scenario("catalogsProductGroupsUpdateSimulation")
        .feed(catalogs_product_groups/updateQUERYFeeder)
        .feed(catalogs_product_groups/updatePATHFeeder)
        .exec(http("catalogsProductGroupsUpdate")
        .httpRequest("PATCH","/catalogs/product_groups/${product_group_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsProductGroupsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsUpdate.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedProcessingResultsList = scenario("feedProcessingResultsListSimulation")
        .feed(feed_processing_results/listQUERYFeeder)
        .feed(feed_processing_results/listPATHFeeder)
        .exec(http("feedProcessingResultsList")
        .httpRequest("GET","/catalogs/feeds/${feed_id}/processing_results")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
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
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("catalog_id","${catalog_id}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
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

    
    val scnitemsBatchGet = scenario("itemsBatchGetSimulation")
        .feed(items_batch/getQUERYFeeder)
        .feed(items_batch/getPATHFeeder)
        .exec(http("itemsBatchGet")
        .httpRequest("GET","/catalogs/items/batch/${batch_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnitemsBatchGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemsBatchGet.inject(
        rampUsersPerSec(1) to(itemsBatchGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemsBatchGetPerSecond) during(durationSeconds),
        rampUsersPerSec(itemsBatchGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemsBatchPost = scenario("itemsBatchPostSimulation")
        .feed(items_batch/postQUERYFeeder)
        .exec(http("itemsBatchPost")
        .httpRequest("POST","/catalogs/items/batch")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnitemsBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemsBatchPost.inject(
        rampUsersPerSec(1) to(itemsBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemsBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(itemsBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemsGet = scenario("itemsGetSimulation")
        .feed(items/getQUERYFeeder)
        .exec(http("itemsGet")
        .httpRequest("GET","/catalogs/items")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("filters","${filters}")
        .queryParam("country","${country}")
        .queryParam("item_ids","${item_ids}")
        .queryParam("language","${language}")
)

    // Run scnitemsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemsGet.inject(
        rampUsersPerSec(1) to(itemsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(itemsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemsIssuesList = scenario("itemsIssuesListSimulation")
        .feed(items_issues/listQUERYFeeder)
        .feed(items_issues/listPATHFeeder)
        .exec(http("itemsIssuesList")
        .httpRequest("GET","/catalogs/processing_results/${processing_result_id}/item_issues")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("item_validation_issue","${item_validation_issue}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("item_numbers","${item_numbers}")
)

    // Run scnitemsIssuesList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemsIssuesList.inject(
        rampUsersPerSec(1) to(itemsIssuesListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemsIssuesListPerSecond) during(durationSeconds),
        rampUsersPerSec(itemsIssuesListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemsPost = scenario("itemsPostSimulation")
        .feed(items/postQUERYFeeder)
        .exec(http("itemsPost")
        .httpRequest("POST","/catalogs/items")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnitemsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemsPost.inject(
        rampUsersPerSec(1) to(itemsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(itemsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnproductsByProductGroupFilterList = scenario("productsByProductGroupFilterListSimulation")
        .feed(products_by_product_group_filter/listQUERYFeeder)
        .exec(http("productsByProductGroupFilterList")
        .httpRequest("POST","/catalogs/products/get_by_product_group_filters")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("pin_metrics","${pin_metrics}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnproductsByProductGroupFilterList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductsByProductGroupFilterList.inject(
        rampUsersPerSec(1) to(productsByProductGroupFilterListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(productsByProductGroupFilterListPerSecond) during(durationSeconds),
        rampUsersPerSec(productsByProductGroupFilterListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnreportsCreate = scenario("reportsCreateSimulation")
        .feed(reports/createQUERYFeeder)
        .exec(http("reportsCreate")
        .httpRequest("POST","/catalogs/reports")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnreportsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnreportsCreate.inject(
        rampUsersPerSec(1) to(reportsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(reportsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(reportsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnreportsGet = scenario("reportsGetSimulation")
        .feed(reports/getQUERYFeeder)
        .exec(http("reportsGet")
        .httpRequest("GET","/catalogs/reports")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("token","${token}")
)

    // Run scnreportsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnreportsGet.inject(
        rampUsersPerSec(1) to(reportsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(reportsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(reportsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnreportsStats = scenario("reportsStatsSimulation")
        .feed(reports/statsQUERYFeeder)
        .exec(http("reportsStats")
        .httpRequest("GET","/catalogs/reports/stats")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("parameters","${parameters}")
)

    // Run scnreportsStats with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnreportsStats.inject(
        rampUsersPerSec(1) to(reportsStatsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(reportsStatsPerSecond) during(durationSeconds),
        rampUsersPerSec(reportsStatsPerSecond) to(1) during(rampDownSeconds)
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
