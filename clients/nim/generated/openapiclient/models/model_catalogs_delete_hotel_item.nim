#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.12.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables


type Operation* {.pure.} = enum
  DELETE

type CatalogsDeleteHotelItem* = object
  ## A hotel item to be deleted
  hotelId*: string ## The catalog hotel id in the merchant namespace
  operation*: Operation

func `%`*(v: Operation): JsonNode =
  let str = case v:
    of Operation.DELETE: "DELETE"

  JsonNode(kind: JString, str: str)

func `$`*(v: Operation): string =
  result = case v:
    of Operation.DELETE: "DELETE"