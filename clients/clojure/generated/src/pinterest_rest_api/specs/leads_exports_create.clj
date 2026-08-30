(ns pinterest-rest-api.specs.leads-exports-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def leads-exports-create-data
  {
   (ds/req :ad_id) string?
   (ds/req :end_date) string?
   (ds/req :start_date) string?
   })

(def leads-exports-create-spec
  (ds/spec
    {:name ::leads-exports-create
     :spec leads-exports-create-data}))
