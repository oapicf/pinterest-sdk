namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open OpenAPI.AdvancedAuctionApiHandler
open OpenAPI.AdvancedAuctionApiHandlerParams

module AdvancedAuctionApiHandlerTestsHelper =


  let mutable AdvancedAuctionItemsGetPostExamples = Map.empty
  let mutable AdvancedAuctionItemsGetPostBody = ""

  AdvancedAuctionItemsGetPostBody <- WebUtility.HtmlDecode "{
  &quot;catalog_id&quot; : &quot;2680059592705&quot;,
  &quot;items&quot; : [ {
    &quot;country&quot; : &quot;AD&quot;,
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;language&quot; : &quot;EN&quot;
  }, {
    &quot;country&quot; : &quot;AD&quot;,
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;language&quot; : &quot;EN&quot;
  }, {
    &quot;country&quot; : &quot;AD&quot;,
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;language&quot; : &quot;EN&quot;
  }, {
    &quot;country&quot; : &quot;AD&quot;,
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;language&quot; : &quot;EN&quot;
  }, {
    &quot;country&quot; : &quot;AD&quot;,
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;language&quot; : &quot;EN&quot;
  } ]
}"
  AdvancedAuctionItemsGetPostExamples <- AdvancedAuctionItemsGetPostExamples.Add("application/json", AdvancedAuctionItemsGetPostBody)

  let getAdvancedAuctionItemsGetPostExample mediaType =
    AdvancedAuctionItemsGetPostExamples.[mediaType]
      |> getConverter mediaType

  let mutable AdvancedAuctionItemsSubmitPostExamples = Map.empty
  let mutable AdvancedAuctionItemsSubmitPostBody = ""

  AdvancedAuctionItemsSubmitPostBody <- WebUtility.HtmlDecode "{
  &quot;catalog_id&quot; : &quot;2680059592705&quot;,
  &quot;items&quot; : [ {
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;country&quot; : &quot;US&quot;,
    &quot;language&quot; : &quot;EN&quot;,
    &quot;operation&quot; : &quot;UPSERT&quot;,
    &quot;bid_options&quot; : {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;app_type_multipliers&quot; : {
        &quot;android_mobile&quot; : 1.1,
        &quot;android_tablet&quot; : 1.1,
        &quot;ipad&quot; : 1.2,
        &quot;iphone&quot; : 1.2,
        &quot;web&quot; : 0.9,
        &quot;web_mobile&quot; : 0.8
      }
    },
    &quot;update_mask&quot; : [ &quot;BID&quot;, &quot;APP_TYPE_BID_MULTIPLIER_SET&quot; ],
    &quot;errors&quot; : [ {
      &quot;code&quot; : 6,
      &quot;message&quot; : &quot;Bid in micro currency should be non-negative&quot;
    } ]
  }, {
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;country&quot; : &quot;US&quot;,
    &quot;language&quot; : &quot;EN&quot;,
    &quot;operation&quot; : &quot;UPSERT&quot;,
    &quot;bid_options&quot; : {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;app_type_multipliers&quot; : {
        &quot;android_mobile&quot; : 1.1,
        &quot;android_tablet&quot; : 1.1,
        &quot;ipad&quot; : 1.2,
        &quot;iphone&quot; : 1.2,
        &quot;web&quot; : 0.9,
        &quot;web_mobile&quot; : 0.8
      }
    },
    &quot;update_mask&quot; : [ &quot;BID&quot;, &quot;APP_TYPE_BID_MULTIPLIER_SET&quot; ],
    &quot;errors&quot; : [ {
      &quot;code&quot; : 6,
      &quot;message&quot; : &quot;Bid in micro currency should be non-negative&quot;
    } ]
  }, {
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;country&quot; : &quot;US&quot;,
    &quot;language&quot; : &quot;EN&quot;,
    &quot;operation&quot; : &quot;UPSERT&quot;,
    &quot;bid_options&quot; : {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;app_type_multipliers&quot; : {
        &quot;android_mobile&quot; : 1.1,
        &quot;android_tablet&quot; : 1.1,
        &quot;ipad&quot; : 1.2,
        &quot;iphone&quot; : 1.2,
        &quot;web&quot; : 0.9,
        &quot;web_mobile&quot; : 0.8
      }
    },
    &quot;update_mask&quot; : [ &quot;BID&quot;, &quot;APP_TYPE_BID_MULTIPLIER_SET&quot; ],
    &quot;errors&quot; : [ {
      &quot;code&quot; : 6,
      &quot;message&quot; : &quot;Bid in micro currency should be non-negative&quot;
    } ]
  }, {
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;country&quot; : &quot;US&quot;,
    &quot;language&quot; : &quot;EN&quot;,
    &quot;operation&quot; : &quot;UPSERT&quot;,
    &quot;bid_options&quot; : {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;app_type_multipliers&quot; : {
        &quot;android_mobile&quot; : 1.1,
        &quot;android_tablet&quot; : 1.1,
        &quot;ipad&quot; : 1.2,
        &quot;iphone&quot; : 1.2,
        &quot;web&quot; : 0.9,
        &quot;web_mobile&quot; : 0.8
      }
    },
    &quot;update_mask&quot; : [ &quot;BID&quot;, &quot;APP_TYPE_BID_MULTIPLIER_SET&quot; ],
    &quot;errors&quot; : [ {
      &quot;code&quot; : 6,
      &quot;message&quot; : &quot;Bid in micro currency should be non-negative&quot;
    } ]
  }, {
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;country&quot; : &quot;US&quot;,
    &quot;language&quot; : &quot;EN&quot;,
    &quot;operation&quot; : &quot;UPSERT&quot;,
    &quot;bid_options&quot; : {
      &quot;bid_in_micro_currency&quot; : 5000000,
      &quot;app_type_multipliers&quot; : {
        &quot;android_mobile&quot; : 1.1,
        &quot;android_tablet&quot; : 1.1,
        &quot;ipad&quot; : 1.2,
        &quot;iphone&quot; : 1.2,
        &quot;web&quot; : 0.9,
        &quot;web_mobile&quot; : 0.8
      }
    },
    &quot;update_mask&quot; : [ &quot;BID&quot;, &quot;APP_TYPE_BID_MULTIPLIER_SET&quot; ],
    &quot;errors&quot; : [ {
      &quot;code&quot; : 6,
      &quot;message&quot; : &quot;Bid in micro currency should be non-negative&quot;
    } ]
  } ]
}"
  AdvancedAuctionItemsSubmitPostExamples <- AdvancedAuctionItemsSubmitPostExamples.Add("application/json", AdvancedAuctionItemsSubmitPostBody)

  let getAdvancedAuctionItemsSubmitPostExample mediaType =
    AdvancedAuctionItemsSubmitPostExamples.[mediaType]
      |> getConverter mediaType
