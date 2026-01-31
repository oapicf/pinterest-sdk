(ns pinterest-rest-api.specs.gender-demographics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gender-demographics-data
  {
   (ds/req :female) float?
   (ds/req :male) float?
   (ds/req :unspecified) float?
   })

(def gender-demographics-spec
  (ds/spec
    {:name ::gender-demographics
     :spec gender-demographics-data}))
