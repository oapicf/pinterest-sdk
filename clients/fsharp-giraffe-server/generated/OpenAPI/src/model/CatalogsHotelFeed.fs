namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.string option

module CatalogsHotelFeed =

  //#region CatalogsHotelFeed

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelFeed = {
    CatalogId : string option;
    CatalogType : CatalogTypeEnum;
    CreatedAt : DateTime;
    Credentials : CatalogsFeedCredentials;
    DefaultCurrency : NullableCurrency;
    DefaultLocale : string;
    Format : CatalogsFormat;
    Id : string;
    Location : string;
    Name : string option;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
    UpdatedAt : DateTime;
  }
  //#endregion
