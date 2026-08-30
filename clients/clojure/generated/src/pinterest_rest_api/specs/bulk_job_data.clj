(ns pinterest-rest-api.specs.bulk-job-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-request-status :refer :all]
            )
  (:import (java.io File)))


(def bulk-job-data-data
  {
   (ds/opt :result_url) string?
   (ds/req :status) bulk-request-status-spec
   (ds/opt :workload_id) int?
   })

(def bulk-job-data-spec
  (ds/spec
    {:name ::bulk-job-data
     :spec bulk-job-data-data}))
