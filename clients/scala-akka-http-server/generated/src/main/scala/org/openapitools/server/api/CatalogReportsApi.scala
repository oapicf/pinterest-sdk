package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CatalogsCreateReportResponse
import org.openapitools.server.model.CatalogsReport
import org.openapitools.server.model.CatalogsReportParameters
import org.openapitools.server.model.Error
import org.openapitools.server.model.ReportsStats200Response
import org.openapitools.server.model.ReportsStatsParametersParameter


class CatalogReportsApi(
    catalogReportsService: CatalogReportsApiService,
    catalogReportsMarshaller: CatalogReportsApiMarshaller
) {

  
  import catalogReportsMarshaller._

  lazy val route: Route =
    path("catalogs" / "reports") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[CatalogsReportParameters]){ catalogsReportParameters =>
              catalogReportsService.reportsCreate(catalogsReportParameters = catalogsReportParameters, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "reports") { 
      get { 
        parameters("ad_account_id".as[String].?, "token".as[String]) { (adAccountId, token) => 
            catalogReportsService.reportsGet(token = token, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "reports" / "stats") { 
      get { 
        parameters("ad_account_id".as[String].?, "page_size".as[Int].?(25), "bookmark".as[String].?, "parameters".as[String]) { (adAccountId, pageSize, bookmark, parameters) => 
            catalogReportsService.reportsStats(parameters = parameters, adAccountId = adAccountId, pageSize = pageSize, bookmark = bookmark)
        }
      }
    }
}


trait CatalogReportsApiService {

  def reportsCreate200(responseCatalogsCreateReportResponse: CatalogsCreateReportResponse)(implicit toEntityMarshallerCatalogsCreateReportResponse: ToEntityMarshaller[CatalogsCreateReportResponse]): Route =
    complete((200, responseCatalogsCreateReportResponse))
  def reportsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def reportsCreate409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def reportsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the report token, DataType: CatalogsCreateReportResponse
   * Code: 404, Message: Entity (e.g., catalog, feed or processing_result) not found, DataType: Error
   * Code: 409, Message: Can&#39;t access this feature without an existing catalog., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def reportsCreate(catalogsReportParameters: CatalogsReportParameters, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsCreateReportResponse: ToEntityMarshaller[CatalogsCreateReportResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def reportsGet200(responseCatalogsReport: CatalogsReport)(implicit toEntityMarshallerCatalogsReport: ToEntityMarshaller[CatalogsReport]): Route =
    complete((200, responseCatalogsReport))
  def reportsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def reportsGet409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def reportsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response that contains a link to download the report, DataType: CatalogsReport
   * Code: 400, Message: The token you provided is not valid or has expired., DataType: Error
   * Code: 409, Message: Can&#39;t access this feature without an existing catalog., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def reportsGet(token: String, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsReport: ToEntityMarshaller[CatalogsReport], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def reportsStats200(responseReportsStats200Response: ReportsStats200Response)(implicit toEntityMarshallerReportsStats200Response: ToEntityMarshaller[ReportsStats200Response]): Route =
    complete((200, responseReportsStats200Response))
  def reportsStats401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def reportsStatsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the diagnostics aggregated counters, DataType: ReportsStats200Response
   * Code: 401, Message: Not authorized to access catalogs, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def reportsStats(parameters: String, adAccountId: Option[String], pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerReportsStats200Response: ToEntityMarshaller[ReportsStats200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogReportsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogsReportParameters: FromEntityUnmarshaller[CatalogsReportParameters]



  implicit def toEntityMarshallerCatalogsReport: ToEntityMarshaller[CatalogsReport]

  implicit def toEntityMarshallerCatalogsCreateReportResponse: ToEntityMarshaller[CatalogsCreateReportResponse]

  implicit def toEntityMarshallerReportsStats200Response: ToEntityMarshaller[ReportsStats200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

