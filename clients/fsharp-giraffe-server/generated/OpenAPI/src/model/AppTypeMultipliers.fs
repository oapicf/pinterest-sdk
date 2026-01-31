namespace OpenAPI.Model

open System
open System.Collections.Generic
open System.Collections.Generic

module AppTypeMultipliers =

  //#region AppTypeMultipliers

  //#region enums
  type APPTYPEEnum = AndroidMobileEnum of string  |  AndroidTabletEnum of string  |  IpadEnum of string  |  IphoneEnum of string  |  WebEnum of string  |  WebMobileEnum of string  
  //#endregion

  type AppTypeMultipliers = {
    APP_TYPE : APPTYPEEnum;
  }
  //#endregion
