package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Account
import model.AnalyticsMetricsResponse
import model.BoardsUserFollowsList200Response
import model.Error
import model.FollowUserRequest
import model.FollowersList200Response
import model.LinkedBusiness
import java.time.LocalDate
import model.TopPinsAnalyticsResponse
import model.TopVideoPinsAnalyticsResponse
import model.UserAccountFollowedInterests200Response
import model.UserFollowingFeedType
import model.UserFollowingGet200Response
import model.UserSummary
import model.UserWebsiteSummary
import model.UserWebsiteVerificationCode
import model.UserWebsiteVerifyRequest
import model.UserWebsitesGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class UserAccountApiController @Inject()(cc: ControllerComponents, api: UserAccountApi) extends AbstractController(cc) {
  /**
    * GET /v5/user_account/following/boards?bookmark=[value]&pageSize=[value]&explicitFollowing=[value]&adAccountId=[value]
    */
  def boardsUserFollowsList(): Action[AnyContent] = Action { request =>
    def executeApi(): BoardsUserFollowsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val explicitFollowing = request.getQueryString("explicit_following")
        .map(value => value.toBoolean)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId)
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
    def executeApi(): UserSummary = {
      val followUserRequest = request.body.asJson.map(_.as[FollowUserRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "followUserRequest")
      }
      api.followUserUpdate(username, followUserRequest)
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
    def executeApi(): Unit = {
      val website = request.getQueryString("website")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("website", "query string")
        }
        
      api.unverifyWebsiteDelete(website)
    }

    executeApi()
    Ok
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
        
      val numOfPins = request.getQueryString("num_of_pins")
        .map(value => value.toInt)
        
      val createdInLastNDays = request.getQueryString("created_in_last_n_days")
        .map(value => value.toInt)
        
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
        
      val numOfPins = request.getQueryString("num_of_pins")
        .map(value => value.toInt)
        
      val createdInLastNDays = request.getQueryString("created_in_last_n_days")
        .map(value => value.toInt)
        
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
    * GET /v5/user_account/following?bookmark=[value]&pageSize=[value]&feedType=[value]&explicitFollowing=[value]&adAccountId=[value]
    */
  def userFollowingGet(): Action[AnyContent] = Action { request =>
    def executeApi(): UserFollowingGet200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val feedType = request.getQueryString("feed_type")
        
      val explicitFollowing = request.getQueryString("explicit_following")
        .map(value => value.toBoolean)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId)
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
    * POST /v5/user_account/websites
    */
  def verifyWebsiteUpdate(): Action[AnyContent] = Action { request =>
    def executeApi(): UserWebsiteSummary = {
      val userWebsiteVerifyRequest = request.body.asJson.map(_.as[UserWebsiteVerifyRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "userWebsiteVerifyRequest")
      }
      api.verifyWebsiteUpdate(userWebsiteVerifyRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account/websites/verification
    */
  def websiteVerificationGet(): Action[AnyContent] = Action { request =>
    def executeApi(): UserWebsiteVerificationCode = {
      api.websiteVerificationGet()
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
