(ns pinterest-rest-api.specs.catalogs-feed-validation-warnings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-validation-warnings-data
  {
   (ds/opt :AD_LINK_FORMAT_WARNING) int?
   (ds/opt :AD_LINK_SAME_AS_LINK) int?
   (ds/opt :TITLE_LENGTH_TOO_LONG) int?
   (ds/opt :DESCRIPTION_LENGTH_TOO_LONG) int?
   (ds/opt :GENDER_INVALID) int?
   (ds/opt :AGE_GROUP_INVALID) int?
   (ds/opt :SIZE_TYPE_INVALID) int?
   (ds/opt :SIZE_SYSTEM_INVALID) int?
   (ds/opt :LINK_FORMAT_WARNING) int?
   (ds/opt :SALES_PRICE_INVALID) int?
   (ds/opt :PRODUCT_CATEGORY_DEPTH_WARNING) int?
   (ds/opt :ADWORDS_FORMAT_WARNING) int?
   (ds/opt :ADWORDS_SAME_AS_LINK) int?
   (ds/opt :DUPLICATE_HEADERS) int?
   (ds/opt :FETCH_SAME_SIGNATURE) int?
   (ds/opt :ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) int?
   (ds/opt :ADDITIONAL_IMAGE_LINK_WARNING) int?
   (ds/opt :IMAGE_LINK_WARNING) int?
   (ds/opt :SHIPPING_INVALID) int?
   (ds/opt :TAX_INVALID) int?
   (ds/opt :SHIPPING_WEIGHT_INVALID) int?
   (ds/opt :EXPIRATION_DATE_INVALID) int?
   (ds/opt :AVAILABILITY_DATE_INVALID) int?
   (ds/opt :SALE_DATE_INVALID) int?
   (ds/opt :WEIGHT_UNIT_INVALID) int?
   (ds/opt :IS_BUNDLE_INVALID) int?
   (ds/opt :UPDATED_TIME_INVALID) int?
   (ds/opt :CUSTOM_LABEL_LENGTH_TOO_LONG) int?
   (ds/opt :PRODUCT_TYPE_LENGTH_TOO_LONG) int?
   (ds/opt :TOO_MANY_ADDITIONAL_IMAGE_LINKS) int?
   (ds/opt :MULTIPACK_INVALID) int?
   (ds/opt :INDEXED_PRODUCT_COUNT_LARGE_DELTA) int?
   (ds/opt :ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) int?
   (ds/opt :OPTIONAL_PRODUCT_CATEGORY_MISSING) int?
   (ds/opt :OPTIONAL_PRODUCT_CATEGORY_INVALID) int?
   (ds/opt :OPTIONAL_CONDITION_MISSING) int?
   (ds/opt :OPTIONAL_CONDITION_INVALID) int?
   (ds/opt :IOS_DEEP_LINK_INVALID) int?
   (ds/opt :ANDROID_DEEP_LINK_INVALID) int?
   (ds/opt :UTM_SOURCE_AUTO_CORRECTED) int?
   (ds/opt :COUNTRY_DOES_NOT_MAP_TO_CURRENCY) int?
   (ds/opt :MIN_AD_PRICE_INVALID) int?
   (ds/opt :GTIN_INVALID) int?
   (ds/opt :INCONSISTENT_CURRENCY_VALUES) int?
   (ds/opt :SALES_PRICE_TOO_LOW) int?
   (ds/opt :SHIPPING_WIDTH_INVALID) int?
   (ds/opt :SHIPPING_HEIGHT_INVALID) int?
   (ds/opt :SALES_PRICE_TOO_HIGH) int?
   (ds/opt :MPN_INVALID) int?
   })

(def catalogs-feed-validation-warnings-spec
  (ds/spec
    {:name ::catalogs-feed-validation-warnings
     :spec catalogs-feed-validation-warnings-data}))
