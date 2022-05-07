(ns pinterest-rest-api.specs.brand-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def brand-filter-data
  {
   (ds/req :BRAND) catalogs-product-group-multiple-string-criteria-spec
   })

(def brand-filter-spec
  (ds/spec
    {:name ::brand-filter
     :spec brand-filter-data}))
