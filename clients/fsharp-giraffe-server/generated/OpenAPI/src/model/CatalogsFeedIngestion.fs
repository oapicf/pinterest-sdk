namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedProcessingStatus

module CatalogsFeedIngestion =

  //#region CatalogsFeedIngestion


  type CatalogsFeedIngestion = {
    Id : string;
    FeedId : string;
    CreatedAt : DateTime;
    Status : CatalogsFeedProcessingStatus;
  }
  //#endregion
