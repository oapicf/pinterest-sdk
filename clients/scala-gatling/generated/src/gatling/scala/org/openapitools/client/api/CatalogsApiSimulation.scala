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
    val catalogsProductGroupsCreatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsCreate") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsDeletePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsDelete") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsListPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsList") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsUpdate") * rateMultiplier * instanceMultiplier
    val feedProcessingResultsListPerSecond = config.getDouble("performance.operationsPerSecond.feedProcessingResultsList") * rateMultiplier * instanceMultiplier
    val feedsCreatePerSecond = config.getDouble("performance.operationsPerSecond.feedsCreate") * rateMultiplier * instanceMultiplier
    val feedsDeletePerSecond = config.getDouble("performance.operationsPerSecond.feedsDelete") * rateMultiplier * instanceMultiplier
    val feedsGetPerSecond = config.getDouble("performance.operationsPerSecond.feedsGet") * rateMultiplier * instanceMultiplier
    val feedsListPerSecond = config.getDouble("performance.operationsPerSecond.feedsList") * rateMultiplier * instanceMultiplier
    val feedsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.feedsUpdate") * rateMultiplier * instanceMultiplier
    val itemsBatchGetPerSecond = config.getDouble("performance.operationsPerSecond.itemsBatchGet") * rateMultiplier * instanceMultiplier
    val itemsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.itemsBatchPost") * rateMultiplier * instanceMultiplier
    val itemsGetPerSecond = config.getDouble("performance.operationsPerSecond.itemsGet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val catalogs_product_groups/deletePATHFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsDelete-pathParams.csv").random
    val catalogs_product_groups/listQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsList-queryParams.csv").random
    val catalogs_product_groups/updatePATHFeeder = csv(userDataDirectory + File.separator + "catalogsProductGroupsUpdate-pathParams.csv").random
    val feed_processing_results/listQUERYFeeder = csv(userDataDirectory + File.separator + "feedProcessingResultsList-queryParams.csv").random
    val feed_processing_results/listPATHFeeder = csv(userDataDirectory + File.separator + "feedProcessingResultsList-pathParams.csv").random
    val feeds/deletePATHFeeder = csv(userDataDirectory + File.separator + "feedsDelete-pathParams.csv").random
    val feeds/getPATHFeeder = csv(userDataDirectory + File.separator + "feedsGet-pathParams.csv").random
    val feeds/listQUERYFeeder = csv(userDataDirectory + File.separator + "feedsList-queryParams.csv").random
    val feeds/updatePATHFeeder = csv(userDataDirectory + File.separator + "feedsUpdate-pathParams.csv").random
    val items_batch/getPATHFeeder = csv(userDataDirectory + File.separator + "itemsBatchGet-pathParams.csv").random
    val items/getQUERYFeeder = csv(userDataDirectory + File.separator + "itemsGet-queryParams.csv").random

    // Setup all scenarios

    
    val scncatalogsProductGroupsCreate = scenario("catalogsProductGroupsCreateSimulation")
        .exec(http("catalogsProductGroupsCreate")
        .httpRequest("POST","/catalogs/product_groups")
)

    // Run scncatalogsProductGroupsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsCreate.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsDelete = scenario("catalogsProductGroupsDeleteSimulation")
        .feed(catalogs_product_groups/deletePATHFeeder)
        .exec(http("catalogsProductGroupsDelete")
        .httpRequest("DELETE","/catalogs/product_groups/${product_group_id}")
)

    // Run scncatalogsProductGroupsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsDelete.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsList = scenario("catalogsProductGroupsListSimulation")
        .feed(catalogs_product_groups/listQUERYFeeder)
        .exec(http("catalogsProductGroupsList")
        .httpRequest("GET","/catalogs/product_groups")
        .queryParam("feed_id","${feed_id}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scncatalogsProductGroupsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsProductGroupsList.inject(
        rampUsersPerSec(1) to(catalogsProductGroupsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsProductGroupsListPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsProductGroupsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsProductGroupsUpdate = scenario("catalogsProductGroupsUpdateSimulation")
        .feed(catalogs_product_groups/updatePATHFeeder)
        .exec(http("catalogsProductGroupsUpdate")
        .httpRequest("PATCH","/catalogs/product_groups/${product_group_id}")
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
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnfeedProcessingResultsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedProcessingResultsList.inject(
        rampUsersPerSec(1) to(feedProcessingResultsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedProcessingResultsListPerSecond) during(durationSeconds),
        rampUsersPerSec(feedProcessingResultsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsCreate = scenario("feedsCreateSimulation")
        .exec(http("feedsCreate")
        .httpRequest("POST","/catalogs/feeds")
)

    // Run scnfeedsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsCreate.inject(
        rampUsersPerSec(1) to(feedsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(feedsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsDelete = scenario("feedsDeleteSimulation")
        .feed(feeds/deletePATHFeeder)
        .exec(http("feedsDelete")
        .httpRequest("DELETE","/catalogs/feeds/${feed_id}")
)

    // Run scnfeedsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsDelete.inject(
        rampUsersPerSec(1) to(feedsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(feedsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsGet = scenario("feedsGetSimulation")
        .feed(feeds/getPATHFeeder)
        .exec(http("feedsGet")
        .httpRequest("GET","/catalogs/feeds/${feed_id}")
)

    // Run scnfeedsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsGet.inject(
        rampUsersPerSec(1) to(feedsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(feedsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsList = scenario("feedsListSimulation")
        .feed(feeds/listQUERYFeeder)
        .exec(http("feedsList")
        .httpRequest("GET","/catalogs/feeds")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnfeedsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsList.inject(
        rampUsersPerSec(1) to(feedsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsListPerSecond) during(durationSeconds),
        rampUsersPerSec(feedsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfeedsUpdate = scenario("feedsUpdateSimulation")
        .feed(feeds/updatePATHFeeder)
        .exec(http("feedsUpdate")
        .httpRequest("PATCH","/catalogs/feeds/${feed_id}")
)

    // Run scnfeedsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfeedsUpdate.inject(
        rampUsersPerSec(1) to(feedsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(feedsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(feedsUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemsBatchGet = scenario("itemsBatchGetSimulation")
        .feed(items_batch/getPATHFeeder)
        .exec(http("itemsBatchGet")
        .httpRequest("GET","/catalogs/items/batch/${batch_id}")
)

    // Run scnitemsBatchGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemsBatchGet.inject(
        rampUsersPerSec(1) to(itemsBatchGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemsBatchGetPerSecond) during(durationSeconds),
        rampUsersPerSec(itemsBatchGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemsBatchPost = scenario("itemsBatchPostSimulation")
        .exec(http("itemsBatchPost")
        .httpRequest("POST","/catalogs/items/batch")
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
        .queryParam("item_ids","${item_ids}")
        .queryParam("language","${language}")
        .queryParam("country","${country}")
)

    // Run scnitemsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemsGet.inject(
        rampUsersPerSec(1) to(itemsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(itemsGetPerSecond) to(1) during(rampDownSeconds)
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
