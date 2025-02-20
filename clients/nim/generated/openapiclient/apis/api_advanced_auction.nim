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

import ../models/model_advanced_auction_items
import ../models/model_advanced_auction_items_get_request
import ../models/model_advanced_auction_items_submit_request
import ../models/model_advanced_auction_processed_items
import ../models/model_error

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


proc advancedAuctionItemsGetPost*(httpClient: HttpClient, advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: string): (Option[AdvancedAuctionItems], Response) =
  ## Get item bid options (POST)
  httpClient.headers["Content-Type"] = "application/json"
  let query_for_api_call = encodeQuery([
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.post(basepath & "/advanced_auction/items/get" & "?" & query_for_api_call, $(%advancedAuctionItemsGetRequest))
  constructResult[AdvancedAuctionItems](response)


proc advancedAuctionItemsSubmitPost*(httpClient: HttpClient, advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: string): (Option[AdvancedAuctionProcessedItems], Response) =
  ## Operate on item level bid options
  httpClient.headers["Content-Type"] = "application/json"
  let query_for_api_call = encodeQuery([
    ("ad_account_id", $adAccountId), # Unique identifier of an ad account.
  ])

  let response = httpClient.post(basepath & "/advanced_auction/items/submit" & "?" & query_for_api_call, $(%advancedAuctionItemsSubmitRequest))
  constructResult[AdvancedAuctionProcessedItems](response)

