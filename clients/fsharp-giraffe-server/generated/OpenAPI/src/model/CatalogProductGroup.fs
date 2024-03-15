namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Board
open OpenAPI.Model.EntityStatus

module CatalogProductGroup =

  //#region CatalogProductGroup


  type CatalogProductGroup = {
    Id : string;
    MerchantId : string;
    Name : string;
    Filters : obj;
    FilterV2 : obj;
    Type : Board;
    Status : EntityStatus;
    FeedProfileId : string;
    CreatedAt : int;
    LastUpdate : int;
    ProductCount : int;
    FeaturedPosition : int;
  }
  //#endregion
