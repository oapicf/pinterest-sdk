namespace OpenAPI.Model

open System
open System.Collections.Generic

module ConversionEventAppInfo =

  //#region ConversionEventAppInfo


  type ConversionEventAppInfo = {
    AppId : string;
    AppName : string;
    AppPackageName : string;
    AppStore : string;
    AppVersion : string;
    InstallTime : int;
    UserAgent : string;
    WindowHeight : int;
    WindowWidth : int;
  }
  //#endregion
