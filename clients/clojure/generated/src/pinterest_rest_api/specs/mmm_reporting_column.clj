(ns pinterest-rest-api.specs.mmm-reporting-column
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def mmm-reporting-column-data
  {
   })

(def mmm-reporting-column-spec
  (ds/spec
    {:name ::mmm-reporting-column
     :spec mmm-reporting-column-data}))
