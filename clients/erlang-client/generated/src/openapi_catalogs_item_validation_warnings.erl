-module(openapi_catalogs_item_validation_warnings).

-export([encode/1]).

-export_type([openapi_catalogs_item_validation_warnings/0]).

-type openapi_catalogs_item_validation_warnings() ::
    #{ 'AD_LINK_FORMAT_WARNING' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'AD_LINK_SAME_AS_LINK' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'ADDITIONAL_IMAGE_LINK_WARNING' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'ADWORDS_FORMAT_WARNING' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'ADWORDS_SAME_AS_LINK' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'AGE_GROUP_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SIZE_SYSTEM_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'ANDROID_DEEP_LINK_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'AVAILABILITY_DATE_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'COUNTRY_DOES_NOT_MAP_TO_CURRENCY' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'CUSTOM_LABEL_LENGTH_TOO_LONG' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'DESCRIPTION_LENGTH_TOO_LONG' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'EXPIRATION_DATE_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'GENDER_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'GTIN_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'IMAGE_LINK_WARNING' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'IOS_DEEP_LINK_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'IS_BUNDLE_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'LINK_FORMAT_WARNING' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'MIN_AD_PRICE_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'MPN_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'MULTIPACK_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'OPTIONAL_CONDITION_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'OPTIONAL_CONDITION_MISSING' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'OPTIONAL_PRODUCT_CATEGORY_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'OPTIONAL_PRODUCT_CATEGORY_MISSING' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'PRODUCT_CATEGORY_DEPTH_WARNING' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'PRODUCT_TYPE_LENGTH_TOO_LONG' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SALES_PRICE_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SALES_PRICE_TOO_LOW' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SALES_PRICE_TOO_HIGH' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SALE_DATE_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SHIPPING_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SHIPPING_HEIGHT_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SHIPPING_WEIGHT_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SHIPPING_WIDTH_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'SIZE_TYPE_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'TAX_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'TITLE_LENGTH_TOO_LONG' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'TOO_MANY_ADDITIONAL_IMAGE_LINKS' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'UTM_SOURCE_AUTO_CORRECTED' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details(),
       'WEIGHT_UNIT_INVALID' => openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details()
     }.

encode(#{ 'AD_LINK_FORMAT_WARNING' := ADLINKFORMATWARNING,
          'AD_LINK_SAME_AS_LINK' := ADLINKSAMEASLINK,
          'ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG' := ADDITIONALIMAGELINKLENGTHTOOLONG,
          'ADDITIONAL_IMAGE_LINK_WARNING' := ADDITIONALIMAGELINKWARNING,
          'ADWORDS_FORMAT_WARNING' := ADWORDSFORMATWARNING,
          'ADWORDS_SAME_AS_LINK' := ADWORDSSAMEASLINK,
          'AGE_GROUP_INVALID' := AGEGROUPINVALID,
          'SIZE_SYSTEM_INVALID' := SIZESYSTEMINVALID,
          'ANDROID_DEEP_LINK_INVALID' := ANDROIDDEEPLINKINVALID,
          'AVAILABILITY_DATE_INVALID' := AVAILABILITYDATEINVALID,
          'COUNTRY_DOES_NOT_MAP_TO_CURRENCY' := COUNTRYDOESNOTMAPTOCURRENCY,
          'CUSTOM_LABEL_LENGTH_TOO_LONG' := CUSTOMLABELLENGTHTOOLONG,
          'DESCRIPTION_LENGTH_TOO_LONG' := DESCRIPTIONLENGTHTOOLONG,
          'EXPIRATION_DATE_INVALID' := EXPIRATIONDATEINVALID,
          'GENDER_INVALID' := GENDERINVALID,
          'GTIN_INVALID' := GTININVALID,
          'IMAGE_LINK_WARNING' := IMAGELINKWARNING,
          'IOS_DEEP_LINK_INVALID' := IOSDEEPLINKINVALID,
          'IS_BUNDLE_INVALID' := ISBUNDLEINVALID,
          'ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE' := ITEMADDITIONALIMAGEDOWNLOADFAILURE,
          'LINK_FORMAT_WARNING' := LINKFORMATWARNING,
          'MIN_AD_PRICE_INVALID' := MINADPRICEINVALID,
          'MPN_INVALID' := MPNINVALID,
          'MULTIPACK_INVALID' := MULTIPACKINVALID,
          'OPTIONAL_CONDITION_INVALID' := OPTIONALCONDITIONINVALID,
          'OPTIONAL_CONDITION_MISSING' := OPTIONALCONDITIONMISSING,
          'OPTIONAL_PRODUCT_CATEGORY_INVALID' := OPTIONALPRODUCTCATEGORYINVALID,
          'OPTIONAL_PRODUCT_CATEGORY_MISSING' := OPTIONALPRODUCTCATEGORYMISSING,
          'PRODUCT_CATEGORY_DEPTH_WARNING' := PRODUCTCATEGORYDEPTHWARNING,
          'PRODUCT_TYPE_LENGTH_TOO_LONG' := PRODUCTTYPELENGTHTOOLONG,
          'SALES_PRICE_INVALID' := SALESPRICEINVALID,
          'SALES_PRICE_TOO_LOW' := SALESPRICETOOLOW,
          'SALES_PRICE_TOO_HIGH' := SALESPRICETOOHIGH,
          'SALE_DATE_INVALID' := SALEDATEINVALID,
          'SHIPPING_INVALID' := SHIPPINGINVALID,
          'SHIPPING_HEIGHT_INVALID' := SHIPPINGHEIGHTINVALID,
          'SHIPPING_WEIGHT_INVALID' := SHIPPINGWEIGHTINVALID,
          'SHIPPING_WIDTH_INVALID' := SHIPPINGWIDTHINVALID,
          'SIZE_TYPE_INVALID' := SIZETYPEINVALID,
          'TAX_INVALID' := TAXINVALID,
          'TITLE_LENGTH_TOO_LONG' := TITLELENGTHTOOLONG,
          'TOO_MANY_ADDITIONAL_IMAGE_LINKS' := TOOMANYADDITIONALIMAGELINKS,
          'UTM_SOURCE_AUTO_CORRECTED' := UTMSOURCEAUTOCORRECTED,
          'WEIGHT_UNIT_INVALID' := WEIGHTUNITINVALID
        }) ->
    #{ 'AD_LINK_FORMAT_WARNING' => ADLINKFORMATWARNING,
       'AD_LINK_SAME_AS_LINK' => ADLINKSAMEASLINK,
       'ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG' => ADDITIONALIMAGELINKLENGTHTOOLONG,
       'ADDITIONAL_IMAGE_LINK_WARNING' => ADDITIONALIMAGELINKWARNING,
       'ADWORDS_FORMAT_WARNING' => ADWORDSFORMATWARNING,
       'ADWORDS_SAME_AS_LINK' => ADWORDSSAMEASLINK,
       'AGE_GROUP_INVALID' => AGEGROUPINVALID,
       'SIZE_SYSTEM_INVALID' => SIZESYSTEMINVALID,
       'ANDROID_DEEP_LINK_INVALID' => ANDROIDDEEPLINKINVALID,
       'AVAILABILITY_DATE_INVALID' => AVAILABILITYDATEINVALID,
       'COUNTRY_DOES_NOT_MAP_TO_CURRENCY' => COUNTRYDOESNOTMAPTOCURRENCY,
       'CUSTOM_LABEL_LENGTH_TOO_LONG' => CUSTOMLABELLENGTHTOOLONG,
       'DESCRIPTION_LENGTH_TOO_LONG' => DESCRIPTIONLENGTHTOOLONG,
       'EXPIRATION_DATE_INVALID' => EXPIRATIONDATEINVALID,
       'GENDER_INVALID' => GENDERINVALID,
       'GTIN_INVALID' => GTININVALID,
       'IMAGE_LINK_WARNING' => IMAGELINKWARNING,
       'IOS_DEEP_LINK_INVALID' => IOSDEEPLINKINVALID,
       'IS_BUNDLE_INVALID' => ISBUNDLEINVALID,
       'ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE' => ITEMADDITIONALIMAGEDOWNLOADFAILURE,
       'LINK_FORMAT_WARNING' => LINKFORMATWARNING,
       'MIN_AD_PRICE_INVALID' => MINADPRICEINVALID,
       'MPN_INVALID' => MPNINVALID,
       'MULTIPACK_INVALID' => MULTIPACKINVALID,
       'OPTIONAL_CONDITION_INVALID' => OPTIONALCONDITIONINVALID,
       'OPTIONAL_CONDITION_MISSING' => OPTIONALCONDITIONMISSING,
       'OPTIONAL_PRODUCT_CATEGORY_INVALID' => OPTIONALPRODUCTCATEGORYINVALID,
       'OPTIONAL_PRODUCT_CATEGORY_MISSING' => OPTIONALPRODUCTCATEGORYMISSING,
       'PRODUCT_CATEGORY_DEPTH_WARNING' => PRODUCTCATEGORYDEPTHWARNING,
       'PRODUCT_TYPE_LENGTH_TOO_LONG' => PRODUCTTYPELENGTHTOOLONG,
       'SALES_PRICE_INVALID' => SALESPRICEINVALID,
       'SALES_PRICE_TOO_LOW' => SALESPRICETOOLOW,
       'SALES_PRICE_TOO_HIGH' => SALESPRICETOOHIGH,
       'SALE_DATE_INVALID' => SALEDATEINVALID,
       'SHIPPING_INVALID' => SHIPPINGINVALID,
       'SHIPPING_HEIGHT_INVALID' => SHIPPINGHEIGHTINVALID,
       'SHIPPING_WEIGHT_INVALID' => SHIPPINGWEIGHTINVALID,
       'SHIPPING_WIDTH_INVALID' => SHIPPINGWIDTHINVALID,
       'SIZE_TYPE_INVALID' => SIZETYPEINVALID,
       'TAX_INVALID' => TAXINVALID,
       'TITLE_LENGTH_TOO_LONG' => TITLELENGTHTOOLONG,
       'TOO_MANY_ADDITIONAL_IMAGE_LINKS' => TOOMANYADDITIONALIMAGELINKS,
       'UTM_SOURCE_AUTO_CORRECTED' => UTMSOURCEAUTOCORRECTED,
       'WEIGHT_UNIT_INVALID' => WEIGHTUNITINVALID
     }.
