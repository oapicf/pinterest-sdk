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


type IntegrationMetadata* = object
  ## Integration metadata
  id*: string
  externalBusinessId*: string
  connectedMerchantId*: string
  connectedUserId*: string
  connectedAdvertiserId*: string
  connectedLbaId*: string
  connectedTagId*: string
  partnerAccessTokenExpiry*: float
  partnerRefreshTokenExpiry*: float
  scopes*: string
  createdTimestamp*: float
  updatedTimestamp*: float
  additionalId1*: string
  partnerMetadata*: string