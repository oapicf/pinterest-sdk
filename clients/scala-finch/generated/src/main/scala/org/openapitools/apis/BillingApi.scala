package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdsCreditRedeemRequest
import org.openapitools.models.AdsCreditRedeemResponse
import org.openapitools.models.AdsCreditsDiscountsGet200Response
import org.openapitools.models.BillingProfilesGet200Response
import org.openapitools.models.Error
import org.openapitools.models.SSIOAccountResponse
import org.openapitools.models.SSIOCreateInsertionOrderRequest
import org.openapitools.models.SSIOCreateInsertionOrderResponse
import org.openapitools.models.SSIOEditInsertionOrderRequest
import org.openapitools.models.SSIOEditInsertionOrderResponse
import org.openapitools.models.SSIOInsertionOrderStatusResponse
import org.openapitools.models.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.models.SsioOrderLinesGetByAdAccount200Response
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

object BillingApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        adsCredit/redeem(da) :+:
        adsCreditsDiscounts/get(da) :+:
        billingProfiles/get(da) :+:
        ssioAccounts/get(da) :+:
        ssioInsertionOrder/create(da) :+:
        ssioInsertionOrder/edit(da) :+:
        ssioInsertionOrdersStatus/getByAdAccount(da) :+:
        ssioInsertionOrdersStatus/getByPinOrderId(da) :+:
        ssioOrderLines/getByAdAccount(da)


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
        * @return An endpoint representing a AdsCreditRedeemResponse
        */
        private def adsCredit/redeem(da: DataAccessor): Endpoint[AdsCreditRedeemResponse] =
        post("ad_accounts" :: string :: "ads_credit" :: "redeem" :: jsonBody[AdsCreditRedeemRequest]) { (adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest) =>
          da.Billing_adsCredit/redeem(adAccountId, adsCreditRedeemRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdsCreditsDiscountsGet200Response
        */
        private def adsCreditsDiscounts/get(da: DataAccessor): Endpoint[AdsCreditsDiscountsGet200Response] =
        get("ad_accounts" :: string :: "ads_credit" :: "discounts" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (adAccountId: String, bookmark: Option[String], pageSize: Option[Int]) =>
          da.Billing_adsCreditsDiscounts/get(adAccountId, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BillingProfilesGet200Response
        */
        private def billingProfiles/get(da: DataAccessor): Endpoint[BillingProfilesGet200Response] =
        get("ad_accounts" :: string :: "billing_profiles" :: param("is_active").map(_.toBoolean) :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (adAccountId: String, isActive: Boolean, bookmark: Option[String], pageSize: Option[Int]) =>
          da.Billing_billingProfiles/get(adAccountId, isActive, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SSIOAccountResponse
        */
        private def ssioAccounts/get(da: DataAccessor): Endpoint[SSIOAccountResponse] =
        get("ad_accounts" :: string :: "ssio" :: "accounts") { (adAccountId: String) =>
          da.Billing_ssioAccounts/get(adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SSIOCreateInsertionOrderResponse
        */
        private def ssioInsertionOrder/create(da: DataAccessor): Endpoint[SSIOCreateInsertionOrderResponse] =
        post("ad_accounts" :: string :: "ssio" :: "insertion_orders" :: jsonBody[SSIOCreateInsertionOrderRequest]) { (adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest) =>
          da.Billing_ssioInsertionOrder/create(adAccountId, sSIOCreateInsertionOrderRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SSIOEditInsertionOrderResponse
        */
        private def ssioInsertionOrder/edit(da: DataAccessor): Endpoint[SSIOEditInsertionOrderResponse] =
        patch("ad_accounts" :: string :: "ssio" :: "insertion_orders" :: jsonBody[SSIOEditInsertionOrderRequest]) { (adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest) =>
          da.Billing_ssioInsertionOrder/edit(adAccountId, sSIOEditInsertionOrderRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SsioInsertionOrdersStatusGetByAdAccount200Response
        */
        private def ssioInsertionOrdersStatus/getByAdAccount(da: DataAccessor): Endpoint[SsioInsertionOrdersStatusGetByAdAccount200Response] =
        get("ad_accounts" :: string :: "ssio" :: "insertion_orders" :: "status" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (adAccountId: String, bookmark: Option[String], pageSize: Option[Int]) =>
          da.Billing_ssioInsertionOrdersStatus/getByAdAccount(adAccountId, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SSIOInsertionOrderStatusResponse
        */
        private def ssioInsertionOrdersStatus/getByPinOrderId(da: DataAccessor): Endpoint[SSIOInsertionOrderStatusResponse] =
        get("ad_accounts" :: string :: "ssio" :: "insertion_orders" :: string :: "status") { (adAccountId: String, pinOrderId: String) =>
          da.Billing_ssioInsertionOrdersStatus/getByPinOrderId(adAccountId, pinOrderId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SsioOrderLinesGetByAdAccount200Response
        */
        private def ssioOrderLines/getByAdAccount(da: DataAccessor): Endpoint[SsioOrderLinesGetByAdAccount200Response] =
        get("ad_accounts" :: string :: "ssio" :: "order_lines" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("pin_order_id")) { (adAccountId: String, bookmark: Option[String], pageSize: Option[Int], pinOrderId: Option[String]) =>
          da.Billing_ssioOrderLines/getByAdAccount(adAccountId, bookmark, pageSize, pinOrderId) match {
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
      val file = Files.createTempFile("tmpBillingApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
