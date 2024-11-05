(ns pinterest-rest-api.specs.ads-analytics-metrics-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ads-analytics-filter-column :refer :all]
            [pinterest-rest-api.specs.ads-analytics-filter-operator :refer :all]
            )
  (:import (java.io File)))


(def ads-analytics-metrics-filter-data
  {
   (ds/req :field) ads-analytics-filter-column-spec
   (ds/req :operator) ads-analytics-filter-operator-spec
   (ds/req :values) (s/coll-of float?)
   })

(def ads-analytics-metrics-filter-spec
  (ds/spec
    {:name ::ads-analytics-metrics-filter
     :spec ads-analytics-metrics-filter-data}))
