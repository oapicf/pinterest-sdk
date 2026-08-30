-module(openapi_product_tags_bulk_add_request).

-include("openapi.hrl").

-export([openapi_product_tags_bulk_add_request/0]).

-export([openapi_product_tags_bulk_add_request/1]).

-export_type([openapi_product_tags_bulk_add_request/0]).

-type openapi_product_tags_bulk_add_request() ::
  [ {'product_tags', list(openapi_product_tag_item:openapi_product_tag_item()) }
  ].


openapi_product_tags_bulk_add_request() ->
    openapi_product_tags_bulk_add_request([]).

openapi_product_tags_bulk_add_request(Fields) ->
  Default = [ {'product_tags', list(openapi_product_tag_item:openapi_product_tag_item(), 1, 24) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

