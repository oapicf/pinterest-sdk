(ns pinterest-rest-api.specs.leads-export-create-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def leads-export-create-response-data
  {
   (ds/opt :leads_export_id) string?
   })

(def leads-export-create-response-spec
  (ds/spec
    {:name ::leads-export-create-response
     :spec leads-export-create-response-data}))
