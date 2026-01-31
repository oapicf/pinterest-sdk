namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.QualityComponentIssue

module QualityComponentDetails =

  //#region QualityComponentDetails


  type QualityComponentDetails = {
    Coverage : decimal;
    Issues : QualityComponentIssue[];
    Overlap : decimal;
  }
  //#endregion
