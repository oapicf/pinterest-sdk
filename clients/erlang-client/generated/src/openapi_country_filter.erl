-module(openapi_country_filter).

-export([encode/1]).

-export_type([openapi_country_filter/0]).

-type openapi_country_filter() ::
    #{ 'COUNTRY' := openapi_catalogs_product_group_multiple_countries_criteria:openapi_catalogs_product_group_multiple_countries_criteria()
     }.

encode(#{ 'COUNTRY' := COUNTRY
        }) ->
    #{ 'COUNTRY' => COUNTRY
     }.
