(ns pinterest-rest-api.specs.metrics-reporting-level
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def metrics-reporting-level-data
  {
   })

(def metrics-reporting-level-spec
  (ds/spec
    {:name ::metrics-reporting-level
     :spec metrics-reporting-level-data}))
