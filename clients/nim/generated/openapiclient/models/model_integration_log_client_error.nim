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


type IntegrationLogClientError* = object
  ## System error details included in the log sent by the client.
  cause*: string ## Original cause of the error.
  columnNumber*: int ## Column number in the line of the file that raised the error.
  fileName*: string ## Filename where the error happened.
  lineNumber*: int ## Line number where the error happened.
  message*: string ## Human-readable description of the error.
  messageDetail*: string ## More detail about the message.
  name*: string ## Filename where the error happened.
  number*: int ## Integer that specifies the error code.
  stackTrace*: string ## Stack trace of where the error happened.
