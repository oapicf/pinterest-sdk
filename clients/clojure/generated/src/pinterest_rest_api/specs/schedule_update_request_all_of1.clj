(ns pinterest-rest-api.specs.schedule-update-request-all-of1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-update-request-all-of1-data
  {
   (ds/opt :entity_id) string?
   (ds/opt :entity_type) string?
   (ds/req :id) string?
   })

(def schedule-update-request-all-of1-spec
  (ds/spec
    {:name ::schedule-update-request-all-of1
     :spec schedule-update-request-all-of1-data}))
