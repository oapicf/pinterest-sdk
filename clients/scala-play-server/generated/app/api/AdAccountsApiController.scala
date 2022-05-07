package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdsAnalyticsCreateAsyncRequest
import model.AdsAnalyticsCreateAsyncResponse
import model.AdsAnalyticsGetAsyncResponse
import model.Error
import model.Granularity
import model.JsObject
import java.time.LocalDate
import model.OasAnyTypeNotMapped
import model.Paginated

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
@Singleton
class AdAccountsApiController @Inject()(cc: ControllerComponents, api: AdAccountsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/analytics?startDate=[value]&endDate=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[Map[String, JsObject]] = {
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
      val columns = request.getQueryString("columns")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("columns", "query string")
        }
      val granularity = request.getQueryString("granularity")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("granularity", "query string")
        }
      val clickWindowDays = request.getQueryString("click_window_days")
        .map(value => value.toInt)
      val engagementWindowDays = request.getQueryString("engagement_window_days")
        .map(value => value.toInt)
      val viewWindowDays = request.getQueryString("view_window_days")
        .map(value => value.toInt)
      val conversionReportTime = request.getQueryString("conversion_report_time")
        
      api.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts?bookmark=[value]&pageSize=[value]&includeSharedAccounts=[value]
    */
  def adAccountsList(): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      val includeSharedAccounts = request.getQueryString("include_shared_accounts")
        .map(value => value.toBoolean)
      api.adAccountsList(bookmark, pageSize, includeSharedAccounts)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/analytics?startDate=[value]&endDate=[value]&adGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[Map[String, JsObject]] = {
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
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ad_group_ids", "query string")
        }
      val columns = request.getQueryString("columns")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("columns", "query string")
        }
      val granularity = request.getQueryString("granularity")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("granularity", "query string")
        }
      val clickWindowDays = request.getQueryString("click_window_days")
        .map(value => value.toInt)
      val engagementWindowDays = request.getQueryString("engagement_window_days")
        .map(value => value.toInt)
      val viewWindowDays = request.getQueryString("view_window_days")
        .map(value => value.toInt)
      val conversionReportTime = request.getQueryString("conversion_report_time")
        
      api.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups?campaignIds=[value]&adGroupIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]&translateInterestsToNames=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      val translateInterestsToNames = request.getQueryString("translate_interests_to_names")
        .map(value => value.toBoolean)
      api.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads/analytics?startDate=[value]&endDate=[value]&adIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[Map[String, JsObject]] = {
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
      val adIds = request.queryString.get("ad_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ad_ids", "query string")
        }
      val columns = request.getQueryString("columns")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("columns", "query string")
        }
      val granularity = request.getQueryString("granularity")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("granularity", "query string")
        }
      val clickWindowDays = request.getQueryString("click_window_days")
        .map(value => value.toInt)
      val engagementWindowDays = request.getQueryString("engagement_window_days")
        .map(value => value.toInt)
      val viewWindowDays = request.getQueryString("view_window_days")
        .map(value => value.toInt)
      val conversionReportTime = request.getQueryString("conversion_report_time")
        
      api.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads?campaignIds=[value]&adGroupIds=[value]&adIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
      val adIds = request.queryString.get("ad_ids")
        .map(_.toList)
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/reports
    * @param adAccountId Unique identifier of an ad account.
    */
  def analyticsCreateReport(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdsAnalyticsCreateAsyncResponse = {
      val adsAnalyticsCreateAsyncRequest = request.body.asJson.map(_.as[AdsAnalyticsCreateAsyncRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adsAnalyticsCreateAsyncRequest")
      }
      api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/reports?token=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def analyticsGetReport(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdsAnalyticsGetAsyncResponse = {
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
      api.analyticsGetReport(adAccountId, token)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns/analytics?startDate=[value]&endDate=[value]&campaignIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[Map[String, JsObject]] = {
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
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("campaign_ids", "query string")
        }
      val columns = request.getQueryString("columns")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("columns", "query string")
        }
      val granularity = request.getQueryString("granularity")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("granularity", "query string")
        }
      val clickWindowDays = request.getQueryString("click_window_days")
        .map(value => value.toInt)
      val engagementWindowDays = request.getQueryString("engagement_window_days")
        .map(value => value.toInt)
      val viewWindowDays = request.getQueryString("view_window_days")
        .map(value => value.toInt)
      val conversionReportTime = request.getQueryString("conversion_report_time")
        
      api.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns?campaignIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/product_groups/analytics?startDate=[value]&endDate=[value]&productGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[Map[String, JsObject]] = {
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
      val productGroupIds = request.queryString.get("product_group_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("product_group_ids", "query string")
        }
      val columns = request.getQueryString("columns")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("columns", "query string")
        }
      val granularity = request.getQueryString("granularity")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("granularity", "query string")
        }
      val clickWindowDays = request.getQueryString("click_window_days")
        .map(value => value.toInt)
      val engagementWindowDays = request.getQueryString("engagement_window_days")
        .map(value => value.toInt)
      val viewWindowDays = request.getQueryString("view_window_days")
        .map(value => value.toInt)
      val conversionReportTime = request.getQueryString("conversion_report_time")
        
      api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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
