namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsHotelFeedsUpdateRequest
open OpenAPI.Model.CatalogsRetailFeedsUpdateRequest
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType

module CatalogsVerticalFeedsUpdateRequest =

  //#region CatalogsVerticalFeedsUpdateRequest

  [<CLIMutable>]
  type CatalogsVerticalFeedsUpdateRequest = {
    [<JsonProperty(PropertyName = "default_currency")>]
    DefaultCurrency : NullableCurrency;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "format")>]
    Format : CatalogsFormat;
    [<JsonProperty(PropertyName = "credentials")>]
    Credentials : CatalogsFeedCredentials;
    [<JsonProperty(PropertyName = "location")>]
    Location : string;
    [<JsonProperty(PropertyName = "preferred_processing_schedule")>]
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    [<JsonProperty(PropertyName = "status")>]
    Status : CatalogsStatus;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "default_availability")>]
    DefaultAvailability : ProductAvailabilityType;
  }

  //#endregion
