namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkCampaignDeliveryEstimatesItem

module BulkCampaignDeliveryEstimatesResponse =

  //#region BulkCampaignDeliveryEstimatesResponse

  [<CLIMutable>]
  type BulkCampaignDeliveryEstimatesResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : BulkCampaignDeliveryEstimatesItem[];
  }

  //#endregion
