-module(openapi_catalogs_product_group_update_request).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_update_request/0]).

-export([openapi_catalogs_product_group_update_request/1]).

-export_type([openapi_catalogs_product_group_update_request/0]).

-type openapi_catalogs_product_group_update_request() ::
  [ {'description', binary() }
  | {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
  | {'is_featured', boolean() }
  | {'name', binary() }
  ].


openapi_catalogs_product_group_update_request() ->
    openapi_catalogs_product_group_update_request([]).

openapi_catalogs_product_group_update_request(Fields) ->
  Default = [ {'description', binary() }
            , {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
            , {'is_featured', boolean() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

