namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFeedsCreateRequestDefaultLocale
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.NullableCurrency

module CatalogsHotelFeedsCreateRequest =

  //#region CatalogsHotelFeedsCreateRequest


  type CatalogsHotelFeedsCreateRequest = {
    CatalogId : string;
    CatalogType : CatalogsType;
    Credentials : CatalogsFeedCredentials;
    DefaultCurrency : NullableCurrency;
    DefaultLocale : CatalogsFeedsCreateRequestDefaultLocale;
    Format : CatalogsFormat;
    Location : string;
    Name : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
