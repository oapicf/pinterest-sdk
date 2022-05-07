(ns pinterest-rest-api.specs.custom-label2-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def custom-label2-filter-data
  {
   (ds/req :CUSTOM_LABEL_2) catalogs-product-group-multiple-string-criteria-spec
   })

(def custom-label2-filter-spec
  (ds/spec
    {:name ::custom-label2-filter
     :spec custom-label2-filter-data}))
