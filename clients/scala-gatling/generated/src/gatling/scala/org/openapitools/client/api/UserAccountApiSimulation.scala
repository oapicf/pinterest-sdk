package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class UserAccountApiSimulation extends Simulation {

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
    val boardsUserFollowsListPerSecond = config.getDouble("performance.operationsPerSecond.boardsUserFollowsList") * rateMultiplier * instanceMultiplier
    val followUserUpdatePerSecond = config.getDouble("performance.operationsPerSecond.followUserUpdate") * rateMultiplier * instanceMultiplier
    val followersListPerSecond = config.getDouble("performance.operationsPerSecond.followersList") * rateMultiplier * instanceMultiplier
    val linkedBusinessAccountsGetPerSecond = config.getDouble("performance.operationsPerSecond.linkedBusinessAccountsGet") * rateMultiplier * instanceMultiplier
    val unverifyWebsiteDeletePerSecond = config.getDouble("performance.operationsPerSecond.unverifyWebsiteDelete") * rateMultiplier * instanceMultiplier
    val userAccountAnalyticsPerSecond = config.getDouble("performance.operationsPerSecond.userAccountAnalytics") * rateMultiplier * instanceMultiplier
    val userAccountAnalyticsTopPinsPerSecond = config.getDouble("performance.operationsPerSecond.userAccountAnalyticsTopPins") * rateMultiplier * instanceMultiplier
    val userAccountAnalyticsTopVideoPinsPerSecond = config.getDouble("performance.operationsPerSecond.userAccountAnalyticsTopVideoPins") * rateMultiplier * instanceMultiplier
    val userAccountFollowedInterestsPerSecond = config.getDouble("performance.operationsPerSecond.userAccountFollowedInterests") * rateMultiplier * instanceMultiplier
    val userAccountGetPerSecond = config.getDouble("performance.operationsPerSecond.userAccountGet") * rateMultiplier * instanceMultiplier
    val userFollowingGetPerSecond = config.getDouble("performance.operationsPerSecond.userFollowingGet") * rateMultiplier * instanceMultiplier
    val userWebsitesGetPerSecond = config.getDouble("performance.operationsPerSecond.userWebsitesGet") * rateMultiplier * instanceMultiplier
    val verifyWebsiteUpdatePerSecond = config.getDouble("performance.operationsPerSecond.verifyWebsiteUpdate") * rateMultiplier * instanceMultiplier
    val websiteVerificationGetPerSecond = config.getDouble("performance.operationsPerSecond.websiteVerificationGet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val boards_user_follows/listQUERYFeeder = csv(userDataDirectory + File.separator + "boardsUserFollowsList-queryParams.csv").random
    val follow_user/updatePATHFeeder = csv(userDataDirectory + File.separator + "followUserUpdate-pathParams.csv").random
    val followers/listQUERYFeeder = csv(userDataDirectory + File.separator + "followersList-queryParams.csv").random
    val unverify_website/deleteQUERYFeeder = csv(userDataDirectory + File.separator + "unverifyWebsiteDelete-queryParams.csv").random
    val user_account/analyticsQUERYFeeder = csv(userDataDirectory + File.separator + "userAccountAnalytics-queryParams.csv").random
    val user_account/analytics/top_pinsQUERYFeeder = csv(userDataDirectory + File.separator + "userAccountAnalyticsTopPins-queryParams.csv").random
    val user_account/analytics/top_video_pinsQUERYFeeder = csv(userDataDirectory + File.separator + "userAccountAnalyticsTopVideoPins-queryParams.csv").random
    val user_account/followed_interestsQUERYFeeder = csv(userDataDirectory + File.separator + "userAccountFollowedInterests-queryParams.csv").random
    val user_account/followed_interestsPATHFeeder = csv(userDataDirectory + File.separator + "userAccountFollowedInterests-pathParams.csv").random
    val user_account/getQUERYFeeder = csv(userDataDirectory + File.separator + "userAccountGet-queryParams.csv").random
    val user_following/getQUERYFeeder = csv(userDataDirectory + File.separator + "userFollowingGet-queryParams.csv").random
    val user_websites/getQUERYFeeder = csv(userDataDirectory + File.separator + "userWebsitesGet-queryParams.csv").random

    // Setup all scenarios

    
    val scnboardsUserFollowsList = scenario("boardsUserFollowsListSimulation")
        .feed(boards_user_follows/listQUERYFeeder)
        .exec(http("boardsUserFollowsList")
        .httpRequest("GET","/user_account/following/boards")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("explicit_following","${explicit_following}")
        .queryParam("page_size","${page_size}")
)

    // Run scnboardsUserFollowsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardsUserFollowsList.inject(
        rampUsersPerSec(1) to(boardsUserFollowsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardsUserFollowsListPerSecond) during(durationSeconds),
        rampUsersPerSec(boardsUserFollowsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfollowUserUpdate = scenario("followUserUpdateSimulation")
        .feed(follow_user/updatePATHFeeder)
        .exec(http("followUserUpdate")
        .httpRequest("POST","/user_account/following/${username}")
)

    // Run scnfollowUserUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfollowUserUpdate.inject(
        rampUsersPerSec(1) to(followUserUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(followUserUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(followUserUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfollowersList = scenario("followersListSimulation")
        .feed(followers/listQUERYFeeder)
        .exec(http("followersList")
        .httpRequest("GET","/user_account/followers")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnfollowersList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfollowersList.inject(
        rampUsersPerSec(1) to(followersListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(followersListPerSecond) during(durationSeconds),
        rampUsersPerSec(followersListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlinkedBusinessAccountsGet = scenario("linkedBusinessAccountsGetSimulation")
        .exec(http("linkedBusinessAccountsGet")
        .httpRequest("GET","/user_account/businesses")
)

    // Run scnlinkedBusinessAccountsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlinkedBusinessAccountsGet.inject(
        rampUsersPerSec(1) to(linkedBusinessAccountsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(linkedBusinessAccountsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(linkedBusinessAccountsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnunverifyWebsiteDelete = scenario("unverifyWebsiteDeleteSimulation")
        .feed(unverify_website/deleteQUERYFeeder)
        .exec(http("unverifyWebsiteDelete")
        .httpRequest("DELETE","/user_account/websites")
        .queryParam("website","${website}")
)

    // Run scnunverifyWebsiteDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnunverifyWebsiteDelete.inject(
        rampUsersPerSec(1) to(unverifyWebsiteDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(unverifyWebsiteDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(unverifyWebsiteDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuserAccountAnalytics = scenario("userAccountAnalyticsSimulation")
        .feed(user_account/analyticsQUERYFeeder)
        .exec(http("userAccountAnalytics")
        .httpRequest("GET","/user_account/analytics")
        .queryParam("metric_types","${metric_types}")
        .queryParam("app_types","${app_types}")
        .queryParam("content_type","${content_type}")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("pin_format","${pin_format}")
        .queryParam("source","${source}")
        .queryParam("start_date","${start_date}")
        .queryParam("end_date","${end_date}")
        .queryParam("from_claimed_content","${from_claimed_content}")
        .queryParam("split_field","${split_field}")
)

    // Run scnuserAccountAnalytics with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserAccountAnalytics.inject(
        rampUsersPerSec(1) to(userAccountAnalyticsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userAccountAnalyticsPerSecond) during(durationSeconds),
        rampUsersPerSec(userAccountAnalyticsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuserAccountAnalyticsTopPins = scenario("userAccountAnalyticsTopPinsSimulation")
        .feed(user_account/analytics/top_pinsQUERYFeeder)
        .exec(http("userAccountAnalyticsTopPins")
        .httpRequest("GET","/user_account/analytics/top_pins")
        .queryParam("metric_types","${metric_types}")
        .queryParam("app_types","${app_types}")
        .queryParam("content_type","${content_type}")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("created_in_last_n_days","${created_in_last_n_days}")
        .queryParam("num_of_pins","${num_of_pins}")
        .queryParam("sort_by","${sort_by}")
        .queryParam("pin_format","${pin_format}")
        .queryParam("source","${source}")
        .queryParam("start_date","${start_date}")
        .queryParam("end_date","${end_date}")
        .queryParam("from_claimed_content","${from_claimed_content}")
)

    // Run scnuserAccountAnalyticsTopPins with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserAccountAnalyticsTopPins.inject(
        rampUsersPerSec(1) to(userAccountAnalyticsTopPinsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userAccountAnalyticsTopPinsPerSecond) during(durationSeconds),
        rampUsersPerSec(userAccountAnalyticsTopPinsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuserAccountAnalyticsTopVideoPins = scenario("userAccountAnalyticsTopVideoPinsSimulation")
        .feed(user_account/analytics/top_video_pinsQUERYFeeder)
        .exec(http("userAccountAnalyticsTopVideoPins")
        .httpRequest("GET","/user_account/analytics/top_video_pins")
        .queryParam("app_types","${app_types}")
        .queryParam("content_type","${content_type}")
        .queryParam("metric_types","${metric_types}")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("created_in_last_n_days","${created_in_last_n_days}")
        .queryParam("sort_by","${sort_by}")
        .queryParam("num_of_pins","${num_of_pins}")
        .queryParam("pin_format","${pin_format}")
        .queryParam("source","${source}")
        .queryParam("start_date","${start_date}")
        .queryParam("end_date","${end_date}")
        .queryParam("from_claimed_content","${from_claimed_content}")
)

    // Run scnuserAccountAnalyticsTopVideoPins with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserAccountAnalyticsTopVideoPins.inject(
        rampUsersPerSec(1) to(userAccountAnalyticsTopVideoPinsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userAccountAnalyticsTopVideoPinsPerSecond) during(durationSeconds),
        rampUsersPerSec(userAccountAnalyticsTopVideoPinsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuserAccountFollowedInterests = scenario("userAccountFollowedInterestsSimulation")
        .feed(user_account/followed_interestsQUERYFeeder)
        .feed(user_account/followed_interestsPATHFeeder)
        .exec(http("userAccountFollowedInterests")
        .httpRequest("GET","/users/${username}/interests/follow")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnuserAccountFollowedInterests with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserAccountFollowedInterests.inject(
        rampUsersPerSec(1) to(userAccountFollowedInterestsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userAccountFollowedInterestsPerSecond) during(durationSeconds),
        rampUsersPerSec(userAccountFollowedInterestsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuserAccountGet = scenario("userAccountGetSimulation")
        .feed(user_account/getQUERYFeeder)
        .exec(http("userAccountGet")
        .httpRequest("GET","/user_account")
        .queryParam("ad_account_id","${ad_account_id}")
)

    // Run scnuserAccountGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserAccountGet.inject(
        rampUsersPerSec(1) to(userAccountGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userAccountGetPerSecond) during(durationSeconds),
        rampUsersPerSec(userAccountGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuserFollowingGet = scenario("userFollowingGetSimulation")
        .feed(user_following/getQUERYFeeder)
        .exec(http("userFollowingGet")
        .httpRequest("GET","/user_account/following")
        .queryParam("ad_account_id","${ad_account_id}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("explicit_following","${explicit_following}")
        .queryParam("feed_type","${feed_type}")
        .queryParam("page_size","${page_size}")
)

    // Run scnuserFollowingGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserFollowingGet.inject(
        rampUsersPerSec(1) to(userFollowingGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userFollowingGetPerSecond) during(durationSeconds),
        rampUsersPerSec(userFollowingGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuserWebsitesGet = scenario("userWebsitesGetSimulation")
        .feed(user_websites/getQUERYFeeder)
        .exec(http("userWebsitesGet")
        .httpRequest("GET","/user_account/websites")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnuserWebsitesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuserWebsitesGet.inject(
        rampUsersPerSec(1) to(userWebsitesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(userWebsitesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(userWebsitesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnverifyWebsiteUpdate = scenario("verifyWebsiteUpdateSimulation")
        .exec(http("verifyWebsiteUpdate")
        .httpRequest("POST","/user_account/websites")
)

    // Run scnverifyWebsiteUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnverifyWebsiteUpdate.inject(
        rampUsersPerSec(1) to(verifyWebsiteUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(verifyWebsiteUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(verifyWebsiteUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnwebsiteVerificationGet = scenario("websiteVerificationGetSimulation")
        .exec(http("websiteVerificationGet")
        .httpRequest("GET","/user_account/websites/verification")
)

    // Run scnwebsiteVerificationGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnwebsiteVerificationGet.inject(
        rampUsersPerSec(1) to(websiteVerificationGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(websiteVerificationGetPerSecond) during(durationSeconds),
        rampUsersPerSec(websiteVerificationGetPerSecond) to(1) during(rampDownSeconds)
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
