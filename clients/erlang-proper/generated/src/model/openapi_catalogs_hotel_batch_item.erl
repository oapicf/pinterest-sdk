-module(openapi_catalogs_hotel_batch_item).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_batch_item/0]).

-export([openapi_catalogs_hotel_batch_item/1]).

-export_type([openapi_catalogs_hotel_batch_item/0]).

-type openapi_catalogs_hotel_batch_item() ::
  [ {'hotel_id', binary() }
  | {'operation', binary() }
  | {'attributes', openapi_catalogs_updatable_hotel_attributes:openapi_catalogs_updatable_hotel_attributes() }
  ].


openapi_catalogs_hotel_batch_item() ->
    openapi_catalogs_hotel_batch_item([]).

openapi_catalogs_hotel_batch_item(Fields) ->
  Default = [ {'hotel_id', binary() }
            , {'operation', elements([<<"DELETE">>]) }
            , {'attributes', openapi_catalogs_updatable_hotel_attributes:openapi_catalogs_updatable_hotel_attributes() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

