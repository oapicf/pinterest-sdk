(ns pinterest-rest-api.specs.conversion-deletion-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-deletion-request-status :refer :all]
            )
  (:import (java.io File)))


(def conversion-deletion-request-data
  {
   (ds/req :created_time) inst?
   (ds/opt :processed_time) inst?
   (ds/req :request_id) string?
   (ds/req :status) conversion-deletion-request-status-spec
   })

(def conversion-deletion-request-spec
  (ds/spec
    {:name ::conversion-deletion-request
     :spec conversion-deletion-request-data}))
