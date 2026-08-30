namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CustomerSegment
open OpenAPI.Model.string option

module CustomerSegmentList200Response =

  //#region CustomerSegmentList200Response


  type customer_segment_list_200_response = {
    Bookmark : string option;
    Items : CustomerSegment[];
  }
  //#endregion
