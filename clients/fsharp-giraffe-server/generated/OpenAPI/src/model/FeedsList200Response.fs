namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.string option

module FeedsList200Response =

  //#region FeedsList200Response


  type feeds_list_200_response = {
    Items : CatalogsFeed[];
    Bookmark : string option;
  }
  //#endregion
