namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType

module CatalogsFeedsUpdateRequest =

  //#region CatalogsFeedsUpdateRequest


  type CatalogsFeedsUpdateRequest = {
    DefaultAvailability : ProductAvailabilityType;
    DefaultCurrency : NullableCurrency;
    Name : string;
    Format : CatalogsFormat;
    Credentials : CatalogsFeedCredentials;
    Location : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
