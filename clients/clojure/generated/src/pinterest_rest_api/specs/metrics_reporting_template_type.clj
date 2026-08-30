(ns pinterest-rest-api.specs.metrics-reporting-template-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def metrics-reporting-template-type-data
  {
   })

(def metrics-reporting-template-type-spec
  (ds/spec
    {:name ::metrics-reporting-template-type
     :spec metrics-reporting-template-type-data}))
