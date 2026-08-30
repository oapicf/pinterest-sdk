(ns pinterest-rest-api.specs.leads-exports
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def leads-exports-data
  {
   (ds/opt :leads_export_id) string?
   })

(def leads-exports-spec
  (ds/spec
    {:name ::leads-exports
     :spec leads-exports-data}))
