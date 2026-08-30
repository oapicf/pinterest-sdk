namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.string option

module CatalogsCreativeAssetsFeed =

  //#region CatalogsCreativeAssetsFeed

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsFeed = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    CreatedAt : DateTime;
    Credentials : CatalogsFeedCredentials;
    DefaultCountry : Country;
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
