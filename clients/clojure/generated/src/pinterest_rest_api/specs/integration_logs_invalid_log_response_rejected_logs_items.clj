(ns pinterest-rest-api.specs.integration-logs-invalid-log-response-rejected-logs-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-logs-invalid-log-response-rejected-logs-items-data
  {
   (ds/req :field) string?
   (ds/opt :log_index) int?
   (ds/req :reason) string?
   (ds/req :value) string?
   })

(def integration-logs-invalid-log-response-rejected-logs-items-spec
  (ds/spec
    {:name ::integration-logs-invalid-log-response-rejected-logs-items
     :spec integration-logs-invalid-log-response-rejected-logs-items-data}))
