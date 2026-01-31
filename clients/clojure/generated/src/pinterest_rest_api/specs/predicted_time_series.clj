(ns pinterest-rest-api.specs.predicted-time-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def predicted-time-series-data
  {
   (ds/opt :date) inst?
   })

(def predicted-time-series-spec
  (ds/spec
    {:name ::predicted-time-series
     :spec predicted-time-series-data}))
