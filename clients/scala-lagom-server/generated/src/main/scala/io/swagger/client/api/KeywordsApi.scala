/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.Error
import io.swagger.client.model.KeywordUpdateBody
import io.swagger.client.model.KeywordsGet200Response
import io.swagger.client.model.KeywordsMetricsArrayResponse
import io.swagger.client.model.KeywordsRequest
import io.swagger.client.model.KeywordsResponse
import io.swagger.client.model.MatchType
import io.swagger.client.model.TrendType
import io.swagger.client.model.TrendingKeywordsResponse
import io.swagger.client.model.TrendsSupportedRegion

trait KeywordsApi extends Service {


  final override def descriptor = {
    import Service._
    named("KeywordsApi").withCalls(
      restCall(Method.GET, "/ad_accounts/:ad_account_id/keywords/metrics?countryCode&keywords", countryKeywordsMetricsGet _), 
      restCall(Method.POST, "/ad_accounts/:ad_account_id/keywords", keywordsCreate _), 
      restCall(Method.GET, "/ad_accounts/:ad_account_id/keywords?campaignId&adGroupId&matchTypes&pageSize&bookmark", keywordsGet _), 
      restCall(Method.PATCH, "/ad_accounts/:ad_account_id/keywords", keywordsUpdate _), 
      restCall(Method.GET, "/trends/keywords/:region/top/:trend_type?interests&genders&ages&normalizeAgainstGroup&limit", trendingKeywordsList _)
    ).withAutoAcl(true)
  }

      
  // keywords:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * Get country&#39;s keyword metrics
    * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \&quot;Get delivery metrics definitions\&quot; &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/delivery_metrics/get\&quot;&gt;API endpoint&lt;/a&gt;).
    *  
    * @param adAccountId Unique identifier of an ad account.  
    * @param countryCode Two letter country code (ISO 3166-1 alpha-2)  
    * @param keywords Comma-separated keywords 
    * @return KeywordsMetricsArrayResponse
    */
  def countryKeywordsMetricsGet(countryCode:String          ,adAccountId: String): ServiceCall[NotUsed ,KeywordsMetricsArrayResponse]
  
  /**
    * Create keywords
    * &lt;p&gt;Create keywords for following entity types(advertiser, campaign, ad group or ad).&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a  target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;b&gt;Rate limit&lt;/b&gt;: &lt;a href&#x3D;\&quot;/docs/redoc/#tag/Rate-Limits\&quot;&gt;WRITE&lt;/a&gt;.&lt;/p&gt;
    *  
    * @param adAccountId Unique identifier of an ad account.  
    * @return KeywordsResponse Body Parameter   
    */
  def keywordsCreate(adAccountId: String): ServiceCall[KeywordsRequest ,KeywordsResponse]
        
  // matchTypes:Seq[MatchType]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * Get keywords
    * &lt;p&gt;Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt;
    *  
    * @param adAccountId Unique identifier of an ad account.  
    * @param campaignId Campaign Id to use to filter the results. (optional) 
    * @param adGroupId Ad group Id. (optional) 
    * @param matchTypes Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type&lt;/a&gt; (optional, default to new ListBuffer[MatchType]() ) 
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25) 
    * @param bookmark Cursor used to fetch the next page of items (optional)
    * @return KeywordsGet200Response
    */
  def keywordsGet(campaignId:           Option[String] = None,adGroupId:           Option[String] = None,pageSize:           Option[Int] /* = 25*/,bookmark:           Option[String] = NoneadAccountId: String): ServiceCall[NotUsed ,KeywordsGet200Response]
  
  /**
    * Update keywords
    * &lt;p&gt;Update one or more keywords&#39; bid and archived fields.&lt;/p&gt; &lt;p&gt;Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity&#39;s keywords list.&lt;/p&gt;
    *  
    * @param adAccountId Unique identifier of an ad account.  
    * @return KeywordsResponse Body Parameter   
    */
  def keywordsUpdate(adAccountId: String): ServiceCall[KeywordUpdateBody ,KeywordsResponse]
        
  // interests:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  // genders:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  // ages:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * List trending keywords
    * &lt;p&gt;Get the top trending search keywords among the Pinterest user audience.&lt;/p&gt; &lt;p&gt;Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.&lt;/p&gt; &lt;p&gt;Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.&lt;/p&gt; &lt;p&gt;For an interactive way to explore this data, please visit &lt;a href&#x3D;\&quot;https://trends.pinterest.com\&quot;&gt;trends.pinterest.com&lt;/a&gt;.
    *  
    * @param region The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia  
    * @param trendType The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)  
    * @param interests If set, filters the results to trends associated with the specified interests.&lt;br /&gt; If unset, trends for all interests will be returned.&lt;br /&gt; The list of supported interests is: - &#x60;animals&#x60; - Animals - &#x60;architecture&#x60; - Architecture - &#x60;art&#x60; - Art - &#x60;beauty&#x60; - Beauty - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion - &#x60;design&#x60; - Design - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts - &#x60;education&#x60; - Education - &#x60;electronics&#x60; - Electronics - &#x60;entertainment&#x60; - Entertainment - &#x60;event_planning&#x60; - Event Planning - &#x60;finance&#x60; - Finance - &#x60;food_and_drinks&#x60; - Food &amp; Drink - &#x60;gardening&#x60; - Gardening - &#x60;health&#x60; - Health - &#x60;home_decor&#x60; - Home Decor - &#x60;mens_fashion&#x60; - Men&#39;s Fashion - &#x60;parenting&#x60; - Parenting - &#x60;quotes&#x60; - Quotes - &#x60;sport&#x60; - Sports - &#x60;travel&#x60; - Travel - &#x60;vehicles&#x60; - Vehicles - &#x60;wedding&#x60; - Wedding - &#x60;womens_fashion&#x60; - Women&#39;s Fashion (optional, default to new ListBuffer[String]() ) 
    * @param genders If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt; If unset, trends among all genders will be returned.&lt;br /&gt; The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. (optional, default to new ListBuffer[String]() ) 
    * @param ages If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt; If unset, trends among all age groups will be returned. (optional, default to new ListBuffer[String]() ) 
    * @param normalizeAgainstGroup Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt; By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt; If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional, default to false) 
    * @param limit The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. (optional, default to 50)
    * @return TrendingKeywordsResponse
    */
  def trendingKeywordsList(interests: Option[KeywordsApiInterestsEnum.KeywordsApiInterestsEnum]genders: Option[KeywordsApiGendersEnum.KeywordsApiGendersEnum]ages: Option[KeywordsApiAgesEnum.KeywordsApiAgesEnum]normalizeAgainstGroup:           Option[Boolean] /* = false*/,limit:           Option[Int] /* = 50*/region: TrendsSupportedRegion, trendType: TrendType): ServiceCall[NotUsed ,TrendingKeywordsResponse]
  

        object KeywordsApiInterestsEnum extends Enumeration {
        val   animals, architecture, art, beauty, childrens_fashion, design, diy_and_crafts, education, electronics, entertainment, event_planning, finance, food_and_drinks, gardening, health, home_decor, mens_fashion, parenting, quotes, sport, travel, vehicles, wedding, womens_fashion = Value     
        type KeywordsApiInterestsEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[KeywordsApiInterestsEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[KeywordsApiInterestsEnum] = PathParamSerializer.required("KeywordsApiInterestsEnum")(withName)(_.toString)
        }
        object KeywordsApiGendersEnum extends Enumeration {
        val   female, male, unknown = Value     
        type KeywordsApiGendersEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[KeywordsApiGendersEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[KeywordsApiGendersEnum] = PathParamSerializer.required("KeywordsApiGendersEnum")(withName)(_.toString)
        }
        object KeywordsApiAgesEnum extends Enumeration {
        val   18-24, 25-34, 35-44, 45-49, 50-54, 55-64, 65+ = Value     
        type KeywordsApiAgesEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[KeywordsApiAgesEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[KeywordsApiAgesEnum] = PathParamSerializer.required("KeywordsApiAgesEnum")(withName)(_.toString)
        }
  }