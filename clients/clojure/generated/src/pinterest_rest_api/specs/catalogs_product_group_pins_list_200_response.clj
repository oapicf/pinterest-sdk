(ns pinterest-rest-api.specs.catalogs-product-group-pins-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-pins-list-200-response-data
  {
   (ds/req :items) (s/coll-of catalogs-product-spec)
   (ds/opt :bookmark) string?
   })

(def catalogs-product-group-pins-list-200-response-spec
  (ds/spec
    {:name ::catalogs-product-group-pins-list-200-response
     :spec catalogs-product-group-pins-list-200-response-data}))
