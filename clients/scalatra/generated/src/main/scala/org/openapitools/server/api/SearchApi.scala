/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.Error
import org.openapitools.server.model.PinsList200Response
import org.openapitools.server.model.SearchPartnerPins200Response
import org.openapitools.server.model.SearchUserBoardsGet200Response

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class SearchApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "SearchApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val searchPartnerPinsOperation = (apiOperation[SearchPartnerPins200Response]("searchPartnerPins")
    summary "Search pins by a given search term"
    parameters(queryParam[String]("term").description(""), queryParam[String]("countryCode").description(""), queryParam[String]("bookmark").description("").optional, queryParam[String]("locale").description("").optional, queryParam[Int]("limit").description("").optional.defaultValue(10))
  )

  get("/search/partner/pins", operation(searchPartnerPinsOperation)) {
            val term = params.getAs[String]("term")

    //println("term: " + term)
            val countryCode = params.getAs[String]("countryCode")

    //println("countryCode: " + countryCode)
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
            val locale = params.getAs[String]("locale")

    //println("locale: " + locale)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
  }

  

  val searchUserBoardsGetOperation = (apiOperation[SearchUserBoardsGet200Response]("searchUserBoardsGet")
    summary "Search user's boards"
    parameters(queryParam[String]("adAccountId").description("").optional, queryParam[String]("bookmark").description("").optional, queryParam[Int]("pageSize").description("").optional.defaultValue(25), queryParam[String]("query").description("").optional)
  )

  get("/search/boards", operation(searchUserBoardsGetOperation)) {
            val adAccountId = params.getAs[String]("adAccountId")

    //println("adAccountId: " + adAccountId)
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
            val query = params.getAs[String]("query")

    //println("query: " + query)
  }

  

  val searchUserPinsListOperation = (apiOperation[PinsList200Response]("searchUserPinsList")
    summary "Search user's Pins"
    parameters(queryParam[String]("query").description(""), queryParam[String]("adAccountId").description("").optional, queryParam[String]("bookmark").description("").optional)
  )

  get("/search/pins", operation(searchUserPinsListOperation)) {
            val query = params.getAs[String]("query")

    //println("query: " + query)
            val adAccountId = params.getAs[String]("adAccountId")

    //println("adAccountId: " + adAccountId)
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
  }

}
