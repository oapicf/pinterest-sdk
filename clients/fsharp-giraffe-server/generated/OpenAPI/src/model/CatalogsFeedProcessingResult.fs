namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedIngestionDetails
open OpenAPI.Model.CatalogsFeedProcessingStatus
open OpenAPI.Model.CatalogsFeedProductCounts
open OpenAPI.Model.CatalogsFeedValidationDetails
open OpenAPI.Model.CatalogsFeedVideoCounts

module CatalogsFeedProcessingResult =

  //#region CatalogsFeedProcessingResult


  type CatalogsFeedProcessingResult = {
    CreatedAt : DateTime;
    Id : string;
    IngestionDetails : CatalogsFeedIngestionDetails;
    ProductCounts : CatalogsFeedProductCounts;
    Status : CatalogsFeedProcessingStatus;
    UpdatedAt : DateTime;
    ValidationDetails : CatalogsFeedValidationDetails;
    VideoCounts : CatalogsFeedVideoCounts;
  }
  //#endregion
