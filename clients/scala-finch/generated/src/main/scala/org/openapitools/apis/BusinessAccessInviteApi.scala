package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AuthRespondInvitesBody
import org.openapitools.models.CancelInvitesBody
import org.openapitools.models.CreateAssetAccessRequestBody
import org.openapitools.models.CreateAssetAccessRequestResponse
import org.openapitools.models.CreateAssetInvitesRequest
import org.openapitools.models.CreateInvitesResultsResponseArray
import org.openapitools.models.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.models.DeleteInvitesResultsResponseArray
import org.openapitools.models.Error
import org.openapitools.models.GetInvites200Response
import org.openapitools.models.InviteType
import org.openapitools.models.RespondToInvitesResponseArray
import scala.collection.immutable.Seq
import org.openapitools.models.UpdateInvitesResultsResponseArray
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

object BusinessAccessInviteApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        assetAccessRequests/create(da) :+:
        cancelInvitesOrRequests(da) :+:
        createAssetInvites(da) :+:
        createMembershipOrPartnershipInvites(da) :+:
        get/invites(da) :+:
        respondBusinessAccessInvites(da)


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
        * @return An endpoint representing a CreateAssetAccessRequestResponse
        */
        private def assetAccessRequests/create(da: DataAccessor): Endpoint[CreateAssetAccessRequestResponse] =
        post("businesses" :: string :: "requests" :: "assets" :: "access" :: jsonBody[CreateAssetAccessRequestBody]) { (businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody) =>
          da.BusinessAccessInvite_assetAccessRequests/create(businessId, createAssetAccessRequestBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteInvitesResultsResponseArray
        */
        private def cancelInvitesOrRequests(da: DataAccessor): Endpoint[DeleteInvitesResultsResponseArray] =
        delete("businesses" :: string :: "invites" :: jsonBody[CancelInvitesBody]) { (businessId: String, cancelInvitesBody: CancelInvitesBody) =>
          da.BusinessAccessInvite_cancelInvitesOrRequests(businessId, cancelInvitesBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateInvitesResultsResponseArray
        */
        private def createAssetInvites(da: DataAccessor): Endpoint[UpdateInvitesResultsResponseArray] =
        post("businesses" :: string :: "invites" :: "assets" :: "access" :: jsonBody[CreateAssetInvitesRequest]) { (businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest) =>
          da.BusinessAccessInvite_createAssetInvites(businessId, createAssetInvitesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateInvitesResultsResponseArray
        */
        private def createMembershipOrPartnershipInvites(da: DataAccessor): Endpoint[CreateInvitesResultsResponseArray] =
        post("businesses" :: string :: "invites" :: jsonBody[CreateMembershipOrPartnershipInvitesBody]) { (businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody) =>
          da.BusinessAccessInvite_createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetInvites200Response
        */
        private def get/invites(da: DataAccessor): Endpoint[GetInvites200Response] =
        get("businesses" :: string :: "invites" :: paramOption("is_member").map(_.map(_.toBoolean)) :: params("invite_status") :: paramOption("invite_type").map(_.map(_.toInviteType)) :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (businessId: String, isMember: Option[Boolean], inviteStatus: Seq[String], inviteType: Option[InviteType], bookmark: Option[String], pageSize: Option[Int]) =>
          da.BusinessAccessInvite_get/invites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RespondToInvitesResponseArray
        */
        private def respondBusinessAccessInvites(da: DataAccessor): Endpoint[RespondToInvitesResponseArray] =
        patch("businesses" :: "invites" :: jsonBody[AuthRespondInvitesBody]) { (authRespondInvitesBody: AuthRespondInvitesBody) =>
          da.BusinessAccessInvite_respondBusinessAccessInvites(authRespondInvitesBody) match {
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
      val file = Files.createTempFile("tmpBusinessAccessInviteApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
