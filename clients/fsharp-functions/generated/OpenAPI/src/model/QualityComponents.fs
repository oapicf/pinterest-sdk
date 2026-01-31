namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.QualityComponentDetails
open System.Collections.Generic

module QualityComponents =

  //#region QualityComponents

  [<CLIMutable>]
  type QualityComponents = {
    [<JsonProperty(PropertyName = "advertiser_external_id")>]
    AdvertiserExternalId : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "click_id_epik")>]
    ClickIdEpik : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "external_event_id")>]
    ExternalEventId : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "hashed_email")>]
    HashedEmail : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "hashed_maid")>]
    HashedMaid : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "ip_address")>]
    IpAddress : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "order_id")>]
    OrderId : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "order_value")>]
    OrderValue : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "product_id")>]
    ProductId : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "source_url")>]
    SourceUrl : IDictionary<string, QualityComponentDetails>;
    [<JsonProperty(PropertyName = "user_agent")>]
    UserAgent : IDictionary<string, QualityComponentDetails>;
  }

  //#endregion
