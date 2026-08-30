(ns pinterest-rest-api.specs.campaign-planning-point-estimate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-planning-point-estimate-data
  {
   (ds/req :budget) int?
   (ds/req :double_y) float?
   (ds/req :max_y) int?
   (ds/req :min_y) int?
   (ds/req :y) int?
   })

(def campaign-planning-point-estimate-spec
  (ds/spec
    {:name ::campaign-planning-point-estimate
     :spec campaign-planning-point-estimate-data}))
