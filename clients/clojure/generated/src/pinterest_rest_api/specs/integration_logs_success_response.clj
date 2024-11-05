(ns pinterest-rest-api.specs.integration-logs-success-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-logs-success-response-data
  {
   (ds/opt :message) string?
   })

(def integration-logs-success-response-spec
  (ds/spec
    {:name ::integration-logs-success-response
     :spec integration-logs-success-response-data}))
