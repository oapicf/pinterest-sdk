(ns pinterest-rest-api.specs.single-interest-targeting-option-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def single-interest-targeting-option-response-data
  {
   (ds/opt :id) string?
   (ds/opt :name) string?
   (ds/opt :child_interests) (s/coll-of string?)
   (ds/opt :level) int?
   })

(def single-interest-targeting-option-response-spec
  (ds/spec
    {:name ::single-interest-targeting-option-response
     :spec single-interest-targeting-option-response-data}))
