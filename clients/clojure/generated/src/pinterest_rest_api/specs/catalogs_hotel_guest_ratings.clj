(ns pinterest-rest-api.specs.catalogs-hotel-guest-ratings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-guest-ratings-data
  {
   (ds/opt :max_score) float?
   (ds/opt :number_of_reviewers) int?
   (ds/opt :rating_system) string?
   (ds/opt :score) float?
   })

(def catalogs-hotel-guest-ratings-spec
  (ds/spec
    {:name ::catalogs-hotel-guest-ratings
     :spec catalogs-hotel-guest-ratings-data}))
