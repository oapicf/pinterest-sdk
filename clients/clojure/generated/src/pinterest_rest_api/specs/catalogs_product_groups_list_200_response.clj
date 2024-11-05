(ns pinterest-rest-api.specs.catalogs-product-groups-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-vertical-product-group :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-groups-list-200-response-data
  {
   (ds/req :items) (s/coll-of catalogs-vertical-product-group-spec)
   (ds/opt :bookmark) string?
   })

(def catalogs-product-groups-list-200-response-spec
  (ds/spec
    {:name ::catalogs-product-groups-list-200-response
     :spec catalogs-product-groups-list-200-response-data}))
