-module(openapi_catalogs_product_groups_create_201_response).

-include("openapi.hrl").

-export([openapi_catalogs_product_groups_create_201_response/0]).

-export([openapi_catalogs_product_groups_create_201_response/1]).

-export_type([openapi_catalogs_product_groups_create_201_response/0]).

-type openapi_catalogs_product_groups_create_201_response() ::
  [ {'id', binary() }
  | {'name', binary() }
  | {'description', binary() }
  | {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
  | {'is_featured', boolean() }
  | {'type', openapi_catalogs_product_group_type:openapi_catalogs_product_group_type() }
  | {'status', openapi_catalogs_product_group_status:openapi_catalogs_product_group_status() }
  | {'created_at', integer() }
  | {'updated_at', integer() }
  | {'feed_id', binary() }
  | {'catalog_type', binary() }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_product_groups_create_201_response() ->
    openapi_catalogs_product_groups_create_201_response([]).

openapi_catalogs_product_groups_create_201_response(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            , {'description', binary() }
            , {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
            , {'is_featured', boolean() }
            , {'type', openapi_catalogs_product_group_type:openapi_catalogs_product_group_type() }
            , {'status', openapi_catalogs_product_group_status:openapi_catalogs_product_group_status() }
            , {'created_at', integer() }
            , {'updated_at', integer() }
            , {'feed_id', elements([<<"">>]) }
            , {'catalog_type', elements([<<"RETAIL">>]) }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

