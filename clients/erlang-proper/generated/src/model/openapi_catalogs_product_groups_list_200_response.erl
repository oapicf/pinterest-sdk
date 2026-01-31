-module(openapi_catalogs_product_groups_list_200_response).

-include("openapi.hrl").

-export([openapi_catalogs_product_groups_list_200_response/0]).

-export([openapi_catalogs_product_groups_list_200_response/1]).

-export_type([openapi_catalogs_product_groups_list_200_response/0]).

-type openapi_catalogs_product_groups_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group()) }
  ].


openapi_catalogs_product_groups_list_200_response() ->
    openapi_catalogs_product_groups_list_200_response([]).

openapi_catalogs_product_groups_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

