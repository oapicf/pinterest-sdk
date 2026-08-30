(ns pinterest-rest-api.specs.dynamic-titles-process-csv-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dynamic-titles-process-csv-create-data
  {
   (ds/req :request_id) string?
   })

(def dynamic-titles-process-csv-create-spec
  (ds/spec
    {:name ::dynamic-titles-process-csv-create
     :spec dynamic-titles-process-csv-create-data}))
