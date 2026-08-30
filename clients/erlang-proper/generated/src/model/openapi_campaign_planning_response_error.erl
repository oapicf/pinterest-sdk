-module(openapi_campaign_planning_response_error).

-include("openapi.hrl").

-export([openapi_campaign_planning_response_error/0]).

-export([openapi_campaign_planning_response_error/1]).

-export_type([openapi_campaign_planning_response_error/0]).

-type openapi_campaign_planning_response_error() ::
  [ {'code', openapi_campaign_planning_response_error_code:openapi_campaign_planning_response_error_code() }
  | {'message', binary() }
  ].


openapi_campaign_planning_response_error() ->
    openapi_campaign_planning_response_error([]).

openapi_campaign_planning_response_error(Fields) ->
  Default = [ {'code', openapi_campaign_planning_response_error_code:openapi_campaign_planning_response_error_code() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

