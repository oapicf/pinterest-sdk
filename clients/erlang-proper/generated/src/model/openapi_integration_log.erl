-module(openapi_integration_log).

-include("openapi.hrl").

-export([openapi_integration_log/0]).

-export([openapi_integration_log/1]).

-export_type([openapi_integration_log/0]).

-type openapi_integration_log() ::
  [ {'advertiser_id', binary() }
  | {'app_version_number', binary() }
  | {'client_timestamp', integer() }
  | {'error', openapi_integration_log_client_error:openapi_integration_log_client_error() }
  | {'event_type', binary() }
  | {'external_business_id', binary() }
  | {'feed_profile_id', binary() }
  | {'log_level', binary() }
  | {'merchant_id', binary() }
  | {'message', binary() }
  | {'platform_version_number', binary() }
  | {'request', openapi_integration_log_client_request:openapi_integration_log_client_request() }
  | {'tag_id', binary() }
  ].


openapi_integration_log() ->
    openapi_integration_log([]).

openapi_integration_log(Fields) ->
  Default = [ {'advertiser_id', binary() }
            , {'app_version_number', binary() }
            , {'client_timestamp', integer() }
            , {'error', openapi_integration_log_client_error:openapi_integration_log_client_error() }
            , {'event_type', elements([<<"APP">>, <<"API">>]) }
            , {'external_business_id', binary() }
            , {'feed_profile_id', binary() }
            , {'log_level', elements([<<"INFO">>, <<"WARN">>, <<"ERROR">>]) }
            , {'merchant_id', binary() }
            , {'message', binary() }
            , {'platform_version_number', binary() }
            , {'request', openapi_integration_log_client_request:openapi_integration_log_client_request() }
            , {'tag_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

