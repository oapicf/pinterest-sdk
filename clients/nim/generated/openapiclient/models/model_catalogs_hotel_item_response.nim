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

import model_catalogs_hotel_attributes
import model_catalogs_type
import model_pin

type CatalogsHotelItemResponse* = object
  ## Object describing a hotel record
  catalogType*: CatalogsType
  hotelId*: string ## The catalog hotel id in the merchant namespace
  pins*: seq[Pin] ## The pins mapped to the item
  attributes*: CatalogsHotelAttributes