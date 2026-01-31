-module(openapi_custom_label2_filter).

-export([encode/1]).

-export_type([openapi_custom_label2_filter/0]).

-type openapi_custom_label2_filter() ::
    #{ 'CUSTOM_LABEL_2' := openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria()
     }.

encode(#{ 'CUSTOM_LABEL_2' := CUSTOMLABEL2
        }) ->
    #{ 'CUSTOM_LABEL_2' => CUSTOMLABEL2
     }.
