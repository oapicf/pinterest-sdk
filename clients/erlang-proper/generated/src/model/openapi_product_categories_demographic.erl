-module(openapi_product_categories_demographic).

-include("openapi.hrl").

-export([openapi_product_categories_demographic/0]).

-export([openapi_product_categories_demographic/1]).

-export_type([openapi_product_categories_demographic/0]).

-type openapi_product_categories_demographic() ::
  [ {'age', map() }
  | {'gender', openapi_gender_demographics:openapi_gender_demographics() }
  ].


openapi_product_categories_demographic() ->
    openapi_product_categories_demographic([]).

openapi_product_categories_demographic(Fields) ->
  Default = [ {'age', map() }
            , {'gender', openapi_gender_demographics:openapi_gender_demographics() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

