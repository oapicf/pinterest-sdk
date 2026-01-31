namespace OpenAPI.Model

open System
open System.Collections.Generic

module AudienceDefinitionType =

  //#region AudienceDefinitionType

  //#region enums
  type ScopeEnum = IMPRESSIONPLUSENGAGEMENTEnum of string  |  ENGAGEMENTEnum of string  
  //#endregion

  type AudienceDefinitionType = {
    Scope : ScopeEnum;
  }
  //#endregion
