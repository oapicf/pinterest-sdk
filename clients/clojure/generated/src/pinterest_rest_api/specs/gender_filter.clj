(ns pinterest-rest-api.specs.gender-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def gender-filter-data
  {
   (ds/req :GENDER) catalogs-product-group-multiple-string-criteria-spec
   })

(def gender-filter-spec
  (ds/spec
    {:name ::gender-filter
     :spec gender-filter-data}))
