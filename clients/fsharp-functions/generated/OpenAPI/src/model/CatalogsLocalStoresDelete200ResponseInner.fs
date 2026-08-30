namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignAdPreviewDelete200ResponseInnerStatus

module CatalogsLocalStoresDelete200ResponseInner =

  //#region CatalogsLocalStoresDelete200ResponseInner

  [<CLIMutable>]
  type CatalogsLocalStoresDelete200ResponseInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : CampaignAdPreviewDelete200ResponseInnerStatus;
  }

  //#endregion
