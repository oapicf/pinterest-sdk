-module(openapi_custom_label0_filter).

-export([encode/1]).

-export_type([openapi_custom_label0_filter/0]).

-type openapi_custom_label0_filter() ::
    #{ 'CUSTOM_LABEL_0' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'CUSTOM_LABEL_0' := CUSTOMLABEL0
        }) ->
    #{ 'CUSTOM_LABEL_0' => CUSTOMLABEL0
     }.
