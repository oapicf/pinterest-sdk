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

import model_non_nullable_catalogs_currency

type CatalogsProductGroupCurrencyCriteria* = object
  ## A currency filter. This filter cannot be negated
  values*: NonNullableCatalogsCurrency
  negated*: bool