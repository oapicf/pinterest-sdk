-module(openapi_interests_enum).

-include("openapi.hrl").

-export([openapi_interests_enum/0]).

-export_type([openapi_interests_enum/0]).

-type openapi_interests_enum() ::
  binary().

openapi_interests_enum() ->
  elements([<<"ALL">>, <<"ANIMALS">>, <<"ARCHITECTURE">>, <<"ART">>, <<"BEAUTY">>, <<"DIY_AND_CRAFTS">>, <<"EDUCATION">>, <<"EVENT_PLANNING">>, <<"FASHION">>, <<"FOOD_AND_DRINKS">>, <<"GARDENING">>, <<"HEALTH">>, <<"HOME_DECOR">>, <<"PARENTING">>, <<"TRAVEL">>, <<"WEDDING">>]).

