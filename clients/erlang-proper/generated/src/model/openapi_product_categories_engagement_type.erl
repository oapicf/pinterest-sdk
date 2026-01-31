-module(openapi_product_categories_engagement_type).

-include("openapi.hrl").

-export([openapi_product_categories_engagement_type/0]).

-export_type([openapi_product_categories_engagement_type/0]).

-type openapi_product_categories_engagement_type() ::
  binary().

openapi_product_categories_engagement_type() ->
  elements([<<"ENGAGEMENT">>, <<"OUTBOUND_CLICK">>, <<"SAVE">>]).

