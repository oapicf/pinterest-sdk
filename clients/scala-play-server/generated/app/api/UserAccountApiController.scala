package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Account
import model.AnalyticsMetricsResponse
import model.BigDecimal
import model.BoardsList200Response
import model.Error
import model.FollowUser
import model.FollowUserCreate
import model.FollowersList200Response
import model.LinkedBusiness
import java.time.LocalDate
import model.QuerymetrictypesItems
import model.QueryvideopinmetrictypesItems
import model.TopPinsAnalyticsResponse
import model.TopPinsSortBy
import model.TopVideoPinsAnalyticsResponse
import model.TopVideoPinsSortBy
import model.UserAccountFollowedInterests200Response
import model.UserFollowingFeedType
import model.UserWebsite
import model.UserWebsiteCreate
import model.UserWebsiteVerification
import model.UserWebsitesGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class UserAccountApiController @Inject()(cc: ControllerComponents, api: UserAccountApi) extends AbstractController(cc) {
  /**
    * GET /v5/user_account/following/boards?adAccountId=[value]&explicitFollowing=[value]&bookmark=[value]&pageSize=[value]
    */
  def boardsUserFollowsList(): Action[AnyContent] = Action { request =>
    def executeApi(): BoardsList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val explicitFollowing = request.getQueryString("explicit_following")
        .map(value => value.toBoolean)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/user_account/following/:username
    * @param username A valid username
    */
  def followUserUpdate(username: String): Action[AnyContent] = Action { request =>
    def executeApi(): FollowUser = {
      val followUserCreate = request.body.asJson.map(_.as[FollowUserCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "followUserCreate")
      }
      api.followUserUpdate(username, followUserCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/followers?bookmark=[value]&pageSize=[value]
    */
  def followersList(): Action[AnyContent] = Action { request =>
    def executeApi(): FollowersList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.followersList(bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/businesses
    */
  def linkedBusinessAccountsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): List[LinkedBusiness] = {
      api.linkedBusinessAccountsGet()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/user_account/websites?website=[value]
    */
  def unverifyWebsiteDelete(): Action[AnyContent] = Action { request =>
    def executeApi(): UserWebsite = {
      val website = request.getQueryString("website")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("website", "query string")
        }
        
      api.unverifyWebsiteDelete(website)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/analytics?startDate=[value]&endDate=[value]&fromClaimedContent=[value]&pinFormat=[value]&appTypes=[value]&contentType=[value]&source=[value]&metricTypes=[value]&splitField=[value]&adAccountId=[value]
    */
  def userAccountAnalytics(): Action[AnyContent] = Action { request =>
    def executeApi(): Map[String, AnalyticsMetricsResponse] = {
      val startDate = request.getQueryString("start_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_date", "query string")
        }
        
      val endDate = request.getQueryString("end_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("end_date", "query string")
        }
        
      val fromClaimedContent = request.getQueryString("from_claimed_content")
        
      val pinFormat = request.getQueryString("pin_format")
        
      val appTypes = request.getQueryString("app_types")
        
      val contentType = request.getQueryString("content_type")
        
      val source = request.getQueryString("source")
        
      val metricTypes = request.getQueryString("metric_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val splitField = request.getQueryString("split_field")
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/analytics/top_pins?startDate=[value]&endDate=[value]&sortBy=[value]&fromClaimedContent=[value]&pinFormat=[value]&appTypes=[value]&contentType=[value]&source=[value]&metricTypes=[value]&numOfPins=[value]&createdInLastNDays=[value]&adAccountId=[value]
    */
  def userAccountAnalyticsTopPins(): Action[AnyContent] = Action { request =>
    def executeApi(): TopPinsAnalyticsResponse = {
      val startDate = request.getQueryString("start_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_date", "query string")
        }
        
      val endDate = request.getQueryString("end_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("end_date", "query string")
        }
        
      val sortBy = request.getQueryString("sort_by")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sort_by", "query string")
        }
        
      val fromClaimedContent = request.getQueryString("from_claimed_content")
        
      val pinFormat = request.getQueryString("pin_format")
        
      val appTypes = request.getQueryString("app_types")
        
      val contentType = request.getQueryString("content_type")
        
      val source = request.getQueryString("source")
        
      val metricTypes = request.getQueryString("metric_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val numOfPins = request.getQueryString("num_of_pins")
        .map(value => value.toInt)
        
      val createdInLastNDays = request.getQueryString("created_in_last_n_days")
        .map(value => BigDecimal(value))
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/analytics/top_video_pins?startDate=[value]&endDate=[value]&sortBy=[value]&fromClaimedContent=[value]&pinFormat=[value]&appTypes=[value]&contentType=[value]&source=[value]&metricTypes=[value]&numOfPins=[value]&createdInLastNDays=[value]&adAccountId=[value]
    */
  def userAccountAnalyticsTopVideoPins(): Action[AnyContent] = Action { request =>
    def executeApi(): TopVideoPinsAnalyticsResponse = {
      val startDate = request.getQueryString("start_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_date", "query string")
        }
        
      val endDate = request.getQueryString("end_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("end_date", "query string")
        }
        
      val sortBy = request.getQueryString("sort_by")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sort_by", "query string")
        }
        
      val fromClaimedContent = request.getQueryString("from_claimed_content")
        
      val pinFormat = request.getQueryString("pin_format")
        
      val appTypes = request.getQueryString("app_types")
        
      val contentType = request.getQueryString("content_type")
        
      val source = request.getQueryString("source")
        
      val metricTypes = request.getQueryString("metric_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val numOfPins = request.getQueryString("num_of_pins")
        .map(value => value.toInt)
        
      val createdInLastNDays = request.getQueryString("created_in_last_n_days")
        .map(value => BigDecimal(value))
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/users/:username/interests/follow?bookmark=[value]&pageSize=[value]
    * @param username A valid username
    */
  def userAccountFollowedInterests(username: String): Action[AnyContent] = Action { request =>
    def executeApi(): UserAccountFollowedInterests200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.userAccountFollowedInterests(username, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account?adAccountId=[value]
    */
  def userAccountGet(): Action[AnyContent] = Action { request =>
    def executeApi(): Account = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.userAccountGet(adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/following?adAccountId=[value]&explicitFollowing=[value]&feedType=[value]&bookmark=[value]&pageSize=[value]
    */
  def userFollowingGet(): Action[AnyContent] = Action { request =>
    def executeApi(): FollowersList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val explicitFollowing = request.getQueryString("explicit_following")
        .map(value => value.toBoolean)
        
      val feedType = request.getQueryString("feed_type")
        .map(value => )
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/websites?bookmark=[value]&pageSize=[value]
    */
  def userWebsitesGet(): Action[AnyContent] = Action { request =>
    def executeApi(): UserWebsitesGet200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.userWebsitesGet(bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/user_account/websites?adAccountId=[value]
    */
  def verifyWebsiteUpdate(): Action[AnyContent] = Action { request =>
    def executeApi(): UserWebsite = {
      val userWebsiteCreate = request.body.asJson.map(_.as[UserWebsiteCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "userWebsiteCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.verifyWebsiteUpdate(userWebsiteCreate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/websites/verification?adAccountId=[value]
    */
  def websiteVerificationGet(): Action[AnyContent] = Action { request =>
    def executeApi(): UserWebsiteVerification = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.websiteVerificationGet(adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
