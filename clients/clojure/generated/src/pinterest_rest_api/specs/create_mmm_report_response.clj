(ns pinterest-rest-api.specs.create-mmm-report-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.create-mmm-report-response-data :refer :all]
            )
  (:import (java.io File)))


(def create-mmm-report-response-data
  {
   (ds/opt :code) float?
   (ds/opt :data) create-mmm-report-response-data-spec
   })

(def create-mmm-report-response-spec
  (ds/spec
    {:name ::create-mmm-report-response
     :spec create-mmm-report-response-data}))
