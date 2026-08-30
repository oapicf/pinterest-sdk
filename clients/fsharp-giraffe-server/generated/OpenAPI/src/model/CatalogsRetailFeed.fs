namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType
open OpenAPI.Model.string option

module CatalogsRetailFeed =

  //#region CatalogsRetailFeed

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailFeed = {
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
  }
  //#endregion
