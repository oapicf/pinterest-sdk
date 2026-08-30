(ns pinterest-rest-api.specs.delivery-metrics-response-items-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delivery-metrics-response-items-items-data
  {
   (ds/opt :category) string?
   (ds/opt :definition) string?
   (ds/opt :display_name) string?
   (ds/opt :name) string?
   })

(def delivery-metrics-response-items-items-spec
  (ds/spec
    {:name ::delivery-metrics-response-items-items
     :spec delivery-metrics-response-items-items-data}))
