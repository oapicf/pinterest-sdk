-module(openapi_catalogs_hotel_batch_item).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_batch_item/0]).

-export([openapi_catalogs_hotel_batch_item/1]).

-export_type([openapi_catalogs_hotel_batch_item/0]).

-type openapi_catalogs_hotel_batch_item() ::
  [ {'attributes', openapi_catalogs_updatable_hotel_attributes:openapi_catalogs_updatable_hotel_attributes() }
  | {'hotel_id', binary() }
  | {'operation', binary() }
  ].


openapi_catalogs_hotel_batch_item() ->
    openapi_catalogs_hotel_batch_item([]).

openapi_catalogs_hotel_batch_item(Fields) ->
  Default = [ {'attributes', openapi_catalogs_updatable_hotel_attributes:openapi_catalogs_updatable_hotel_attributes() }
            , {'hotel_id', binary() }
            , {'operation', elements([<<"DELETE">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

