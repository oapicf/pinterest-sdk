#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_advanced_auction_item

type AdvancedAuctionItems* = object
  ## Response object containing item bid options
  catalogId*: string ## Response object of item bid options
  items*: seq[AdvancedAuctionItem] ## Array with item bid options
