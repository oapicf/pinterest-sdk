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

import model_catalogs_vertical_product_group

type CatalogsProductGroupsList200Response* = object
  ## 
  items*: seq[CatalogsVerticalProductGroup]
  bookmark*: string
