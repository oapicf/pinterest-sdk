namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedIngestionErrors
open OpenAPI.Model.CatalogsFeedIngestionInfo

module CatalogsFeedIngestionDetails =

  //#region CatalogsFeedIngestionDetails


  type CatalogsFeedIngestionDetails = {
    Errors : CatalogsFeedIngestionErrors;
    Info : CatalogsFeedIngestionInfo;
  }
  //#endregion
