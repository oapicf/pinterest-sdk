(ns pinterest-rest-api.specs.catalogs-item-validation-warnings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            )
  (:import (java.io File)))


(def catalogs-item-validation-warnings-data
  {
   (ds/opt :AD_LINK_FORMAT_WARNING) catalogs-item-validation-details-spec
   (ds/opt :AD_LINK_SAME_AS_LINK) catalogs-item-validation-details-spec
   (ds/opt :ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) catalogs-item-validation-details-spec
   (ds/opt :ADDITIONAL_IMAGE_LINK_WARNING) catalogs-item-validation-details-spec
   (ds/opt :ADWORDS_FORMAT_WARNING) catalogs-item-validation-details-spec
   (ds/opt :ADWORDS_SAME_AS_LINK) catalogs-item-validation-details-spec
   (ds/opt :AGE_GROUP_INVALID) catalogs-item-validation-details-spec
   (ds/opt :SIZE_SYSTEM_INVALID) catalogs-item-validation-details-spec
   (ds/opt :ANDROID_DEEP_LINK_INVALID) catalogs-item-validation-details-spec
   (ds/opt :AVAILABILITY_DATE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :COUNTRY_DOES_NOT_MAP_TO_CURRENCY) catalogs-item-validation-details-spec
   (ds/opt :CUSTOM_LABEL_LENGTH_TOO_LONG) catalogs-item-validation-details-spec
   (ds/opt :DESCRIPTION_LENGTH_TOO_LONG) catalogs-item-validation-details-spec
   (ds/opt :EXPIRATION_DATE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :GENDER_INVALID) catalogs-item-validation-details-spec
   (ds/opt :GTIN_INVALID) catalogs-item-validation-details-spec
   (ds/opt :IMAGE_LINK_WARNING) catalogs-item-validation-details-spec
   (ds/opt :IOS_DEEP_LINK_INVALID) catalogs-item-validation-details-spec
   (ds/opt :IS_BUNDLE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) catalogs-item-validation-details-spec
   (ds/opt :LINK_FORMAT_WARNING) catalogs-item-validation-details-spec
   (ds/opt :MIN_AD_PRICE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :MPN_INVALID) catalogs-item-validation-details-spec
   (ds/opt :MULTIPACK_INVALID) catalogs-item-validation-details-spec
   (ds/opt :OPTIONAL_CONDITION_INVALID) catalogs-item-validation-details-spec
   (ds/opt :OPTIONAL_CONDITION_MISSING) catalogs-item-validation-details-spec
   (ds/opt :OPTIONAL_PRODUCT_CATEGORY_INVALID) catalogs-item-validation-details-spec
   (ds/opt :OPTIONAL_PRODUCT_CATEGORY_MISSING) catalogs-item-validation-details-spec
   (ds/opt :PRODUCT_CATEGORY_DEPTH_WARNING) catalogs-item-validation-details-spec
   (ds/opt :PRODUCT_TYPE_LENGTH_TOO_LONG) catalogs-item-validation-details-spec
   (ds/opt :SALES_PRICE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :SALES_PRICE_TOO_LOW) catalogs-item-validation-details-spec
   (ds/opt :SALES_PRICE_TOO_HIGH) catalogs-item-validation-details-spec
   (ds/opt :SALE_DATE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :SHIPPING_INVALID) catalogs-item-validation-details-spec
   (ds/opt :SHIPPING_HEIGHT_INVALID) catalogs-item-validation-details-spec
   (ds/opt :SHIPPING_WEIGHT_INVALID) catalogs-item-validation-details-spec
   (ds/opt :SHIPPING_WIDTH_INVALID) catalogs-item-validation-details-spec
   (ds/opt :SIZE_TYPE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :TAX_INVALID) catalogs-item-validation-details-spec
   (ds/opt :TITLE_LENGTH_TOO_LONG) catalogs-item-validation-details-spec
   (ds/opt :TOO_MANY_ADDITIONAL_IMAGE_LINKS) catalogs-item-validation-details-spec
   (ds/opt :UTM_SOURCE_AUTO_CORRECTED) catalogs-item-validation-details-spec
   (ds/opt :WEIGHT_UNIT_INVALID) catalogs-item-validation-details-spec
   })

(def catalogs-item-validation-warnings-spec
  (ds/spec
    {:name ::catalogs-item-validation-warnings
     :spec catalogs-item-validation-warnings-data}))
