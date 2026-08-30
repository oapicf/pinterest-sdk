namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsFeedsCreateRequest
open OpenAPI.Model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsHotelFeedsCreateRequest
open OpenAPI.Model.CatalogsRetailFeedsCreateRequest
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.Country
open OpenAPI.Model.NullableCurrency
open OpenAPI.Model.ProductAvailabilityType

module CatalogsVerticalFeedsCreateRequest =

  //#region CatalogsVerticalFeedsCreateRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsVerticalFeedsCreateRequest = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Credentials : CatalogsFeedCredentials;
    DefaultAvailability : ProductAvailabilityType;
    DefaultCountry : Country;
    DefaultCurrency : NullableCurrency;
    DefaultLocale : CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
    Format : CatalogsFormat;
    Location : string;
    Name : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
  }
  //#endregion
