namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsDbItem
open OpenAPI.Model.CatalogsFeedIngestionDetails
open OpenAPI.Model.CatalogsFeedProcessingResultFields
open OpenAPI.Model.CatalogsFeedProcessingStatus
open OpenAPI.Model.CatalogsFeedProductCounts
open OpenAPI.Model.CatalogsFeedValidationDetails

module CatalogsFeedProcessingResult =

  //#region CatalogsFeedProcessingResult


  type CatalogsFeedProcessingResult = {
    CreatedAt : Nullable<DateTime>;
    Id : string;
    UpdatedAt : Nullable<DateTime>;
    IngestionDetails : CatalogsFeedIngestionDetails;
    Status : CatalogsFeedProcessingStatus;
    ProductCounts : CatalogsFeedProductCounts;
    ValidationDetails : CatalogsFeedValidationDetails;
  }
  //#endregion
