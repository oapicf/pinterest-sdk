-module(openapi_template_response).

-include("openapi.hrl").

-export([openapi_template_response/0]).

-export([openapi_template_response/1]).

-export_type([openapi_template_response/0]).

-type openapi_template_response() ::
  [ {'ad_account_id', binary() }
  | {'ad_account_ids', list(binary()) }
  | {'click_window_days', integer() }
  | {'columns', list(binary()) }
  | {'conversion_report_time_type', binary() }
  | {'creation_source', binary() }
  | {'custom_column_ids', list(binary()) }
  | {'date_range', openapi_template_response_date_range:openapi_template_response_date_range() }
  | {'engagement_window_days', integer() }
  | {'filters_json', binary() }
  | {'granularity', openapi_granularity:openapi_granularity() }
  | {'id', binary() }
  | {'ingestion_sources', list(binary()) }
  | {'is_deleted', boolean() }
  | {'is_owned_by_user', boolean() }
  | {'is_scheduled', boolean() }
  | {'name', binary() }
  | {'report_end_relative_days_in_past', integer() }
  | {'report_format', openapi_data_output_format:openapi_data_output_format() }
  | {'report_level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
  | {'report_start_relative_days_in_past', integer() }
  | {'type', binary() }
  | {'updated_time', integer() }
  | {'user_id', binary() }
  | {'view_window_days', integer() }
  ].


openapi_template_response() ->
    openapi_template_response([]).

openapi_template_response(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'ad_account_ids', list(binary()) }
            , {'click_window_days', integer() }
            , {'columns', list(binary()) }
            , {'conversion_report_time_type', elements([<<"TIME_OF_AD_ACTION">>, <<"TIME_OF_CONVERSION">>]) }
            , {'creation_source', elements([<<"ADS_API">>, <<"ADS_MANAGER_REPORTING_PAGE">>, <<"ADS_MANAGER_REPORT_BUILDER">>]) }
            , {'custom_column_ids', list(binary()) }
            , {'date_range', openapi_template_response_date_range:openapi_template_response_date_range() }
            , {'engagement_window_days', integer() }
            , {'filters_json', binary() }
            , {'granularity', openapi_granularity:openapi_granularity() }
            , {'id', binary() }
            , {'ingestion_sources', list(binary()) }
            , {'is_deleted', boolean() }
            , {'is_owned_by_user', boolean() }
            , {'is_scheduled', boolean() }
            , {'name', binary() }
            , {'report_end_relative_days_in_past', integer() }
            , {'report_format', openapi_data_output_format:openapi_data_output_format() }
            , {'report_level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
            , {'report_start_relative_days_in_past', integer() }
            , {'type', elements([<<"UNSPECIFIED">>, <<"BULK">>, <<"OVERVIEW">>, <<"TABLE">>]) }
            , {'updated_time', integer() }
            , {'user_id', binary() }
            , {'view_window_days', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

