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

import model_conversion_events_data_inner

type ConversionEvents* = object
  ## A list of events (one or more) encapsulated by a data object.
  data*: seq[ConversionEvents_data_inner]
