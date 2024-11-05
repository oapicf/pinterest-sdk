package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class AudienceSharingApiSimulation extends Simulation {

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
    val adAccountsAudiencesSharedAccountsListPerSecond = config.getDouble("performance.operationsPerSecond.adAccountsAudiencesSharedAccountsList") * rateMultiplier * instanceMultiplier
    val businessAccountAudiencesSharedAccountsListPerSecond = config.getDouble("performance.operationsPerSecond.businessAccountAudiencesSharedAccountsList") * rateMultiplier * instanceMultiplier
    val sharedAudiencesForBusinessListPerSecond = config.getDouble("performance.operationsPerSecond.sharedAudiencesForBusinessList") * rateMultiplier * instanceMultiplier
    val updateAdAccountToAdAccountSharedAudiencePerSecond = config.getDouble("performance.operationsPerSecond.updateAdAccountToAdAccountSharedAudience") * rateMultiplier * instanceMultiplier
    val updateAdAccountToBusinessSharedAudiencePerSecond = config.getDouble("performance.operationsPerSecond.updateAdAccountToBusinessSharedAudience") * rateMultiplier * instanceMultiplier
    val updateBusinessToAdAccountSharedAudiencePerSecond = config.getDouble("performance.operationsPerSecond.updateBusinessToAdAccountSharedAudience") * rateMultiplier * instanceMultiplier
    val updateBusinessToBusinessSharedAudiencePerSecond = config.getDouble("performance.operationsPerSecond.updateBusinessToBusinessSharedAudience") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val ad_accounts_audiences_shared_accounts/listQUERYFeeder = csv(userDataDirectory + File.separator + "adAccountsAudiencesSharedAccountsList-queryParams.csv").random
    val ad_accounts_audiences_shared_accounts/listPATHFeeder = csv(userDataDirectory + File.separator + "adAccountsAudiencesSharedAccountsList-pathParams.csv").random
    val business_account_audiences_shared_accounts/listQUERYFeeder = csv(userDataDirectory + File.separator + "businessAccountAudiencesSharedAccountsList-queryParams.csv").random
    val business_account_audiences_shared_accounts/listPATHFeeder = csv(userDataDirectory + File.separator + "businessAccountAudiencesSharedAccountsList-pathParams.csv").random
    val shared_audiences_for_business/listQUERYFeeder = csv(userDataDirectory + File.separator + "sharedAudiencesForBusinessList-queryParams.csv").random
    val shared_audiences_for_business/listPATHFeeder = csv(userDataDirectory + File.separator + "sharedAudiencesForBusinessList-pathParams.csv").random
    val update_ad_account_to_ad_account_shared_audiencePATHFeeder = csv(userDataDirectory + File.separator + "updateAdAccountToAdAccountSharedAudience-pathParams.csv").random
    val update_ad_account_to_business_shared_audiencePATHFeeder = csv(userDataDirectory + File.separator + "updateAdAccountToBusinessSharedAudience-pathParams.csv").random
    val update_business_to_ad_account_shared_audiencePATHFeeder = csv(userDataDirectory + File.separator + "updateBusinessToAdAccountSharedAudience-pathParams.csv").random
    val update_business_to_business_shared_audiencePATHFeeder = csv(userDataDirectory + File.separator + "updateBusinessToBusinessSharedAudience-pathParams.csv").random

    // Setup all scenarios

    
    val scnadAccountsAudiencesSharedAccountsList = scenario("adAccountsAudiencesSharedAccountsListSimulation")
        .feed(ad_accounts_audiences_shared_accounts/listQUERYFeeder)
        .feed(ad_accounts_audiences_shared_accounts/listPATHFeeder)
        .exec(http("adAccountsAudiencesSharedAccountsList")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/audiences/shared/accounts")
        .queryParam("account_type","${account_type}")
        .queryParam("page_size","${page_size}")
        .queryParam("audience_id","${audience_id}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnadAccountsAudiencesSharedAccountsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadAccountsAudiencesSharedAccountsList.inject(
        rampUsersPerSec(1) to(adAccountsAudiencesSharedAccountsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adAccountsAudiencesSharedAccountsListPerSecond) during(durationSeconds),
        rampUsersPerSec(adAccountsAudiencesSharedAccountsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbusinessAccountAudiencesSharedAccountsList = scenario("businessAccountAudiencesSharedAccountsListSimulation")
        .feed(business_account_audiences_shared_accounts/listQUERYFeeder)
        .feed(business_account_audiences_shared_accounts/listPATHFeeder)
        .exec(http("businessAccountAudiencesSharedAccountsList")
        .httpRequest("GET","/businesses/${business_id}/audiences/shared/accounts")
        .queryParam("account_type","${account_type}")
        .queryParam("page_size","${page_size}")
        .queryParam("audience_id","${audience_id}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnbusinessAccountAudiencesSharedAccountsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbusinessAccountAudiencesSharedAccountsList.inject(
        rampUsersPerSec(1) to(businessAccountAudiencesSharedAccountsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(businessAccountAudiencesSharedAccountsListPerSecond) during(durationSeconds),
        rampUsersPerSec(businessAccountAudiencesSharedAccountsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsharedAudiencesForBusinessList = scenario("sharedAudiencesForBusinessListSimulation")
        .feed(shared_audiences_for_business/listQUERYFeeder)
        .feed(shared_audiences_for_business/listPATHFeeder)
        .exec(http("sharedAudiencesForBusinessList")
        .httpRequest("GET","/businesses/${business_id}/audiences")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("order","${order}")
)

    // Run scnsharedAudiencesForBusinessList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsharedAudiencesForBusinessList.inject(
        rampUsersPerSec(1) to(sharedAudiencesForBusinessListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(sharedAudiencesForBusinessListPerSecond) during(durationSeconds),
        rampUsersPerSec(sharedAudiencesForBusinessListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateAdAccountToAdAccountSharedAudience = scenario("updateAdAccountToAdAccountSharedAudienceSimulation")
        .feed(update_ad_account_to_ad_account_shared_audiencePATHFeeder)
        .exec(http("updateAdAccountToAdAccountSharedAudience")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/audiences/ad_accounts/shared")
)

    // Run scnupdateAdAccountToAdAccountSharedAudience with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateAdAccountToAdAccountSharedAudience.inject(
        rampUsersPerSec(1) to(updateAdAccountToAdAccountSharedAudiencePerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateAdAccountToAdAccountSharedAudiencePerSecond) during(durationSeconds),
        rampUsersPerSec(updateAdAccountToAdAccountSharedAudiencePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateAdAccountToBusinessSharedAudience = scenario("updateAdAccountToBusinessSharedAudienceSimulation")
        .feed(update_ad_account_to_business_shared_audiencePATHFeeder)
        .exec(http("updateAdAccountToBusinessSharedAudience")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/audiences/businesses/shared")
)

    // Run scnupdateAdAccountToBusinessSharedAudience with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateAdAccountToBusinessSharedAudience.inject(
        rampUsersPerSec(1) to(updateAdAccountToBusinessSharedAudiencePerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateAdAccountToBusinessSharedAudiencePerSecond) during(durationSeconds),
        rampUsersPerSec(updateAdAccountToBusinessSharedAudiencePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateBusinessToAdAccountSharedAudience = scenario("updateBusinessToAdAccountSharedAudienceSimulation")
        .feed(update_business_to_ad_account_shared_audiencePATHFeeder)
        .exec(http("updateBusinessToAdAccountSharedAudience")
        .httpRequest("PATCH","/businesses/${business_id}/audiences/ad_accounts/shared")
)

    // Run scnupdateBusinessToAdAccountSharedAudience with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateBusinessToAdAccountSharedAudience.inject(
        rampUsersPerSec(1) to(updateBusinessToAdAccountSharedAudiencePerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateBusinessToAdAccountSharedAudiencePerSecond) during(durationSeconds),
        rampUsersPerSec(updateBusinessToAdAccountSharedAudiencePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateBusinessToBusinessSharedAudience = scenario("updateBusinessToBusinessSharedAudienceSimulation")
        .feed(update_business_to_business_shared_audiencePATHFeeder)
        .exec(http("updateBusinessToBusinessSharedAudience")
        .httpRequest("PATCH","/businesses/${business_id}/audiences/businesses/shared")
)

    // Run scnupdateBusinessToBusinessSharedAudience with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateBusinessToBusinessSharedAudience.inject(
        rampUsersPerSec(1) to(updateBusinessToBusinessSharedAudiencePerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateBusinessToBusinessSharedAudiencePerSecond) during(durationSeconds),
        rampUsersPerSec(updateBusinessToBusinessSharedAudiencePerSecond) to(1) during(rampDownSeconds)
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
