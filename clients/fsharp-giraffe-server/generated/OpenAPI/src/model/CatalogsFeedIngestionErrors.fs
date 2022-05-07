namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedIngestionErrors =

  //#region CatalogsFeedIngestionErrors

  //#region enums
  type LargeProductCountDecreaseEnum = _1Enum of int  
  //#endregion

  type CatalogsFeedIngestionErrors = {
    ImageDownloadError : int;
    ImageDownloadConnectionTimeout : int;
    ImageFormatUnrecognize : int;
    LineLevelInternalError : int;
    LargeProductCountDecrease : LargeProductCountDecreaseEnum;
  }
  //#endregion
