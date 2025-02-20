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

import model_pin_media
import model_video_metadata

type PinMediaWithVideos* = object
  ## Pin with multiple videos.
  mediaType*: string
  items*: seq[VideoMetadata]
