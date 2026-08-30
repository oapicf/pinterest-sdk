(ns pinterest-rest-api.specs.conversion-api-response-events-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.event-processing-status :refer :all]
            )
  (:import (java.io File)))


(def conversion-api-response-events-items-data
  {
   (ds/opt :error_message) string?
   (ds/req :status) event-processing-status-spec
   (ds/opt :warning_message) string?
   })

(def conversion-api-response-events-items-spec
  (ds/spec
    {:name ::conversion-api-response-events-items
     :spec conversion-api-response-events-items-data}))
