namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RelatedTermsRelatedTermsListItems

module RelatedTerms =

  //#region RelatedTerms


  type RelatedTerms = {
    Id : string;
    RelatedTermCount : int;
    RelatedTermsList : RelatedTermsRelatedTermsListItems[];
  }
  //#endregion
