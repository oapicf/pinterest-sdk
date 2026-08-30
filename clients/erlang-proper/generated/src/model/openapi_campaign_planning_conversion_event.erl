-module(openapi_campaign_planning_conversion_event).

-include("openapi.hrl").

-export([openapi_campaign_planning_conversion_event/0]).

-export_type([openapi_campaign_planning_conversion_event/0]).

-type openapi_campaign_planning_conversion_event() ::
  binary().

openapi_campaign_planning_conversion_event() ->
  elements([<<"SIGNUP">>, <<"CHECKOUT">>, <<"ADD_TO_CART">>, <<"LEAD">>]).

