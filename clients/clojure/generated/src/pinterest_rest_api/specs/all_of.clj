(ns pinterest-rest-api.specs.all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def all-of-data
  {
   (ds/req :all_of) (s/coll-of catalogs-product-group-filter-keys-spec)
   })

(def all-of-spec
  (ds/spec
    {:name ::all-of
     :spec all-of-data}))
