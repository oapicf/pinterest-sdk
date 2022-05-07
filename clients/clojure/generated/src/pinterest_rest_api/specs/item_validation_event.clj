(ns pinterest-rest-api.specs.item-validation-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-validation-event-data
  {
   (ds/opt :attribute) string?
   (ds/opt :code) int?
   (ds/opt :message) string?
   })

(def item-validation-event-spec
  (ds/spec
    {:name ::item-validation-event
     :spec item-validation-event-data}))
