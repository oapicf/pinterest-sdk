package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Error
import org.openapitools.models.KeywordUpdateBody
import org.openapitools.models.KeywordsGet200Response
import org.openapitools.models.KeywordsMetricsArrayResponse
import org.openapitools.models.KeywordsRequest
import org.openapitools.models.KeywordsResponse
import org.openapitools.models.MatchType
import scala.collection.immutable.Seq
import org.openapitools.models.TrendType
import org.openapitools.models.TrendingKeywordsResponse
import org.openapitools.models.TrendsSupportedRegion
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

object KeywordsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        countryKeywordsMetrics/get(da) :+:
        keywords/create(da) :+:
        keywords/get(da) :+:
        keywords/update(da) :+:
        trendingKeywords/list(da)


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
        * @return An endpoint representing a KeywordsMetricsArrayResponse
        */
        private def countryKeywordsMetrics/get(da: DataAccessor): Endpoint[KeywordsMetricsArrayResponse] =
        get("ad_accounts" :: string :: "keywords" :: "metrics" :: param("country_code") :: params("keywords")) { (adAccountId: String, countryCode: String, keywords: Seq[String]) =>
          da.Keywords_countryKeywordsMetrics/get(adAccountId, countryCode, keywords) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a KeywordsResponse
        */
        private def keywords/create(da: DataAccessor): Endpoint[KeywordsResponse] =
        post("ad_accounts" :: string :: "keywords" :: jsonBody[KeywordsRequest]) { (adAccountId: String, keywordsRequest: KeywordsRequest) =>
          da.Keywords_keywords/create(adAccountId, keywordsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a KeywordsGet200Response
        */
        private def keywords/get(da: DataAccessor): Endpoint[KeywordsGet200Response] =
        get("ad_accounts" :: string :: "keywords" :: paramOption("campaign_id") :: paramOption("ad_group_id") :: params("match_types") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (adAccountId: String, campaignId: Option[String], adGroupId: Option[String], matchTypes: Seq[MatchType], pageSize: Option[Int], bookmark: Option[String]) =>
          da.Keywords_keywords/get(adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a KeywordsResponse
        */
        private def keywords/update(da: DataAccessor): Endpoint[KeywordsResponse] =
        patch("ad_accounts" :: string :: "keywords" :: jsonBody[KeywordUpdateBody]) { (adAccountId: String, keywordUpdateBody: KeywordUpdateBody) =>
          da.Keywords_keywords/update(adAccountId, keywordUpdateBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TrendingKeywordsResponse
        */
        private def trendingKeywords/list(da: DataAccessor): Endpoint[TrendingKeywordsResponse] =
        get("trends" :: "keywords" :: trendssupportedregion :: "top" :: trendtype :: params("interests") :: params("genders") :: params("ages") :: paramOption("normalize_against_group").map(_.map(_.toBoolean)) :: paramOption("limit").map(_.map(_.toInt))) { (region: TrendsSupportedRegion, trendType: TrendType, interests: Seq[String], genders: Seq[String], ages: Seq[String], normalizeAgainstGroup: Option[Boolean], limit: Option[Int]) =>
          da.Keywords_trendingKeywords/list(region, trendType, interests, genders, ages, normalizeAgainstGroup, limit) match {
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
      val file = Files.createTempFile("tmpKeywordsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
