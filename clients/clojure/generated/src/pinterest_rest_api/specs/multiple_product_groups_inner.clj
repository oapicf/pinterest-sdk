(ns pinterest-rest-api.specs.multiple-product-groups-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-locale :refer :all]
            )
  (:import (java.io File)))


(def multiple-product-groups-inner-data
  {
   (ds/req :name) string?
   (ds/opt :description) string?
   (ds/opt :is_featured) boolean?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/req :feed_id) string?
   (ds/req :catalog_type) string?
   (ds/req :catalog_id) string?
   (ds/req :country) country-spec
   (ds/req :locale) catalogs-locale-spec
   })

(def multiple-product-groups-inner-spec
  (ds/spec
    {:name ::multiple-product-groups-inner
     :spec multiple-product-groups-inner-data}))
