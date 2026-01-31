(ns pinterest-rest-api.specs.time-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def time-series-data
  {
   (ds/opt :date) inst?
   })

(def time-series-spec
  (ds/spec
    {:name ::time-series
     :spec time-series-data}))
