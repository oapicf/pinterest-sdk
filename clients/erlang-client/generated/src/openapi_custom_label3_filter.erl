-module(openapi_custom_label3_filter).

-export([encode/1]).

-export_type([openapi_custom_label3_filter/0]).

-type openapi_custom_label3_filter() ::
    #{ 'CUSTOM_LABEL_3' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'CUSTOM_LABEL_3' := CUSTOMLABEL3
        }) ->
    #{ 'CUSTOM_LABEL_3' => CUSTOMLABEL3
     }.
