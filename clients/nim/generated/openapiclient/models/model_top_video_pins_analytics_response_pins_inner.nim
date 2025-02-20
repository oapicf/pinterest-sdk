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

import model_data_status

type TopVideoPinsAnalyticsResponsePinsInner* = object
  ## Array with metrics, status, and pin id for the requested metric
  metrics*: Table[string, float] ## The metric name and daily value for each requested metric
  dataStatus*: Table[string, DataStatus]
  pinId*: string ## The pin id
