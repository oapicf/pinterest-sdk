(ns pinterest-rest-api.specs.custom-label4-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def custom-label4-filter-data
  {
   (ds/req :CUSTOM_LABEL_4) catalogs-product-group-multiple-string-criteria-spec
   })

(def custom-label4-filter-spec
  (ds/spec
    {:name ::custom-label4-filter
     :spec custom-label4-filter-data}))
