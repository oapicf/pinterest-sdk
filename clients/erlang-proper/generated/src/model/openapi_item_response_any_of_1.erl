-module(openapi_item_response_any_of_1).

-include("openapi.hrl").

-export([openapi_item_response_any_of_1/0]).

-export([openapi_item_response_any_of_1/1]).

-export_type([openapi_item_response_any_of_1/0]).

-type openapi_item_response_any_of_1() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'item_id', binary() }
  | {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
  | {'hotel_id', binary() }
  | {'creative_assets_id', binary() }
  ].


openapi_item_response_any_of_1() ->
    openapi_item_response_any_of_1([]).

openapi_item_response_any_of_1(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'item_id', binary() }
            , {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
            , {'hotel_id', binary() }
            , {'creative_assets_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

