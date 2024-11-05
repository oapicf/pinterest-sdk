package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BusinessAccessAssetsApiSimulation extends Simulation {

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
    val assetGroupCreatePerSecond = config.getDouble("performance.operationsPerSecond.assetGroupCreate") * rateMultiplier * instanceMultiplier
    val assetGroupDeletePerSecond = config.getDouble("performance.operationsPerSecond.assetGroupDelete") * rateMultiplier * instanceMultiplier
    val assetGroupUpdatePerSecond = config.getDouble("performance.operationsPerSecond.assetGroupUpdate") * rateMultiplier * instanceMultiplier
    val businessAssetMembersGetPerSecond = config.getDouble("performance.operationsPerSecond.businessAssetMembersGet") * rateMultiplier * instanceMultiplier
    val businessAssetPartnersGetPerSecond = config.getDouble("performance.operationsPerSecond.businessAssetPartnersGet") * rateMultiplier * instanceMultiplier
    val businessAssetsGetPerSecond = config.getDouble("performance.operationsPerSecond.businessAssetsGet") * rateMultiplier * instanceMultiplier
    val businessMemberAssetsGetPerSecond = config.getDouble("performance.operationsPerSecond.businessMemberAssetsGet") * rateMultiplier * instanceMultiplier
    val businessMembersAssetAccessDeletePerSecond = config.getDouble("performance.operationsPerSecond.businessMembersAssetAccessDelete") * rateMultiplier * instanceMultiplier
    val businessMembersAssetAccessUpdatePerSecond = config.getDouble("performance.operationsPerSecond.businessMembersAssetAccessUpdate") * rateMultiplier * instanceMultiplier
    val businessPartnerAssetAccessGetPerSecond = config.getDouble("performance.operationsPerSecond.businessPartnerAssetAccessGet") * rateMultiplier * instanceMultiplier
    val deletePartnerAssetAccessHandlerImplPerSecond = config.getDouble("performance.operationsPerSecond.deletePartnerAssetAccessHandlerImpl") * rateMultiplier * instanceMultiplier
    val updatePartnerAssetAccessHandlerImplPerSecond = config.getDouble("performance.operationsPerSecond.updatePartnerAssetAccessHandlerImpl") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val asset_group/createPATHFeeder = csv(userDataDirectory + File.separator + "assetGroupCreate-pathParams.csv").random
    val asset_group/deletePATHFeeder = csv(userDataDirectory + File.separator + "assetGroupDelete-pathParams.csv").random
    val asset_group/updatePATHFeeder = csv(userDataDirectory + File.separator + "assetGroupUpdate-pathParams.csv").random
    val business_asset_members/getQUERYFeeder = csv(userDataDirectory + File.separator + "businessAssetMembersGet-queryParams.csv").random
    val business_asset_members/getPATHFeeder = csv(userDataDirectory + File.separator + "businessAssetMembersGet-pathParams.csv").random
    val business_asset_partners/getQUERYFeeder = csv(userDataDirectory + File.separator + "businessAssetPartnersGet-queryParams.csv").random
    val business_asset_partners/getPATHFeeder = csv(userDataDirectory + File.separator + "businessAssetPartnersGet-pathParams.csv").random
    val business_assets/getQUERYFeeder = csv(userDataDirectory + File.separator + "businessAssetsGet-queryParams.csv").random
    val business_assets/getPATHFeeder = csv(userDataDirectory + File.separator + "businessAssetsGet-pathParams.csv").random
    val business_member_assets/getQUERYFeeder = csv(userDataDirectory + File.separator + "businessMemberAssetsGet-queryParams.csv").random
    val business_member_assets/getPATHFeeder = csv(userDataDirectory + File.separator + "businessMemberAssetsGet-pathParams.csv").random
    val business_members_asset_access/deletePATHFeeder = csv(userDataDirectory + File.separator + "businessMembersAssetAccessDelete-pathParams.csv").random
    val business_members_asset_access/updatePATHFeeder = csv(userDataDirectory + File.separator + "businessMembersAssetAccessUpdate-pathParams.csv").random
    val business_partner_asset_access/getQUERYFeeder = csv(userDataDirectory + File.separator + "businessPartnerAssetAccessGet-queryParams.csv").random
    val business_partner_asset_access/getPATHFeeder = csv(userDataDirectory + File.separator + "businessPartnerAssetAccessGet-pathParams.csv").random
    val delete_partner_asset_access_handler_implPATHFeeder = csv(userDataDirectory + File.separator + "deletePartnerAssetAccessHandlerImpl-pathParams.csv").random
    val update_partner_asset_access_handler_implPATHFeeder = csv(userDataDirectory + File.separator + "updatePartnerAssetAccessHandlerImpl-pathParams.csv").random

    // Setup all scenarios

    
    val scnassetGroupCreate = scenario("assetGroupCreateSimulation")
        .feed(asset_group/createPATHFeeder)
        .exec(http("assetGroupCreate")
        .httpRequest("POST","/businesses/${business_id}/asset_groups")
)

    // Run scnassetGroupCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnassetGroupCreate.inject(
        rampUsersPerSec(1) to(assetGroupCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(assetGroupCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(assetGroupCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnassetGroupDelete = scenario("assetGroupDeleteSimulation")
        .feed(asset_group/deletePATHFeeder)
        .exec(http("assetGroupDelete")
        .httpRequest("DELETE","/businesses/${business_id}/asset_groups")
)

    // Run scnassetGroupDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnassetGroupDelete.inject(
        rampUsersPerSec(1) to(assetGroupDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(assetGroupDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(assetGroupDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnassetGroupUpdate = scenario("assetGroupUpdateSimulation")
        .feed(asset_group/updatePATHFeeder)
        .exec(http("assetGroupUpdate")
        .httpRequest("PATCH","/businesses/${business_id}/asset_groups")
)

    // Run scnassetGroupUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnassetGroupUpdate.inject(
        rampUsersPerSec(1) to(assetGroupUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(assetGroupUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(assetGroupUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbusinessAssetMembersGet = scenario("businessAssetMembersGetSimulation")
        .feed(business_asset_members/getQUERYFeeder)
        .feed(business_asset_members/getPATHFeeder)
        .exec(http("businessAssetMembersGet")
        .httpRequest("GET","/businesses/${business_id}/assets/${asset_id}/members")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("start_index","${start_index}")
)

    // Run scnbusinessAssetMembersGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbusinessAssetMembersGet.inject(
        rampUsersPerSec(1) to(businessAssetMembersGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(businessAssetMembersGetPerSecond) during(durationSeconds),
        rampUsersPerSec(businessAssetMembersGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbusinessAssetPartnersGet = scenario("businessAssetPartnersGetSimulation")
        .feed(business_asset_partners/getQUERYFeeder)
        .feed(business_asset_partners/getPATHFeeder)
        .exec(http("businessAssetPartnersGet")
        .httpRequest("GET","/businesses/${business_id}/assets/${asset_id}/partners")
        .queryParam("page_size","${page_size}")
        .queryParam("start_index","${start_index}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnbusinessAssetPartnersGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbusinessAssetPartnersGet.inject(
        rampUsersPerSec(1) to(businessAssetPartnersGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(businessAssetPartnersGetPerSecond) during(durationSeconds),
        rampUsersPerSec(businessAssetPartnersGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbusinessAssetsGet = scenario("businessAssetsGetSimulation")
        .feed(business_assets/getQUERYFeeder)
        .feed(business_assets/getPATHFeeder)
        .exec(http("businessAssetsGet")
        .httpRequest("GET","/businesses/${business_id}/assets")
        .queryParam("asset_type","${asset_type}")
        .queryParam("asset_group_id","${asset_group_id}")
        .queryParam("child_asset_id","${child_asset_id}")
        .queryParam("page_size","${page_size}")
        .queryParam("permissions","${permissions}")
        .queryParam("start_index","${start_index}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnbusinessAssetsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbusinessAssetsGet.inject(
        rampUsersPerSec(1) to(businessAssetsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(businessAssetsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(businessAssetsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbusinessMemberAssetsGet = scenario("businessMemberAssetsGetSimulation")
        .feed(business_member_assets/getQUERYFeeder)
        .feed(business_member_assets/getPATHFeeder)
        .exec(http("businessMemberAssetsGet")
        .httpRequest("GET","/businesses/${business_id}/members/${member_id}/assets")
        .queryParam("asset_type","${asset_type}")
        .queryParam("page_size","${page_size}")
        .queryParam("start_index","${start_index}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnbusinessMemberAssetsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbusinessMemberAssetsGet.inject(
        rampUsersPerSec(1) to(businessMemberAssetsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(businessMemberAssetsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(businessMemberAssetsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbusinessMembersAssetAccessDelete = scenario("businessMembersAssetAccessDeleteSimulation")
        .feed(business_members_asset_access/deletePATHFeeder)
        .exec(http("businessMembersAssetAccessDelete")
        .httpRequest("DELETE","/businesses/${business_id}/members/assets/access")
)

    // Run scnbusinessMembersAssetAccessDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbusinessMembersAssetAccessDelete.inject(
        rampUsersPerSec(1) to(businessMembersAssetAccessDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(businessMembersAssetAccessDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(businessMembersAssetAccessDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbusinessMembersAssetAccessUpdate = scenario("businessMembersAssetAccessUpdateSimulation")
        .feed(business_members_asset_access/updatePATHFeeder)
        .exec(http("businessMembersAssetAccessUpdate")
        .httpRequest("PATCH","/businesses/${business_id}/members/assets/access")
)

    // Run scnbusinessMembersAssetAccessUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbusinessMembersAssetAccessUpdate.inject(
        rampUsersPerSec(1) to(businessMembersAssetAccessUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(businessMembersAssetAccessUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(businessMembersAssetAccessUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbusinessPartnerAssetAccessGet = scenario("businessPartnerAssetAccessGetSimulation")
        .feed(business_partner_asset_access/getQUERYFeeder)
        .feed(business_partner_asset_access/getPATHFeeder)
        .exec(http("businessPartnerAssetAccessGet")
        .httpRequest("GET","/businesses/${business_id}/partners/${partner_id}/assets")
        .queryParam("partner_type","${partner_type}")
        .queryParam("asset_type","${asset_type}")
        .queryParam("page_size","${page_size}")
        .queryParam("start_index","${start_index}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnbusinessPartnerAssetAccessGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbusinessPartnerAssetAccessGet.inject(
        rampUsersPerSec(1) to(businessPartnerAssetAccessGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(businessPartnerAssetAccessGetPerSecond) during(durationSeconds),
        rampUsersPerSec(businessPartnerAssetAccessGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeletePartnerAssetAccessHandlerImpl = scenario("deletePartnerAssetAccessHandlerImplSimulation")
        .feed(delete_partner_asset_access_handler_implPATHFeeder)
        .exec(http("deletePartnerAssetAccessHandlerImpl")
        .httpRequest("DELETE","/businesses/${business_id}/partners/assets")
)

    // Run scndeletePartnerAssetAccessHandlerImpl with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeletePartnerAssetAccessHandlerImpl.inject(
        rampUsersPerSec(1) to(deletePartnerAssetAccessHandlerImplPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deletePartnerAssetAccessHandlerImplPerSecond) during(durationSeconds),
        rampUsersPerSec(deletePartnerAssetAccessHandlerImplPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdatePartnerAssetAccessHandlerImpl = scenario("updatePartnerAssetAccessHandlerImplSimulation")
        .feed(update_partner_asset_access_handler_implPATHFeeder)
        .exec(http("updatePartnerAssetAccessHandlerImpl")
        .httpRequest("PATCH","/businesses/${business_id}/partners/assets")
)

    // Run scnupdatePartnerAssetAccessHandlerImpl with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdatePartnerAssetAccessHandlerImpl.inject(
        rampUsersPerSec(1) to(updatePartnerAssetAccessHandlerImplPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updatePartnerAssetAccessHandlerImplPerSecond) during(durationSeconds),
        rampUsersPerSec(updatePartnerAssetAccessHandlerImplPerSecond) to(1) during(rampDownSeconds)
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
