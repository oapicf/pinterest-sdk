(ns pinterest-rest-api.specs.campaign-planning-ad-group-audience-size
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-planning-ad-group-audience-size-data
  {
   (ds/opt :count_lower) int?
   (ds/opt :count_upper) int?
   })

(def campaign-planning-ad-group-audience-size-spec
  (ds/spec
    {:name ::campaign-planning-ad-group-audience-size
     :spec campaign-planning-ad-group-audience-size-data}))
