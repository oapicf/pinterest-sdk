-module(openapi_catalogs_hotel_product_group_filter_keys).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_product_group_filter_keys/0]).

-type openapi_catalogs_hotel_product_group_filter_keys() ::
    #{ 'PRICE' := openapi_price_filter_price:openapi_price_filter_price(),
       'HOTEL_ID' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria(),
       'BRAND' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria(),
       'CUSTOM_LABEL_0' := openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria(),
       'CUSTOM_LABEL_1' := openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria(),
       'CUSTOM_LABEL_2' := openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria(),
       'CUSTOM_LABEL_3' := openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria(),
       'CUSTOM_LABEL_4' := openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria(),
       'COUNTRY' := openapi_catalogs_product_group_multiple_countries_criteria:openapi_catalogs_product_group_multiple_countries_criteria(),
       'TITLE_KEYWORDS' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'PRICE' := PRICE,
          'HOTEL_ID' := HOTELID,
          'BRAND' := BRAND,
          'CUSTOM_LABEL_0' := CUSTOMLABEL0,
          'CUSTOM_LABEL_1' := CUSTOMLABEL1,
          'CUSTOM_LABEL_2' := CUSTOMLABEL2,
          'CUSTOM_LABEL_3' := CUSTOMLABEL3,
          'CUSTOM_LABEL_4' := CUSTOMLABEL4,
          'COUNTRY' := COUNTRY,
          'TITLE_KEYWORDS' := TITLEKEYWORDS
        }) ->
    #{ 'PRICE' => PRICE,
       'HOTEL_ID' => HOTELID,
       'BRAND' => BRAND,
       'CUSTOM_LABEL_0' => CUSTOMLABEL0,
       'CUSTOM_LABEL_1' => CUSTOMLABEL1,
       'CUSTOM_LABEL_2' => CUSTOMLABEL2,
       'CUSTOM_LABEL_3' => CUSTOMLABEL3,
       'CUSTOM_LABEL_4' => CUSTOMLABEL4,
       'COUNTRY' => COUNTRY,
       'TITLE_KEYWORDS' => TITLEKEYWORDS
     }.
