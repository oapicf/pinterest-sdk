-module(openapi_catalogs_update_hotel_item).

-include("openapi.hrl").

-export([openapi_catalogs_update_hotel_item/0]).

-export([openapi_catalogs_update_hotel_item/1]).

-export_type([openapi_catalogs_update_hotel_item/0]).

-type openapi_catalogs_update_hotel_item() ::
  [ {'hotel_id', binary() }
  | {'operation', binary() }
  | {'attributes', openapi_catalogs_updatable_hotel_attributes:openapi_catalogs_updatable_hotel_attributes() }
  ].


openapi_catalogs_update_hotel_item() ->
    openapi_catalogs_update_hotel_item([]).

openapi_catalogs_update_hotel_item(Fields) ->
  Default = [ {'hotel_id', binary() }
            , {'operation', elements([<<"UPDATE">>]) }
            , {'attributes', openapi_catalogs_updatable_hotel_attributes:openapi_catalogs_updatable_hotel_attributes() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

