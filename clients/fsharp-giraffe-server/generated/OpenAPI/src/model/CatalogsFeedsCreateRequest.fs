namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType

module CatalogsFeedsCreateRequest =

  //#region CatalogsFeedsCreateRequest


  type CatalogsFeedsCreateRequest = {
    DefaultCountry : Country;
    DefaultAvailability : ProductAvailabilityType;
    DefaultCurrency : NullableCurrency;
    Name : string;
    Format : CatalogsFormat;
    DefaultLocale : string;
    Credentials : CatalogsFeedCredentials;
    Location : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
  }
  //#endregion
