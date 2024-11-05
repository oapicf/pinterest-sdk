-module(openapi_catalogs_creative_assets_product_group_filter_keys).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_product_group_filter_keys/0]).

-type openapi_catalogs_creative_assets_product_group_filter_keys() ::
    #{ 'CREATIVE_ASSETS_ID' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria(),
       'CUSTOM_LABEL_0' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria(),
       'CUSTOM_LABEL_1' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria(),
       'CUSTOM_LABEL_2' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria(),
       'CUSTOM_LABEL_3' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria(),
       'CUSTOM_LABEL_4' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria(),
       'GOOGLE_PRODUCT_CATEGORY_6' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria(),
       'GOOGLE_PRODUCT_CATEGORY_5' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria(),
       'GOOGLE_PRODUCT_CATEGORY_4' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria(),
       'GOOGLE_PRODUCT_CATEGORY_3' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria(),
       'GOOGLE_PRODUCT_CATEGORY_2' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria(),
       'GOOGLE_PRODUCT_CATEGORY_1' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria(),
       'GOOGLE_PRODUCT_CATEGORY_0' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria(),
       'MEDIA_TYPE' := openapi_catalogs_product_group_multiple_media_types_criteria:openapi_catalogs_product_group_multiple_media_types_criteria()
     }.

encode(#{ 'CREATIVE_ASSETS_ID' := CREATIVEASSETSID,
          'CUSTOM_LABEL_0' := CUSTOMLABEL0,
          'CUSTOM_LABEL_1' := CUSTOMLABEL1,
          'CUSTOM_LABEL_2' := CUSTOMLABEL2,
          'CUSTOM_LABEL_3' := CUSTOMLABEL3,
          'CUSTOM_LABEL_4' := CUSTOMLABEL4,
          'GOOGLE_PRODUCT_CATEGORY_6' := GOOGLEPRODUCTCATEGORY6,
          'GOOGLE_PRODUCT_CATEGORY_5' := GOOGLEPRODUCTCATEGORY5,
          'GOOGLE_PRODUCT_CATEGORY_4' := GOOGLEPRODUCTCATEGORY4,
          'GOOGLE_PRODUCT_CATEGORY_3' := GOOGLEPRODUCTCATEGORY3,
          'GOOGLE_PRODUCT_CATEGORY_2' := GOOGLEPRODUCTCATEGORY2,
          'GOOGLE_PRODUCT_CATEGORY_1' := GOOGLEPRODUCTCATEGORY1,
          'GOOGLE_PRODUCT_CATEGORY_0' := GOOGLEPRODUCTCATEGORY0,
          'MEDIA_TYPE' := MEDIATYPE
        }) ->
    #{ 'CREATIVE_ASSETS_ID' => CREATIVEASSETSID,
       'CUSTOM_LABEL_0' => CUSTOMLABEL0,
       'CUSTOM_LABEL_1' => CUSTOMLABEL1,
       'CUSTOM_LABEL_2' => CUSTOMLABEL2,
       'CUSTOM_LABEL_3' => CUSTOMLABEL3,
       'CUSTOM_LABEL_4' => CUSTOMLABEL4,
       'GOOGLE_PRODUCT_CATEGORY_6' => GOOGLEPRODUCTCATEGORY6,
       'GOOGLE_PRODUCT_CATEGORY_5' => GOOGLEPRODUCTCATEGORY5,
       'GOOGLE_PRODUCT_CATEGORY_4' => GOOGLEPRODUCTCATEGORY4,
       'GOOGLE_PRODUCT_CATEGORY_3' => GOOGLEPRODUCTCATEGORY3,
       'GOOGLE_PRODUCT_CATEGORY_2' => GOOGLEPRODUCTCATEGORY2,
       'GOOGLE_PRODUCT_CATEGORY_1' => GOOGLEPRODUCTCATEGORY1,
       'GOOGLE_PRODUCT_CATEGORY_0' => GOOGLEPRODUCTCATEGORY0,
       'MEDIA_TYPE' => MEDIATYPE
     }.
