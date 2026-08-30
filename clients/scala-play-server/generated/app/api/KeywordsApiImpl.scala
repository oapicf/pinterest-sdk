package api

import model.Error
import model.Keywords
import model.KeywordsCreate
import model.KeywordsGet200Response
import model.KeywordsMetricsArrayResponse
import model.KeywordsUpdate
import model.MatchType
import model.TrendType
import model.TrendingKeywordsResponse
import model.TrendsAgeBucket
import model.TrendsGenderFilter
import model.TrendsL1Interest
import model.TrendsSupportedRegion

/**
  * Provides a default implementation for [[KeywordsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
  override def keywordsCreate(adAccountId: String, keywordsCreate: KeywordsCreate): Keywords = {
    // TODO: Implement better logic

    Keywords(List.empty[KeywordError], List.empty[Keyword])
  }

  /**
    * @inheritdoc
    */
  override def keywordsGet(adAccountId: String, campaignId: Option[String], adGroupId: Option[String], adGroupIds: Option[List[String]], matchTypes: Option[List[MatchType]], bookmark: Option[String], pageSize: Option[Int]): KeywordsGet200Response = {
    // TODO: Implement better logic

    KeywordsGet200Response(None, List.empty[Keyword])
  }

  /**
    * @inheritdoc
    */
  override def keywordsUpdate(adAccountId: String, keywordsUpdate: KeywordsUpdate): Keywords = {
    // TODO: Implement better logic

    Keywords(List.empty[KeywordError], List.empty[Keyword])
  }

  /**
    * @inheritdoc
    */
  override def trendingKeywordsList(region: TrendsSupportedRegion, trendType: TrendType, interests: Option[List[TrendsL1Interest]], genders: Option[List[TrendsGenderFilter]], ages: Option[List[TrendsAgeBucket]], includeKeywords: Option[List[String]], normalizeAgainstGroup: Option[Boolean], limit: Option[Int], includeDemographics: Option[Boolean]): TrendingKeywordsResponse = {
    // TODO: Implement better logic

    TrendingKeywordsResponse(None)
  }
}
