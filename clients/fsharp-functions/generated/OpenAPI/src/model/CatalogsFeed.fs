namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsFeed
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsHotelFeed
open OpenAPI.Model.CatalogsRetailFeed
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType
open OpenAPI.Model.string option

module CatalogsFeed =

  //#region CatalogsFeed

  [<CLIMutable>]
  type CatalogsFeed = {
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : DateTime;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "updated_at")>]
    UpdatedAt : DateTime;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "format")>]
    Format : CatalogsFormat;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "credentials")>]
    Credentials : CatalogsFeedCredentials;
    [<JsonProperty(PropertyName = "location")>]
    Location : string;
    [<JsonProperty(PropertyName = "preferred_processing_schedule")>]
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    [<JsonProperty(PropertyName = "status")>]
    Status : CatalogsStatus;
    [<JsonProperty(PropertyName = "default_currency")>]
    DefaultCurrency : NullableCurrency;
    [<JsonProperty(PropertyName = "default_locale")>]
    DefaultLocale : string;
    [<JsonProperty(PropertyName = "default_country")>]
    DefaultCountry : Country;
    [<JsonProperty(PropertyName = "default_availability")>]
    DefaultAvailability : ProductAvailabilityType;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string option;
  }

  //#endregion
