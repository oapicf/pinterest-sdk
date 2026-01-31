namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedProcessingStatus

module CatalogsFeedIngestion =

  //#region CatalogsFeedIngestion


  type CatalogsFeedIngestion = {
    CreatedAt : DateTime;
    FeedId : string;
    Id : string;
    Status : CatalogsFeedProcessingStatus;
  }
  //#endregion
