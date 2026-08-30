(ns pinterest-rest-api.specs.campaign-planning-estimation-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-planning-estimation-type-data
  {
   })

(def campaign-planning-estimation-type-spec
  (ds/spec
    {:name ::campaign-planning-estimation-type
     :spec campaign-planning-estimation-type-data}))
