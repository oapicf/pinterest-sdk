-module(openapi_trends_l1_interest).

-include("openapi.hrl").

-export([openapi_trends_l1_interest/0]).

-export_type([openapi_trends_l1_interest/0]).

-type openapi_trends_l1_interest() ::
  binary().

openapi_trends_l1_interest() ->
  elements([<<"animals">>, <<"architecture">>, <<"art">>, <<"beauty">>, <<"childrens_fashion">>, <<"design">>, <<"diy_and_crafts">>, <<"education">>, <<"electronics">>, <<"entertainment">>, <<"event_planning">>, <<"finance">>, <<"food_and_drinks">>, <<"gardening">>, <<"health">>, <<"home_decor">>, <<"mens_fashion">>, <<"parenting">>, <<"quotes">>, <<"sport">>, <<"travel">>, <<"vehicles">>, <<"wedding">>, <<"womens_fashion">>]).

