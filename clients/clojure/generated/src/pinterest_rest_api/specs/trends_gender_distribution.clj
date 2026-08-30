(ns pinterest-rest-api.specs.trends-gender-distribution
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.trends-gender :refer :all]
            )
  (:import (java.io File)))


(def trends-gender-distribution-data
  {
   (ds/opt :gender_distribution) trends-gender-spec
   })

(def trends-gender-distribution-spec
  (ds/spec
    {:name ::trends-gender-distribution
     :spec trends-gender-distribution-data}))
