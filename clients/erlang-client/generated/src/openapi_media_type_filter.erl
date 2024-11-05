-module(openapi_media_type_filter).

-export([encode/1]).

-export_type([openapi_media_type_filter/0]).

-type openapi_media_type_filter() ::
    #{ 'MEDIA_TYPE' := openapi_catalogs_product_group_multiple_media_types_criteria:openapi_catalogs_product_group_multiple_media_types_criteria()
     }.

encode(#{ 'MEDIA_TYPE' := MEDIATYPE
        }) ->
    #{ 'MEDIA_TYPE' => MEDIATYPE
     }.
