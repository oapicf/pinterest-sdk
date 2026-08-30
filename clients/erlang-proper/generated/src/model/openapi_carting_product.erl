-module(openapi_carting_product).

-include("openapi.hrl").

-export([openapi_carting_product/0]).

-export([openapi_carting_product/1]).

-export_type([openapi_carting_product/0]).

-type openapi_carting_product() ::
  [ {'carting_product_id', binary() }
  | {'display_preferred_retailers_only', boolean() }
  | {'display_product_price', boolean() }
  | {'preferred_retailers', list(openapi_carting_retailer:openapi_carting_retailer()) }
  | {'randomize_preferred_retailers', boolean() }
  ].


openapi_carting_product() ->
    openapi_carting_product([]).

openapi_carting_product(Fields) ->
  Default = [ {'carting_product_id', binary() }
            , {'display_preferred_retailers_only', boolean() }
            , {'display_product_price', boolean() }
            , {'preferred_retailers', list(openapi_carting_retailer:openapi_carting_retailer()) }
            , {'randomize_preferred_retailers', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

