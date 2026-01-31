(ns pinterest-rest-api.specs.trending-keyword-demographics-age-distribution
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trending-keyword-demographics-age-distribution-data
  {
   (ds/opt :age_distribution) string?
   })

(def trending-keyword-demographics-age-distribution-spec
  (ds/spec
    {:name ::trending-keyword-demographics-age-distribution
     :spec trending-keyword-demographics-age-distribution-data}))
