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

import model_batch_operation
import model_catalogs_items_request_language
import model_country
import model_item_delete_batch_record

type CatalogsItemsDeleteBatchRequest* = object
  ## Request object to delete catalogs items
  country*: Country
  language*: CatalogsItemsRequest_language
  operation*: BatchOperation
  items*: seq[ItemDeleteBatchRecord] ## Array with catalogs items
