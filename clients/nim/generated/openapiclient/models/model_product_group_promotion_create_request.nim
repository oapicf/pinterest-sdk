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

import model_product_group_promotion

type ProductGroupPromotionCreateRequest* = object
  ## 
  adGroupId*: string ## ID of the Ad Group the Product Group Promotion belongs to.
  productGroupPromotion*: seq[ProductGroupPromotion]