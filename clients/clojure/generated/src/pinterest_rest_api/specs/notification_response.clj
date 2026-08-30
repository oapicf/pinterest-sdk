(ns pinterest-rest-api.specs.notification-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def notification-response-data
  {
   (ds/opt :error_msg) string?
   (ds/opt :received_at) int?
   (ds/opt :success) boolean?
   })

(def notification-response-spec
  (ds/spec
    {:name ::notification-response
     :spec notification-response-data}))
