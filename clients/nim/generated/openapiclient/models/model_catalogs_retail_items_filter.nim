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


type CatalogType* {.pure.} = enum
  RETAIL

type CatalogsRetailItemsFilter* = object
  ## 
  catalogType*: CatalogType
  itemIds*: seq[string]
  catalogId*: string ## Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog

func `%`*(v: CatalogType): JsonNode =
  let str = case v:
    of CatalogType.RETAIL: "RETAIL"

  JsonNode(kind: JString, str: str)

func `$`*(v: CatalogType): string =
  result = case v:
    of CatalogType.RETAIL: "RETAIL"