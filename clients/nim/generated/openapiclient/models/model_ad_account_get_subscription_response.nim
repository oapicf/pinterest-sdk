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


type AdAccountGetSubscriptionResponse* = object
  ## 
  leadFormId*: string ## Lead form ID.
  webhookUrl*: string ## Standard HTTPS webhook URL.
  id*: string ## Subscription ID.
  userAccountId*: string ## User account used to subscribe lead data.
  adAccountId*: string ## The Ad Account ID that this lead form belongs to.
  apiVersion*: string ## API version.
  cryptographicKey*: string ## Base64 encoded key for client to decrypt lead data.
  cryptographicAlgorithm*: string ## Lead data encryption algorithm.
  createdTime*: int ## Lead form creation time. Unix timestamp in milliseconds.
