namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EnhancedMatchStatusType =

  //#region EnhancedMatchStatusType

  let UNKNOWNEnum = "UNKNOWN"
  let NOTVALIDATEDEnum = "NOT_VALIDATED"
  let VALIDATINGINPROGRESSEnum = "VALIDATING_IN_PROGRESS"
  let VALIDATIONCOMPLETEEnum = "VALIDATION_COMPLETE"
  type EnhancedMatchStatusType = string

  //#endregion
