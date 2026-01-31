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
    CatalogId : string;
    CatalogType : CatalogsType;
    Credentials : CatalogsFeedCredentials;
    DefaultCountry : Country;
    DefaultCurrency : NullableCurrency;
    DefaultLocale : string;
    Format : CatalogsFormat;
    Location : string;
    Name : string option;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
