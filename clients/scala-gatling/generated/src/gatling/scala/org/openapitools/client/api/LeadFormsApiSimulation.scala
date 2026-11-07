package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class LeadFormsApiSimulation extends Simulation {

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
    val leadFormGetPerSecond = config.getDouble("performance.operationsPerSecond.leadFormGet") * rateMultiplier * instanceMultiplier
    val leadFormTestCreatePerSecond = config.getDouble("performance.operationsPerSecond.leadFormTestCreate") * rateMultiplier * instanceMultiplier
    val leadFormsCreatePerSecond = config.getDouble("performance.operationsPerSecond.leadFormsCreate") * rateMultiplier * instanceMultiplier
    val leadFormsListPerSecond = config.getDouble("performance.operationsPerSecond.leadFormsList") * rateMultiplier * instanceMultiplier
    val leadFormsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.leadFormsUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val lead_form/getPATHFeeder = csv(userDataDirectory + File.separator + "leadFormGet-pathParams.csv").random
    val lead_form_test/createPATHFeeder = csv(userDataDirectory + File.separator + "leadFormTestCreate-pathParams.csv").random
    val lead_forms/createPATHFeeder = csv(userDataDirectory + File.separator + "leadFormsCreate-pathParams.csv").random
    val lead_forms/listQUERYFeeder = csv(userDataDirectory + File.separator + "leadFormsList-queryParams.csv").random
    val lead_forms/listPATHFeeder = csv(userDataDirectory + File.separator + "leadFormsList-pathParams.csv").random
    val lead_forms/updatePATHFeeder = csv(userDataDirectory + File.separator + "leadFormsUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scnleadFormGet = scenario("leadFormGetSimulation")
        .feed(lead_form/getPATHFeeder)
        .exec(http("leadFormGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/lead_forms/${lead_form_id}")
)

    // Run scnleadFormGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnleadFormGet.inject(
        rampUsersPerSec(1) to(leadFormGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(leadFormGetPerSecond) during(durationSeconds),
        rampUsersPerSec(leadFormGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnleadFormTestCreate = scenario("leadFormTestCreateSimulation")
        .feed(lead_form_test/createPATHFeeder)
        .exec(http("leadFormTestCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/lead_forms/${lead_form_id}/test")
)

    // Run scnleadFormTestCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnleadFormTestCreate.inject(
        rampUsersPerSec(1) to(leadFormTestCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(leadFormTestCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(leadFormTestCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnleadFormsCreate = scenario("leadFormsCreateSimulation")
        .feed(lead_forms/createPATHFeeder)
        .exec(http("leadFormsCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/lead_forms")
)

    // Run scnleadFormsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnleadFormsCreate.inject(
        rampUsersPerSec(1) to(leadFormsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(leadFormsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(leadFormsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnleadFormsList = scenario("leadFormsListSimulation")
        .feed(lead_forms/listQUERYFeeder)
        .feed(lead_forms/listPATHFeeder)
        .exec(http("leadFormsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/lead_forms")
        .queryParam("page_size","${page_size}")
        .queryParam("order","${order}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnleadFormsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnleadFormsList.inject(
        rampUsersPerSec(1) to(leadFormsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(leadFormsListPerSecond) during(durationSeconds),
        rampUsersPerSec(leadFormsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnleadFormsUpdate = scenario("leadFormsUpdateSimulation")
        .feed(lead_forms/updatePATHFeeder)
        .exec(http("leadFormsUpdate")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/lead_forms")
)

    // Run scnleadFormsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnleadFormsUpdate.inject(
        rampUsersPerSec(1) to(leadFormsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(leadFormsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(leadFormsUpdatePerSecond) to(1) during(rampDownSeconds)
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
