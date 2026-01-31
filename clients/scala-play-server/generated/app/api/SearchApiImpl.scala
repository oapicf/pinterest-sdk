package api

import model.Error
import model.SearchPartnerPins200Response
import model.SearchUserBoardsGet200Response
import model.SearchUserPinsList200Response

/**
  * Provides a default implementation for [[SearchApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class SearchApiImpl extends SearchApi {
  /**
    * @inheritdoc
    */
  override def searchPartnerPins(term: String, countryCode: String, bookmark: Option[String], locale: Option[String], limit: Option[Int]): SearchPartnerPins200Response = {
    // TODO: Implement better logic

    SearchPartnerPins200Response(None, List.empty[SummaryPin])
  }

  /**
    * @inheritdoc
    */
  override def searchUserBoardsGet(adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], query: Option[String]): SearchUserBoardsGet200Response = {
    // TODO: Implement better logic

    SearchUserBoardsGet200Response(None, List.empty[Board])
  }

  /**
    * @inheritdoc
    */
  override def searchUserPinsList(query: String, adAccountId: Option[String], bookmark: Option[String]): SearchUserPinsList200Response = {
    // TODO: Implement better logic

    SearchUserPinsList200Response(None, List.empty[Pin])
  }
}
