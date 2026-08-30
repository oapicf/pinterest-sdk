(ns pinterest-rest-api.specs.report-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def report-type-data
  {
   })

(def report-type-spec
  (ds/spec
    {:name ::report-type
     :spec report-type-data}))
