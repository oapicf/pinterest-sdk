#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.12.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_error
import ../models/model_keyword_update_body
import ../models/model_keywords_metrics_array_response
import ../models/model_keywords_request
import ../models/model_keywords_response
import ../models/model_match_type
import ../models/model_trend_type
import ../models/model_trending_keywords_response
import ../models/model_trends_supported_region
import ../models/model_keywords_get_200_response

const basepath = "https://api.pinterest.com/v5"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc countryKeywordsMetricsGet*(httpClient: HttpClient, adAccountId: string, countryCode: string, keywords: seq[string]): (Option[KeywordsMetricsArrayResponse], Response) =
  ## Get country's keyword metrics
  let query_for_api_call = encodeQuery([
    ("country_code", $countryCode), # Two letter country code (ISO 3166-1 alpha-2)
    ("keywords", $keywords.join(",")), # Comma-separated keywords
  ])

  let response = httpClient.get(basepath & fmt"/ad_accounts/{ad_account_id}/keywords/metrics" & "?" & query_for_api_call)
  constructResult[KeywordsMetricsArrayResponse](response)


proc keywordsCreate*(httpClient: HttpClient, adAccountId: string, keywordsRequest: KeywordsRequest): (Option[KeywordsResponse], Response) =
  ## Create keywords
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & fmt"/ad_accounts/{ad_account_id}/keywords", $(%keywordsRequest))
  constructResult[KeywordsResponse](response)


proc keywordsGet*(httpClient: HttpClient, adAccountId: string, campaignId: string, adGroupId: string, matchTypes: seq[MatchType], pageSize: int, bookmark: string): (Option[keywords_get_200_response], Response) =
  ## Get keywords
  let query_for_api_call = encodeQuery([
    ("campaign_id", $campaignId), # Campaign Id to use to filter the results.
    ("ad_group_id", $adGroupId), # Ad group Id.
    ("match_types", $matchTypes.join(",")), # Keyword <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type</a>
    ("page_size", $pageSize), # Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    ("bookmark", $bookmark), # Cursor used to fetch the next page of items
  ])

  let response = httpClient.get(basepath & fmt"/ad_accounts/{ad_account_id}/keywords" & "?" & query_for_api_call)
  constructResult[keywords_get_200_response](response)


proc keywordsUpdate*(httpClient: HttpClient, adAccountId: string, keywordUpdateBody: KeywordUpdateBody): (Option[KeywordsResponse], Response) =
  ## Update keywords
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.patch(basepath & fmt"/ad_accounts/{ad_account_id}/keywords", $(%keywordUpdateBody))
  constructResult[KeywordsResponse](response)


proc trendingKeywordsList*(httpClient: HttpClient, region: TrendsSupportedRegion, trendType: TrendType, interests: seq[Interests], genders: seq[Genders], ages: seq[Ages], normalizeAgainstGroup: bool, limit: int): (Option[TrendingKeywordsResponse], Response) =
  ## List trending keywords
  let query_for_api_call = encodeQuery([
    ("interests", $interests.join(",")), # If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion
    ("genders", $genders.join(",")), # If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.
    ("ages", $ages.join(",")), # If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.
    ("normalize_against_group", $normalizeAgainstGroup), # Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
    ("limit", $limit), # The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
  ])

  let response = httpClient.get(basepath & fmt"/trends/keywords/{region}/top/{trend_type}" & "?" & query_for_api_call)
  constructResult[TrendingKeywordsResponse](response)
