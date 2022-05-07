namespace OpenAPI.Model

open System
open System.Collections.Generic

module TrackingUrls =

  //#region TrackingUrls


  type TrackingUrls = {
    Impression : string[];
    Click : string[];
    Engagement : string[];
    BuyableButton : string[];
    AudienceVerification : string[];
  }
  //#endregion
