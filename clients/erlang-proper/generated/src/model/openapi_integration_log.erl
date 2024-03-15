-module(openapi_integration_log).

-include("openapi.hrl").

-export([openapi_integration_log/0]).

-export([openapi_integration_log/1]).

-export_type([openapi_integration_log/0]).

-type openapi_integration_log() ::
  [ {'client_timestamp', integer() }
  | {'event_type', binary() }
  | {'log_level', binary() }
  | {'external_business_id', binary() }
  | {'advertiser_id', binary() }
  | {'merchant_id', binary() }
  | {'tag_id', binary() }
  | {'feed_profile_id', binary() }
  | {'message', binary() }
  | {'app_version_number', binary() }
  | {'platform_version_number', binary() }
  | {'error', openapi_integration_log_client_error:openapi_integration_log_client_error() }
  | {'request', openapi_integration_log_client_request:openapi_integration_log_client_request() }
  ].


openapi_integration_log() ->
    openapi_integration_log([]).

openapi_integration_log(Fields) ->
  Default = [ {'client_timestamp', integer() }
            , {'event_type', elements([<<"APP">>, <<"API">>]) }
            , {'log_level', elements([<<"INFO">>, <<"WARN">>, <<"ERROR">>]) }
            , {'external_business_id', binary() }
            , {'advertiser_id', binary() }
            , {'merchant_id', binary() }
            , {'tag_id', binary() }
            , {'feed_profile_id', binary() }
            , {'message', binary() }
            , {'app_version_number', binary() }
            , {'platform_version_number', binary() }
            , {'error', openapi_integration_log_client_error:openapi_integration_log_client_error() }
            , {'request', openapi_integration_log_client_request:openapi_integration_log_client_request() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

