namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdGroupAudienceSizing =

  //#region AdGroupAudienceSizing

  [<CLIMutable>]
  type AdGroupAudienceSizing = {
    [<JsonProperty(PropertyName = "audience_size_lower_bound")>]
    AudienceSizeLowerBound : decimal;
    [<JsonProperty(PropertyName = "audience_size_upper_bound")>]
    AudienceSizeUpperBound : decimal;
  }

  //#endregion
