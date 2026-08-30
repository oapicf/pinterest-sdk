(ns pinterest-rest-api.specs.standard-pin-metric-types
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def standard-pin-metric-types-data
  {
   })

(def standard-pin-metric-types-spec
  (ds/spec
    {:name ::standard-pin-metric-types
     :spec standard-pin-metric-types-data}))
