namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedProcessingResult
open OpenAPI.Model.string option

module FeedProcessingResultsList200Response =

  //#region FeedProcessingResultsList200Response


  type feed_processing_results_list_200_response = {
    Items : CatalogsFeedProcessingResult[];
    Bookmark : string option;
  }
  //#endregion
