-module(openapi_catalogs_items_request).

-export([encode/1]).

-export_type([openapi_catalogs_items_request/0]).

-type openapi_catalogs_items_request() ::
    #{ 'country' := openapi_country:openapi_country(),
       'filters' := openapi_catalogs_items_post_filters:openapi_catalogs_items_post_filters(),
       'language' := binary()
     }.

encode(#{ 'country' := Country,
          'filters' := Filters,
          'language' := Language
        }) ->
    #{ 'country' => Country,
       'filters' => Filters,
       'language' => Language
     }.
