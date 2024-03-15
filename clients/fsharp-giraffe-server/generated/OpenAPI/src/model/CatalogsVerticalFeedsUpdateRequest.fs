namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type CatalogsVerticalFeedsUpdateRequest = {
    DefaultCurrency : NullableCurrency;
    Name : string;
    Format : CatalogsFormat;
    Credentials : CatalogsFeedCredentials;
    Location : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
    CatalogType : CatalogsType;
    DefaultAvailability : ProductAvailabilityType;
  }
  //#endregion
