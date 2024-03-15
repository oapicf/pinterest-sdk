namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFeedsUpdateRequest
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.CatalogsVerticalFeedsUpdateRequest
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType

module FeedsUpdateRequest =

  //#region FeedsUpdateRequest


  type feeds_update_request = {
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
