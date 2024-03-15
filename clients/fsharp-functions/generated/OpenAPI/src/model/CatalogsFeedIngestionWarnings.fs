namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedIngestionWarnings =

  //#region CatalogsFeedIngestionWarnings

  [<CLIMutable>]
  type CatalogsFeedIngestionWarnings = {
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR")>]
    ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR : int;
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE")>]
    ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE : int;
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_MALFORMED_URL")>]
    ADDITIONAL_IMAGE_MALFORMED_URL : int;
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_FILE_NOT_FOUND")>]
    ADDITIONAL_IMAGE_FILE_NOT_FOUND : int;
    [<JsonProperty(PropertyName = "ADDITIONAL_IMAGE_INVALID_FILE")>]
    ADDITIONAL_IMAGE_INVALID_FILE : int;
    [<JsonProperty(PropertyName = "HOTEL_PRICE_HEADER_IS_PRESENT")>]
    HOTEL_PRICE_HEADER_IS_PRESENT : int;
  }

  //#endregion
