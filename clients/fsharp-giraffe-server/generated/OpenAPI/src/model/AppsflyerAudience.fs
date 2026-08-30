namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AppsflyerPlatform

module AppsflyerAudience =

  //#region AppsflyerAudience


  type AppsflyerAudience = {
    ContainerId : string;
    Name : string;
    Platform : AppsflyerPlatform;
  }
  //#endregion
