package api

import model.Error
import model.KeywordUpdateBody
import model.KeywordsGet200Response
import model.KeywordsMetricsArrayResponse
import model.KeywordsRequest
import model.KeywordsResponse
import model.MatchType
import model.TrendType
import model.TrendingKeywordsResponse
import model.TrendsSupportedRegion

/**
  * Provides a default implementation for [[KeywordsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class KeywordsApiImpl extends KeywordsApi {
  /**
    * @inheritdoc
    */
  override def countryKeywordsMetricsGet(adAccountId: String, countryCode: String, keywords: List[String]): KeywordsMetricsArrayResponse = {
    // TODO: Implement better logic

    KeywordsMetricsArrayResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def keywordsCreate(adAccountId: String, keywordsRequest: KeywordsRequest): KeywordsResponse = {
    // TODO: Implement better logic

    KeywordsResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def keywordsGet(adAccountId: String, campaignId: Option[String], adGroupId: Option[String], matchTypes: Option[List[MatchType]], pageSize: Option[Int], bookmark: Option[String]): KeywordsGet200Response = {
    // TODO: Implement better logic

    KeywordsGet200Response(List.empty[Keyword], None)
  }

  /**
    * @inheritdoc
    */
  override def keywordsUpdate(adAccountId: String, keywordUpdateBody: KeywordUpdateBody): KeywordsResponse = {
    // TODO: Implement better logic

    KeywordsResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def trendingKeywordsList(region: TrendsSupportedRegion, trendType: TrendType, interests: Option[List[String]], genders: Option[List[String]], ages: Option[List[String]], includeKeywords: Option[List[String]], normalizeAgainstGroup: Option[Boolean], limit: Option[Int]): TrendingKeywordsResponse = {
    // TODO: Implement better logic

    TrendingKeywordsResponse(None)
  }
}
