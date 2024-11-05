(ns pinterest-rest-api.specs.ads-analytics-filter-column
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-filter-column-data
  {
   })

(def ads-analytics-filter-column-spec
  (ds/spec
    {:name ::ads-analytics-filter-column
     :spec ads-analytics-filter-column-data}))
