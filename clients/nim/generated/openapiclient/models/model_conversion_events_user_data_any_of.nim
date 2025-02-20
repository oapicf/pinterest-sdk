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


type ConversionEventsUserDataAnyOf* = object
  ## 
  em*: seq[string] ## Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  hashedMaids*: seq[string] ## Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  clientIpAddress*: string ## The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
  clientUserAgent*: string ## The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
