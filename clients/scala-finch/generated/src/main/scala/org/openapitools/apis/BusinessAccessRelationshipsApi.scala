package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.DeletePartnersRequest
import org.openapitools.models.DeletePartnersResponse
import org.openapitools.models.DeletedMembersResponse
import org.openapitools.models.Error
import org.openapitools.models.GetBusinessEmployers200Response
import org.openapitools.models.GetBusinessMembers200Response
import org.openapitools.models.GetBusinessPartners200Response
import org.openapitools.models.MemberBusinessRole
import org.openapitools.models.MembersToDeleteBody
import org.openapitools.models.PartnerType
import scala.collection.immutable.Seq
import org.openapitools.models.UpdateMemberBusinessRoleBody
import org.openapitools.models.UpdateMemberResultsResponseArray
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object BusinessAccessRelationshipsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        deleteBusinessMembership(da) :+:
        deleteBusinessPartners(da) :+:
        get/businessEmployers(da) :+:
        get/businessMembers(da) :+:
        get/businessPartners(da) :+:
        update/businessMemberships(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a DeletedMembersResponse
        */
        private def deleteBusinessMembership(da: DataAccessor): Endpoint[DeletedMembersResponse] =
        delete("businesses" :: string :: "members" :: jsonBody[MembersToDeleteBody]) { (businessId: String, membersToDeleteBody: MembersToDeleteBody) =>
          da.BusinessAccessRelationships_deleteBusinessMembership(businessId, membersToDeleteBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeletePartnersResponse
        */
        private def deleteBusinessPartners(da: DataAccessor): Endpoint[DeletePartnersResponse] =
        delete("businesses" :: string :: "partners" :: jsonBody[DeletePartnersRequest]) { (businessId: String, deletePartnersRequest: DeletePartnersRequest) =>
          da.BusinessAccessRelationships_deleteBusinessPartners(businessId, deletePartnersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBusinessEmployers200Response
        */
        private def get/businessEmployers(da: DataAccessor): Endpoint[GetBusinessEmployers200Response] =
        get("businesses" :: "employers" :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (pageSize: Option[Int], bookmark: Option[String]) =>
          da.BusinessAccessRelationships_get/businessEmployers(pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBusinessMembers200Response
        */
        private def get/businessMembers(da: DataAccessor): Endpoint[GetBusinessMembers200Response] =
        get("businesses" :: string :: "members" :: paramOption("assets_summary").map(_.map(_.toBoolean)) :: params("business_roles") :: paramOption("member_ids") :: paramOption("start_index").map(_.map(_.toInt)) :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (businessId: String, assetsSummary: Option[Boolean], businessRoles: Seq[MemberBusinessRole], memberIds: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]) =>
          da.BusinessAccessRelationships_get/businessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBusinessPartners200Response
        */
        private def get/businessPartners(da: DataAccessor): Endpoint[GetBusinessPartners200Response] =
        get("businesses" :: string :: "partners" :: paramOption("assets_summary").map(_.map(_.toBoolean)) :: paramOption("partner_type").map(_.map(_.toPartnerType)) :: paramOption("partner_ids") :: paramOption("start_index").map(_.map(_.toInt)) :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (businessId: String, assetsSummary: Option[Boolean], partnerType: Option[PartnerType], partnerIds: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]) =>
          da.BusinessAccessRelationships_get/businessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateMemberResultsResponseArray
        */
        private def update/businessMemberships(da: DataAccessor): Endpoint[UpdateMemberResultsResponseArray] =
        patch("businesses" :: string :: "members" :: jsonBody[Seq[UpdateMemberBusinessRoleBody]]) { (businessId: String, updateMemberBusinessRoleBody: Seq[UpdateMemberBusinessRoleBody]) =>
          da.BusinessAccessRelationships_update/businessMemberships(businessId, updateMemberBusinessRoleBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpBusinessAccessRelationshipsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
