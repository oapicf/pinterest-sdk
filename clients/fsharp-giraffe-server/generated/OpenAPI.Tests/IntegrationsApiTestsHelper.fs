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
open OpenAPI.IntegrationsApiHandler
open OpenAPI.IntegrationsApiHandlerParams

module IntegrationsApiHandlerTestsHelper =

  ()

  ()


  let mutable IntegrationsCommercePatchExamples = Map.empty
  let mutable IntegrationsCommercePatchBody = ""

  IntegrationsCommercePatchBody <- WebUtility.HtmlDecode "{
  &quot;connected_advertiser_id&quot; : &quot;connected_advertiser_id&quot;,
  &quot;connected_lba_id&quot; : &quot;connected_lba_id&quot;,
  &quot;partner_primary_email&quot; : &quot;partner_primary_email&quot;,
  &quot;connected_tag_id&quot; : &quot;connected_tag_id&quot;,
  &quot;partner_refresh_token&quot; : &quot;partner_refresh_token&quot;,
  &quot;additional_id_1&quot; : &quot;additional_id_1&quot;,
  &quot;connected_merchant_id&quot; : &quot;connected_merchant_id&quot;,
  &quot;scopes&quot; : &quot;scopes&quot;,
  &quot;partner_metadata&quot; : &quot;partner_metadata&quot;,
  &quot;partner_access_token&quot; : &quot;partner_access_token&quot;,
  &quot;partner_access_token_expiry&quot; : 0.8008281904610115,
  &quot;partner_refresh_token_expiry&quot; : 6.027456183070403
}"
  IntegrationsCommercePatchExamples <- IntegrationsCommercePatchExamples.Add("application/json", IntegrationsCommercePatchBody)

  let getIntegrationsCommercePatchExample mediaType =
    IntegrationsCommercePatchExamples.[mediaType]
      |> getConverter mediaType

  let mutable IntegrationsCommercePostExamples = Map.empty
  let mutable IntegrationsCommercePostBody = ""

  IntegrationsCommercePostBody <- WebUtility.HtmlDecode "{
  &quot;connected_advertiser_id&quot; : &quot;connected_advertiser_id&quot;,
  &quot;partner_primary_email&quot; : &quot;partner_primary_email&quot;,
  &quot;connected_tag_id&quot; : &quot;connected_tag_id&quot;,
  &quot;partner_metadata&quot; : &quot;partner_metadata&quot;,
  &quot;partner_access_token&quot; : &quot;partner_access_token&quot;,
  &quot;partner_refresh_token_expiry&quot; : 6,
  &quot;external_business_id&quot; : &quot;external_business_id&quot;,
  &quot;connected_lba_id&quot; : &quot;connected_lba_id&quot;,
  &quot;partner_refresh_token&quot; : &quot;partner_refresh_token&quot;,
  &quot;additional_id_1&quot; : &quot;additional_id_1&quot;,
  &quot;connected_merchant_id&quot; : &quot;connected_merchant_id&quot;,
  &quot;scopes&quot; : &quot;scopes&quot;,
  &quot;partner_access_token_expiry&quot; : 0
}"
  IntegrationsCommercePostExamples <- IntegrationsCommercePostExamples.Add("application/json", IntegrationsCommercePostBody)

  let getIntegrationsCommercePostExample mediaType =
    IntegrationsCommercePostExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable IntegrationsLogsPostExamples = Map.empty
  let mutable IntegrationsLogsPostBody = ""

  IntegrationsLogsPostBody <- WebUtility.HtmlDecode "{
  &quot;logs&quot; : [ {
    &quot;client_timestamp&quot; : 0,
    &quot;app_version_number&quot; : &quot;app_version_number&quot;,
    &quot;request&quot; : {
      &quot;path&quot; : &quot;path&quot;,
      &quot;response_headers&quot; : {
        &quot;key&quot; : &quot;response_headers&quot;
      },
      &quot;method&quot; : &quot;GET&quot;,
      &quot;host&quot; : &quot;host&quot;,
      &quot;request_headers&quot; : {
        &quot;key&quot; : &quot;request_headers&quot;
      },
      &quot;response_status_code&quot; : 5
    },
    &quot;log_level&quot; : &quot;INFO&quot;,
    &quot;merchant_id&quot; : &quot;merchant_id&quot;,
    &quot;message&quot; : &quot;message&quot;,
    &quot;error&quot; : {
      &quot;number&quot; : 5,
      &quot;file_name&quot; : &quot;file_name&quot;,
      &quot;line_number&quot; : 1,
      &quot;name&quot; : &quot;name&quot;,
      &quot;cause&quot; : &quot;cause&quot;,
      &quot;column_number&quot; : 6,
      &quot;stack_trace&quot; : &quot;stack_trace&quot;,
      &quot;message&quot; : &quot;message&quot;,
      &quot;message_detail&quot; : &quot;message_detail&quot;
    },
    &quot;platform_version_number&quot; : &quot;platform_version_number&quot;,
    &quot;advertiser_id&quot; : &quot;advertiser_id&quot;,
    &quot;external_business_id&quot; : &quot;external_business_id&quot;,
    &quot;event_type&quot; : &quot;APP&quot;,
    &quot;tag_id&quot; : &quot;tag_id&quot;,
    &quot;feed_profile_id&quot; : &quot;feed_profile_id&quot;
  }, {
    &quot;client_timestamp&quot; : 0,
    &quot;app_version_number&quot; : &quot;app_version_number&quot;,
    &quot;request&quot; : {
      &quot;path&quot; : &quot;path&quot;,
      &quot;response_headers&quot; : {
        &quot;key&quot; : &quot;response_headers&quot;
      },
      &quot;method&quot; : &quot;GET&quot;,
      &quot;host&quot; : &quot;host&quot;,
      &quot;request_headers&quot; : {
        &quot;key&quot; : &quot;request_headers&quot;
      },
      &quot;response_status_code&quot; : 5
    },
    &quot;log_level&quot; : &quot;INFO&quot;,
    &quot;merchant_id&quot; : &quot;merchant_id&quot;,
    &quot;message&quot; : &quot;message&quot;,
    &quot;error&quot; : {
      &quot;number&quot; : 5,
      &quot;file_name&quot; : &quot;file_name&quot;,
      &quot;line_number&quot; : 1,
      &quot;name&quot; : &quot;name&quot;,
      &quot;cause&quot; : &quot;cause&quot;,
      &quot;column_number&quot; : 6,
      &quot;stack_trace&quot; : &quot;stack_trace&quot;,
      &quot;message&quot; : &quot;message&quot;,
      &quot;message_detail&quot; : &quot;message_detail&quot;
    },
    &quot;platform_version_number&quot; : &quot;platform_version_number&quot;,
    &quot;advertiser_id&quot; : &quot;advertiser_id&quot;,
    &quot;external_business_id&quot; : &quot;external_business_id&quot;,
    &quot;event_type&quot; : &quot;APP&quot;,
    &quot;tag_id&quot; : &quot;tag_id&quot;,
    &quot;feed_profile_id&quot; : &quot;feed_profile_id&quot;
  }, {
    &quot;client_timestamp&quot; : 0,
    &quot;app_version_number&quot; : &quot;app_version_number&quot;,
    &quot;request&quot; : {
      &quot;path&quot; : &quot;path&quot;,
      &quot;response_headers&quot; : {
        &quot;key&quot; : &quot;response_headers&quot;
      },
      &quot;method&quot; : &quot;GET&quot;,
      &quot;host&quot; : &quot;host&quot;,
      &quot;request_headers&quot; : {
        &quot;key&quot; : &quot;request_headers&quot;
      },
      &quot;response_status_code&quot; : 5
    },
    &quot;log_level&quot; : &quot;INFO&quot;,
    &quot;merchant_id&quot; : &quot;merchant_id&quot;,
    &quot;message&quot; : &quot;message&quot;,
    &quot;error&quot; : {
      &quot;number&quot; : 5,
      &quot;file_name&quot; : &quot;file_name&quot;,
      &quot;line_number&quot; : 1,
      &quot;name&quot; : &quot;name&quot;,
      &quot;cause&quot; : &quot;cause&quot;,
      &quot;column_number&quot; : 6,
      &quot;stack_trace&quot; : &quot;stack_trace&quot;,
      &quot;message&quot; : &quot;message&quot;,
      &quot;message_detail&quot; : &quot;message_detail&quot;
    },
    &quot;platform_version_number&quot; : &quot;platform_version_number&quot;,
    &quot;advertiser_id&quot; : &quot;advertiser_id&quot;,
    &quot;external_business_id&quot; : &quot;external_business_id&quot;,
    &quot;event_type&quot; : &quot;APP&quot;,
    &quot;tag_id&quot; : &quot;tag_id&quot;,
    &quot;feed_profile_id&quot; : &quot;feed_profile_id&quot;
  }, {
    &quot;client_timestamp&quot; : 0,
    &quot;app_version_number&quot; : &quot;app_version_number&quot;,
    &quot;request&quot; : {
      &quot;path&quot; : &quot;path&quot;,
      &quot;response_headers&quot; : {
        &quot;key&quot; : &quot;response_headers&quot;
      },
      &quot;method&quot; : &quot;GET&quot;,
      &quot;host&quot; : &quot;host&quot;,
      &quot;request_headers&quot; : {
        &quot;key&quot; : &quot;request_headers&quot;
      },
      &quot;response_status_code&quot; : 5
    },
    &quot;log_level&quot; : &quot;INFO&quot;,
    &quot;merchant_id&quot; : &quot;merchant_id&quot;,
    &quot;message&quot; : &quot;message&quot;,
    &quot;error&quot; : {
      &quot;number&quot; : 5,
      &quot;file_name&quot; : &quot;file_name&quot;,
      &quot;line_number&quot; : 1,
      &quot;name&quot; : &quot;name&quot;,
      &quot;cause&quot; : &quot;cause&quot;,
      &quot;column_number&quot; : 6,
      &quot;stack_trace&quot; : &quot;stack_trace&quot;,
      &quot;message&quot; : &quot;message&quot;,
      &quot;message_detail&quot; : &quot;message_detail&quot;
    },
    &quot;platform_version_number&quot; : &quot;platform_version_number&quot;,
    &quot;advertiser_id&quot; : &quot;advertiser_id&quot;,
    &quot;external_business_id&quot; : &quot;external_business_id&quot;,
    &quot;event_type&quot; : &quot;APP&quot;,
    &quot;tag_id&quot; : &quot;tag_id&quot;,
    &quot;feed_profile_id&quot; : &quot;feed_profile_id&quot;
  }, {
    &quot;client_timestamp&quot; : 0,
    &quot;app_version_number&quot; : &quot;app_version_number&quot;,
    &quot;request&quot; : {
      &quot;path&quot; : &quot;path&quot;,
      &quot;response_headers&quot; : {
        &quot;key&quot; : &quot;response_headers&quot;
      },
      &quot;method&quot; : &quot;GET&quot;,
      &quot;host&quot; : &quot;host&quot;,
      &quot;request_headers&quot; : {
        &quot;key&quot; : &quot;request_headers&quot;
      },
      &quot;response_status_code&quot; : 5
    },
    &quot;log_level&quot; : &quot;INFO&quot;,
    &quot;merchant_id&quot; : &quot;merchant_id&quot;,
    &quot;message&quot; : &quot;message&quot;,
    &quot;error&quot; : {
      &quot;number&quot; : 5,
      &quot;file_name&quot; : &quot;file_name&quot;,
      &quot;line_number&quot; : 1,
      &quot;name&quot; : &quot;name&quot;,
      &quot;cause&quot; : &quot;cause&quot;,
      &quot;column_number&quot; : 6,
      &quot;stack_trace&quot; : &quot;stack_trace&quot;,
      &quot;message&quot; : &quot;message&quot;,
      &quot;message_detail&quot; : &quot;message_detail&quot;
    },
    &quot;platform_version_number&quot; : &quot;platform_version_number&quot;,
    &quot;advertiser_id&quot; : &quot;advertiser_id&quot;,
    &quot;external_business_id&quot; : &quot;external_business_id&quot;,
    &quot;event_type&quot; : &quot;APP&quot;,
    &quot;tag_id&quot; : &quot;tag_id&quot;,
    &quot;feed_profile_id&quot; : &quot;feed_profile_id&quot;
  } ]
}"
  IntegrationsLogsPostExamples <- IntegrationsLogsPostExamples.Add("application/json", IntegrationsLogsPostBody)

  let getIntegrationsLogsPostExample mediaType =
    IntegrationsLogsPostExamples.[mediaType]
      |> getConverter mediaType
