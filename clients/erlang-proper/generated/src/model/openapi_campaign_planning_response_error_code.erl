-module(openapi_campaign_planning_response_error_code).

-include("openapi.hrl").

-export([openapi_campaign_planning_response_error_code/0]).

-export_type([openapi_campaign_planning_response_error_code/0]).

-type openapi_campaign_planning_response_error_code() ::
  binary().

openapi_campaign_planning_response_error_code() ->
  elements([<<"SERVER_ERROR">>, <<"AUDIENCE_LIST_MISSING">>, <<"INVALID_REQUEST">>, <<"PRODUCT_GROUP_MISSING">>]).

