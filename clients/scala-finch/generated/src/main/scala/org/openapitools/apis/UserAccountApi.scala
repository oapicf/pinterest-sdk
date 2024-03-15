package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Account
import org.openapitools.models.AnalyticsMetricsResponse
import org.openapitools.models.BoardsUserFollowsList200Response
import org.openapitools.models.Error
import org.openapitools.models.FollowUserRequest
import org.openapitools.models.FollowersList200Response
import org.openapitools.models.LinkedBusiness
import java.time.LocalDateTime
import scala.collection.immutable.Seq
import org.openapitools.models.TopPinsAnalyticsResponse
import org.openapitools.models.TopVideoPinsAnalyticsResponse
import org.openapitools.models.UserAccountFollowedInterests200Response
import org.openapitools.models.UserFollowingFeedType
import org.openapitools.models.UserFollowingGet200Response
import org.openapitools.models.UserSummary
import org.openapitools.models.UserWebsiteSummary
import org.openapitools.models.UserWebsiteVerificationCode
import org.openapitools.models.UserWebsiteVerifyRequest
import org.openapitools.models.UserWebsitesGet200Response
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

object UserAccountApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        boardsUserFollows/list(da) :+:
        followUser/update(da) :+:
        followers/list(da) :+:
        linkedBusinessAccounts/get(da) :+:
        unverifyWebsite/delete(da) :+:
        userAccount/analytics(da) :+:
        userAccount/analytics/topPins(da) :+:
        userAccount/analytics/topVideoPins(da) :+:
        userAccount/followedInterests(da) :+:
        userAccount/get(da) :+:
        userFollowing/get(da) :+:
        userWebsites/get(da) :+:
        verifyWebsite/update(da) :+:
        websiteVerification/get(da)


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
        * @return An endpoint representing a BoardsUserFollowsList200Response
        */
        private def boardsUserFollows/list(da: DataAccessor): Endpoint[BoardsUserFollowsList200Response] =
        get("user_account" :: "following" :: "boards" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("explicit_following").map(_.map(_.toBoolean)) :: paramOption("ad_account_id")) { (bookmark: Option[String], pageSize: Option[Int], explicitFollowing: Option[Boolean], adAccountId: Option[String]) =>
          da.UserAccount_boardsUserFollows/list(bookmark, pageSize, explicitFollowing, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UserSummary
        */
        private def followUser/update(da: DataAccessor): Endpoint[UserSummary] =
        post("user_account" :: "following" :: string :: jsonBody[FollowUserRequest]) { (username: String, followUserRequest: FollowUserRequest) =>
          da.UserAccount_followUser/update(username, followUserRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FollowersList200Response
        */
        private def followers/list(da: DataAccessor): Endpoint[FollowersList200Response] =
        get("user_account" :: "followers" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (bookmark: Option[String], pageSize: Option[Int]) =>
          da.UserAccount_followers/list(bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[LinkedBusiness]
        */
        private def linkedBusinessAccounts/get(da: DataAccessor): Endpoint[Seq[LinkedBusiness]] =
        get("user_account" :: "businesses") { () =>
          da.UserAccount_linkedBusinessAccounts/get() match {
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
        private def unverifyWebsite/delete(da: DataAccessor): Endpoint[Unit] =
        delete("user_account" :: "websites" :: param("website")) { (website: String) =>
          da.UserAccount_unverifyWebsite/delete(website) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Map[String, AnalyticsMetricsResponse]
        */
        private def userAccount/analytics(da: DataAccessor): Endpoint[Map[String, AnalyticsMetricsResponse]] =
        get("user_account" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: paramOption("from_claimed_content") :: paramOption("pin_format") :: paramOption("app_types") :: paramOption("content_type") :: paramOption("source") :: params("metric_types") :: paramOption("split_field") :: paramOption("ad_account_id")) { (startDate: LocalDateTime, endDate: LocalDateTime, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Seq[String], splitField: Option[String], adAccountId: Option[String]) =>
          da.UserAccount_userAccount/analytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TopPinsAnalyticsResponse
        */
        private def userAccount/analytics/topPins(da: DataAccessor): Endpoint[TopPinsAnalyticsResponse] =
        get("user_account" :: "analytics" :: "top_pins" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: param("sort_by") :: paramOption("from_claimed_content") :: paramOption("pin_format") :: paramOption("app_types") :: paramOption("content_type") :: paramOption("source") :: params("metric_types") :: paramOption("num_of_pins").map(_.map(_.toInt)) :: paramOption("created_in_last_n_days").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (startDate: LocalDateTime, endDate: LocalDateTime, sortBy: String, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Seq[String], numOfPins: Option[Int], createdInLastNDays: Option[Int], adAccountId: Option[String]) =>
          da.UserAccount_userAccount/analytics/topPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TopVideoPinsAnalyticsResponse
        */
        private def userAccount/analytics/topVideoPins(da: DataAccessor): Endpoint[TopVideoPinsAnalyticsResponse] =
        get("user_account" :: "analytics" :: "top_video_pins" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: param("sort_by") :: paramOption("from_claimed_content") :: paramOption("pin_format") :: paramOption("app_types") :: paramOption("content_type") :: paramOption("source") :: params("metric_types") :: paramOption("num_of_pins").map(_.map(_.toInt)) :: paramOption("created_in_last_n_days").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (startDate: LocalDateTime, endDate: LocalDateTime, sortBy: String, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Seq[String], numOfPins: Option[Int], createdInLastNDays: Option[Int], adAccountId: Option[String]) =>
          da.UserAccount_userAccount/analytics/topVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UserAccountFollowedInterests200Response
        */
        private def userAccount/followedInterests(da: DataAccessor): Endpoint[UserAccountFollowedInterests200Response] =
        get("users" :: string :: "interests" :: "follow" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (username: String, bookmark: Option[String], pageSize: Option[Int]) =>
          da.UserAccount_userAccount/followedInterests(username, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Account
        */
        private def userAccount/get(da: DataAccessor): Endpoint[Account] =
        get("user_account" :: paramOption("ad_account_id")) { (adAccountId: Option[String]) =>
          da.UserAccount_userAccount/get(adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UserFollowingGet200Response
        */
        private def userFollowing/get(da: DataAccessor): Endpoint[UserFollowingGet200Response] =
        get("user_account" :: "following" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("feed_type").map(_.map(_.toUserFollowingFeedType)) :: paramOption("explicit_following").map(_.map(_.toBoolean)) :: paramOption("ad_account_id")) { (bookmark: Option[String], pageSize: Option[Int], feedType: Option[UserFollowingFeedType], explicitFollowing: Option[Boolean], adAccountId: Option[String]) =>
          da.UserAccount_userFollowing/get(bookmark, pageSize, feedType, explicitFollowing, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UserWebsitesGet200Response
        */
        private def userWebsites/get(da: DataAccessor): Endpoint[UserWebsitesGet200Response] =
        get("user_account" :: "websites" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (bookmark: Option[String], pageSize: Option[Int]) =>
          da.UserAccount_userWebsites/get(bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UserWebsiteSummary
        */
        private def verifyWebsite/update(da: DataAccessor): Endpoint[UserWebsiteSummary] =
        post("user_account" :: "websites" :: jsonBody[UserWebsiteVerifyRequest]) { (userWebsiteVerifyRequest: UserWebsiteVerifyRequest) =>
          da.UserAccount_verifyWebsite/update(userWebsiteVerifyRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UserWebsiteVerificationCode
        */
        private def websiteVerification/get(da: DataAccessor): Endpoint[UserWebsiteVerificationCode] =
        get("user_account" :: "websites" :: "verification") { () =>
          da.UserAccount_websiteVerification/get() match {
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
      val file = Files.createTempFile("tmpUserAccountApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
