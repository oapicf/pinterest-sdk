package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class PromotionsApiSimulation extends Simulation {

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
    val promotionsCreatePerSecond = config.getDouble("performance.operationsPerSecond.promotionsCreate") * rateMultiplier * instanceMultiplier
    val promotionsDeletePerSecond = config.getDouble("performance.operationsPerSecond.promotionsDelete") * rateMultiplier * instanceMultiplier
    val promotionsGetPerSecond = config.getDouble("performance.operationsPerSecond.promotionsGet") * rateMultiplier * instanceMultiplier
    val promotionsListPerSecond = config.getDouble("performance.operationsPerSecond.promotionsList") * rateMultiplier * instanceMultiplier
    val promotionsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.promotionsUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val promotions/createPATHFeeder = csv(userDataDirectory + File.separator + "promotionsCreate-pathParams.csv").random
    val promotions/deletePATHFeeder = csv(userDataDirectory + File.separator + "promotionsDelete-pathParams.csv").random
    val promotions/getPATHFeeder = csv(userDataDirectory + File.separator + "promotionsGet-pathParams.csv").random
    val promotions/listQUERYFeeder = csv(userDataDirectory + File.separator + "promotionsList-queryParams.csv").random
    val promotions/listPATHFeeder = csv(userDataDirectory + File.separator + "promotionsList-pathParams.csv").random
    val promotions/updatePATHFeeder = csv(userDataDirectory + File.separator + "promotionsUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scnpromotionsCreate = scenario("promotionsCreateSimulation")
        .feed(promotions/createPATHFeeder)
        .exec(http("promotionsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/promotions")
)

    // Run scnpromotionsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpromotionsCreate.inject(
        rampUsersPerSec(1) to(promotionsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(promotionsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(promotionsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpromotionsDelete = scenario("promotionsDeleteSimulation")
        .feed(promotions/deletePATHFeeder)
        .exec(http("promotionsDelete")
        .httpRequest("DELETE","/ad_accounts/${ad_account_id}/promotions/${promotion_id}")
)

    // Run scnpromotionsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpromotionsDelete.inject(
        rampUsersPerSec(1) to(promotionsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(promotionsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(promotionsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpromotionsGet = scenario("promotionsGetSimulation")
        .feed(promotions/getPATHFeeder)
        .exec(http("promotionsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/promotions/${promotion_id}")
)

    // Run scnpromotionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpromotionsGet.inject(
        rampUsersPerSec(1) to(promotionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(promotionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(promotionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpromotionsList = scenario("promotionsListSimulation")
        .feed(promotions/listQUERYFeeder)
        .feed(promotions/listPATHFeeder)
        .exec(http("promotionsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/promotions")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
        .queryParam("order","${order}")
)

    // Run scnpromotionsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpromotionsList.inject(
        rampUsersPerSec(1) to(promotionsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(promotionsListPerSecond) during(durationSeconds),
        rampUsersPerSec(promotionsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpromotionsUpdate = scenario("promotionsUpdateSimulation")
        .feed(promotions/updatePATHFeeder)
        .exec(http("promotionsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/promotions")
)

    // Run scnpromotionsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpromotionsUpdate.inject(
        rampUsersPerSec(1) to(promotionsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(promotionsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(promotionsUpdatePerSecond) to(1) during(rampDownSeconds)
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
