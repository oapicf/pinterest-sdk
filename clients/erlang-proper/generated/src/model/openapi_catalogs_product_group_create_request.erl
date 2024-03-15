-module(openapi_catalogs_product_group_create_request).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_create_request/0]).

-export([openapi_catalogs_product_group_create_request/1]).

-export_type([openapi_catalogs_product_group_create_request/0]).

-type openapi_catalogs_product_group_create_request() ::
  [ {'name', binary() }
  | {'description', binary() }
  | {'is_featured', boolean() }
  | {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
  | {'feed_id', binary() }
  ].


openapi_catalogs_product_group_create_request() ->
    openapi_catalogs_product_group_create_request([]).

openapi_catalogs_product_group_create_request(Fields) ->
  Default = [ {'name', binary() }
            , {'description', binary() }
            , {'is_featured', boolean() }
            , {'filters', openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request() }
            , {'feed_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

