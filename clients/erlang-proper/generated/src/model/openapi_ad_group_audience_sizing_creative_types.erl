-module(openapi_ad_group_audience_sizing_creative_types).

-include("openapi.hrl").

-export([openapi_ad_group_audience_sizing_creative_types/0]).

-export_type([openapi_ad_group_audience_sizing_creative_types/0]).

-type openapi_ad_group_audience_sizing_creative_types() ::
  binary().

openapi_ad_group_audience_sizing_creative_types() ->
  elements([<<"REGULAR">>, <<"VIDEO">>, <<"SHOPPING">>, <<"CAROUSEL">>, <<"MAX_VIDEO">>, <<"SHOP_THE_PIN">>, <<"COLLECTION">>, <<"IDEA">>]).

