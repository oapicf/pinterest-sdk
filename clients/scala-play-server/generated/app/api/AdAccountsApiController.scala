package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdAccount
import model.AdAccountAnalyticsResponseInner
import model.AdAccountCreateRequest
import model.AdAccountsList200Response
import model.AdsAnalyticsCreateAsyncRequest
import model.AdsAnalyticsCreateAsyncResponse
import model.AdsAnalyticsGetAsyncResponse
import model.AdsAnalyticsTargetingType
import model.ConversionReportAttributionType
import model.CreateMMMReportRequest
import model.CreateMMMReportResponse
import model.Error
import model.GetMMMReportResponse
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse
import model.TemplatesList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class AdAccountsApiController @Inject()(cc: ControllerComponents, api: AdAccountsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/analytics?startDate=[value]&endDate=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[AdAccountAnalyticsResponseInner] = {
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
    * GET /v5/ad_accounts/:adAccountId/targeting_analytics?startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountTargetingAnalyticsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): MetricsResponse = {
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
        
      val targetingTypes = request.getQueryString("targeting_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("targeting_types", "query string")
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
        
      val attributionTypes = request.getQueryString("attribution_types")
        .map(value => )
        
      api.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts
    */
  def adAccountsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccount = {
      val adAccountCreateRequest = request.body.asJson.map(_.as[AdAccountCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adAccountCreateRequest")
      }
      api.adAccountsCreate(adAccountCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccount = {
      api.adAccountsGet(adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts?bookmark=[value]&pageSize=[value]&includeSharedAccounts=[value]
    */
  def adAccountsList(): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsList200Response = {
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
    * POST /v5/ad_accounts/:adAccountId/mmm_reports
    * @param adAccountId Unique identifier of an ad account.
    */
  def analyticsCreateMmmReport(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CreateMMMReportResponse = {
      val createMMMReportRequest = request.body.asJson.map(_.as[CreateMMMReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createMMMReportRequest")
      }
      api.analyticsCreateMmmReport(adAccountId, createMMMReportRequest)
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
    * POST /v5/ad_accounts/:adAccountId/templates/:templateId/reports?startDate=[value]&endDate=[value]&granularity=[value]
    * @param adAccountId Unique identifier of an ad account.
    * @param templateId Unique identifier of a template.
    */
  def analyticsCreateTemplateReport(adAccountId: String, templateId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdsAnalyticsCreateAsyncResponse = {
      val startDate = request.getQueryString("start_date")
        .map(value => LocalDate.parse(value))
        
      val endDate = request.getQueryString("end_date")
        .map(value => LocalDate.parse(value))
        
      val granularity = request.getQueryString("granularity")
        .map(value => )
        
      api.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/mmm_reports?token=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def analyticsGetMmmReport(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetMMMReportResponse = {
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
        
      api.analyticsGetMmmReport(adAccountId, token)
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
    * DELETE /v5/ad_accounts/:adAccountId/sandbox
    * @param adAccountId Unique identifier of an ad account.
    */
  def sandboxDelete(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.sandboxDelete(adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/templates?pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def templatesList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): TemplatesList200Response = {
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.templatesList(adAccountId, pageSize, order, bookmark)
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
