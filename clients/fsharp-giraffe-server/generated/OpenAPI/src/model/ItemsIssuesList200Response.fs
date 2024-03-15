namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsItemValidationIssues
open OpenAPI.Model.string option

module ItemsIssuesList200Response =

  //#region ItemsIssuesList200Response


  type items_issues_list_200_response = {
    Items : CatalogsItemValidationIssues[];
    Bookmark : string option;
  }
  //#endregion
