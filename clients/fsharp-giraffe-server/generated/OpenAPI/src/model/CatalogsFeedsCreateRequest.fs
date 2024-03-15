namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFeedsCreateRequestDefaultLocale
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType

module CatalogsFeedsCreateRequest =

  //#region CatalogsFeedsCreateRequest


  type CatalogsFeedsCreateRequest = {
    DefaultCurrency : NullableCurrency;
    Name : string;
    Format : CatalogsFormat;
    DefaultLocale : CatalogsFeedsCreateRequestDefaultLocale;
    Credentials : CatalogsFeedCredentials;
    Location : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    DefaultCountry : Country;
    DefaultAvailability : ProductAvailabilityType;
  }
  //#endregion
