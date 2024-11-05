namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFeedsCreateRequestDefaultLocale
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.string option

module CatalogsCreativeAssetsFeedsCreateRequest =

  //#region CatalogsCreativeAssetsFeedsCreateRequest


  type CatalogsCreativeAssetsFeedsCreateRequest = {
    DefaultCurrency : NullableCurrency;
    Name : string;
    Format : CatalogsFormat;
    DefaultLocale : CatalogsFeedsCreateRequestDefaultLocale;
    DefaultCountry : Country;
    Credentials : CatalogsFeedCredentials;
    Location : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    CatalogType : CatalogsType;
    CatalogId : string option;
    Status : CatalogsStatus;
  }
  //#endregion
