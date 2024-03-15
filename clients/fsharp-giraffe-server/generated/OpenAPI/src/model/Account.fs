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
    AccountType : AccountTypeEnum;
    Id : string;
    ProfileImage : string;
    WebsiteUrl : string;
    Username : string;
    About : string;
    BusinessName : string option;
    BoardCount : int option;
    PinCount : int option;
    FollowerCount : int option;
    FollowingCount : int option;
    MonthlyViews : int option;
  }
  //#endregion
