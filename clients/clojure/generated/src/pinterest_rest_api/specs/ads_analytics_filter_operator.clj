(ns pinterest-rest-api.specs.ads-analytics-filter-operator
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-filter-operator-data
  {
   })

(def ads-analytics-filter-operator-spec
  (ds/spec
    {:name ::ads-analytics-filter-operator
     :spec ads-analytics-filter-operator-data}))
