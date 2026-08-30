(ns pinterest-rest-api.specs.trending-keyword-demographics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.trends-age-distribution :refer :all]
            [pinterest-rest-api.specs.trends-gender-distribution :refer :all]
            )
  (:import (java.io File)))


(def trending-keyword-demographics-data
  {
   (ds/opt :age_distribution) trends-age-distribution-spec
   (ds/opt :gender_distribution) trends-gender-distribution-spec
   })

(def trending-keyword-demographics-spec
  (ds/spec
    {:name ::trending-keyword-demographics
     :spec trending-keyword-demographics-data}))
