(ns pinterest-rest-api.specs.any-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def any-of-data
  {
   (ds/req :any_of) (s/coll-of catalogs-product-group-filter-keys-spec)
   })

(def any-of-spec
  (ds/spec
    {:name ::any-of
     :spec any-of-data}))
