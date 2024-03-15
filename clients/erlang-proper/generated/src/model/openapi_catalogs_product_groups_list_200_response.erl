-module(openapi_catalogs_product_groups_list_200_response).

-include("openapi.hrl").

-export([openapi_catalogs_product_groups_list_200_response/0]).

-export([openapi_catalogs_product_groups_list_200_response/1]).

-export_type([openapi_catalogs_product_groups_list_200_response/0]).

-type openapi_catalogs_product_groups_list_200_response() ::
  [ {'items', list(openapi_catalogs_product_groups_list_200_response_all_of_items_inner:openapi_catalogs_product_groups_list_200_response_all_of_items_inner()) }
  | {'bookmark', binary() }
  ].


openapi_catalogs_product_groups_list_200_response() ->
    openapi_catalogs_product_groups_list_200_response([]).

openapi_catalogs_product_groups_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_catalogs_product_groups_list_200_response_all_of_items_inner:openapi_catalogs_product_groups_list_200_response_all_of_items_inner()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

