namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinPromotionSummaryStatus
open OpenAPI.Model.string option

module AdResponseAllOf1 =

  //#region AdResponseAllOf1

  [<CLIMutable>]
  type AdResponseAllOf1 = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "campaign_id")>]
    CampaignId : string;
    [<JsonProperty(PropertyName = "collection_items_destination_url_template")>]
    CollectionItemsDestinationUrlTemplate : string option;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "rejected_reasons")>]
    RejectedReasons : string[];
    [<JsonProperty(PropertyName = "rejection_labels")>]
    RejectionLabels : string[];
    [<JsonProperty(PropertyName = "review_status")>]
    ReviewStatus : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
    [<JsonProperty(PropertyName = "summary_status")>]
    SummaryStatus : PinPromotionSummaryStatus;
  }

  //#endregion
