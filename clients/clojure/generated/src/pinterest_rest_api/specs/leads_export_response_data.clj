(ns pinterest-rest-api.specs.leads-export-response-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.leads-export-status :refer :all]
            )
  (:import (java.io File)))


(def leads-export-response-data-data
  {
   (ds/opt :download_url) string?
   (ds/opt :export_status) leads-export-status-spec
   })

(def leads-export-response-data-spec
  (ds/spec
    {:name ::leads-export-response-data
     :spec leads-export-response-data-data}))
