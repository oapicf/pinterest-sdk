namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsFeedsUpdateRequest
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsHotelFeedsUpdateRequest
open OpenAPI.Model.CatalogsRetailFeedsUpdateRequest
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType

module CatalogsVerticalFeedsUpdateRequest =

  //#region CatalogsVerticalFeedsUpdateRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsVerticalFeedsUpdateRequest = {
    CatalogType : CatalogTypeEnum;
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
