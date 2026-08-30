(ns pinterest-rest-api.specs.dynamic-titles-process-csv-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dynamic-titles-process-csv-error-data
  {
   (ds/opt :error_type) string?
   (ds/opt :row_number) int?
   })

(def dynamic-titles-process-csv-error-spec
  (ds/spec
    {:name ::dynamic-titles-process-csv-error
     :spec dynamic-titles-process-csv-error-data}))
