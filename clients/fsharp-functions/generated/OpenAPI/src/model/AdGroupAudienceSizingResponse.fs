namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdGroupAudienceSizingResponse =

  //#region AdGroupAudienceSizingResponse

  [<CLIMutable>]
  type AdGroupAudienceSizingResponse = {
    [<JsonProperty(PropertyName = "audience_size_lower_bound")>]
    AudienceSizeLowerBound : decimal;
    [<JsonProperty(PropertyName = "audience_size_upper_bound")>]
    AudienceSizeUpperBound : decimal;
  }

  //#endregion
