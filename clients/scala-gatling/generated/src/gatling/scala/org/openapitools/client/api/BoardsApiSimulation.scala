package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BoardsApiSimulation extends Simulation {

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
    val boardSectionsCreatePerSecond = config.getDouble("performance.operationsPerSecond.boardSectionsCreate") * rateMultiplier * instanceMultiplier
    val boardSectionsDeletePerSecond = config.getDouble("performance.operationsPerSecond.boardSectionsDelete") * rateMultiplier * instanceMultiplier
    val boardSectionsListPerSecond = config.getDouble("performance.operationsPerSecond.boardSectionsList") * rateMultiplier * instanceMultiplier
    val boardSectionsListPinsPerSecond = config.getDouble("performance.operationsPerSecond.boardSectionsListPins") * rateMultiplier * instanceMultiplier
    val boardSectionsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.boardSectionsUpdate") * rateMultiplier * instanceMultiplier
    val boardsCreatePerSecond = config.getDouble("performance.operationsPerSecond.boardsCreate") * rateMultiplier * instanceMultiplier
    val boardsDeletePerSecond = config.getDouble("performance.operationsPerSecond.boardsDelete") * rateMultiplier * instanceMultiplier
    val boardsGetPerSecond = config.getDouble("performance.operationsPerSecond.boardsGet") * rateMultiplier * instanceMultiplier
    val boardsListPerSecond = config.getDouble("performance.operationsPerSecond.boardsList") * rateMultiplier * instanceMultiplier
    val boardsListPinsPerSecond = config.getDouble("performance.operationsPerSecond.boardsListPins") * rateMultiplier * instanceMultiplier
    val boardsUpdatePerSecond = config.getDouble("performance.operationsPerSecond.boardsUpdate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val board_sections/createPATHFeeder = csv(userDataDirectory + File.separator + "boardSectionsCreate-pathParams.csv").random
    val board_sections/deletePATHFeeder = csv(userDataDirectory + File.separator + "boardSectionsDelete-pathParams.csv").random
    val board_sections/listQUERYFeeder = csv(userDataDirectory + File.separator + "boardSectionsList-queryParams.csv").random
    val board_sections/listPATHFeeder = csv(userDataDirectory + File.separator + "boardSectionsList-pathParams.csv").random
    val board_sections/list_pinsQUERYFeeder = csv(userDataDirectory + File.separator + "boardSectionsListPins-queryParams.csv").random
    val board_sections/list_pinsPATHFeeder = csv(userDataDirectory + File.separator + "boardSectionsListPins-pathParams.csv").random
    val board_sections/updatePATHFeeder = csv(userDataDirectory + File.separator + "boardSectionsUpdate-pathParams.csv").random
    val boards/deletePATHFeeder = csv(userDataDirectory + File.separator + "boardsDelete-pathParams.csv").random
    val boards/getPATHFeeder = csv(userDataDirectory + File.separator + "boardsGet-pathParams.csv").random
    val boards/listQUERYFeeder = csv(userDataDirectory + File.separator + "boardsList-queryParams.csv").random
    val boards/list_pinsQUERYFeeder = csv(userDataDirectory + File.separator + "boardsListPins-queryParams.csv").random
    val boards/list_pinsPATHFeeder = csv(userDataDirectory + File.separator + "boardsListPins-pathParams.csv").random
    val boards/updatePATHFeeder = csv(userDataDirectory + File.separator + "boardsUpdate-pathParams.csv").random

    // Setup all scenarios

    
    val scnboardSectionsCreate = scenario("boardSectionsCreateSimulation")
        .feed(board_sections/createPATHFeeder)
        .exec(http("boardSectionsCreate")
        .httpRequest("POST","/boards/${board_id}/sections")
)

    // Run scnboardSectionsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardSectionsCreate.inject(
        rampUsersPerSec(1) to(boardSectionsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardSectionsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(boardSectionsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardSectionsDelete = scenario("boardSectionsDeleteSimulation")
        .feed(board_sections/deletePATHFeeder)
        .exec(http("boardSectionsDelete")
        .httpRequest("DELETE","/boards/${board_id}/sections/${section_id}")
)

    // Run scnboardSectionsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardSectionsDelete.inject(
        rampUsersPerSec(1) to(boardSectionsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardSectionsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(boardSectionsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardSectionsList = scenario("boardSectionsListSimulation")
        .feed(board_sections/listQUERYFeeder)
        .feed(board_sections/listPATHFeeder)
        .exec(http("boardSectionsList")
        .httpRequest("GET","/boards/${board_id}/sections")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnboardSectionsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardSectionsList.inject(
        rampUsersPerSec(1) to(boardSectionsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardSectionsListPerSecond) during(durationSeconds),
        rampUsersPerSec(boardSectionsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardSectionsListPins = scenario("boardSectionsListPinsSimulation")
        .feed(board_sections/list_pinsQUERYFeeder)
        .feed(board_sections/list_pinsPATHFeeder)
        .exec(http("boardSectionsListPins")
        .httpRequest("GET","/boards/${board_id}/sections/${section_id}/pins")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnboardSectionsListPins with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardSectionsListPins.inject(
        rampUsersPerSec(1) to(boardSectionsListPinsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardSectionsListPinsPerSecond) during(durationSeconds),
        rampUsersPerSec(boardSectionsListPinsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardSectionsUpdate = scenario("boardSectionsUpdateSimulation")
        .feed(board_sections/updatePATHFeeder)
        .exec(http("boardSectionsUpdate")
        .httpRequest("PATCH","/boards/${board_id}/sections/${section_id}")
)

    // Run scnboardSectionsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardSectionsUpdate.inject(
        rampUsersPerSec(1) to(boardSectionsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardSectionsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(boardSectionsUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardsCreate = scenario("boardsCreateSimulation")
        .exec(http("boardsCreate")
        .httpRequest("POST","/boards")
)

    // Run scnboardsCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardsCreate.inject(
        rampUsersPerSec(1) to(boardsCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardsCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(boardsCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardsDelete = scenario("boardsDeleteSimulation")
        .feed(boards/deletePATHFeeder)
        .exec(http("boardsDelete")
        .httpRequest("DELETE","/boards/${board_id}")
)

    // Run scnboardsDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardsDelete.inject(
        rampUsersPerSec(1) to(boardsDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardsDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(boardsDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardsGet = scenario("boardsGetSimulation")
        .feed(boards/getPATHFeeder)
        .exec(http("boardsGet")
        .httpRequest("GET","/boards/${board_id}")
)

    // Run scnboardsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardsGet.inject(
        rampUsersPerSec(1) to(boardsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(boardsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardsList = scenario("boardsListSimulation")
        .feed(boards/listQUERYFeeder)
        .exec(http("boardsList")
        .httpRequest("GET","/boards")
        .queryParam("privacy","${privacy}")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnboardsList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardsList.inject(
        rampUsersPerSec(1) to(boardsListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardsListPerSecond) during(durationSeconds),
        rampUsersPerSec(boardsListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardsListPins = scenario("boardsListPinsSimulation")
        .feed(boards/list_pinsQUERYFeeder)
        .feed(boards/list_pinsPATHFeeder)
        .exec(http("boardsListPins")
        .httpRequest("GET","/boards/${board_id}/pins")
        .queryParam("bookmark","${bookmark}")
        .queryParam("page_size","${page_size}")
)

    // Run scnboardsListPins with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardsListPins.inject(
        rampUsersPerSec(1) to(boardsListPinsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardsListPinsPerSecond) during(durationSeconds),
        rampUsersPerSec(boardsListPinsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnboardsUpdate = scenario("boardsUpdateSimulation")
        .feed(boards/updatePATHFeeder)
        .exec(http("boardsUpdate")
        .httpRequest("PATCH","/boards/${board_id}")
)

    // Run scnboardsUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnboardsUpdate.inject(
        rampUsersPerSec(1) to(boardsUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(boardsUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(boardsUpdatePerSecond) to(1) during(rampDownSeconds)
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
