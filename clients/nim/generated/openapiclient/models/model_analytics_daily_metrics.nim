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

type AnalyticsDailyMetrics* = object
  ## 
  dataStatus*: DataStatus
  date*: string ## Metrics date (UTC): YYYY-MM-DD.
  metrics*: Table[string, float] ## The metric name and daily value for each requested metric
