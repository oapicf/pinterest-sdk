namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RelatedTermsRelatedTermsListInner

module RelatedTerms =

  //#region RelatedTerms

  [<CLIMutable>]
  type RelatedTerms = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "related_term_count")>]
    RelatedTermCount : int;
    [<JsonProperty(PropertyName = "related_terms_list")>]
    RelatedTermsList : RelatedTermsRelatedTermsListInner[];
  }

  //#endregion
