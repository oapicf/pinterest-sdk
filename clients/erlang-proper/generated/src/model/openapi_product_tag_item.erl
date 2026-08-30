-module(openapi_product_tag_item).

-include("openapi.hrl").

-export([openapi_product_tag_item/0]).

-export([openapi_product_tag_item/1]).

-export_type([openapi_product_tag_item/0]).

-type openapi_product_tag_item() ::
  [ {'pin_id', binary() }
  ].


openapi_product_tag_item() ->
    openapi_product_tag_item([]).

openapi_product_tag_item(Fields) ->
  Default = [ {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

