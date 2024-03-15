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
open OpenAPI.Model.ProductAvailabilityType
open OpenAPI.Model.string option

module CatalogsRetailFeed =

  //#region CatalogsRetailFeed


  type CatalogsRetailFeed = {
    CreatedAt : Nullable<DateTime>;
    Id : string;
    UpdatedAt : Nullable<DateTime>;
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
    DefaultAvailability : ProductAvailabilityType;
  }
  //#endregion
