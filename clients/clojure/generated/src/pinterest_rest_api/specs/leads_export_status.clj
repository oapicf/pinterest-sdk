(ns pinterest-rest-api.specs.leads-export-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def leads-export-status-data
  {
   })

(def leads-export-status-spec
  (ds/spec
    {:name ::leads-export-status
     :spec leads-export-status-data}))
