#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.14.0
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

import ../models/model_account
import ../models/model_analytics_metrics_response
import ../models/model_error
import ../models/model_follow_user_request
import ../models/model_linked_business
import ../models/model_top_pins_analytics_response
import ../models/model_top_video_pins_analytics_response
import ../models/model_user_following_feed_type
import ../models/model_user_summary
import ../models/model_user_website_summary
import ../models/model_user_website_verification_code
import ../models/model_user_website_verify_request
import ../models/model_boards_user_follows_list_200_response
import ../models/model_followers_list_200_response
import ../models/model_user_account_followed_interests_200_response
import ../models/model_user_following_get_200_response
import ../models/model_user_websites_get_200_response

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


proc boardsUserFollowsList*(httpClient: HttpClient, bookmark: string, pageSize: int, explicitFollowing: bool, adAccountId: string): (Option[boards_user_follows_list_200_response], Response) =
  ## List following boards
  let query_for_api_call = encodeQuery([
    ("bookmark", $bookmark), # Cursor used to fetch the next page of items
    ("page_size", $pageSize), # Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    ("explicit_following", $explicitFollowing), # Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.get(basepath & "/user_account/following/boards" & "?" & query_for_api_call)
  constructResult[boards_user_follows_list_200_response](response)


proc followUserUpdate*(httpClient: HttpClient, username: string, followUserRequest: FollowUserRequest): (Option[UserSummary], Response) =
  ## Follow user
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & fmt"/user_account/following/{username}", $(%followUserRequest))
  constructResult[UserSummary](response)


proc followersList*(httpClient: HttpClient, bookmark: string, pageSize: int): (Option[followers_list_200_response], Response) =
  ## List followers
  let query_for_api_call = encodeQuery([
    ("bookmark", $bookmark), # Cursor used to fetch the next page of items
    ("page_size", $pageSize), # Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ])

  let response = httpClient.get(basepath & "/user_account/followers" & "?" & query_for_api_call)
  constructResult[followers_list_200_response](response)


proc linkedBusinessAccountsGet*(httpClient: HttpClient): (Option[seq[LinkedBusiness]], Response) =
  ## List linked businesses

  let response = httpClient.get(basepath & "/user_account/businesses")
  constructResult[seq[LinkedBusiness]](response)


proc unverifyWebsiteDelete*(httpClient: HttpClient, website: string): Response =
  ## Unverify website
  let query_for_api_call = encodeQuery([
    ("website", $website), # Website with path or domain only
  ])
  httpClient.delete(basepath & "/user_account/websites" & "?" & query_for_api_call)


proc userAccountAnalytics*(httpClient: HttpClient, startDate: string, endDate: string, fromClaimedContent: string, pinFormat: string, appTypes: string, contentType: string, source: string, metricTypes: seq[MetricTypes], splitField: string, adAccountId: string): (Option[Table[string, AnalyticsMetricsResponse]], Response) =
  ## Get user account analytics
  let query_for_api_call = encodeQuery([
    ("start_date", $startDate), # Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    ("end_date", $endDate), # Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    ("from_claimed_content", $fromClaimedContent), # Filter on Pins that match your claimed domain.
    ("pin_format", $pinFormat), # Pin formats to get data for, default is all.
    ("app_types", $appTypes), # Apps or devices to get data for, default is all.
    ("content_type", $contentType), # Filter to paid or organic data. Default is all.
    ("source", $source), # Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    ("metric_types", $metricTypes.join(",")), # Metric types to get data for, default is all. 
    ("split_field", $splitField), # How to split the data into groups. Not including this param means data won't be split.
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.get(basepath & "/user_account/analytics" & "?" & query_for_api_call)
  constructResult[Table[string, AnalyticsMetricsResponse]](response)


proc userAccountAnalyticsTopPins*(httpClient: HttpClient, startDate: string, endDate: string, sortBy: string, fromClaimedContent: string, pinFormat: string, appTypes: string, contentType: string, source: string, metricTypes: seq[MetricTypes], numOfPins: int, createdInLastNDays: CreatedInLastNDays, adAccountId: string): (Option[TopPinsAnalyticsResponse], Response) =
  ## Get user account top pins analytics
  let query_for_api_call = encodeQuery([
    ("start_date", $startDate), # Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    ("end_date", $endDate), # Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    ("sort_by", $sortBy), # Specify sorting order for metrics
    ("from_claimed_content", $fromClaimedContent), # Filter on Pins that match your claimed domain.
    ("pin_format", $pinFormat), # Pin formats to get data for, default is all.
    ("app_types", $appTypes), # Apps or devices to get data for, default is all.
    ("content_type", $contentType), # Filter to paid or organic data. Default is all.
    ("source", $source), # Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    ("metric_types", $metricTypes.join(",")), # Metric types to get data for, default is all. 
    ("num_of_pins", $numOfPins), # Number of pins to include, default is 10. Max is 50.
    ("created_in_last_n_days", $createdInLastNDays), # Get metrics for pins created in the last \"n\" days.
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.get(basepath & "/user_account/analytics/top_pins" & "?" & query_for_api_call)
  constructResult[TopPinsAnalyticsResponse](response)


proc userAccountAnalyticsTopVideoPins*(httpClient: HttpClient, startDate: string, endDate: string, sortBy: string, fromClaimedContent: string, pinFormat: string, appTypes: string, contentType: string, source: string, metricTypes: seq[MetricTypes], numOfPins: int, createdInLastNDays: CreatedInLastNDays, adAccountId: string): (Option[TopVideoPinsAnalyticsResponse], Response) =
  ## Get user account top video pins analytics
  let query_for_api_call = encodeQuery([
    ("start_date", $startDate), # Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    ("end_date", $endDate), # Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    ("sort_by", $sortBy), # Specify sorting order for video metrics
    ("from_claimed_content", $fromClaimedContent), # Filter on Pins that match your claimed domain.
    ("pin_format", $pinFormat), # Pin formats to get data for, default is all.
    ("app_types", $appTypes), # Apps or devices to get data for, default is all.
    ("content_type", $contentType), # Filter to paid or organic data. Default is all.
    ("source", $source), # Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    ("metric_types", $metricTypes.join(",")), # Metric types to get video data for, default is all. 
    ("num_of_pins", $numOfPins), # Number of pins to include, default is 10. Max is 50.
    ("created_in_last_n_days", $createdInLastNDays), # Get metrics for pins created in the last \"n\" days.
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.get(basepath & "/user_account/analytics/top_video_pins" & "?" & query_for_api_call)
  constructResult[TopVideoPinsAnalyticsResponse](response)


proc userAccountFollowedInterests*(httpClient: HttpClient, username: string, bookmark: string, pageSize: int): (Option[user_account_followed_interests_200_response], Response) =
  ## List following interests
  let query_for_api_call = encodeQuery([
    ("bookmark", $bookmark), # Cursor used to fetch the next page of items
    ("page_size", $pageSize), # Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ])

  let response = httpClient.get(basepath & fmt"/users/{username}/interests/follow" & "?" & query_for_api_call)
  constructResult[user_account_followed_interests_200_response](response)


proc userAccountGet*(httpClient: HttpClient, adAccountId: string): (Option[Account], Response) =
  ## Get user account
  let query_for_api_call = encodeQuery([
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.get(basepath & "/user_account" & "?" & query_for_api_call)
  constructResult[Account](response)


proc userFollowingGet*(httpClient: HttpClient, bookmark: string, pageSize: int, feedType: string, explicitFollowing: bool, adAccountId: string): (Option[user_following_get_200_response], Response) =
  ## List following
  let query_for_api_call = encodeQuery([
    ("bookmark", $bookmark), # Cursor used to fetch the next page of items
    ("page_size", $pageSize), # Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    ("feed_type", $feedType), # Thrift param specifying what type of followees will be kept. Default to include all followees.
    ("explicit_following", $explicitFollowing), # Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.get(basepath & "/user_account/following" & "?" & query_for_api_call)
  constructResult[user_following_get_200_response](response)


proc userWebsitesGet*(httpClient: HttpClient, bookmark: string, pageSize: int): (Option[user_websites_get_200_response], Response) =
  ## Get user websites
  let query_for_api_call = encodeQuery([
    ("bookmark", $bookmark), # Cursor used to fetch the next page of items
    ("page_size", $pageSize), # Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ])

  let response = httpClient.get(basepath & "/user_account/websites" & "?" & query_for_api_call)
  constructResult[user_websites_get_200_response](response)


proc verifyWebsiteUpdate*(httpClient: HttpClient, userWebsiteVerifyRequest: UserWebsiteVerifyRequest, adAccountId: string): (Option[UserWebsiteSummary], Response) =
  ## Verify website
  httpClient.headers["Content-Type"] = "application/json"
  let query_for_api_call = encodeQuery([
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.post(basepath & "/user_account/websites" & "?" & query_for_api_call, $(%userWebsiteVerifyRequest))
  constructResult[UserWebsiteSummary](response)


proc websiteVerificationGet*(httpClient: HttpClient, adAccountId: string): (Option[UserWebsiteVerificationCode], Response) =
  ## Get user verification code for website claiming
  let query_for_api_call = encodeQuery([
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.get(basepath & "/user_account/websites/verification" & "?" & query_for_api_call)
  constructResult[UserWebsiteVerificationCode](response)

