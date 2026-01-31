namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionEventAppInfo =

  //#region ConversionEventAppInfo

  [<CLIMutable>]
  type ConversionEventAppInfo = {
    [<JsonProperty(PropertyName = "app_id")>]
    AppId : string;
    [<JsonProperty(PropertyName = "app_name")>]
    AppName : string;
    [<JsonProperty(PropertyName = "app_package_name")>]
    AppPackageName : string;
    [<JsonProperty(PropertyName = "app_store")>]
    AppStore : string;
    [<JsonProperty(PropertyName = "app_version")>]
    AppVersion : string;
    [<JsonProperty(PropertyName = "install_time")>]
    InstallTime : int;
    [<JsonProperty(PropertyName = "user_agent")>]
    UserAgent : string;
    [<JsonProperty(PropertyName = "window_height")>]
    WindowHeight : int;
    [<JsonProperty(PropertyName = "window_width")>]
    WindowWidth : int;
  }

  //#endregion
