-module(openapi_line_item).

-include("openapi.hrl").

-export([openapi_line_item/0]).

-export([openapi_line_item/1]).

-export_type([openapi_line_item/0]).

-type openapi_line_item() ::
  [ {'product_brand', binary() }
  | {'product_category', binary() }
  | {'product_id', integer() }
  | {'product_name', binary() }
  | {'product_price', binary() }
  | {'product_quantity', integer() }
  | {'product_variant', binary() }
  | {'product_variant_id', binary() }
  ].


openapi_line_item() ->
    openapi_line_item([]).

openapi_line_item(Fields) ->
  Default = [ {'product_brand', binary() }
            , {'product_category', binary() }
            , {'product_id', integer() }
            , {'product_name', binary() }
            , {'product_price', binary() }
            , {'product_quantity', integer() }
            , {'product_variant', binary() }
            , {'product_variant_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

