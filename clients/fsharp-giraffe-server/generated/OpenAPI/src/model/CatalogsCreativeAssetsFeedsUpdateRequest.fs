namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.NullableCurrency

module CatalogsCreativeAssetsFeedsUpdateRequest =

  //#region CatalogsCreativeAssetsFeedsUpdateRequest


  type CatalogsCreativeAssetsFeedsUpdateRequest = {
    CatalogType : CatalogsType;
    Credentials : CatalogsFeedCredentials;
    DefaultCurrency : NullableCurrency;
    Format : CatalogsFormat;
    Location : string;
    Name : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
