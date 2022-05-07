(ns pinterest-rest-api.specs.ads-analytics-create-async-request-all-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.reporting-column-async :refer :all]
            [pinterest-rest-api.specs.metrics-reporting-level :refer :all]
            [pinterest-rest-api.specs.data-output-format :refer :all]
            )
  (:import (java.io File)))


(def ads-analytics-create-async-request-all-of-1-data
  {
   (ds/req :columns) (s/coll-of reporting-column-async-spec)
   (ds/req :level) metrics-reporting-level-spec
   (ds/opt :report_format) data-output-format-spec
   })

(def ads-analytics-create-async-request-all-of-1-spec
  (ds/spec
    {:name ::ads-analytics-create-async-request-all-of-1
     :spec ads-analytics-create-async-request-all-of-1-data}))
