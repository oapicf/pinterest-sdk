namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module AudienceDefinition =

  //#region AudienceDefinition


  type AudienceDefinition = {
    Date : string option;
    Type : string;
    Scope : string;
  }
  //#endregion
