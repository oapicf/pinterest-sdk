package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Error
import org.openapitools.models.PromotionCreateRequest
import org.openapitools.models.PromotionResponse
import org.openapitools.models.PromotionUpdateRequest
import org.openapitools.models.PromotionsList200Response
import org.openapitools.models.PromotionsResponse
import scala.collection.immutable.Seq
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

object PromotionsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        promotions/create(da) :+:
        promotions/delete(da) :+:
        promotions/get(da) :+:
        promotions/list(da) :+:
        promotions/update(da)


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
        * @return An endpoint representing a PromotionsResponse
        */
        private def promotions/create(da: DataAccessor): Endpoint[PromotionsResponse] =
        post("ad_accounts" :: string :: "promotions" :: jsonBody[Seq[PromotionCreateRequest]]) { (adAccountId: String, promotionCreateRequest: Seq[PromotionCreateRequest]) =>
          da.Promotions_promotions/create(adAccountId, promotionCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def promotions/delete(da: DataAccessor): Endpoint[Unit] =
        delete("ad_accounts" :: string :: "promotions" :: string) { (adAccountId: String, promotionId: String) =>
          da.Promotions_promotions/delete(adAccountId, promotionId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PromotionResponse
        */
        private def promotions/get(da: DataAccessor): Endpoint[PromotionResponse] =
        get("ad_accounts" :: string :: "promotions" :: string) { (adAccountId: String, promotionId: String) =>
          da.Promotions_promotions/get(adAccountId, promotionId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PromotionsList200Response
        */
        private def promotions/list(da: DataAccessor): Endpoint[PromotionsList200Response] =
        get("ad_accounts" :: string :: "promotions" :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.Promotions_promotions/list(adAccountId, pageSize, order, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PromotionsResponse
        */
        private def promotions/update(da: DataAccessor): Endpoint[PromotionsResponse] =
        patch("ad_accounts" :: string :: "promotions" :: jsonBody[Seq[PromotionUpdateRequest]]) { (adAccountId: String, promotionUpdateRequest: Seq[PromotionUpdateRequest]) =>
          da.Promotions_promotions/update(adAccountId, promotionUpdateRequest) match {
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
      val file = Files.createTempFile("tmpPromotionsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
