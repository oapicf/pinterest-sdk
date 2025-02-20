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

import org.openapitools.server.model.DeletePartnersRequest
import org.openapitools.server.model.DeletePartnersResponse
import org.openapitools.server.model.DeletedMembersResponse
import org.openapitools.server.model.Error
import org.openapitools.server.model.GetBusinessEmployers200Response
import org.openapitools.server.model.GetBusinessMembers200Response
import org.openapitools.server.model.GetBusinessPartners200Response
import org.openapitools.server.model.MemberBusinessRole
import org.openapitools.server.model.MembersToDeleteBody
import org.openapitools.server.model.PartnerType
import org.openapitools.server.model.UpdateMemberBusinessRoleBody
import org.openapitools.server.model.UpdateMemberResultsResponseArray

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class BusinessAccessRelationshipsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "BusinessAccessRelationshipsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val deleteBusinessMembershipOperation = (apiOperation[DeletedMembersResponse]("deleteBusinessMembership")
    summary "Terminate business memberships"
    parameters(pathParam[String]("businessId").description(""), bodyParam[MembersToDeleteBody]("membersToDeleteBody").description(""))
  )

  delete("/businesses/:business_id/members", operation(deleteBusinessMembershipOperation)) {
    val businessId = params.getOrElse("businessId", halt(400))
    //println("businessId: " + businessId)
    //println("membersToDeleteBody: " + membersToDeleteBody)
  }

  

  val deleteBusinessPartnersOperation = (apiOperation[DeletePartnersResponse]("deleteBusinessPartners")
    summary "Terminate business partnerships"
    parameters(pathParam[String]("businessId").description(""), bodyParam[DeletePartnersRequest]("deletePartnersRequest").description(""))
  )

  delete("/businesses/:business_id/partners", operation(deleteBusinessPartnersOperation)) {
    val businessId = params.getOrElse("businessId", halt(400))
    //println("businessId: " + businessId)
    //println("deletePartnersRequest: " + deletePartnersRequest)
  }

  

  val getBusinessEmployersOperation = (apiOperation[GetBusinessEmployers200Response]("getBusinessEmployers")
    summary "List business employers for user"
    parameters(queryParam[Int]("pageSize").description("").optional.defaultValue(25), queryParam[String]("bookmark").description("").optional)
  )

  get("/businesses/employers", operation(getBusinessEmployersOperation)) {
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
  }

  

  val getBusinessMembersOperation = (apiOperation[GetBusinessMembers200Response]("getBusinessMembers")
    summary "Get business members"
    parameters(pathParam[String]("businessId").description(""), queryParam[Boolean]("assetsSummary").description("").optional.defaultValue(false), queryParam[List[MemberBusinessRole]]("businessRoles").description("").optional.defaultValue(List.empty[MemberBusinessRole] ), queryParam[String]("memberIds").description("").optional, queryParam[Int]("startIndex").description("").optional.defaultValue(0), queryParam[String]("bookmark").description("").optional, queryParam[Int]("pageSize").description("").optional.defaultValue(25))
  )

  get("/businesses/:business_id/members", operation(getBusinessMembersOperation)) {
    val businessId = params.getOrElse("businessId", halt(400))
    //println("businessId: " + businessId)
            val assetsSummary = params.getAs[Boolean]("assetsSummary")

    //println("assetsSummary: " + assetsSummary)
        val businessRolesString = params.getAs[String]("businessRoles")
    val businessRoles = if("multi" == "default" || "multi" == "csv") {
      businessRolesString match {
        case Some(str) => str.split(",").toSeq
        case None => Seq()
      }
    } else
      Seq()

    //println("businessRoles: " + businessRoles)
            val memberIds = params.getAs[String]("memberIds")

    //println("memberIds: " + memberIds)
            val startIndex = params.getAs[Int]("startIndex")

    //println("startIndex: " + startIndex)
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
  }

  

  val getBusinessPartnersOperation = (apiOperation[GetBusinessPartners200Response]("getBusinessPartners")
    summary "Get business partners"
    parameters(pathParam[String]("businessId").description(""), queryParam[Boolean]("assetsSummary").description("").optional.defaultValue(false), queryParam[PartnerType]("partnerType").description("").optional, queryParam[String]("partnerIds").description("").optional, queryParam[Int]("startIndex").description("").optional.defaultValue(0), queryParam[Int]("pageSize").description("").optional.defaultValue(25), queryParam[String]("bookmark").description("").optional)
  )

  get("/businesses/:business_id/partners", operation(getBusinessPartnersOperation)) {
    val businessId = params.getOrElse("businessId", halt(400))
    //println("businessId: " + businessId)
            val assetsSummary = params.getAs[Boolean]("assetsSummary")

    //println("assetsSummary: " + assetsSummary)
            val partnerType = params.getAs[PartnerType]("partnerType")

    //println("partnerType: " + partnerType)
            val partnerIds = params.getAs[String]("partnerIds")

    //println("partnerIds: " + partnerIds)
            val startIndex = params.getAs[Int]("startIndex")

    //println("startIndex: " + startIndex)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
            val bookmark = params.getAs[String]("bookmark")

    //println("bookmark: " + bookmark)
  }

  

  val updateBusinessMembershipsOperation = (apiOperation[UpdateMemberResultsResponseArray]("updateBusinessMemberships")
    summary "Update member's business role"
    parameters(pathParam[String]("businessId").description(""), bodyParam[List[UpdateMemberBusinessRoleBody]]("updateMemberBusinessRoleBody").description(""))
  )

  patch("/businesses/:business_id/members", operation(updateBusinessMembershipsOperation)) {
    val businessId = params.getOrElse("businessId", halt(400))
    //println("businessId: " + businessId)
    //println("updateMemberBusinessRoleBody: " + updateMemberBusinessRoleBody)
  }

}
