-module(openapi_catalogs_product_groups_create_request).

-include("openapi.hrl").

-export([openapi_catalogs_product_groups_create_request/0]).

-export([openapi_catalogs_product_groups_create_request/1]).

-export_type([openapi_catalogs_product_groups_create_request/0]).

-type openapi_catalogs_product_groups_create_request() ::
  [ {'name', binary() }
  | {'description', binary() }
  | {'is_featured', boolean() }
  | {'filters', openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters() }
  | {'feed_id', binary() }
  | {'catalog_type', binary() }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_product_groups_create_request() ->
    openapi_catalogs_product_groups_create_request([]).

openapi_catalogs_product_groups_create_request(Fields) ->
  Default = [ {'name', binary() }
            , {'description', binary() }
            , {'is_featured', boolean() }
            , {'filters', openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters() }
            , {'feed_id', binary() }
            , {'catalog_type', elements([<<"HOTEL">>]) }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

