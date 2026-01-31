-module(openapi_title_keywords_filter).

-include("openapi.hrl").

-export([openapi_title_keywords_filter/0]).

-export([openapi_title_keywords_filter/1]).

-export_type([openapi_title_keywords_filter/0]).

-type openapi_title_keywords_filter() ::
  [ {'TITLE_KEYWORDS', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_title_keywords_filter() ->
    openapi_title_keywords_filter([]).

openapi_title_keywords_filter(Fields) ->
  Default = [ {'TITLE_KEYWORDS', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

