namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RelatedTermsRelatedTermsListItems =

  //#region RelatedTermsRelatedTermsListItems

  [<CLIMutable>]
  type RelatedTermsRelatedTermsListItems = {
    [<JsonProperty(PropertyName = "related_terms")>]
    RelatedTerms : string[];
    [<JsonProperty(PropertyName = "term")>]
    Term : string;
  }

  //#endregion
