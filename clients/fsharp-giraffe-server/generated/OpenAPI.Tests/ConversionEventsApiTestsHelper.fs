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
open OpenAPI.ConversionEventsApiHandler
open OpenAPI.ConversionEventsApiHandlerParams

module ConversionEventsApiHandlerTestsHelper =


  let mutable EventsCreateExamples = Map.empty
  let mutable EventsCreateBody = ""

  EventsCreateBody <- WebUtility.HtmlDecode "{
  &quot;data&quot; : [ {
    &quot;action_source&quot; : &quot;app_ios&quot;,
    &quot;wifi&quot; : false,
    &quot;opt_out&quot; : false,
    &quot;app_version&quot; : &quot;7.9&quot;,
    &quot;device_model&quot; : &quot;iPhone X&quot;,
    &quot;partner_name&quot; : &quot;ss-partnername&quot;,
    &quot;os_version&quot; : &quot;12.1.4&quot;,
    &quot;device_type&quot; : &quot;iPhone&quot;,
    &quot;language&quot; : &quot;en&quot;,
    &quot;user_data&quot; : {
      &quot;ct&quot; : [ &quot;4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36&quot; ],
      &quot;st&quot; : [ &quot;49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34&quot; ],
      &quot;country&quot; : [ &quot;9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d&quot; ],
      &quot;ln&quot; : [ &quot;7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19&quot; ],
      &quot;partner_id&quot; : &quot;BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc&quot;,
      &quot;click_id&quot; : &quot;dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv&quot;,
      &quot;zp&quot; : [ &quot;fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145&quot; ],
      &quot;ph&quot; : [ &quot;45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d&quot; ],
      &quot;fn&quot; : [ &quot;ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2&quot; ],
      &quot;external_id&quot; : [ &quot;6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee&quot; ],
      &quot;ge&quot; : [ &quot;0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf&quot; ],
      &quot;db&quot; : [ &quot;d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739&quot; ]
    },
    &quot;device_carrier&quot; : &quot;T-Mobile&quot;,
    &quot;event_source_url&quot; : &quot;https://www.my-clothing-shop.org/&quot;,
    &quot;app_name&quot; : &quot;Pinterest&quot;,
    &quot;event_id&quot; : &quot;eventId0001&quot;,
    &quot;device_brand&quot; : &quot;Apple&quot;,
    &quot;event_name&quot; : &quot;checkout&quot;,
    &quot;custom_data&quot; : {
      &quot;content_name&quot; : &quot;pinterest-themed-clothing&quot;,
      &quot;content_ids&quot; : [ &quot;red-pinterest-shirt-logo-1&quot;, &quot;purple-pinterest-shirt-logo-3&quot; ],
      &quot;np&quot; : &quot;ss-company&quot;,
      &quot;content_category&quot; : &quot;shirts&quot;,
      &quot;contents&quot; : [ {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      }, {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      } ],
      &quot;num_items&quot; : 2,
      &quot;opt_out_type&quot; : &quot;LDP&quot;,
      &quot;content_brand&quot; : &quot;pinterest-brand&quot;,
      &quot;currency&quot; : &quot;USD&quot;,
      &quot;search_string&quot; : &quot;sample string&quot;,
      &quot;value&quot; : &quot;72.39&quot;,
      &quot;order_id&quot; : &quot;my_order_id&quot;
    },
    &quot;app_id&quot; : &quot;429047995&quot;,
    &quot;event_time&quot; : 1451431341
  }, {
    &quot;action_source&quot; : &quot;app_ios&quot;,
    &quot;wifi&quot; : false,
    &quot;opt_out&quot; : false,
    &quot;app_version&quot; : &quot;7.9&quot;,
    &quot;device_model&quot; : &quot;iPhone X&quot;,
    &quot;partner_name&quot; : &quot;ss-partnername&quot;,
    &quot;os_version&quot; : &quot;12.1.4&quot;,
    &quot;device_type&quot; : &quot;iPhone&quot;,
    &quot;language&quot; : &quot;en&quot;,
    &quot;user_data&quot; : {
      &quot;ct&quot; : [ &quot;4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36&quot; ],
      &quot;st&quot; : [ &quot;49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34&quot; ],
      &quot;country&quot; : [ &quot;9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d&quot; ],
      &quot;ln&quot; : [ &quot;7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19&quot; ],
      &quot;partner_id&quot; : &quot;BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc&quot;,
      &quot;click_id&quot; : &quot;dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv&quot;,
      &quot;zp&quot; : [ &quot;fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145&quot; ],
      &quot;ph&quot; : [ &quot;45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d&quot; ],
      &quot;fn&quot; : [ &quot;ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2&quot; ],
      &quot;external_id&quot; : [ &quot;6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee&quot; ],
      &quot;ge&quot; : [ &quot;0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf&quot; ],
      &quot;db&quot; : [ &quot;d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739&quot; ]
    },
    &quot;device_carrier&quot; : &quot;T-Mobile&quot;,
    &quot;event_source_url&quot; : &quot;https://www.my-clothing-shop.org/&quot;,
    &quot;app_name&quot; : &quot;Pinterest&quot;,
    &quot;event_id&quot; : &quot;eventId0001&quot;,
    &quot;device_brand&quot; : &quot;Apple&quot;,
    &quot;event_name&quot; : &quot;checkout&quot;,
    &quot;custom_data&quot; : {
      &quot;content_name&quot; : &quot;pinterest-themed-clothing&quot;,
      &quot;content_ids&quot; : [ &quot;red-pinterest-shirt-logo-1&quot;, &quot;purple-pinterest-shirt-logo-3&quot; ],
      &quot;np&quot; : &quot;ss-company&quot;,
      &quot;content_category&quot; : &quot;shirts&quot;,
      &quot;contents&quot; : [ {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      }, {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      } ],
      &quot;num_items&quot; : 2,
      &quot;opt_out_type&quot; : &quot;LDP&quot;,
      &quot;content_brand&quot; : &quot;pinterest-brand&quot;,
      &quot;currency&quot; : &quot;USD&quot;,
      &quot;search_string&quot; : &quot;sample string&quot;,
      &quot;value&quot; : &quot;72.39&quot;,
      &quot;order_id&quot; : &quot;my_order_id&quot;
    },
    &quot;app_id&quot; : &quot;429047995&quot;,
    &quot;event_time&quot; : 1451431341
  }, {
    &quot;action_source&quot; : &quot;app_ios&quot;,
    &quot;wifi&quot; : false,
    &quot;opt_out&quot; : false,
    &quot;app_version&quot; : &quot;7.9&quot;,
    &quot;device_model&quot; : &quot;iPhone X&quot;,
    &quot;partner_name&quot; : &quot;ss-partnername&quot;,
    &quot;os_version&quot; : &quot;12.1.4&quot;,
    &quot;device_type&quot; : &quot;iPhone&quot;,
    &quot;language&quot; : &quot;en&quot;,
    &quot;user_data&quot; : {
      &quot;ct&quot; : [ &quot;4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36&quot; ],
      &quot;st&quot; : [ &quot;49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34&quot; ],
      &quot;country&quot; : [ &quot;9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d&quot; ],
      &quot;ln&quot; : [ &quot;7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19&quot; ],
      &quot;partner_id&quot; : &quot;BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc&quot;,
      &quot;click_id&quot; : &quot;dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv&quot;,
      &quot;zp&quot; : [ &quot;fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145&quot; ],
      &quot;ph&quot; : [ &quot;45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d&quot; ],
      &quot;fn&quot; : [ &quot;ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2&quot; ],
      &quot;external_id&quot; : [ &quot;6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee&quot; ],
      &quot;ge&quot; : [ &quot;0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf&quot; ],
      &quot;db&quot; : [ &quot;d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739&quot; ]
    },
    &quot;device_carrier&quot; : &quot;T-Mobile&quot;,
    &quot;event_source_url&quot; : &quot;https://www.my-clothing-shop.org/&quot;,
    &quot;app_name&quot; : &quot;Pinterest&quot;,
    &quot;event_id&quot; : &quot;eventId0001&quot;,
    &quot;device_brand&quot; : &quot;Apple&quot;,
    &quot;event_name&quot; : &quot;checkout&quot;,
    &quot;custom_data&quot; : {
      &quot;content_name&quot; : &quot;pinterest-themed-clothing&quot;,
      &quot;content_ids&quot; : [ &quot;red-pinterest-shirt-logo-1&quot;, &quot;purple-pinterest-shirt-logo-3&quot; ],
      &quot;np&quot; : &quot;ss-company&quot;,
      &quot;content_category&quot; : &quot;shirts&quot;,
      &quot;contents&quot; : [ {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      }, {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      } ],
      &quot;num_items&quot; : 2,
      &quot;opt_out_type&quot; : &quot;LDP&quot;,
      &quot;content_brand&quot; : &quot;pinterest-brand&quot;,
      &quot;currency&quot; : &quot;USD&quot;,
      &quot;search_string&quot; : &quot;sample string&quot;,
      &quot;value&quot; : &quot;72.39&quot;,
      &quot;order_id&quot; : &quot;my_order_id&quot;
    },
    &quot;app_id&quot; : &quot;429047995&quot;,
    &quot;event_time&quot; : 1451431341
  }, {
    &quot;action_source&quot; : &quot;app_ios&quot;,
    &quot;wifi&quot; : false,
    &quot;opt_out&quot; : false,
    &quot;app_version&quot; : &quot;7.9&quot;,
    &quot;device_model&quot; : &quot;iPhone X&quot;,
    &quot;partner_name&quot; : &quot;ss-partnername&quot;,
    &quot;os_version&quot; : &quot;12.1.4&quot;,
    &quot;device_type&quot; : &quot;iPhone&quot;,
    &quot;language&quot; : &quot;en&quot;,
    &quot;user_data&quot; : {
      &quot;ct&quot; : [ &quot;4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36&quot; ],
      &quot;st&quot; : [ &quot;49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34&quot; ],
      &quot;country&quot; : [ &quot;9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d&quot; ],
      &quot;ln&quot; : [ &quot;7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19&quot; ],
      &quot;partner_id&quot; : &quot;BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc&quot;,
      &quot;click_id&quot; : &quot;dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv&quot;,
      &quot;zp&quot; : [ &quot;fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145&quot; ],
      &quot;ph&quot; : [ &quot;45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d&quot; ],
      &quot;fn&quot; : [ &quot;ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2&quot; ],
      &quot;external_id&quot; : [ &quot;6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee&quot; ],
      &quot;ge&quot; : [ &quot;0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf&quot; ],
      &quot;db&quot; : [ &quot;d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739&quot; ]
    },
    &quot;device_carrier&quot; : &quot;T-Mobile&quot;,
    &quot;event_source_url&quot; : &quot;https://www.my-clothing-shop.org/&quot;,
    &quot;app_name&quot; : &quot;Pinterest&quot;,
    &quot;event_id&quot; : &quot;eventId0001&quot;,
    &quot;device_brand&quot; : &quot;Apple&quot;,
    &quot;event_name&quot; : &quot;checkout&quot;,
    &quot;custom_data&quot; : {
      &quot;content_name&quot; : &quot;pinterest-themed-clothing&quot;,
      &quot;content_ids&quot; : [ &quot;red-pinterest-shirt-logo-1&quot;, &quot;purple-pinterest-shirt-logo-3&quot; ],
      &quot;np&quot; : &quot;ss-company&quot;,
      &quot;content_category&quot; : &quot;shirts&quot;,
      &quot;contents&quot; : [ {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      }, {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      } ],
      &quot;num_items&quot; : 2,
      &quot;opt_out_type&quot; : &quot;LDP&quot;,
      &quot;content_brand&quot; : &quot;pinterest-brand&quot;,
      &quot;currency&quot; : &quot;USD&quot;,
      &quot;search_string&quot; : &quot;sample string&quot;,
      &quot;value&quot; : &quot;72.39&quot;,
      &quot;order_id&quot; : &quot;my_order_id&quot;
    },
    &quot;app_id&quot; : &quot;429047995&quot;,
    &quot;event_time&quot; : 1451431341
  }, {
    &quot;action_source&quot; : &quot;app_ios&quot;,
    &quot;wifi&quot; : false,
    &quot;opt_out&quot; : false,
    &quot;app_version&quot; : &quot;7.9&quot;,
    &quot;device_model&quot; : &quot;iPhone X&quot;,
    &quot;partner_name&quot; : &quot;ss-partnername&quot;,
    &quot;os_version&quot; : &quot;12.1.4&quot;,
    &quot;device_type&quot; : &quot;iPhone&quot;,
    &quot;language&quot; : &quot;en&quot;,
    &quot;user_data&quot; : {
      &quot;ct&quot; : [ &quot;4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36&quot; ],
      &quot;st&quot; : [ &quot;49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34&quot; ],
      &quot;country&quot; : [ &quot;9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d&quot; ],
      &quot;ln&quot; : [ &quot;7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19&quot; ],
      &quot;partner_id&quot; : &quot;BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc&quot;,
      &quot;click_id&quot; : &quot;dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv&quot;,
      &quot;zp&quot; : [ &quot;fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145&quot; ],
      &quot;ph&quot; : [ &quot;45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d&quot; ],
      &quot;fn&quot; : [ &quot;ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2&quot; ],
      &quot;external_id&quot; : [ &quot;6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee&quot; ],
      &quot;ge&quot; : [ &quot;0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf&quot; ],
      &quot;db&quot; : [ &quot;d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739&quot; ]
    },
    &quot;device_carrier&quot; : &quot;T-Mobile&quot;,
    &quot;event_source_url&quot; : &quot;https://www.my-clothing-shop.org/&quot;,
    &quot;app_name&quot; : &quot;Pinterest&quot;,
    &quot;event_id&quot; : &quot;eventId0001&quot;,
    &quot;device_brand&quot; : &quot;Apple&quot;,
    &quot;event_name&quot; : &quot;checkout&quot;,
    &quot;custom_data&quot; : {
      &quot;content_name&quot; : &quot;pinterest-themed-clothing&quot;,
      &quot;content_ids&quot; : [ &quot;red-pinterest-shirt-logo-1&quot;, &quot;purple-pinterest-shirt-logo-3&quot; ],
      &quot;np&quot; : &quot;ss-company&quot;,
      &quot;content_category&quot; : &quot;shirts&quot;,
      &quot;contents&quot; : [ {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      }, {
        &quot;quantity&quot; : 5,
        &quot;item_price&quot; : &quot;1325.12&quot;,
        &quot;item_name&quot; : &quot;pinterest-clothing-shirt&quot;,
        &quot;id&quot; : &quot;red-pinterest-shirt-logo-1&quot;,
        &quot;item_brand&quot; : &quot;pinterest&quot;,
        &quot;item_category&quot; : &quot;pinterest-entertainment&quot;
      } ],
      &quot;num_items&quot; : 2,
      &quot;opt_out_type&quot; : &quot;LDP&quot;,
      &quot;content_brand&quot; : &quot;pinterest-brand&quot;,
      &quot;currency&quot; : &quot;USD&quot;,
      &quot;search_string&quot; : &quot;sample string&quot;,
      &quot;value&quot; : &quot;72.39&quot;,
      &quot;order_id&quot; : &quot;my_order_id&quot;
    },
    &quot;app_id&quot; : &quot;429047995&quot;,
    &quot;event_time&quot; : 1451431341
  } ]
}"
  EventsCreateExamples <- EventsCreateExamples.Add("application/json", EventsCreateBody)

  let getEventsCreateExample mediaType =
    EventsCreateExamples.[mediaType]
      |> getConverter mediaType
