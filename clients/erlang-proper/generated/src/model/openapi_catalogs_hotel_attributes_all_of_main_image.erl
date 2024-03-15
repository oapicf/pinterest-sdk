-module(openapi_catalogs_hotel_attributes_all_of_main_image).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_attributes_all_of_main_image/0]).

-export([openapi_catalogs_hotel_attributes_all_of_main_image/1]).

-export_type([openapi_catalogs_hotel_attributes_all_of_main_image/0]).

-type openapi_catalogs_hotel_attributes_all_of_main_image() ::
  [ {'link', binary() }
  | {'tag', list(binary()) }
  ].


openapi_catalogs_hotel_attributes_all_of_main_image() ->
    openapi_catalogs_hotel_attributes_all_of_main_image([]).

openapi_catalogs_hotel_attributes_all_of_main_image(Fields) ->
  Default = [ {'link', binary() }
            , {'tag', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

