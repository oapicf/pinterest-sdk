-module(openapi_product_tags_response).

-include("openapi.hrl").

-export([openapi_product_tags_response/0]).

-export([openapi_product_tags_response/1]).

-export_type([openapi_product_tags_response/0]).

-type openapi_product_tags_response() ::
  [ {'product_tags', list(openapi_product_tag_item:openapi_product_tag_item()) }
  ].


openapi_product_tags_response() ->
    openapi_product_tags_response([]).

openapi_product_tags_response(Fields) ->
  Default = [ {'product_tags', list(openapi_product_tag_item:openapi_product_tag_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

