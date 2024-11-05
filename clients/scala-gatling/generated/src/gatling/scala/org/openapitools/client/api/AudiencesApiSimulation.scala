package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class AudiencesApiSimulation extends Simulation {

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
    val audiencesCreatePerSecond = config.getDouble("performance.operationsPerSecond.audiencesCreate") * rateMultiplier * instanceMultiplier
    val audiencesCreateCustomPerSecond = config.getDouble("performance.operationsPerSecond.audiencesCreateCustom") * rateMultiplier * instanceMultiplier
    val audiencesGetPerSecond = config.getDouble("performance.operationsPerSecond.audiencesGet") * rateMultiplier * instanceMultiplier
    val audiencesListPerSecond = config.getDouble("performance.operationsPerSecond.audiencesList") * rateMultiplier * instanceMultiplier
    val audiencesUpdatePerSecond = config.getDouble("performance.operationsPerSecond.audiencesUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val audiences/createPATHFeeder = csv(userDataDirectory + File.separator + "audiencesCreate-pathParams.csv").random
    val audiences/create_customPATHFeeder = csv(userDataDirectory + File.separator + "audiencesCreateCustom-pathParams.csv").random
    val audiences/getPATHFeeder = csv(userDataDirectory + File.separator + "audiencesGet-pathParams.csv").random
    val audiences/listQUERYFeeder = csv(userDataDirectory + File.separator + "audiencesList-queryParams.csv").random
    val audiences/listPATHFeeder = csv(userDataDirectory + File.separator + "audiencesList-pathParams.csv").random
    val audiences/updatePATHFeeder = csv(userDataDirectory + File.separator + "audiencesUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scnaudiencesCreate = scenario("audiencesCreateSimulation")
        .feed(audiences/createPATHFeeder)
        .exec(http("audiencesCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/audiences")
)

    // Run scnaudiencesCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaudiencesCreate.inject(
        rampUsersPerSec(1) to(audiencesCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(audiencesCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(audiencesCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnaudiencesCreateCustom = scenario("audiencesCreateCustomSimulation")
        .feed(audiences/create_customPATHFeeder)
        .exec(http("audiencesCreateCustom")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/audiences/custom")
)

    // Run scnaudiencesCreateCustom with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaudiencesCreateCustom.inject(
        rampUsersPerSec(1) to(audiencesCreateCustomPerSecond) during(rampUpSeconds),
        constantUsersPerSec(audiencesCreateCustomPerSecond) during(durationSeconds),
        rampUsersPerSec(audiencesCreateCustomPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnaudiencesGet = scenario("audiencesGetSimulation")
        .feed(audiences/getPATHFeeder)
        .exec(http("audiencesGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/audiences/${audience_id}")
)

    // Run scnaudiencesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaudiencesGet.inject(
        rampUsersPerSec(1) to(audiencesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(audiencesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(audiencesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnaudiencesList = scenario("audiencesListSimulation")
        .feed(audiences/listQUERYFeeder)
        .feed(audiences/listPATHFeeder)
        .exec(http("audiencesList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/audiences")
        .queryParam("order","${order}")
        .queryParam("ownership_type","${ownership_type}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnaudiencesList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaudiencesList.inject(
        rampUsersPerSec(1) to(audiencesListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(audiencesListPerSecond) during(durationSeconds),
        rampUsersPerSec(audiencesListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnaudiencesUpdate = scenario("audiencesUpdateSimulation")
        .feed(audiences/updatePATHFeeder)
        .exec(http("audiencesUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/audiences/${audience_id}")
)

    // Run scnaudiencesUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaudiencesUpdate.inject(
        rampUsersPerSec(1) to(audiencesUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(audiencesUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(audiencesUpdatePerSecond) to(1) during(rampDownSeconds)
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
