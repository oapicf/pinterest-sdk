-module(openapi_title_keywords_filter).

-export([encode/1]).

-export_type([openapi_title_keywords_filter/0]).

-type openapi_title_keywords_filter() ::
    #{ 'TITLE_KEYWORDS' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'TITLE_KEYWORDS' := TITLEKEYWORDS
        }) ->
    #{ 'TITLE_KEYWORDS' => TITLEKEYWORDS
     }.
