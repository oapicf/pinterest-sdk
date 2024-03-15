-module(openapi_items_issues_list_200_response).

-include("openapi.hrl").

-export([openapi_items_issues_list_200_response/0]).

-export([openapi_items_issues_list_200_response/1]).

-export_type([openapi_items_issues_list_200_response/0]).

-type openapi_items_issues_list_200_response() ::
  [ {'items', list(openapi_catalogs_item_validation_issues:openapi_catalogs_item_validation_issues()) }
  | {'bookmark', binary() }
  ].


openapi_items_issues_list_200_response() ->
    openapi_items_issues_list_200_response([]).

openapi_items_issues_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_catalogs_item_validation_issues:openapi_catalogs_item_validation_issues()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

