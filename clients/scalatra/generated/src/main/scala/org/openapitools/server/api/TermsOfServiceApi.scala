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

import org.openapitools.server.model.Error
import org.openapitools.server.model.TermsOfService

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class TermsOfServiceApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "TermsOfServiceApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val termsOfServiceGetOperation = (apiOperation[TermsOfService]("termsOfServiceGet")
    summary "Get terms of service"
    parameters(pathParam[String]("adAccountId").description(""), queryParam[Boolean]("includeHtml").description("").optional.defaultValue(false), queryParam[String]("tosType").description("").optional)
  )

  get("/ad_accounts/:ad_account_id/terms_of_service", operation(termsOfServiceGetOperation)) {
    val adAccountId = params.getOrElse("adAccountId", halt(400))
    //println("adAccountId: " + adAccountId)
            val includeHtml = params.getAs[Boolean]("includeHtml")

    //println("includeHtml: " + includeHtml)
            val tosType = params.getAs[String]("tosType")

    //println("tosType: " + tosType)
  }

}