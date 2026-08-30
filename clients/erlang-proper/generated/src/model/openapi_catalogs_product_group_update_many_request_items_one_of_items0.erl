-module(openapi_catalogs_product_group_update_many_request_items_one_of_items0).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_update_many_request_items_one_of_items0/0]).

-export([openapi_catalogs_product_group_update_many_request_items_one_of_items0/1]).

-export_type([openapi_catalogs_product_group_update_many_request_items_one_of_items0/0]).

-type openapi_catalogs_product_group_update_many_request_items_one_of_items0() ::
  [ {'description', binary() }
  | {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
  | {'is_featured', boolean() }
  | {'name', binary() }
  | {'id', binary() }
  ].


openapi_catalogs_product_group_update_many_request_items_one_of_items0() ->
    openapi_catalogs_product_group_update_many_request_items_one_of_items0([]).

openapi_catalogs_product_group_update_many_request_items_one_of_items0(Fields) ->
  Default = [ {'description', binary() }
            , {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
            , {'is_featured', boolean() }
            , {'name', binary() }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

