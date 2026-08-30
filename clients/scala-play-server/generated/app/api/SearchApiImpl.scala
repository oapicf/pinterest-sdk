package api

import model.BoardsList200Response
import model.Error
import model.PinsList200Response
import model.SearchPartnerPins200Response

/**
  * Provides a default implementation for [[SearchApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
  override def searchUserBoardsGet(adAccountId: Option[String], query: Option[String], bookmark: Option[String], pageSize: Option[Int]): BoardsList200Response = {
    // TODO: Implement better logic

    BoardsList200Response(None, List.empty[Board])
  }

  /**
    * @inheritdoc
    */
  override def searchUserPinsList(query: String, adAccountId: Option[String], bookmark: Option[String]): PinsList200Response = {
    // TODO: Implement better logic

    PinsList200Response(None, List.empty[Pin])
  }
}
