-module(openapi_catalogs_product_group_multiple_media_types_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_multiple_media_types_criteria/0]).

-export([openapi_catalogs_product_group_multiple_media_types_criteria/1]).

-export_type([openapi_catalogs_product_group_multiple_media_types_criteria/0]).

-type openapi_catalogs_product_group_multiple_media_types_criteria() ::
  [ {'values', list(openapi_media_type:openapi_media_type()) }
  | {'negated', boolean() }
  ].


openapi_catalogs_product_group_multiple_media_types_criteria() ->
    openapi_catalogs_product_group_multiple_media_types_criteria([]).

openapi_catalogs_product_group_multiple_media_types_criteria(Fields) ->
  Default = [ {'values', list(openapi_media_type:openapi_media_type()) }
            , {'negated', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

