namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedIngestionErrors =

  //#region CatalogsFeedIngestionErrors

  [<CLIMutable>]
  type CatalogsFeedIngestionErrors = {
    [<JsonProperty(PropertyName = "ACCOUNT_FLAGGED")>]
    ACCOUNT_FLAGGED : int;
    [<JsonProperty(PropertyName = "FETCH_GOOGLE_SHEET_NOT_SHARED")>]
    FETCH_GOOGLE_SHEET_NOT_SHARED : int;
    [<JsonProperty(PropertyName = "IMAGE_FILE_NOT_ACCESSIBLE")>]
    IMAGE_FILE_NOT_ACCESSIBLE : int;
    [<JsonProperty(PropertyName = "IMAGE_FILE_NOT_FOUND")>]
    IMAGE_FILE_NOT_FOUND : int;
    [<JsonProperty(PropertyName = "IMAGE_INVALID_FILE")>]
    IMAGE_INVALID_FILE : int;
    [<JsonProperty(PropertyName = "IMAGE_LEVEL_INTERNAL_ERROR")>]
    IMAGE_LEVEL_INTERNAL_ERROR : int;
    [<JsonProperty(PropertyName = "IMAGE_MALFORMED_URL")>]
    IMAGE_MALFORMED_URL : int;
    [<JsonProperty(PropertyName = "LARGE_PRODUCT_COUNT_DECREASE")>]
    LARGE_PRODUCT_COUNT_DECREASE : int;
    [<JsonProperty(PropertyName = "LINE_LEVEL_INTERNAL_ERROR")>]
    LINE_LEVEL_INTERNAL_ERROR : int;
  }

  //#endregion
