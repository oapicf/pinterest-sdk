namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RelatedTermsRelatedTermsListInner =

  //#region RelatedTermsRelatedTermsListInner

  [<CLIMutable>]
  type RelatedTermsRelatedTermsListInner = {
    [<JsonProperty(PropertyName = "related_terms")>]
    RelatedTerms : string[];
    [<JsonProperty(PropertyName = "term")>]
    Term : string;
  }

  //#endregion
