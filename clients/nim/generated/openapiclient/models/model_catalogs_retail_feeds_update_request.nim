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

import model_catalogs_feed_credentials
import model_catalogs_feed_processing_schedule
import model_catalogs_format
import model_catalogs_status
import model_catalogs_type
import model_nullable_currency
import model_product_availability_type

type CatalogsRetailFeedsUpdateRequest* = object
  ## Request object for updating a feed.
  defaultCurrency*: NullableCurrency
  name*: string ## A human-friendly name associated to a given feed.
  format*: CatalogsFormat
  credentials*: CatalogsFeedCredentials
  location*: string ## The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  preferredProcessingSchedule*: CatalogsFeedProcessingSchedule
  status*: CatalogsStatus
  catalogType*: CatalogsType
  defaultAvailability*: ProductAvailabilityType
