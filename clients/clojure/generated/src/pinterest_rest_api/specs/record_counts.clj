(ns pinterest-rest-api.specs.record-counts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def record-counts-data
  {
   (ds/req :invalid) int?
   (ds/req :processed) int?
   (ds/req :valid) int?
   })

(def record-counts-spec
  (ds/spec
    {:name ::record-counts
     :spec record-counts-data}))
