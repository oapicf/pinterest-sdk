namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module Account =

  //#region Account

  //#region enums
  type AccountTypeEnum = PINNEREnum of string  |  BUSINESSEnum of string  
  //#endregion

  type Account = {
    About : string;
    AccountType : AccountTypeEnum;
    BoardCount : int option;
    BusinessName : string option;
    FollowerCount : int option;
    FollowingCount : int option;
    Id : string;
    MonthlyViews : int option;
    PinCount : int option;
    ProfileImage : string;
    Username : string;
    WebsiteUrl : string;
  }
  //#endregion
