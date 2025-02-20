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


type Status* {.pure.} = enum
  Failed
  Processed

type ConversionApiResponseEventsInner* = object
  ## 
  status*: Status ## Whether the event was processed successfully.
  errorMessage*: string ## Error message containing more information about why the event failed to be processed.
  warningMessage*: string ## Warning messages about any fields in the event which are not standard. These are not critical to event processing.

func `%`*(v: Status): JsonNode =
  let str = case v:
    of Status.Failed: "failed"
    of Status.Processed: "processed"

  JsonNode(kind: JString, str: str)

func `$`*(v: Status): string =
  result = case v:
    of Status.Failed: "failed"
    of Status.Processed: "processed"
