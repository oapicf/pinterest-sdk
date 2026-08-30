(ns pinterest-rest-api.specs.mmm-report-granularity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def mmm-report-granularity-data
  {
   })

(def mmm-report-granularity-spec
  (ds/spec
    {:name ::mmm-report-granularity
     :spec mmm-report-granularity-data}))
