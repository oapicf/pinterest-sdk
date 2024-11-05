(ns pinterest-rest-api.specs.delivery-metrics-response-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delivery-metrics-response-items-inner-data
  {
   (ds/opt :name) string?
   (ds/opt :category) string?
   (ds/opt :definition) string?
   (ds/opt :display_name) string?
   })

(def delivery-metrics-response-items-inner-spec
  (ds/spec
    {:name ::delivery-metrics-response-items-inner
     :spec delivery-metrics-response-items-inner-data}))
