package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.BusinessAssetMembersGet200Response
import org.openapitools.models.BusinessAssetPartnersGet200Response
import org.openapitools.models.BusinessAssetsGet200Response
import org.openapitools.models.BusinessMemberAssetsGet200Response
import org.openapitools.models.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.models.BusinessPartnerAssetAccessGet200Response
import org.openapitools.models.CreateAssetGroupBody
import org.openapitools.models.CreateAssetGroupResponse
import org.openapitools.models.DeleteAssetGroupBody
import org.openapitools.models.DeleteAssetGroupResponse
import org.openapitools.models.DeleteMemberAccessResultsResponseArray
import org.openapitools.models.DeletePartnerAssetAccessBody
import org.openapitools.models.DeletePartnerAssetsResultsResponseArray
import org.openapitools.models.Error
import org.openapitools.models.PartnerType
import org.openapitools.models.PermissionsWithOwner
import scala.collection.immutable.Seq
import org.openapitools.models.UpdateAssetGroupBody
import org.openapitools.models.UpdateAssetGroupResponse
import org.openapitools.models.UpdateMemberAssetAccessBody
import org.openapitools.models.UpdateMemberAssetsResultsResponseArray
import org.openapitools.models.UpdatePartnerAssetAccessBody
import org.openapitools.models.UpdatePartnerAssetsResultsResponseArray
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

object BusinessAccessAssetsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        assetGroup/create(da) :+:
        assetGroup/delete(da) :+:
        assetGroup/update(da) :+:
        businessAssetMembers/get(da) :+:
        businessAssetPartners/get(da) :+:
        businessAssets/get(da) :+:
        businessMemberAssets/get(da) :+:
        businessMembersAssetAccess/delete(da) :+:
        businessMembersAssetAccess/update(da) :+:
        businessPartnerAssetAccess/get(da) :+:
        deletePartnerAssetAccessHandlerImpl(da) :+:
        updatePartnerAssetAccessHandlerImpl(da)


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
        * @return An endpoint representing a CreateAssetGroupResponse
        */
        private def assetGroup/create(da: DataAccessor): Endpoint[CreateAssetGroupResponse] =
        post("businesses" :: string :: "asset_groups" :: jsonBody[CreateAssetGroupBody]) { (businessId: String, createAssetGroupBody: CreateAssetGroupBody) =>
          da.BusinessAccessAssets_assetGroup/create(businessId, createAssetGroupBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteAssetGroupResponse
        */
        private def assetGroup/delete(da: DataAccessor): Endpoint[DeleteAssetGroupResponse] =
        delete("businesses" :: string :: "asset_groups" :: jsonBody[DeleteAssetGroupBody]) { (businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody) =>
          da.BusinessAccessAssets_assetGroup/delete(businessId, deleteAssetGroupBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateAssetGroupResponse
        */
        private def assetGroup/update(da: DataAccessor): Endpoint[UpdateAssetGroupResponse] =
        patch("businesses" :: string :: "asset_groups" :: jsonBody[UpdateAssetGroupBody]) { (businessId: String, updateAssetGroupBody: UpdateAssetGroupBody) =>
          da.BusinessAccessAssets_assetGroup/update(businessId, updateAssetGroupBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BusinessAssetMembersGet200Response
        */
        private def businessAssetMembers/get(da: DataAccessor): Endpoint[BusinessAssetMembersGet200Response] =
        get("businesses" :: string :: "assets" :: string :: "members" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("start_index").map(_.map(_.toInt))) { (businessId: String, assetId: String, bookmark: Option[String], pageSize: Option[Int], startIndex: Option[Int]) =>
          da.BusinessAccessAssets_businessAssetMembers/get(businessId, assetId, bookmark, pageSize, startIndex) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BusinessAssetPartnersGet200Response
        */
        private def businessAssetPartners/get(da: DataAccessor): Endpoint[BusinessAssetPartnersGet200Response] =
        get("businesses" :: string :: "assets" :: string :: "partners" :: paramOption("start_index").map(_.map(_.toInt)) :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (businessId: String, assetId: String, startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]) =>
          da.BusinessAccessAssets_businessAssetPartners/get(businessId, assetId, startIndex, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BusinessAssetsGet200Response
        */
        private def businessAssets/get(da: DataAccessor): Endpoint[BusinessAssetsGet200Response] =
        get("businesses" :: string :: "assets" :: params("permissions") :: paramOption("child_asset_id") :: paramOption("asset_group_id") :: paramOption("asset_type") :: paramOption("start_index").map(_.map(_.toInt)) :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (businessId: String, permissions: Seq[PermissionsWithOwner], childAssetId: Option[String], assetGroupId: Option[String], assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]) =>
          da.BusinessAccessAssets_businessAssets/get(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BusinessMemberAssetsGet200Response
        */
        private def businessMemberAssets/get(da: DataAccessor): Endpoint[BusinessMemberAssetsGet200Response] =
        get("businesses" :: string :: "members" :: string :: "assets" :: paramOption("asset_type") :: paramOption("start_index").map(_.map(_.toInt)) :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (businessId: String, memberId: String, assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]) =>
          da.BusinessAccessAssets_businessMemberAssets/get(businessId, memberId, assetType, startIndex, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteMemberAccessResultsResponseArray
        */
        private def businessMembersAssetAccess/delete(da: DataAccessor): Endpoint[DeleteMemberAccessResultsResponseArray] =
        delete("businesses" :: string :: "members" :: "assets" :: "access" :: jsonBody[BusinessMembersAssetAccessDeleteRequest]) { (businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest) =>
          da.BusinessAccessAssets_businessMembersAssetAccess/delete(businessId, businessMembersAssetAccessDeleteRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateMemberAssetsResultsResponseArray
        */
        private def businessMembersAssetAccess/update(da: DataAccessor): Endpoint[UpdateMemberAssetsResultsResponseArray] =
        patch("businesses" :: string :: "members" :: "assets" :: "access" :: jsonBody[UpdateMemberAssetAccessBody]) { (businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody) =>
          da.BusinessAccessAssets_businessMembersAssetAccess/update(businessId, updateMemberAssetAccessBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BusinessPartnerAssetAccessGet200Response
        */
        private def businessPartnerAssetAccess/get(da: DataAccessor): Endpoint[BusinessPartnerAssetAccessGet200Response] =
        get("businesses" :: string :: "partners" :: string :: "assets" :: paramOption("partner_type").map(_.map(_.toPartnerType)) :: paramOption("asset_type") :: paramOption("start_index").map(_.map(_.toInt)) :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (businessId: String, partnerId: String, partnerType: Option[PartnerType], assetType: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]) =>
          da.BusinessAccessAssets_businessPartnerAssetAccess/get(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeletePartnerAssetsResultsResponseArray
        */
        private def deletePartnerAssetAccessHandlerImpl(da: DataAccessor): Endpoint[DeletePartnerAssetsResultsResponseArray] =
        delete("businesses" :: string :: "partners" :: "assets" :: jsonBody[DeletePartnerAssetAccessBody]) { (businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody) =>
          da.BusinessAccessAssets_deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdatePartnerAssetsResultsResponseArray
        */
        private def updatePartnerAssetAccessHandlerImpl(da: DataAccessor): Endpoint[UpdatePartnerAssetsResultsResponseArray] =
        patch("businesses" :: string :: "partners" :: "assets" :: jsonBody[UpdatePartnerAssetAccessBody]) { (businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody) =>
          da.BusinessAccessAssets_updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody) match {
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
      val file = Files.createTempFile("tmpBusinessAccessAssetsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
