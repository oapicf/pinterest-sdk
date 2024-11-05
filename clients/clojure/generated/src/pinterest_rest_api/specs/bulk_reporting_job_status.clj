(ns pinterest-rest-api.specs.bulk-reporting-job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bulk-reporting-job-status-data
  {
   })

(def bulk-reporting-job-status-spec
  (ds/spec
    {:name ::bulk-reporting-job-status
     :spec bulk-reporting-job-status-data}))
