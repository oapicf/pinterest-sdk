namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics =

  //#region AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics

  [<CLIMutable>]
  type AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics = {
    [<JsonProperty(PropertyName = "custom_event_metrics_type")>]
    CustomEventMetricsType : string;
    [<JsonProperty(PropertyName = "custom_event_name")>]
    CustomEventName : string;
  }

  //#endregion
