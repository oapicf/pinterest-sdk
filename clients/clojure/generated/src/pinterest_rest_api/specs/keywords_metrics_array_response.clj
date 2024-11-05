(ns pinterest-rest-api.specs.keywords-metrics-array-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword-metrics-response :refer :all]
            )
  (:import (java.io File)))


(def keywords-metrics-array-response-data
  {
   (ds/opt :data) (s/coll-of keyword-metrics-response-spec)
   })

(def keywords-metrics-array-response-spec
  (ds/spec
    {:name ::keywords-metrics-array-response
     :spec keywords-metrics-array-response-data}))
