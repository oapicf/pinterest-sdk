namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RelatedTermsRelatedTermsListInner

module RelatedTerms =

  //#region RelatedTerms


  type RelatedTerms = {
    Id : string;
    RelatedTermCount : int;
    RelatedTermsList : RelatedTermsRelatedTermsListInner[];
  }
  //#endregion
