(ns pinterest-rest-api.specs.custom-label1-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def custom-label1-filter-data
  {
   (ds/req :CUSTOM_LABEL_1) catalogs-product-group-multiple-string-criteria-spec
   })

(def custom-label1-filter-spec
  (ds/spec
    {:name ::custom-label1-filter
     :spec custom-label1-filter-data}))
