(ns pinterest-rest-api.specs.mmm-report-level
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def mmm-report-level-data
  {
   })

(def mmm-report-level-spec
  (ds/spec
    {:name ::mmm-report-level
     :spec mmm-report-level-data}))
