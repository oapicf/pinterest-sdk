(ns pinterest-rest-api.specs.metrics-response-data-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def metrics-response-data-items-data
  {
   (ds/req :metrics) any?
   (ds/req :targeting_type) string?
   (ds/req :targeting_value) string?
   })

(def metrics-response-data-items-spec
  (ds/spec
    {:name ::metrics-response-data-items
     :spec metrics-response-data-items-data}))
