namespace OpenAPI.Model

open System
open System.Collections.Generic

module TrackingUrls =

  //#region TrackingUrls


  type TrackingUrls = {
    AudienceVerification : string[];
    BuyableButton : string[];
    Click : string[];
    Engagement : string[];
    Impression : string[];
  }
  //#endregion
