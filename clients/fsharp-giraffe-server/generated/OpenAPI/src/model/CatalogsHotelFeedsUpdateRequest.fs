namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedCredentials
open OpenAPI.Model.CatalogsFeedProcessingSchedule
open OpenAPI.Model.CatalogsFormat
open OpenAPI.Model.CatalogsStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.NullableCurrency

module CatalogsHotelFeedsUpdateRequest =

  //#region CatalogsHotelFeedsUpdateRequest


  type CatalogsHotelFeedsUpdateRequest = {
    DefaultCurrency : NullableCurrency;
    Name : string;
    Format : CatalogsFormat;
    Credentials : CatalogsFeedCredentials;
    Location : string;
    PreferredProcessingSchedule : CatalogsFeedProcessingSchedule;
    Status : CatalogsStatus;
    CatalogType : CatalogsType;
  }
  //#endregion
