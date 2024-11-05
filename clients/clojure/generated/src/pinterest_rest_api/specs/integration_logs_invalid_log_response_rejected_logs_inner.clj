(ns pinterest-rest-api.specs.integration-logs-invalid-log-response-rejected-logs-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-logs-invalid-log-response-rejected-logs-inner-data
  {
   (ds/opt :log_index) int?
   (ds/req :field) string?
   (ds/req :value) string?
   (ds/req :reason) string?
   })

(def integration-logs-invalid-log-response-rejected-logs-inner-spec
  (ds/spec
    {:name ::integration-logs-invalid-log-response-rejected-logs-inner
     :spec integration-logs-invalid-log-response-rejected-logs-inner-data}))
