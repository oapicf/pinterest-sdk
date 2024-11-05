package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BillingApiSimulation extends Simulation {

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
    val adsCreditRedeemPerSecond = config.getDouble("performance.operationsPerSecond.adsCreditRedeem") * rateMultiplier * instanceMultiplier
    val adsCreditsDiscountsGetPerSecond = config.getDouble("performance.operationsPerSecond.adsCreditsDiscountsGet") * rateMultiplier * instanceMultiplier
    val billingProfilesGetPerSecond = config.getDouble("performance.operationsPerSecond.billingProfilesGet") * rateMultiplier * instanceMultiplier
    val ssioAccountsGetPerSecond = config.getDouble("performance.operationsPerSecond.ssioAccountsGet") * rateMultiplier * instanceMultiplier
    val ssioInsertionOrderCreatePerSecond = config.getDouble("performance.operationsPerSecond.ssioInsertionOrderCreate") * rateMultiplier * instanceMultiplier
    val ssioInsertionOrderEditPerSecond = config.getDouble("performance.operationsPerSecond.ssioInsertionOrderEdit") * rateMultiplier * instanceMultiplier
    val ssioInsertionOrdersStatusGetByAdAccountPerSecond = config.getDouble("performance.operationsPerSecond.ssioInsertionOrdersStatusGetByAdAccount") * rateMultiplier * instanceMultiplier
    val ssioInsertionOrdersStatusGetByPinOrderIdPerSecond = config.getDouble("performance.operationsPerSecond.ssioInsertionOrdersStatusGetByPinOrderId") * rateMultiplier * instanceMultiplier
    val ssioOrderLinesGetByAdAccountPerSecond = config.getDouble("performance.operationsPerSecond.ssioOrderLinesGetByAdAccount") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val ads_credit/redeemPATHFeeder = csv(userDataDirectory + File.separator + "adsCreditRedeem-pathParams.csv").random
    val ads_credits_discounts/getQUERYFeeder = csv(userDataDirectory + File.separator + "adsCreditsDiscountsGet-queryParams.csv").random
    val ads_credits_discounts/getPATHFeeder = csv(userDataDirectory + File.separator + "adsCreditsDiscountsGet-pathParams.csv").random
    val billing_profiles/getQUERYFeeder = csv(userDataDirectory + File.separator + "billingProfilesGet-queryParams.csv").random
    val billing_profiles/getPATHFeeder = csv(userDataDirectory + File.separator + "billingProfilesGet-pathParams.csv").random
    val ssio_accounts/getPATHFeeder = csv(userDataDirectory + File.separator + "ssioAccountsGet-pathParams.csv").random
    val ssio_insertion_order/createPATHFeeder = csv(userDataDirectory + File.separator + "ssioInsertionOrderCreate-pathParams.csv").random
    val ssio_insertion_order/editPATHFeeder = csv(userDataDirectory + File.separator + "ssioInsertionOrderEdit-pathParams.csv").random
    val ssio_insertion_orders_status/get_by_ad_accountQUERYFeeder = csv(userDataDirectory + File.separator + "ssioInsertionOrdersStatusGetByAdAccount-queryParams.csv").random
    val ssio_insertion_orders_status/get_by_ad_accountPATHFeeder = csv(userDataDirectory + File.separator + "ssioInsertionOrdersStatusGetByAdAccount-pathParams.csv").random
    val ssio_insertion_orders_status/get_by_pin_order_idPATHFeeder = csv(userDataDirectory + File.separator + "ssioInsertionOrdersStatusGetByPinOrderId-pathParams.csv").random
    val ssio_order_lines/get_by_ad_accountQUERYFeeder = csv(userDataDirectory + File.separator + "ssioOrderLinesGetByAdAccount-queryParams.csv").random
    val ssio_order_lines/get_by_ad_accountPATHFeeder = csv(userDataDirectory + File.separator + "ssioOrderLinesGetByAdAccount-pathParams.csv").random

    // Setup all scenarios

    
    val scnadsCreditRedeem = scenario("adsCreditRedeemSimulation")
        .feed(ads_credit/redeemPATHFeeder)
        .exec(http("adsCreditRedeem")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/ads_credit/redeem")
)

    // Run scnadsCreditRedeem with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsCreditRedeem.inject(
        rampUsersPerSec(1) to(adsCreditRedeemPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsCreditRedeemPerSecond) during(durationSeconds),
        rampUsersPerSec(adsCreditRedeemPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadsCreditsDiscountsGet = scenario("adsCreditsDiscountsGetSimulation")
        .feed(ads_credits_discounts/getQUERYFeeder)
        .feed(ads_credits_discounts/getPATHFeeder)
        .exec(http("adsCreditsDiscountsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ads_credit/discounts")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnadsCreditsDiscountsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadsCreditsDiscountsGet.inject(
        rampUsersPerSec(1) to(adsCreditsDiscountsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adsCreditsDiscountsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adsCreditsDiscountsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbillingProfilesGet = scenario("billingProfilesGetSimulation")
        .feed(billing_profiles/getQUERYFeeder)
        .feed(billing_profiles/getPATHFeeder)
        .exec(http("billingProfilesGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/billing_profiles")
        .queryParam("is_active","${is_active}")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnbillingProfilesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbillingProfilesGet.inject(
        rampUsersPerSec(1) to(billingProfilesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(billingProfilesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(billingProfilesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnssioAccountsGet = scenario("ssioAccountsGetSimulation")
        .feed(ssio_accounts/getPATHFeeder)
        .exec(http("ssioAccountsGet")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ssio/accounts")
)

    // Run scnssioAccountsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnssioAccountsGet.inject(
        rampUsersPerSec(1) to(ssioAccountsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(ssioAccountsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(ssioAccountsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnssioInsertionOrderCreate = scenario("ssioInsertionOrderCreateSimulation")
        .feed(ssio_insertion_order/createPATHFeeder)
        .exec(http("ssioInsertionOrderCreate")
        .httpRequest("POST","/ad_accounts/${ad_account_id}/ssio/insertion_orders")
)

    // Run scnssioInsertionOrderCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnssioInsertionOrderCreate.inject(
        rampUsersPerSec(1) to(ssioInsertionOrderCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(ssioInsertionOrderCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(ssioInsertionOrderCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnssioInsertionOrderEdit = scenario("ssioInsertionOrderEditSimulation")
        .feed(ssio_insertion_order/editPATHFeeder)
        .exec(http("ssioInsertionOrderEdit")
        .httpRequest("PATCH","/ad_accounts/${ad_account_id}/ssio/insertion_orders")
)

    // Run scnssioInsertionOrderEdit with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnssioInsertionOrderEdit.inject(
        rampUsersPerSec(1) to(ssioInsertionOrderEditPerSecond) during(rampUpSeconds),
        constantUsersPerSec(ssioInsertionOrderEditPerSecond) during(durationSeconds),
        rampUsersPerSec(ssioInsertionOrderEditPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnssioInsertionOrdersStatusGetByAdAccount = scenario("ssioInsertionOrdersStatusGetByAdAccountSimulation")
        .feed(ssio_insertion_orders_status/get_by_ad_accountQUERYFeeder)
        .feed(ssio_insertion_orders_status/get_by_ad_accountPATHFeeder)
        .exec(http("ssioInsertionOrdersStatusGetByAdAccount")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ssio/insertion_orders/status")
        .queryParam("page_size","${page_size}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnssioInsertionOrdersStatusGetByAdAccount with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnssioInsertionOrdersStatusGetByAdAccount.inject(
        rampUsersPerSec(1) to(ssioInsertionOrdersStatusGetByAdAccountPerSecond) during(rampUpSeconds),
        constantUsersPerSec(ssioInsertionOrdersStatusGetByAdAccountPerSecond) during(durationSeconds),
        rampUsersPerSec(ssioInsertionOrdersStatusGetByAdAccountPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnssioInsertionOrdersStatusGetByPinOrderId = scenario("ssioInsertionOrdersStatusGetByPinOrderIdSimulation")
        .feed(ssio_insertion_orders_status/get_by_pin_order_idPATHFeeder)
        .exec(http("ssioInsertionOrdersStatusGetByPinOrderId")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ssio/insertion_orders/${pin_order_id}/status")
)

    // Run scnssioInsertionOrdersStatusGetByPinOrderId with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnssioInsertionOrdersStatusGetByPinOrderId.inject(
        rampUsersPerSec(1) to(ssioInsertionOrdersStatusGetByPinOrderIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(ssioInsertionOrdersStatusGetByPinOrderIdPerSecond) during(durationSeconds),
        rampUsersPerSec(ssioInsertionOrdersStatusGetByPinOrderIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnssioOrderLinesGetByAdAccount = scenario("ssioOrderLinesGetByAdAccountSimulation")
        .feed(ssio_order_lines/get_by_ad_accountQUERYFeeder)
        .feed(ssio_order_lines/get_by_ad_accountPATHFeeder)
        .exec(http("ssioOrderLinesGetByAdAccount")
        .httpRequest("GET","/ad_accounts/${ad_account_id}/ssio/order_lines")
        .queryParam("page_size","${page_size}")
        .queryParam("pin_order_id","${pin_order_id}")
        .queryParam("bookmark","${bookmark}")
)

    // Run scnssioOrderLinesGetByAdAccount with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnssioOrderLinesGetByAdAccount.inject(
        rampUsersPerSec(1) to(ssioOrderLinesGetByAdAccountPerSecond) during(rampUpSeconds),
        constantUsersPerSec(ssioOrderLinesGetByAdAccountPerSecond) during(durationSeconds),
        rampUsersPerSec(ssioOrderLinesGetByAdAccountPerSecond) to(1) during(rampDownSeconds)
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
