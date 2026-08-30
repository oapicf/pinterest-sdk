namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency

module CatalogsCreativeAssetsFeedsCreateRequest =

  //#region CatalogsCreativeAssetsFeedsCreateRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsFeedsCreateRequest = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Credentials : CatalogsFeedCredentials;
    DefaultCountry : Country;
    DefaultCurrency : NullableCurrency;
    DefaultLocale : CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
    Format : CatalogsFormat;
    Location : string;
    Name : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
