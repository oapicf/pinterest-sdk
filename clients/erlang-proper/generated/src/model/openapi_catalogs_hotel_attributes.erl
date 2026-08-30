-module(openapi_catalogs_hotel_attributes).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_attributes/0]).

-export([openapi_catalogs_hotel_attributes/1]).

-export_type([openapi_catalogs_hotel_attributes/0]).

-type openapi_catalogs_hotel_attributes() ::
  [ {'address', openapi_catalogs_hotel_address:openapi_catalogs_hotel_address() }
  | {'base_price', binary() }
  | {'brand', binary() }
  | {'category', binary() }
  | {'custom_label_0', binary() }
  | {'custom_label_1', binary() }
  | {'custom_label_2', binary() }
  | {'custom_label_3', binary() }
  | {'custom_label_4', binary() }
  | {'description', binary() }
  | {'guest_ratings', openapi_catalogs_hotel_guest_ratings:openapi_catalogs_hotel_guest_ratings() }
  | {'latitude', integer() }
  | {'link', binary() }
  | {'longitude', integer() }
  | {'name', binary() }
  | {'neighborhood', list(binary()) }
  | {'sale_price', binary() }
  | {'additional_image_link', list(binary()) }
  | {'ai_disclosures', list(openapi_catalogs_ai_content_disclosure:openapi_catalogs_ai_content_disclosure()) }
  | {'main_image', openapi_catalogs_hotel_main_image:openapi_catalogs_hotel_main_image() }
  ].


openapi_catalogs_hotel_attributes() ->
    openapi_catalogs_hotel_attributes([]).

openapi_catalogs_hotel_attributes(Fields) ->
  Default = [ {'address', openapi_catalogs_hotel_address:openapi_catalogs_hotel_address() }
            , {'base_price', binary() }
            , {'brand', binary() }
            , {'category', binary() }
            , {'custom_label_0', binary() }
            , {'custom_label_1', binary() }
            , {'custom_label_2', binary() }
            , {'custom_label_3', binary() }
            , {'custom_label_4', binary() }
            , {'description', binary() }
            , {'guest_ratings', openapi_catalogs_hotel_guest_ratings:openapi_catalogs_hotel_guest_ratings() }
            , {'latitude', integer() }
            , {'link', binary() }
            , {'longitude', integer() }
            , {'name', binary() }
            , {'neighborhood', list(binary()) }
            , {'sale_price', binary() }
            , {'additional_image_link', list(binary()) }
            , {'ai_disclosures', list(openapi_catalogs_ai_content_disclosure:openapi_catalogs_ai_content_disclosure()) }
            , {'main_image', openapi_catalogs_hotel_main_image:openapi_catalogs_hotel_main_image() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

