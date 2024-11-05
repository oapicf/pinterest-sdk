package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BusinessAccessInviteApiSimulation extends Simulation {

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
    val assetAccessRequestsCreatePerSecond = config.getDouble("performance.operationsPerSecond.assetAccessRequestsCreate") * rateMultiplier * instanceMultiplier
    val cancelInvitesOrRequestsPerSecond = config.getDouble("performance.operationsPerSecond.cancelInvitesOrRequests") * rateMultiplier * instanceMultiplier
    val createAssetInvitesPerSecond = config.getDouble("performance.operationsPerSecond.createAssetInvites") * rateMultiplier * instanceMultiplier
    val createMembershipOrPartnershipInvitesPerSecond = config.getDouble("performance.operationsPerSecond.createMembershipOrPartnershipInvites") * rateMultiplier * instanceMultiplier
    val getInvitesPerSecond = config.getDouble("performance.operationsPerSecond.getInvites") * rateMultiplier * instanceMultiplier
    val respondBusinessAccessInvitesPerSecond = config.getDouble("performance.operationsPerSecond.respondBusinessAccessInvites") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val asset_access_requests/createPATHFeeder = csv(userDataDirectory + File.separator + "assetAccessRequestsCreate-pathParams.csv").random
    val cancel_invites_or_requestsPATHFeeder = csv(userDataDirectory + File.separator + "cancelInvitesOrRequests-pathParams.csv").random
    val create_asset_invitesPATHFeeder = csv(userDataDirectory + File.separator + "createAssetInvites-pathParams.csv").random
    val create_membership_or_partnership_invitesPATHFeeder = csv(userDataDirectory + File.separator + "createMembershipOrPartnershipInvites-pathParams.csv").random
    val get/invitesQUERYFeeder = csv(userDataDirectory + File.separator + "getInvites-queryParams.csv").random
    val get/invitesPATHFeeder = csv(userDataDirectory + File.separator + "getInvites-pathParams.csv").random

    // Setup all scenarios

    
    val scnassetAccessRequestsCreate = scenario("assetAccessRequestsCreateSimulation")
        .feed(asset_access_requests/createPATHFeeder)
        .exec(http("assetAccessRequestsCreate")
        .httpRequest("POST","/businesses/${business_id}/requests/assets/access")
)

    // Run scnassetAccessRequestsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnassetAccessRequestsCreate.inject(
        rampUsersPerSec(1) to(assetAccessRequestsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(assetAccessRequestsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(assetAccessRequestsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncancelInvitesOrRequests = scenario("cancelInvitesOrRequestsSimulation")
        .feed(cancel_invites_or_requestsPATHFeeder)
        .exec(http("cancelInvitesOrRequests")
        .httpRequest("DELETE","/businesses/${business_id}/invites")
)

    // Run scncancelInvitesOrRequests with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncancelInvitesOrRequests.inject(
        rampUsersPerSec(1) to(cancelInvitesOrRequestsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(cancelInvitesOrRequestsPerSecond) during(durationSeconds),
        rampUsersPerSec(cancelInvitesOrRequestsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateAssetInvites = scenario("createAssetInvitesSimulation")
        .feed(create_asset_invitesPATHFeeder)
        .exec(http("createAssetInvites")
        .httpRequest("POST","/businesses/${business_id}/invites/assets/access")
)

    // Run scncreateAssetInvites with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateAssetInvites.inject(
        rampUsersPerSec(1) to(createAssetInvitesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createAssetInvitesPerSecond) during(durationSeconds),
        rampUsersPerSec(createAssetInvitesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateMembershipOrPartnershipInvites = scenario("createMembershipOrPartnershipInvitesSimulation")
        .feed(create_membership_or_partnership_invitesPATHFeeder)
        .exec(http("createMembershipOrPartnershipInvites")
        .httpRequest("POST","/businesses/${business_id}/invites")
)

    // Run scncreateMembershipOrPartnershipInvites with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateMembershipOrPartnershipInvites.inject(
        rampUsersPerSec(1) to(createMembershipOrPartnershipInvitesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createMembershipOrPartnershipInvitesPerSecond) during(durationSeconds),
        rampUsersPerSec(createMembershipOrPartnershipInvitesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetInvites = scenario("getInvitesSimulation")
        .feed(get/invitesQUERYFeeder)
        .feed(get/invitesPATHFeeder)
        .exec(http("getInvites")
        .httpRequest("GET","/businesses/${business_id}/invites")
        .queryParam("is_member","${is_member}")
        .queryParam("invite_status","${invite_status}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("invite_type","${invite_type}")
)

    // Run scngetInvites with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetInvites.inject(
        rampUsersPerSec(1) to(getInvitesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getInvitesPerSecond) during(durationSeconds),
        rampUsersPerSec(getInvitesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnrespondBusinessAccessInvites = scenario("respondBusinessAccessInvitesSimulation")
        .exec(http("respondBusinessAccessInvites")
        .httpRequest("PATCH","/businesses/invites")
)

    // Run scnrespondBusinessAccessInvites with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnrespondBusinessAccessInvites.inject(
        rampUsersPerSec(1) to(respondBusinessAccessInvitesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(respondBusinessAccessInvitesPerSecond) during(durationSeconds),
        rampUsersPerSec(respondBusinessAccessInvitesPerSecond) to(1) during(rampDownSeconds)
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
