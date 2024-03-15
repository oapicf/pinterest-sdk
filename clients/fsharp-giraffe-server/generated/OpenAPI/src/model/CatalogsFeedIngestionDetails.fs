namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedIngestionErrors
open OpenAPI.Model.CatalogsFeedIngestionInfo
open OpenAPI.Model.CatalogsFeedIngestionWarnings

module CatalogsFeedIngestionDetails =

  //#region CatalogsFeedIngestionDetails


  type CatalogsFeedIngestionDetails = {
    Errors : CatalogsFeedIngestionErrors;
    Info : CatalogsFeedIngestionInfo;
    Warnings : CatalogsFeedIngestionWarnings;
  }
  //#endregion
