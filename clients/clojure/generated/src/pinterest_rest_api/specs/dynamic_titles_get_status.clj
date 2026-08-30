(ns pinterest-rest-api.specs.dynamic-titles-get-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dynamic-titles-get-status-data
  {
   (ds/opt :generated_count) int?
   (ds/opt :is_ready) boolean?
   (ds/opt :reviewed_count) int?
   })

(def dynamic-titles-get-status-spec
  (ds/spec
    {:name ::dynamic-titles-get-status
     :spec dynamic-titles-get-status-data}))
