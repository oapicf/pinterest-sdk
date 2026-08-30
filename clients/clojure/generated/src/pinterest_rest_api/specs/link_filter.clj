(ns pinterest-rest-api.specs.link-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filter-operator-type-criteria :refer :all]
            )
  (:import (java.io File)))


(def link-filter-data
  {
   (ds/req :LINK) catalogs-product-group-filter-operator-type-criteria-spec
   })

(def link-filter-spec
  (ds/spec
    {:name ::link-filter
     :spec link-filter-data}))
