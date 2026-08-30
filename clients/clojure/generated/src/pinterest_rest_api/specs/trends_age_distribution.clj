(ns pinterest-rest-api.specs.trends-age-distribution
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.trends-age-bucket :refer :all]
            )
  (:import (java.io File)))


(def trends-age-distribution-data
  {
   (ds/opt :age_distribution) trends-age-bucket-spec
   })

(def trends-age-distribution-spec
  (ds/spec
    {:name ::trends-age-distribution
     :spec trends-age-distribution-data}))
