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


type AccountType* {.pure.} = enum
  PINNER
  BUSINESS

type Account* = object
  ## 
  accountType*: AccountType ## Type of account
  id*: string ## User account ID.
  profileImage*: string
  websiteUrl*: string
  username*: string
  about*: string ## Profile about description.
  businessName*: string
  boardCount*: int ## User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  pinCount*: int ## User account pin count. This includes both created and saved pins.
  followerCount*: int ## User account follower count.
  followingCount*: int ## User account following count.
  monthlyViews*: int ## User account monthly views.

func `%`*(v: AccountType): JsonNode =
  let str = case v:
    of AccountType.PINNER: "PINNER"
    of AccountType.BUSINESS: "BUSINESS"

  JsonNode(kind: JString, str: str)

func `$`*(v: AccountType): string =
  result = case v:
    of AccountType.PINNER: "PINNER"
    of AccountType.BUSINESS: "BUSINESS"
