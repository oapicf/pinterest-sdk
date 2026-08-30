namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdeColumnType

module CustomConversionEventMetrics =

  //#region CustomConversionEventMetrics

  [<CLIMutable>]
  type CustomConversionEventMetrics = {
    [<JsonProperty(PropertyName = "custom_event_metrics_type")>]
    CustomEventMetricsType : AdeColumnType;
    [<JsonProperty(PropertyName = "custom_event_name")>]
    CustomEventName : string;
  }

  //#endregion
