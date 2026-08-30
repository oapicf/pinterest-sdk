(ns pinterest-rest-api.specs.single-interest-targeting-option
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def single-interest-targeting-option-data
  {
   (ds/req :child_interests) (s/coll-of string?)
   (ds/req :id) string?
   (ds/req :level) int?
   (ds/req :name) string?
   })

(def single-interest-targeting-option-spec
  (ds/spec
    {:name ::single-interest-targeting-option
     :spec single-interest-targeting-option-data}))
