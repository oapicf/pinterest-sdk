(ns pinterest-rest-api.specs.conversion-api-response-events-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-api-response-events-inner-data
  {
   (ds/req :status) string?
   (ds/opt :error_message) string?
   (ds/opt :warning_message) string?
   })

(def conversion-api-response-events-inner-spec
  (ds/spec
    {:name ::conversion-api-response-events-inner
     :spec conversion-api-response-events-inner-data}))
