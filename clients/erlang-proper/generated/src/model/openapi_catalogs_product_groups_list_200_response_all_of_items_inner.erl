-module(openapi_catalogs_product_groups_list_200_response_all_of_items_inner).

-include("openapi.hrl").

-export([openapi_catalogs_product_groups_list_200_response_all_of_items_inner/0]).

-export([openapi_catalogs_product_groups_list_200_response_all_of_items_inner/1]).

-export_type([openapi_catalogs_product_groups_list_200_response_all_of_items_inner/0]).

-type openapi_catalogs_product_groups_list_200_response_all_of_items_inner() ::
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


openapi_catalogs_product_groups_list_200_response_all_of_items_inner() ->
    openapi_catalogs_product_groups_list_200_response_all_of_items_inner([]).

openapi_catalogs_product_groups_list_200_response_all_of_items_inner(Fields) ->
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

