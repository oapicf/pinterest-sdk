namespace OpenAPI.Model

open System
open System.Collections.Generic

module AudienceDefinitionScope =

  //#region AudienceDefinitionScope

  //#region enums
  type ScopeEnum = PARTNEREnum of string  |  PINTERESTEnum of string  
  //#endregion

  type AudienceDefinitionScope = {
    Scope : ScopeEnum;
  }
  //#endregion
