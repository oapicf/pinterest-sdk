-module(openapi_custom_label4_filter).

-export([encode/1]).

-export_type([openapi_custom_label4_filter/0]).

-type openapi_custom_label4_filter() ::
    #{ 'CUSTOM_LABEL_4' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'CUSTOM_LABEL_4' := CUSTOMLABEL4
        }) ->
    #{ 'CUSTOM_LABEL_4' => CUSTOMLABEL4
     }.
