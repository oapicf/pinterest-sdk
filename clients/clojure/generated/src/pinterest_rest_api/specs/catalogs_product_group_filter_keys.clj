(ns pinterest-rest-api.specs.catalogs-product-group-filter-keys
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-filter-keys-data
  {
   (ds/req :MIN_PRICE) catalogs-product-group-pricing-criteria-spec
   (ds/req :MAX_PRICE) catalogs-product-group-pricing-criteria-spec
   (ds/req :CURRENCY) catalogs-product-group-currency-criteria-spec
   (ds/req :ITEM_ID) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :AVAILABILITY) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :BRAND) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CONDITION) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_0) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_1) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_2) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_3) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_4) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :ITEM_GROUP_ID) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :GENDER) catalogs-product-group-multiple-gender-criteria-spec
   (ds/req :MEDIA_TYPE) catalogs-product-group-multiple-media-types-criteria-spec
   (ds/req :PRODUCT_TYPE_4) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :PRODUCT_TYPE_3) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :PRODUCT_TYPE_2) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :PRODUCT_TYPE_1) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :PRODUCT_TYPE_0) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :GOOGLE_PRODUCT_CATEGORY_6) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :GOOGLE_PRODUCT_CATEGORY_5) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :GOOGLE_PRODUCT_CATEGORY_4) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :GOOGLE_PRODUCT_CATEGORY_3) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :GOOGLE_PRODUCT_CATEGORY_2) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :GOOGLE_PRODUCT_CATEGORY_1) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :GOOGLE_PRODUCT_CATEGORY_0) catalogs-product-group-multiple-string-list-criteria-spec
   (ds/req :PRODUCT_GROUP) catalogs-product-group-multiple-string-criteria-spec
   })

(def catalogs-product-group-filter-keys-spec
  (ds/spec
    {:name ::catalogs-product-group-filter-keys
     :spec catalogs-product-group-filter-keys-data}))
