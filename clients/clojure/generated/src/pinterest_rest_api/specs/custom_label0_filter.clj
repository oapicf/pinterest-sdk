(ns pinterest-rest-api.specs.custom-label0-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def custom-label0-filter-data
  {
   (ds/req :CUSTOM_LABEL_0) catalogs-product-group-multiple-string-criteria-spec
   })

(def custom-label0-filter-spec
  (ds/spec
    {:name ::custom-label0-filter
     :spec custom-label0-filter-data}))
