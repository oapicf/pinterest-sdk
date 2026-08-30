namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.NullableCurrency

module CatalogsHotelFeedsUpdateRequest =

  //#region CatalogsHotelFeedsUpdateRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelFeedsUpdateRequest = {
    CatalogType : CatalogTypeEnum;
    Credentials : CatalogsFeedCredentials;
    DefaultCurrency : NullableCurrency;
    Format : CatalogsFormat;
    Location : string;
    Name : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
