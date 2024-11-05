(ns pinterest-rest-api.specs.custom-label3-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def custom-label3-filter-data
  {
   (ds/req :CUSTOM_LABEL_3) catalogs-product-group-multiple-string-criteria-spec
   })

(def custom-label3-filter-spec
  (ds/spec
    {:name ::custom-label3-filter
     :spec custom-label3-filter-data}))
