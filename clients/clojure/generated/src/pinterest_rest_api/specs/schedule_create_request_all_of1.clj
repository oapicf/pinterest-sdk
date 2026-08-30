(ns pinterest-rest-api.specs.schedule-create-request-all-of1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-create-request-all-of1-data
  {
   (ds/req :entity_id) string?
   (ds/req :entity_type) string?
   })

(def schedule-create-request-all-of1-spec
  (ds/spec
    {:name ::schedule-create-request-all-of1
     :spec schedule-create-request-all-of1-data}))
