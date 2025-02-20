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


type MediaUploadAllOfUploadParameters* = object
  ## The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  xAmzDate*: string
  xAmzSignature*: string
  xAmzSecurityToken*: string
  xAmzAlgorithm*: string
  key*: string
  policy*: string
  xAmzCredential*: string
  contentType*: string
