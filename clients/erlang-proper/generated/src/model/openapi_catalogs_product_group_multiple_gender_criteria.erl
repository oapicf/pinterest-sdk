-module(openapi_catalogs_product_group_multiple_gender_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_multiple_gender_criteria/0]).

-export([openapi_catalogs_product_group_multiple_gender_criteria/1]).

-export_type([openapi_catalogs_product_group_multiple_gender_criteria/0]).

-type openapi_catalogs_product_group_multiple_gender_criteria() ::
  [ {'values', list(openapi_gender:openapi_gender()) }
  | {'negated', boolean() }
  ].


openapi_catalogs_product_group_multiple_gender_criteria() ->
    openapi_catalogs_product_group_multiple_gender_criteria([]).

openapi_catalogs_product_group_multiple_gender_criteria(Fields) ->
  Default = [ {'values', list(openapi_gender:openapi_gender()) }
            , {'negated', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

