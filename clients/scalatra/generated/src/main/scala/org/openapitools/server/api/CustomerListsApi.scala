/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.CustomerList
import org.openapitools.server.model.CustomerListRequest
import org.openapitools.server.model.CustomerListUpdateRequest
import org.openapitools.server.model.CustomerListsList200Response
import org.openapitools.server.model.Error

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class CustomerListsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "CustomerListsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val customerListsCreateOperation = (apiOperation[CustomerList]("customerListsCreate")
    summary "Create customer lists"
    parameters(pathParam[String]("adAccountId").description(""), bodyParam[CustomerListRequest]("customerListRequest").description(""))
  )

  post("/ad_accounts/:ad_account_id/customer_lists", operation(customerListsCreateOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
    //println("customerListRequest: " + customerListRequest)
  }

  

  val customerListsGetOperation = (apiOperation[CustomerList]("customerListsGet")
    summary "Get customer list"
    parameters(pathParam[String]("adAccountId").description(""), pathParam[String]("customerListId").description(""))
  )

  get("/ad_accounts/:ad_account_id/customer_lists/:customer_list_id", operation(customerListsGetOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
    val customerListId = params.getOrElse("customerListId", halt(400))
    //println("customerListId: " + customerListId)
  }

  

  val customerListsListOperation = (apiOperation[CustomerListsList200Response]("customerListsList")
    summary "Get customer lists"
    parameters(pathParam[String]("adAccountId").description(""), queryParam[Int]("pageSize").description("").optional.defaultValue(25), queryParam[String]("order").description("").optional, queryParam[String]("bookmark").description("").optional)
  )

  get("/ad_accounts/:ad_account_id/customer_lists", operation(customerListsListOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
            val order = params.getAs[String]("order")

    //println("order: " + order)
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
  }

  

  val customerListsUpdateOperation = (apiOperation[CustomerList]("customerListsUpdate")
    summary "Update customer list"
    parameters(pathParam[String]("adAccountId").description(""), pathParam[String]("customerListId").description(""), bodyParam[CustomerListUpdateRequest]("customerListUpdateRequest").description(""))
  )

  patch("/ad_accounts/:ad_account_id/customer_lists/:customer_list_id", operation(customerListsUpdateOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
    val customerListId = params.getOrElse("customerListId", halt(400))
    //println("customerListId: " + customerListId)
    //println("customerListUpdateRequest: " + customerListUpdateRequest)
  }

}