namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedIngestionDetails
open OpenAPI.Model.CatalogsFeedProcessingStatus
open OpenAPI.Model.CatalogsFeedProductCounts
open OpenAPI.Model.CatalogsFeedValidationDetails

module CatalogsFeedProcessingResultFields =

  //#region CatalogsFeedProcessingResultFields


  type catalogs_feed_processing_result_fields = {
    IngestionDetails : CatalogsFeedIngestionDetails;
    Status : CatalogsFeedProcessingStatus;
    ProductCounts : CatalogsFeedProductCounts;
    ValidationDetails : CatalogsFeedValidationDetails;
  }
  //#endregion
