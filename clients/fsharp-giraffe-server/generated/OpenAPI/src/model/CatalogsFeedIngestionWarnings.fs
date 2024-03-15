namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedIngestionWarnings =

  //#region CatalogsFeedIngestionWarnings


  type CatalogsFeedIngestionWarnings = {
    ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR : int;
    ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE : int;
    ADDITIONAL_IMAGE_MALFORMED_URL : int;
    ADDITIONAL_IMAGE_FILE_NOT_FOUND : int;
    ADDITIONAL_IMAGE_INVALID_FILE : int;
    HOTEL_PRICE_HEADER_IS_PRESENT : int;
  }
  //#endregion
