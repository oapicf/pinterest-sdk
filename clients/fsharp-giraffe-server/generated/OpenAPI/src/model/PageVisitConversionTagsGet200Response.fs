namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionEventResponse
open OpenAPI.Model.string option

module PageVisitConversionTagsGet200Response =

  //#region PageVisitConversionTagsGet200Response


  type page_visit_conversion_tags_get_200_response = {
    Bookmark : string option;
    Items : ConversionEventResponse[];
  }
  //#endregion
