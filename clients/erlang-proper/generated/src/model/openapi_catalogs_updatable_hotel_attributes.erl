-module(openapi_catalogs_updatable_hotel_attributes).

-include("openapi.hrl").

-export([openapi_catalogs_updatable_hotel_attributes/0]).

-export([openapi_catalogs_updatable_hotel_attributes/1]).

-export_type([openapi_catalogs_updatable_hotel_attributes/0]).

-type openapi_catalogs_updatable_hotel_attributes() ::
  [ {'name', binary() }
  | {'link', binary() }
  | {'description', binary() }
  | {'brand', binary() }
  | {'latitude', integer() }
  | {'longitude', integer() }
  | {'neighborhood', list(binary()) }
  | {'address', openapi_catalogs_hotel_address:openapi_catalogs_hotel_address() }
  | {'custom_label_0', binary() }
  | {'custom_label_1', binary() }
  | {'custom_label_2', binary() }
  | {'custom_label_3', binary() }
  | {'custom_label_4', binary() }
  | {'category', binary() }
  | {'base_price', binary() }
  | {'sale_price', binary() }
  | {'guest_ratings', openapi_catalogs_hotel_guest_ratings:openapi_catalogs_hotel_guest_ratings() }
  ].


openapi_catalogs_updatable_hotel_attributes() ->
    openapi_catalogs_updatable_hotel_attributes([]).

openapi_catalogs_updatable_hotel_attributes(Fields) ->
  Default = [ {'name', binary() }
            , {'link', binary() }
            , {'description', binary() }
            , {'brand', binary() }
            , {'latitude', integer() }
            , {'longitude', integer() }
            , {'neighborhood', list(binary()) }
            , {'address', openapi_catalogs_hotel_address:openapi_catalogs_hotel_address() }
            , {'custom_label_0', binary() }
            , {'custom_label_1', binary() }
            , {'custom_label_2', binary() }
            , {'custom_label_3', binary() }
            , {'custom_label_4', binary() }
            , {'category', binary() }
            , {'base_price', binary() }
            , {'sale_price', binary() }
            , {'guest_ratings', openapi_catalogs_hotel_guest_ratings:openapi_catalogs_hotel_guest_ratings() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

