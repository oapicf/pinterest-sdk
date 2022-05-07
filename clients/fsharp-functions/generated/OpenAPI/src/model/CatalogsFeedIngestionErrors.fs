namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedIngestionErrors =

  //#region CatalogsFeedIngestionErrors

  [<CLIMutable>]
  type CatalogsFeedIngestionErrors = {
    [<JsonProperty(PropertyName = "image_download_error")>]
    ImageDownloadError : int;
    [<JsonProperty(PropertyName = "image_download_connection_timeout")>]
    ImageDownloadConnectionTimeout : int;
    [<JsonProperty(PropertyName = "image_format_unrecognize")>]
    ImageFormatUnrecognize : int;
    [<JsonProperty(PropertyName = "line_level_internal_error")>]
    LineLevelInternalError : int;
    [<JsonProperty(PropertyName = "large_product_count_decrease")>]
    LargeProductCountDecrease : int;
  }

  //#endregion
