package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CatalogSupplementalApiSimulation extends Simulation {

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
    val catalogsLocalInventoryItemsBatchOperatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsLocalInventoryItemsBatchOperate") * rateMultiplier * instanceMultiplier
    val catalogsLocalInventoryItemsPostPerSecond = config.getDouble("performance.operationsPerSecond.catalogsLocalInventoryItemsPost") * rateMultiplier * instanceMultiplier
    val catalogsLocalStoresCreatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsLocalStoresCreate") * rateMultiplier * instanceMultiplier
    val catalogsLocalStoresDeletePerSecond = config.getDouble("performance.operationsPerSecond.catalogsLocalStoresDelete") * rateMultiplier * instanceMultiplier
    val catalogsLocalStoresListPerSecond = config.getDouble("performance.operationsPerSecond.catalogsLocalStoresList") * rateMultiplier * instanceMultiplier
    val catalogsLocalStoresUpdatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsLocalStoresUpdate") * rateMultiplier * instanceMultiplier
    val catalogsSupplementalItemsBatchGetPerSecond = config.getDouble("performance.operationsPerSecond.catalogsSupplementalItemsBatchGet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val catalogs_local_inventory_items_batch/operateQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsLocalInventoryItemsBatchOperate-queryParams.csv").random
    val catalogs_local_inventory_items_batch/operatePATHFeeder = csv(userDataDirectory + File.separator + "catalogsLocalInventoryItemsBatchOperate-pathParams.csv").random
    val catalogs_local_inventory_items/postQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsLocalInventoryItemsPost-queryParams.csv").random
    val catalogs_local_inventory_items/postPATHFeeder = csv(userDataDirectory + File.separator + "catalogsLocalInventoryItemsPost-pathParams.csv").random
    val catalogs_local_stores/createQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsLocalStoresCreate-queryParams.csv").random
    val catalogs_local_stores/createPATHFeeder = csv(userDataDirectory + File.separator + "catalogsLocalStoresCreate-pathParams.csv").random
    val catalogs_local_stores/deleteQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsLocalStoresDelete-queryParams.csv").random
    val catalogs_local_stores/deletePATHFeeder = csv(userDataDirectory + File.separator + "catalogsLocalStoresDelete-pathParams.csv").random
    val catalogs_local_stores/listQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsLocalStoresList-queryParams.csv").random
    val catalogs_local_stores/listPATHFeeder = csv(userDataDirectory + File.separator + "catalogsLocalStoresList-pathParams.csv").random
    val catalogs_local_stores/updateQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsLocalStoresUpdate-queryParams.csv").random
    val catalogs_local_stores/updatePATHFeeder = csv(userDataDirectory + File.separator + "catalogsLocalStoresUpdate-pathParams.csv").random
    val catalogs_supplemental_items_batch/getQUERYFeeder = csv(userDataDirectory + File.separator + "catalogsSupplementalItemsBatchGet-queryParams.csv").random
    val catalogs_supplemental_items_batch/getPATHFeeder = csv(userDataDirectory + File.separator + "catalogsSupplementalItemsBatchGet-pathParams.csv").random

    // Setup all scenarios

    
    val scncatalogsLocalInventoryItemsBatchOperate = scenario("catalogsLocalInventoryItemsBatchOperateSimulation")
        .feed(catalogs_local_inventory_items_batch/operateQUERYFeeder)
        .feed(catalogs_local_inventory_items_batch/operatePATHFeeder)
        .exec(http("catalogsLocalInventoryItemsBatchOperate")
        .httpRequest("POST","/catalogs/${catalog_id}/local_inventory_items/batch")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsLocalInventoryItemsBatchOperate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsLocalInventoryItemsBatchOperate.inject(
        rampUsersPerSec(1) to(catalogsLocalInventoryItemsBatchOperatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsLocalInventoryItemsBatchOperatePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsLocalInventoryItemsBatchOperatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsLocalInventoryItemsPost = scenario("catalogsLocalInventoryItemsPostSimulation")
        .feed(catalogs_local_inventory_items/postQUERYFeeder)
        .feed(catalogs_local_inventory_items/postPATHFeeder)
        .exec(http("catalogsLocalInventoryItemsPost")
        .httpRequest("POST","/catalogs/${catalog_id}/local_inventory_items/query")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsLocalInventoryItemsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsLocalInventoryItemsPost.inject(
        rampUsersPerSec(1) to(catalogsLocalInventoryItemsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsLocalInventoryItemsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsLocalInventoryItemsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsLocalStoresCreate = scenario("catalogsLocalStoresCreateSimulation")
        .feed(catalogs_local_stores/createQUERYFeeder)
        .feed(catalogs_local_stores/createPATHFeeder)
        .exec(http("catalogsLocalStoresCreate")
        .httpRequest("POST","/catalogs/${catalog_id}/local_stores")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsLocalStoresCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsLocalStoresCreate.inject(
        rampUsersPerSec(1) to(catalogsLocalStoresCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsLocalStoresCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsLocalStoresCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsLocalStoresDelete = scenario("catalogsLocalStoresDeleteSimulation")
        .feed(catalogs_local_stores/deleteQUERYFeeder)
        .feed(catalogs_local_stores/deletePATHFeeder)
        .exec(http("catalogsLocalStoresDelete")
        .httpRequest("DELETE","/catalogs/${catalog_id}/local_stores")
        .queryParam("ids","${ids}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsLocalStoresDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsLocalStoresDelete.inject(
        rampUsersPerSec(1) to(catalogsLocalStoresDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsLocalStoresDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsLocalStoresDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsLocalStoresList = scenario("catalogsLocalStoresListSimulation")
        .feed(catalogs_local_stores/listQUERYFeeder)
        .feed(catalogs_local_stores/listPATHFeeder)
        .exec(http("catalogsLocalStoresList")
        .httpRequest("GET","/catalogs/${catalog_id}/local_stores")
        .queryParam("ids","${ids}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsLocalStoresList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsLocalStoresList.inject(
        rampUsersPerSec(1) to(catalogsLocalStoresListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsLocalStoresListPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsLocalStoresListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsLocalStoresUpdate = scenario("catalogsLocalStoresUpdateSimulation")
        .feed(catalogs_local_stores/updateQUERYFeeder)
        .feed(catalogs_local_stores/updatePATHFeeder)
        .exec(http("catalogsLocalStoresUpdate")
        .httpRequest("PATCH","/catalogs/${catalog_id}/local_stores")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsLocalStoresUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsLocalStoresUpdate.inject(
        rampUsersPerSec(1) to(catalogsLocalStoresUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsLocalStoresUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsLocalStoresUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncatalogsSupplementalItemsBatchGet = scenario("catalogsSupplementalItemsBatchGetSimulation")
        .feed(catalogs_supplemental_items_batch/getQUERYFeeder)
        .feed(catalogs_supplemental_items_batch/getPATHFeeder)
        .exec(http("catalogsSupplementalItemsBatchGet")
        .httpRequest("GET","/catalogs/${catalog_id}/supplemental_items/batch/${batch_id}")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scncatalogsSupplementalItemsBatchGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncatalogsSupplementalItemsBatchGet.inject(
        rampUsersPerSec(1) to(catalogsSupplementalItemsBatchGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(catalogsSupplementalItemsBatchGetPerSecond) during(durationSeconds),
        rampUsersPerSec(catalogsSupplementalItemsBatchGetPerSecond) to(1) during(rampDownSeconds)
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
