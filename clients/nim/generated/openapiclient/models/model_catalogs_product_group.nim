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

import model_catalogs_product_group_filters
import model_catalogs_product_group_status
import model_catalogs_product_group_type

type CatalogType* {.pure.} = enum
  RETAIL

type CatalogsProductGroup* = object
  ## catalog product group entity
  id*: string ## ID of the catalog product group.
  name*: string ## Name of catalog product group
  description*: string
  filters*: CatalogsProductGroupFilters
  isFeatured*: bool ## boolean indicator of whether the product group is being featured or not
  `type`*: CatalogsProductGroupType
  status*: CatalogsProductGroupStatus
  createdAt*: int ## Unix timestamp in seconds of when catalog product group was created.
  updatedAt*: int ## Unix timestamp in seconds of last time catalog product group was updated.
  feedId*: string ## id of the catalogs feed belonging to this catalog product group
  catalogType*: CatalogType

func `%`*(v: CatalogType): JsonNode =
  let str = case v:
    of CatalogType.RETAIL: "RETAIL"

  JsonNode(kind: JString, str: str)

func `$`*(v: CatalogType): string =
  result = case v:
    of CatalogType.RETAIL: "RETAIL"