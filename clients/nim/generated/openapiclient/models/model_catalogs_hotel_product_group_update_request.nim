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

import model_catalogs_hotel_product_group_filters

type CatalogType* {.pure.} = enum
  HOTEL

type CatalogsHotelProductGroupUpdateRequest* = object
  ## Request object for updating a hotel product group.
  catalogType*: CatalogType
  name*: string
  description*: string
  filters*: CatalogsHotelProductGroupFilters

func `%`*(v: CatalogType): JsonNode =
  let str = case v:
    of CatalogType.HOTEL: "HOTEL"

  JsonNode(kind: JString, str: str)

func `$`*(v: CatalogType): string =
  result = case v:
    of CatalogType.HOTEL: "HOTEL"
