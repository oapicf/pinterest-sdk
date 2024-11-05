(ns pinterest-rest-api.specs.metrics-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def metrics-response-data
  {
   (ds/opt :data) (s/coll-of any?)
   })

(def metrics-response-spec
  (ds/spec
    {:name ::metrics-response
     :spec metrics-response-data}))
