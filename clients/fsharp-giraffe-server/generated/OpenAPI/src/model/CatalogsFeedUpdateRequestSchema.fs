namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFeedsUpdateRequest
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsVerticalFeedsUpdateRequest
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType

module CatalogsFeedUpdateRequestSchema =

  //#region CatalogsFeedUpdateRequestSchema


  type CatalogsFeedUpdateRequestSchema = {
    Credentials : CatalogsFeedCredentials;
    DefaultAvailability : ProductAvailabilityType;
    DefaultCurrency : NullableCurrency;
    Format : CatalogsFormat;
    Location : string;
    Name : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
