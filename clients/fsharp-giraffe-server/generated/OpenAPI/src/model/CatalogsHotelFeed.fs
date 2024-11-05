namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.string option

module CatalogsHotelFeed =

  //#region CatalogsHotelFeed


  type CatalogsHotelFeed = {
    CreatedAt : DateTime;
    Id : string;
    UpdatedAt : DateTime;
    Name : string option;
    Format : CatalogsFormat;
    CatalogType : CatalogsType;
    Credentials : CatalogsFeedCredentials;
    Location : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
    DefaultCurrency : NullableCurrency;
    DefaultLocale : string;
    CatalogId : string option;
  }
  //#endregion
