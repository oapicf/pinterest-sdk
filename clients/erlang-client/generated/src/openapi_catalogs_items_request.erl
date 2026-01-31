-module(openapi_catalogs_items_request).

-export([encode/1]).

-export_type([openapi_catalogs_items_request/0]).

-type openapi_catalogs_items_request() ::
    #{ 'country' := openapi_country:openapi_country(),
       'language' := binary(),
       'filters' := openapi_catalogs_items_post_filters:openapi_catalogs_items_post_filters()
     }.

encode(#{ 'country' := Country,
          'language' := Language,
          'filters' := Filters
        }) ->
    #{ 'country' => Country,
       'language' => Language,
       'filters' => Filters
     }.
