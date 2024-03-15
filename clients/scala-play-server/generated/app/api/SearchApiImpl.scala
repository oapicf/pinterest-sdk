package api

import model.Error
import model.PinsList200Response
import model.SearchPartnerPins200Response
import model.SearchUserBoardsGet200Response

/**
  * Provides a default implementation for [[SearchApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class SearchApiImpl extends SearchApi {
  /**
    * @inheritdoc
    */
  override def searchPartnerPins(term: String, countryCode: String, bookmark: Option[String], locale: Option[String], limit: Option[Int]): SearchPartnerPins200Response = {
    // TODO: Implement better logic

    SearchPartnerPins200Response(List.empty[SummaryPin], None)
  }

  /**
    * @inheritdoc
    */
  override def searchUserBoardsGet(adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], query: Option[String]): SearchUserBoardsGet200Response = {
    // TODO: Implement better logic

    SearchUserBoardsGet200Response(List.empty[Board], None)
  }

  /**
    * @inheritdoc
    */
  override def searchUserPinsList(query: String, adAccountId: Option[String], bookmark: Option[String]): PinsList200Response = {
    // TODO: Implement better logic

    PinsList200Response(List.empty[Pin], None)
  }
}
