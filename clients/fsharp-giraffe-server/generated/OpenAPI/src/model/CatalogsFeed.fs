namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type CatalogsFeed = {
    CreatedAt : Nullable<DateTime>;
    Id : string;
    UpdatedAt : Nullable<DateTime>;
    DefaultCountry : Country;
    DefaultAvailability : ProductAvailabilityType;
    DefaultCurrency : NullableCurrency;
    Name : string option;
    Format : CatalogsFormat;
    DefaultLocale : string;
    Credentials : CatalogsFeedCredentials;
    Location : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
