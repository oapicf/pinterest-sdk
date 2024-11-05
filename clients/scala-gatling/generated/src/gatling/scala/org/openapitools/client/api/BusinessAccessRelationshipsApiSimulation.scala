package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BusinessAccessRelationshipsApiSimulation extends Simulation {

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
    val deleteBusinessMembershipPerSecond = config.getDouble("performance.operationsPerSecond.deleteBusinessMembership") * rateMultiplier * instanceMultiplier
    val deleteBusinessPartnersPerSecond = config.getDouble("performance.operationsPerSecond.deleteBusinessPartners") * rateMultiplier * instanceMultiplier
    val getBusinessEmployersPerSecond = config.getDouble("performance.operationsPerSecond.getBusinessEmployers") * rateMultiplier * instanceMultiplier
    val getBusinessMembersPerSecond = config.getDouble("performance.operationsPerSecond.getBusinessMembers") * rateMultiplier * instanceMultiplier
    val getBusinessPartnersPerSecond = config.getDouble("performance.operationsPerSecond.getBusinessPartners") * rateMultiplier * instanceMultiplier
    val updateBusinessMembershipsPerSecond = config.getDouble("performance.operationsPerSecond.updateBusinessMemberships") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val delete_business_membershipPATHFeeder = csv(userDataDirectory + File.separator + "deleteBusinessMembership-pathParams.csv").random
    val delete_business_partnersPATHFeeder = csv(userDataDirectory + File.separator + "deleteBusinessPartners-pathParams.csv").random
    val get/business_employersQUERYFeeder = csv(userDataDirectory + File.separator + "getBusinessEmployers-queryParams.csv").random
    val get/business_membersQUERYFeeder = csv(userDataDirectory + File.separator + "getBusinessMembers-queryParams.csv").random
    val get/business_membersPATHFeeder = csv(userDataDirectory + File.separator + "getBusinessMembers-pathParams.csv").random
    val get/business_partnersQUERYFeeder = csv(userDataDirectory + File.separator + "getBusinessPartners-queryParams.csv").random
    val get/business_partnersPATHFeeder = csv(userDataDirectory + File.separator + "getBusinessPartners-pathParams.csv").random
    val update/business_membershipsPATHFeeder = csv(userDataDirectory + File.separator + "updateBusinessMemberships-pathParams.csv").random

    // Setup all scenarios

    
    val scndeleteBusinessMembership = scenario("deleteBusinessMembershipSimulation")
        .feed(delete_business_membershipPATHFeeder)
        .exec(http("deleteBusinessMembership")
        .httpRequest("DELETE","/businesses/${business_id}/members")
)

    // Run scndeleteBusinessMembership with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteBusinessMembership.inject(
        rampUsersPerSec(1) to(deleteBusinessMembershipPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteBusinessMembershipPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteBusinessMembershipPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteBusinessPartners = scenario("deleteBusinessPartnersSimulation")
        .feed(delete_business_partnersPATHFeeder)
        .exec(http("deleteBusinessPartners")
        .httpRequest("DELETE","/businesses/${business_id}/partners")
)

    // Run scndeleteBusinessPartners with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteBusinessPartners.inject(
        rampUsersPerSec(1) to(deleteBusinessPartnersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteBusinessPartnersPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteBusinessPartnersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBusinessEmployers = scenario("getBusinessEmployersSimulation")
        .feed(get/business_employersQUERYFeeder)
        .exec(http("getBusinessEmployers")
        .httpRequest("GET","/businesses/employers")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scngetBusinessEmployers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBusinessEmployers.inject(
        rampUsersPerSec(1) to(getBusinessEmployersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBusinessEmployersPerSecond) during(durationSeconds),
        rampUsersPerSec(getBusinessEmployersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBusinessMembers = scenario("getBusinessMembersSimulation")
        .feed(get/business_membersQUERYFeeder)
        .feed(get/business_membersPATHFeeder)
        .exec(http("getBusinessMembers")
        .httpRequest("GET","/businesses/${business_id}/members")
        .queryParam("assets_summary","${assets_summary}")
        .queryParam("member_ids","${member_ids}")
        .queryParam("page_size","${page_size}")
        .queryParam("business_roles","${business_roles}")
        .queryParam("start_index","${start_index}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scngetBusinessMembers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBusinessMembers.inject(
        rampUsersPerSec(1) to(getBusinessMembersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBusinessMembersPerSecond) during(durationSeconds),
        rampUsersPerSec(getBusinessMembersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBusinessPartners = scenario("getBusinessPartnersSimulation")
        .feed(get/business_partnersQUERYFeeder)
        .feed(get/business_partnersPATHFeeder)
        .exec(http("getBusinessPartners")
        .httpRequest("GET","/businesses/${business_id}/partners")
        .queryParam("assets_summary","${assets_summary}")
        .queryParam("partner_ids","${partner_ids}")
        .queryParam("page_size","${page_size}")
        .queryParam("partner_type","${partner_type}")
        .queryParam("start_index","${start_index}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scngetBusinessPartners with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBusinessPartners.inject(
        rampUsersPerSec(1) to(getBusinessPartnersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBusinessPartnersPerSecond) during(durationSeconds),
        rampUsersPerSec(getBusinessPartnersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateBusinessMemberships = scenario("updateBusinessMembershipsSimulation")
        .feed(update/business_membershipsPATHFeeder)
        .exec(http("updateBusinessMemberships")
        .httpRequest("PATCH","/businesses/${business_id}/members")
)

    // Run scnupdateBusinessMemberships with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateBusinessMemberships.inject(
        rampUsersPerSec(1) to(updateBusinessMembershipsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateBusinessMembershipsPerSecond) during(durationSeconds),
        rampUsersPerSec(updateBusinessMembershipsPerSecond) to(1) during(rampDownSeconds)
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
