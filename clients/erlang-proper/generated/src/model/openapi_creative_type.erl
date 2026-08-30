-module(openapi_creative_type).

-include("openapi.hrl").

-export([openapi_creative_type/0]).

-export_type([openapi_creative_type/0]).

-type openapi_creative_type() ::
  binary().

openapi_creative_type() ->
  elements([<<"REGULAR">>, <<"VIDEO">>, <<"SHOPPING">>, <<"CAROUSEL">>, <<"MAX_VIDEO">>, <<"SHOP_THE_PIN">>, <<"COLLECTION">>, <<"IDEA">>, <<"SHOWCASE">>, <<"QUIZ">>, <<"COLLAGE">>, <<"MAX_WIDTH_REGULAR_COLLECTION">>, <<"MAX_WIDTH_VIDEO_COLLECTION">>, <<"APP">>]).

