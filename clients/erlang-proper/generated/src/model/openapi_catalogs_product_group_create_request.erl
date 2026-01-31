-module(openapi_catalogs_product_group_create_request).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_create_request/0]).

-export([openapi_catalogs_product_group_create_request/1]).

-export_type([openapi_catalogs_product_group_create_request/0]).

-type openapi_catalogs_product_group_create_request() ::
  [ {'description', binary() }
  | {'feed_id', binary() }
  | {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
  | {'is_featured', boolean() }
  | {'name', binary() }
  ].


openapi_catalogs_product_group_create_request() ->
    openapi_catalogs_product_group_create_request([]).

openapi_catalogs_product_group_create_request(Fields) ->
  Default = [ {'description', binary() }
            , {'feed_id', binary() }
            , {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
            , {'is_featured', boolean() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

