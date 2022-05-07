namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsDbItem
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.Country
open OpenAPI.Model.FeedFields
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType
open OpenAPI.Model.string option

module CatalogsFeed =

  //#region CatalogsFeed

  [<CLIMutable>]
  type CatalogsFeed = {
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "updated_at")>]
    UpdatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "default_country")>]
    DefaultCountry : Country;
    [<JsonProperty(PropertyName = "default_availability")>]
    DefaultAvailability : ProductAvailabilityType;
    [<JsonProperty(PropertyName = "default_currency")>]
    DefaultCurrency : NullableCurrency;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "format")>]
    Format : CatalogsFormat;
    [<JsonProperty(PropertyName = "default_locale")>]
    DefaultLocale : string;
    [<JsonProperty(PropertyName = "credentials")>]
    Credentials : CatalogsFeedCredentials;
    [<JsonProperty(PropertyName = "location")>]
    Location : string;
    [<JsonProperty(PropertyName = "preferred_processing_schedule")>]
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    [<JsonProperty(PropertyName = "status")>]
    Status : CatalogsStatus;
  }

  //#endregion
