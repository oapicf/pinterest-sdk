namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.string option

module CatalogsCreativeAssetsFeed =

  //#region CatalogsCreativeAssetsFeed


  type CatalogsCreativeAssetsFeed = {
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
    DefaultCountry : Country;
    CatalogId : string option;
  }
  //#endregion
