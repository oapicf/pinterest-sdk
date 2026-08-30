(ns pinterest-rest-api.specs.supplemental-item-validation-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def supplemental-item-validation-event-data
  {
   (ds/req :attribute) string?
   (ds/req :code) int?
   (ds/req :message) string?
   })

(def supplemental-item-validation-event-spec
  (ds/spec
    {:name ::supplemental-item-validation-event
     :spec supplemental-item-validation-event-data}))
