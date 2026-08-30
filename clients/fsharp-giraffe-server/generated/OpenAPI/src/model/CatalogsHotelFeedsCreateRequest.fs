namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.NullableCurrency

module CatalogsHotelFeedsCreateRequest =

  //#region CatalogsHotelFeedsCreateRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelFeedsCreateRequest = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Credentials : CatalogsFeedCredentials;
    DefaultCurrency : NullableCurrency;
    DefaultLocale : CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
    Format : CatalogsFormat;
    Location : string;
    Name : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
