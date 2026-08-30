namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedIngestionErrors =

  //#region CatalogsFeedIngestionErrors


  type CatalogsFeedIngestionErrors = {
    ACCOUNT_FLAGGED : int;
    FETCH_GOOGLE_SHEET_NOT_SHARED : int;
    IMAGE_FILE_NOT_ACCESSIBLE : int;
    IMAGE_FILE_NOT_FOUND : int;
    IMAGE_INVALID_FILE : int;
    IMAGE_LEVEL_INTERNAL_ERROR : int;
    IMAGE_MALFORMED_URL : int;
    LARGE_PRODUCT_COUNT_DECREASE : int;
    LINE_LEVEL_INTERNAL_ERROR : int;
  }
  //#endregion
