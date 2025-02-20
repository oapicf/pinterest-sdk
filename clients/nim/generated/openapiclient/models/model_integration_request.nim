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


type IntegrationRequest* = object
  ## Schema used for creating the integration metadata.
  externalBusinessId*: string ## External business ID for the integration.
  connectedMerchantId*: string
  connectedAdvertiserId*: string
  connectedLbaId*: string
  connectedTagId*: string
  partnerAccessToken*: string
  partnerRefreshToken*: string
  partnerPrimaryEmail*: string
  partnerAccessTokenExpiry*: int
  partnerRefreshTokenExpiry*: int
  scopes*: string
  additionalId1*: string
  partnerMetadata*: string
