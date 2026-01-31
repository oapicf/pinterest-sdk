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
    CatalogId : string option;
    CatalogType : CatalogsType;
    Credentials : CatalogsFeedCredentials;
    DefaultCurrency : NullableCurrency;
    DefaultLocale : string;
    Format : CatalogsFormat;
    Location : string;
    Name : string option;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
