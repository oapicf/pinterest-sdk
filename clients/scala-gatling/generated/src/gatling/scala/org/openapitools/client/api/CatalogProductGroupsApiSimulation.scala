package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CatalogProductGroupsApiSimulation extends Simulation {

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
    val catalogsProductGroupPinsListPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupPinsList") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsCreatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsCreate") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsCreateManyPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsCreateMany") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsDeletePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsDelete") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsDeleteManyPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsDeleteMany") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsGetPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsGet") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsListPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsList") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsProductCountsGetPerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsProductCountsGet") * rateMultiplier * instanceMultiplier
    val catalogsProductGroupsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.catalogsProductGroupsUpdate") * rateMultiplier * instanceMultiplier
    val productsByProductGroupFilterListPerSecond = config.getDouble("performance.operationsPerSecond.productsByProductGroupFilterList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
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
    val products_by_product_group_filter/listQUERYFeeder = csv(userDataDirectory + File.separator + "productsByProductGroupFilterList-queryParams.csv").random

    // Setup all scenarios

    
    val scncatalogsProductGroupPinsList = scenario("catalogsProductGroupPinsListSimulation")
        .feed(catalogs_product_group_pins/listQUERYFeeder)
        .feed(catalogs_product_group_pins/listPATHFeeder)
        .exec(http("catalogsProductGroupPinsList")
        .httpRequest("GET","/catalogs/product_groups/${product_group_id}/products")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("pin_metrics","${pin_metrics}")
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
        .queryParam("id","${id}")
        .queryParam("ad_account_id","${ad_account_id}")
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
        .queryParam("catalog_id","${catalog_id}")
        .queryParam("id","${id}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("feed_id","${feed_id}")
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

    
    val scnproductsByProductGroupFilterList = scenario("productsByProductGroupFilterListSimulation")
        .feed(products_by_product_group_filter/listQUERYFeeder)
        .exec(http("productsByProductGroupFilterList")
        .httpRequest("POST","/catalogs/products/get_by_product_group_filters")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("pin_metrics","${pin_metrics}")
)

    // Run scnproductsByProductGroupFilterList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnproductsByProductGroupFilterList.inject(
        rampUsersPerSec(1) to(productsByProductGroupFilterListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(productsByProductGroupFilterListPerSecond) during(durationSeconds),
        rampUsersPerSec(productsByProductGroupFilterListPerSecond) to(1) during(rampDownSeconds)
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
