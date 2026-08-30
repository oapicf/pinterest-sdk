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
import org.openapitools.server.model.CatalogsReportStatsParameters
import org.openapitools.server.model.Error
import org.openapitools.server.model.ReportsStats200Response


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
        parameters("ad_account_id".as[String].?, "parameters".as[String], "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, parameters, bookmark, pageSize) => 
            catalogReportsService.reportsStats(parameters = parameters, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    }
}


trait CatalogReportsApiService {

  def reportsCreate200(responseCatalogsCreateReportResponse: CatalogsCreateReportResponse)(implicit toEntityMarshallerCatalogsCreateReportResponse: ToEntityMarshaller[CatalogsCreateReportResponse]): Route =
    complete((200, responseCatalogsCreateReportResponse))
  def reportsCreate201(responseCatalogsCreateReportResponse: CatalogsCreateReportResponse)(implicit toEntityMarshallerCatalogsCreateReportResponse: ToEntityMarshaller[CatalogsCreateReportResponse]): Route =
    complete((201, responseCatalogsCreateReportResponse))
  def reportsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def reportsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def reportsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def reportsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def reportsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def reportsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsCreateReportResponse
   * Code: 201, Message: Resource create operation completed successfully., DataType: CatalogsCreateReportResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def reportsCreate(catalogsReportParameters: CatalogsReportParameters, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsCreateReportResponse: ToEntityMarshaller[CatalogsCreateReportResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def reportsGet200(responseCatalogsReport: CatalogsReport)(implicit toEntityMarshallerCatalogsReport: ToEntityMarshaller[CatalogsReport]): Route =
    complete((200, responseCatalogsReport))
  def reportsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def reportsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def reportsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def reportsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def reportsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def reportsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsReport
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def reportsGet(token: String, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsReport: ToEntityMarshaller[CatalogsReport], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def reportsStats200(responseReportsStats200Response: ReportsStats200Response)(implicit toEntityMarshallerReportsStats200Response: ToEntityMarshaller[ReportsStats200Response]): Route =
    complete((200, responseReportsStats200Response))
  def reportsStats400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def reportsStats401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def reportsStats403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def reportsStats404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def reportsStats429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def reportsStatsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ReportsStats200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def reportsStats(parameters: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerReportsStats200Response: ToEntityMarshaller[ReportsStats200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogReportsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogsReportParameters: FromEntityUnmarshaller[CatalogsReportParameters]



  implicit def toEntityMarshallerCatalogsReport: ToEntityMarshaller[CatalogsReport]

  implicit def toEntityMarshallerCatalogsCreateReportResponse: ToEntityMarshaller[CatalogsCreateReportResponse]

  implicit def toEntityMarshallerReportsStats200Response: ToEntityMarshaller[ReportsStats200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

