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
import org.openapitools.server.model.LeadFormArrayResponse
import org.openapitools.server.model.LeadFormCreateRequest
import org.openapitools.server.model.LeadFormResponse
import org.openapitools.server.model.LeadFormTestRequest
import org.openapitools.server.model.LeadFormTestResponse
import org.openapitools.server.model.LeadFormUpdateRequest
import org.openapitools.server.model.LeadFormsList200Response

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class LeadFormsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "LeadFormsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val leadFormGetOperation = (apiOperation[LeadFormResponse]("leadFormGet")
    summary "Get lead form by id"
    parameters(pathParam[String]("adAccountId").description(""), pathParam[String]("leadFormId").description(""))
  )

  get("/ad_accounts/:ad_account_id/lead_forms/:lead_form_id", operation(leadFormGetOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
    val leadFormId = params.getOrElse("leadFormId", halt(400))
    //println("leadFormId: " + leadFormId)
  }

  

  val leadFormTestCreateOperation = (apiOperation[LeadFormTestResponse]("leadFormTestCreate")
    summary "Create lead form test data"
    parameters(pathParam[String]("adAccountId").description(""), pathParam[String]("leadFormId").description(""), bodyParam[LeadFormTestRequest]("leadFormTestRequest").description(""))
  )

  post("/ad_accounts/:ad_account_id/lead_forms/:lead_form_id/test", operation(leadFormTestCreateOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
    val leadFormId = params.getOrElse("leadFormId", halt(400))
    //println("leadFormId: " + leadFormId)
    //println("leadFormTestRequest: " + leadFormTestRequest)
  }

  

  val leadFormsCreateOperation = (apiOperation[LeadFormArrayResponse]("leadFormsCreate")
    summary "Create lead forms"
    parameters(pathParam[String]("adAccountId").description(""), bodyParam[List[LeadFormCreateRequest]]("leadFormCreateRequest").description(""))
  )

  post("/ad_accounts/:ad_account_id/lead_forms", operation(leadFormsCreateOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
    //println("leadFormCreateRequest: " + leadFormCreateRequest)
  }

  

  val leadFormsListOperation = (apiOperation[LeadFormsList200Response]("leadFormsList")
    summary "List lead forms"
    parameters(pathParam[String]("adAccountId").description(""), queryParam[Int]("pageSize").description("").optional.defaultValue(25), queryParam[String]("order").description("").optional, queryParam[String]("bookmark").description("").optional)
  )

  get("/ad_accounts/:ad_account_id/lead_forms", operation(leadFormsListOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
            val order = params.getAs[String]("order")

    //println("order: " + order)
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
  }

  

  val leadFormsUpdateOperation = (apiOperation[LeadFormArrayResponse]("leadFormsUpdate")
    summary "Update lead forms"
    parameters(pathParam[String]("adAccountId").description(""), bodyParam[List[LeadFormUpdateRequest]]("leadFormUpdateRequest").description(""))
  )

  patch("/ad_accounts/:ad_account_id/lead_forms", operation(leadFormsUpdateOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
    //println("leadFormUpdateRequest: " + leadFormUpdateRequest)
  }

}
