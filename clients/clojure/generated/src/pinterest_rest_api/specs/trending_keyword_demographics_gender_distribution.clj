(ns pinterest-rest-api.specs.trending-keyword-demographics-gender-distribution
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trending-keyword-demographics-gender-distribution-data
  {
   (ds/opt :gender_distribution) string?
   })

(def trending-keyword-demographics-gender-distribution-spec
  (ds/spec
    {:name ::trending-keyword-demographics-gender-distribution
     :spec trending-keyword-demographics-gender-distribution-data}))
