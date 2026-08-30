(ns pinterest-rest-api.specs.dynamic-titles-process-csv
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.dynamic-titles-process-csv-error :refer :all]
            )
  (:import (java.io File)))


(def dynamic-titles-process-csv-data
  {
   (ds/opt :errors) (s/coll-of dynamic-titles-process-csv-error-spec)
   (ds/opt :status) string?
   })

(def dynamic-titles-process-csv-spec
  (ds/spec
    {:name ::dynamic-titles-process-csv
     :spec dynamic-titles-process-csv-data}))
