(ns pinterest-rest-api.specs.integration-logs-invalid-log-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.integration-logs-invalid-log-response-rejected-logs-inner :refer :all]
            )
  (:import (java.io File)))


(def integration-logs-invalid-log-response-data
  {
   (ds/opt :rejected_logs) (s/coll-of integration-logs-invalid-log-response-rejected-logs-inner-spec)
   })

(def integration-logs-invalid-log-response-spec
  (ds/spec
    {:name ::integration-logs-invalid-log-response
     :spec integration-logs-invalid-log-response-data}))
