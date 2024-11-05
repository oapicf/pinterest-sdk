-module(openapi_media_type_filter).

-include("openapi.hrl").

-export([openapi_media_type_filter/0]).

-export([openapi_media_type_filter/1]).

-export_type([openapi_media_type_filter/0]).

-type openapi_media_type_filter() ::
  [ {'MEDIA_TYPE', openapi_catalogs_product_group_multiple_media_types_criteria:openapi_catalogs_product_group_multiple_media_types_criteria() }
  ].


openapi_media_type_filter() ->
    openapi_media_type_filter([]).

openapi_media_type_filter(Fields) ->
  Default = [ {'MEDIA_TYPE', openapi_catalogs_product_group_multiple_media_types_criteria:openapi_catalogs_product_group_multiple_media_types_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

