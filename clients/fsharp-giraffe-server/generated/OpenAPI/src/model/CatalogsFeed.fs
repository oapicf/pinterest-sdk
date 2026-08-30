namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsFeed
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsHotelFeed
open OpenAPI.Model.CatalogsRetailFeed
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType
open OpenAPI.Model.string option

module CatalogsFeed =

  //#region CatalogsFeed

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsFeed = {
    CatalogType : CatalogTypeEnum;
    CreatedAt : DateTime;
    Credentials : CatalogsFeedCredentials;
    DefaultAvailability : ProductAvailabilityType;
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
    CatalogId : string;
  }
  //#endregion
