(ns pinterest-rest-api.specs.condition-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def condition-filter-data
  {
   (ds/req :CONDITION) catalogs-product-group-multiple-string-criteria-spec
   })

(def condition-filter-spec
  (ds/spec
    {:name ::condition-filter
     :spec condition-filter-data}))
