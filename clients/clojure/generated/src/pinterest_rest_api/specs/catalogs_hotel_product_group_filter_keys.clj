(ns pinterest-rest-api.specs.catalogs-hotel-product-group-filter-keys
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-pricing-currency-criteria :refer :all]
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


(def catalogs-hotel-product-group-filter-keys-data
  {
   (ds/req :PRICE) catalogs-product-group-pricing-currency-criteria-spec
   (ds/req :HOTEL_ID) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :BRAND) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_0) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_1) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_2) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_3) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :CUSTOM_LABEL_4) catalogs-product-group-multiple-string-criteria-spec
   (ds/req :COUNTRY) catalogs-product-group-multiple-countries-criteria-spec
   })

(def catalogs-hotel-product-group-filter-keys-spec
  (ds/spec
    {:name ::catalogs-hotel-product-group-filter-keys
     :spec catalogs-hotel-product-group-filter-keys-data}))
