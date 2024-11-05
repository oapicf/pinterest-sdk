(ns pinterest-rest-api.specs.get-mmm-report-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.get-mmm-report-response-data :refer :all]
            )
  (:import (java.io File)))


(def get-mmm-report-response-data
  {
   (ds/opt :code) float?
   (ds/opt :data) get-mmm-report-response-data-spec
   (ds/opt :message) string?
   (ds/opt :status) string?
   })

(def get-mmm-report-response-spec
  (ds/spec
    {:name ::get-mmm-report-response
     :spec get-mmm-report-response-data}))
