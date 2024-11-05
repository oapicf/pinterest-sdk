(ns pinterest-rest-api.specs.leads-export-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def leads-export-create-request-data
  {
   (ds/req :start_date) string?
   (ds/req :end_date) string?
   (ds/req :ad_id) string?
   })

(def leads-export-create-request-spec
  (ds/spec
    {:name ::leads-export-create-request
     :spec leads-export-create-request-data}))
