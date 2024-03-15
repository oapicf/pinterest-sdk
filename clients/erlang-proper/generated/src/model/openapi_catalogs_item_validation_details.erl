-module(openapi_catalogs_item_validation_details).

-include("openapi.hrl").

-export([openapi_catalogs_item_validation_details/0]).

-export([openapi_catalogs_item_validation_details/1]).

-export_type([openapi_catalogs_item_validation_details/0]).

-type openapi_catalogs_item_validation_details() ::
  [ {'attribute_name', openapi_nullable_catalogs_item_field_type:openapi_nullable_catalogs_item_field_type() }
  | {'provided_value', binary() }
  ].


openapi_catalogs_item_validation_details() ->
    openapi_catalogs_item_validation_details([]).

openapi_catalogs_item_validation_details(Fields) ->
  Default = [ {'attribute_name', openapi_nullable_catalogs_item_field_type:openapi_nullable_catalogs_item_field_type() }
            , {'provided_value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

