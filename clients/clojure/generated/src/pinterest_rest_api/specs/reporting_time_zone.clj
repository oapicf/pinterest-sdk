(ns pinterest-rest-api.specs.reporting-time-zone
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def reporting-time-zone-data
  {
   })

(def reporting-time-zone-spec
  (ds/spec
    {:name ::reporting-time-zone
     :spec reporting-time-zone-data}))
