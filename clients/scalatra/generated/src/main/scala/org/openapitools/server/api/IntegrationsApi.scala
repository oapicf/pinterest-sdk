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

import org.openapitools.server.model.DetailedError
import org.openapitools.server.model.Error
import org.openapitools.server.model.IntegrationLogsRequest
import org.openapitools.server.model.IntegrationLogsSuccessResponse
import org.openapitools.server.model.IntegrationMetadata
import org.openapitools.server.model.IntegrationRecord
import org.openapitools.server.model.IntegrationRequest
import org.openapitools.server.model.IntegrationRequestPatch
import org.openapitools.server.model.IntegrationsGetList200Response

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class IntegrationsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "IntegrationsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val integrationsCommerceDelOperation = (apiOperation[Unit]("integrationsCommerceDel")
    summary "Delete commerce integration"
    parameters(pathParam[String]("externalBusinessId").description(""))
  )

  delete("/integrations/commerce/:external_business_id", operation(integrationsCommerceDelOperation)) {
    val externalBusinessId = params.getOrElse("externalBusinessId", halt(400))
    //println("externalBusinessId: " + externalBusinessId)
  }

  

  val integrationsCommerceGetOperation = (apiOperation[IntegrationMetadata]("integrationsCommerceGet")
    summary "Get commerce integration"
    parameters(pathParam[String]("externalBusinessId").description(""))
  )

  get("/integrations/commerce/:external_business_id", operation(integrationsCommerceGetOperation)) {
    val externalBusinessId = params.getOrElse("externalBusinessId", halt(400))
    //println("externalBusinessId: " + externalBusinessId)
  }

  

  val integrationsCommercePatchOperation = (apiOperation[IntegrationMetadata]("integrationsCommercePatch")
    summary "Update commerce integration"
    parameters(pathParam[String]("externalBusinessId").description(""), bodyParam[IntegrationRequestPatch]("integrationRequestPatch").description("").optional)
  )

  patch("/integrations/commerce/:external_business_id", operation(integrationsCommercePatchOperation)) {
    val externalBusinessId = params.getOrElse("externalBusinessId", halt(400))
    //println("externalBusinessId: " + externalBusinessId)
    //println("integrationRequestPatch: " + integrationRequestPatch)
  }

  

  val integrationsCommercePostOperation = (apiOperation[IntegrationMetadata]("integrationsCommercePost")
    summary "Create commerce integration"
    parameters(bodyParam[IntegrationRequest]("integrationRequest").description("").optional)
  )

  post("/integrations/commerce", operation(integrationsCommercePostOperation)) {
    //println("integrationRequest: " + integrationRequest)
  }

  

  val integrationsGetByIdOperation = (apiOperation[IntegrationRecord]("integrationsGetById")
    summary "Get integration metadata"
    parameters(pathParam[String]("id").description(""))
  )

  get("/integrations/:id", operation(integrationsGetByIdOperation)) {
    val id = params.getOrElse("id", halt(400))
    //println("id: " + id)
  }

  

  val integrationsGetListOperation = (apiOperation[IntegrationsGetList200Response]("integrationsGetList")
    summary "Get integration metadata list"
    parameters(queryParam[String]("bookmark").description("").optional, queryParam[Int]("pageSize").description("").optional.defaultValue(25))
  )

  get("/integrations", operation(integrationsGetListOperation)) {
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
  }

  

  val integrationsLogsPostOperation = (apiOperation[IntegrationLogsSuccessResponse]("integrationsLogsPost")
    summary "Receives batched logs from integration applications."
    parameters(bodyParam[IntegrationLogsRequest]("integrationLogsRequest").description(""))
  )

  post("/integrations/logs", operation(integrationsLogsPostOperation)) {
    //println("integrationLogsRequest: " + integrationLogsRequest)
  }

}