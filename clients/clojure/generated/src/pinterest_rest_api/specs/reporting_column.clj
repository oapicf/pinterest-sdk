(ns pinterest-rest-api.specs.reporting-column
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def reporting-column-data
  {
   })

(def reporting-column-spec
  (ds/spec
    {:name ::reporting-column
     :spec reporting-column-data}))
