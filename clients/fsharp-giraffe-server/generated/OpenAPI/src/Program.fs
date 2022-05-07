namespace OpenAPI

open System
open System.Net.Http
open System.Security.Claims
open System.Threading
open Microsoft.AspNetCore
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.Http
open Microsoft.AspNetCore.Http.Features
open Microsoft.AspNetCore.Authentication
open Microsoft.AspNetCore.Authentication.Cookies
open Microsoft.Extensions.Configuration
open Microsoft.Extensions.Logging
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open System.Diagnostics
open Giraffe.GiraffeViewEngine
open AspNet.Security.ApiKey.Providers

open AdAccountsApiHandlerParams
open BoardsApiHandlerParams
open CatalogsApiHandlerParams
open MediaApiHandlerParams
open OauthApiHandlerParams
open PinsApiHandlerParams
open UserAccountApiHandlerParams
open Giraffe

module App =

  // ---------------------------------
  // Error handler
  // ---------------------------------

  let errorHandler (ex : Exception) (logger : ILogger) =
    logger.LogError(EventId(), ex, "An unhandled exception has occurred while executing the request.")
    clearResponse >=> setStatusCode 500 >=> text ex.Message

  // ---------------------------------
  // Web app
  // ---------------------------------

  let HttpGet = GET
  let HttpPost = POST
  let HttpPut = PUT
  let HttpDelete = DELETE

  let authFailure : HttpHandler =
    setStatusCode 401 >=> text "You must be authenticated to access this resource."

  let webApp =
    choose (CustomHandlers.handlers @ [
      HttpGet >=> routeBind<AdAccountAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/analytics"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdAccountAnalytics x);
      HttpGet >=> route "/v5/ad_accounts" >=> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdAccountsList;
      HttpGet >=> routeBind<AdGroupsAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdGroupsAnalytics x);
      HttpGet >=> routeBind<AdGroupsListPathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdGroupsList x);
      HttpGet >=> routeBind<AdsAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/ads/analytics"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdsAnalytics x);
      HttpGet >=> routeBind<AdsListPathParams> "/v5/ad_accounts/{ad_account_id}/ads"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdsList x);
      HttpPost >=> routeBind<AnalyticsCreateReportPathParams> "/v5/ad_accounts/{ad_account_id}/reports"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AnalyticsCreateReport x);
      HttpGet >=> routeBind<AnalyticsGetReportPathParams> "/v5/ad_accounts/{ad_account_id}/reports"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AnalyticsGetReport x);
      HttpGet >=> routeBind<CampaignsAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/campaigns/analytics"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.CampaignsAnalytics x);
      HttpGet >=> routeBind<CampaignsListPathParams> "/v5/ad_accounts/{ad_account_id}/campaigns"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.CampaignsList x);
      HttpGet >=> routeBind<ProductGroupsAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/product_groups/analytics"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.ProductGroupsAnalytics x);
      HttpPost >=> routeBind<BoardSectionsCreatePathParams> "/v5/boards/{board_id}/sections"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsCreate x);
      HttpDelete >=> routeBind<BoardSectionsDeletePathParams> "/v5/boards/{board_id}/sections/{section_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsDelete x) x);
      HttpGet >=> routeBind<BoardSectionsListPathParams> "/v5/boards/{board_id}/sections"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsList x);
      HttpGet >=> routeBind<BoardSectionsListPinsPathParams> "/v5/boards/{board_id}/sections/{section_id}/pins"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsListPins x) x);
      HttpPatch >=> routeBind<BoardSectionsUpdatePathParams> "/v5/boards/{board_id}/sections/{section_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsUpdate x) x);
      HttpPost >=> route "/v5/boards" >=> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsCreate;
      HttpDelete >=> routeBind<BoardsDeletePathParams> "/v5/boards/{board_id}"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsDelete x);
      HttpGet >=> routeBind<BoardsGetPathParams> "/v5/boards/{board_id}"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsGet x);
      HttpGet >=> route "/v5/boards" >=> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsList;
      HttpGet >=> routeBind<BoardsListPinsPathParams> "/v5/boards/{board_id}/pins"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsListPins x);
      HttpPatch >=> routeBind<BoardsUpdatePathParams> "/v5/boards/{board_id}"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsUpdate x);
      HttpPost >=> route "/v5/catalogs/product_groups" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsCreate;
      HttpDelete >=> routeBind<CatalogsProductGroupsDeletePathParams> "/v5/catalogs/product_groups/{product_group_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsDelete x);
      HttpGet >=> route "/v5/catalogs/product_groups" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsList;
      HttpPatch >=> routeBind<CatalogsProductGroupsUpdatePathParams> "/v5/catalogs/product_groups/{product_group_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsUpdate x);
      HttpGet >=> routeBind<FeedProcessingResultsListPathParams> "/v5/catalogs/feeds/{feed_id}/processing_results"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedProcessingResultsList x);
      HttpPost >=> route "/v5/catalogs/feeds" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsCreate;
      HttpDelete >=> routeBind<FeedsDeletePathParams> "/v5/catalogs/feeds/{feed_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsDelete x);
      HttpGet >=> routeBind<FeedsGetPathParams> "/v5/catalogs/feeds/{feed_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsGet x);
      HttpGet >=> route "/v5/catalogs/feeds" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsList;
      HttpPatch >=> routeBind<FeedsUpdatePathParams> "/v5/catalogs/feeds/{feed_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsUpdate x);
      HttpGet >=> routeBind<ItemsBatchGetPathParams> "/v5/catalogs/items/batch/{batch_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.ItemsBatchGet x);
      HttpPost >=> route "/v5/catalogs/items/batch" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ItemsBatchPost;
      HttpGet >=> route "/v5/catalogs/items" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ItemsGet;
      HttpPost >=> route "/v5/media" >=> requiresAuthentication authFailure >=>  MediaApiHandler.MediaCreate;
      HttpGet >=> routeBind<MediaGetPathParams> "/v5/media/{media_id}"  (fun x -> requiresAuthentication authFailure >=>  MediaApiHandler.MediaGet x);
      HttpGet >=> route "/v5/media" >=> requiresAuthentication authFailure >=>  MediaApiHandler.MediaList;
      HttpPost >=> route "/v5/oauth/token" >=>  OauthApiHandler.OauthToken;
      HttpGet >=> routeBind<PinsAnalyticsPathParams> "/v5/pins/{pin_id}/analytics"  (fun x -> requiresAuthentication authFailure >=>  PinsApiHandler.PinsAnalytics x);
      HttpPost >=> route "/v5/pins" >=> requiresAuthentication authFailure >=>  PinsApiHandler.PinsCreate;
      HttpDelete >=> routeBind<PinsDeletePathParams> "/v5/pins/{pin_id}"  (fun x -> requiresAuthentication authFailure >=>  PinsApiHandler.PinsDelete x);
      HttpGet >=> routeBind<PinsGetPathParams> "/v5/pins/{pin_id}"  (fun x -> requiresAuthentication authFailure >=>  PinsApiHandler.PinsGet x);
      HttpGet >=> route "/v5/user_account/analytics" >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserAccountAnalytics;
      HttpGet >=> route "/v5/user_account" >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserAccountGet;
      RequestErrors.notFound (text "Not Found")
    ])
  // ---------------------------------
  // Main
  // ---------------------------------

  let configureApp (app : IApplicationBuilder) =
    app.UseGiraffeErrorHandler(errorHandler)
      .UseStaticFiles()
      .UseAuthentication()
      .UseResponseCaching() |> ignore
    CustomHandlers.configureApp app |> ignore
    app.UseGiraffe webApp |> ignore


  let configureServices (services : IServiceCollection) =
    services
          .AddResponseCaching()
          .AddGiraffe()
          |> AuthSchemes.configureServices
          |> CustomHandlers.configureServices services
          |> ignore
    services.AddDataProtection() |> ignore

  let configureLogging (loggerBuilder : ILoggingBuilder) =
    loggerBuilder.AddFilter(fun lvl -> lvl.Equals LogLevel.Error)
                  .AddConsole()
                  .AddDebug() |> ignore

  [<EntryPoint>]
  let main _ =
    let builder = WebHost.CreateDefaultBuilder()
                    .Configure(Action<IApplicationBuilder> configureApp)
                    .ConfigureServices(configureServices)
                    .ConfigureLogging(configureLogging)
                    |> CustomHandlers.configureWebHost
    builder.Build()
            .Run()
    0