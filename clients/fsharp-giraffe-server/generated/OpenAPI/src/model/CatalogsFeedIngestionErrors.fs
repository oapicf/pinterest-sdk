namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedIngestionErrors =

  //#region CatalogsFeedIngestionErrors

  //#region enums
  type LARGEPRODUCTCOUNTDECREASEEnum = _1Enum of int  
  //#endregion

  type CatalogsFeedIngestionErrors = {
    LINE_LEVEL_INTERNAL_ERROR : int;
    LARGE_PRODUCT_COUNT_DECREASE : LARGEPRODUCTCOUNTDECREASEEnum;
    ACCOUNT_FLAGGED : int;
    IMAGE_LEVEL_INTERNAL_ERROR : int;
    IMAGE_FILE_NOT_ACCESSIBLE : int;
    IMAGE_MALFORMED_URL : int;
    IMAGE_FILE_NOT_FOUND : int;
    IMAGE_INVALID_FILE : int;
  }
  //#endregion
