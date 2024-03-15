-module(openapi_template_response).

-include("openapi.hrl").

-export([openapi_template_response/0]).

-export([openapi_template_response/1]).

-export_type([openapi_template_response/0]).

-type openapi_template_response() ::
  [ {'id', binary() }
  | {'ad_account_id', binary() }
  | {'ad_account_ids', list(binary()) }
  | {'user_id', binary() }
  | {'name', binary() }
  | {'report_start_relative_days_in_past', integer() }
  | {'report_end_relative_days_in_past', integer() }
  | {'date_range', openapi_template_response_date_range:openapi_template_response_date_range() }
  | {'report_level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
  | {'report_format', openapi_data_output_format:openapi_data_output_format() }
  | {'columns', list(binary()) }
  | {'granularity', openapi_granularity:openapi_granularity() }
  | {'view_window_days', integer() }
  | {'click_window_days', integer() }
  | {'engagement_window_days', integer() }
  | {'conversion_report_time_type', binary() }
  | {'filters_json', binary() }
  | {'is_owned_by_user', boolean() }
  | {'is_scheduled', boolean() }
  | {'creation_source', binary() }
  | {'is_deleted', boolean() }
  | {'updated_time', integer() }
  | {'custom_column_ids', list(binary()) }
  | {'type', binary() }
  | {'ingestion_sources', list(binary()) }
  ].


openapi_template_response() ->
    openapi_template_response([]).

openapi_template_response(Fields) ->
  Default = [ {'id', binary() }
            , {'ad_account_id', binary() }
            , {'ad_account_ids', list(binary()) }
            , {'user_id', binary() }
            , {'name', binary() }
            , {'report_start_relative_days_in_past', integer() }
            , {'report_end_relative_days_in_past', integer() }
            , {'date_range', openapi_template_response_date_range:openapi_template_response_date_range() }
            , {'report_level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
            , {'report_format', openapi_data_output_format:openapi_data_output_format() }
            , {'columns', list(binary()) }
            , {'granularity', openapi_granularity:openapi_granularity() }
            , {'view_window_days', integer() }
            , {'click_window_days', integer() }
            , {'engagement_window_days', integer() }
            , {'conversion_report_time_type', elements([<<"TIME_OF_AD_ACTION">>, <<"TIME_OF_CONVERSION">>]) }
            , {'filters_json', binary() }
            , {'is_owned_by_user', boolean() }
            , {'is_scheduled', boolean() }
            , {'creation_source', elements([<<"ADS_API">>, <<"ADS_MANAGER_REPORTING_PAGE">>, <<"ADS_MANAGER_REPORT_BUILDER">>]) }
            , {'is_deleted', boolean() }
            , {'updated_time', integer() }
            , {'custom_column_ids', list(binary()) }
            , {'type', elements([<<"UNSPECIFIED">>, <<"BULK">>, <<"OVERVIEW">>, <<"TABLE">>]) }
            , {'ingestion_sources', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

