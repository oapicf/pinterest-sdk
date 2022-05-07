(ns pinterest-rest-api.specs.conversion-report-time-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-report-time-type-data
  {
   })

(def conversion-report-time-type-spec
  (ds/spec
    {:name ::conversion-report-time-type
     :spec conversion-report-time-type-data}))
