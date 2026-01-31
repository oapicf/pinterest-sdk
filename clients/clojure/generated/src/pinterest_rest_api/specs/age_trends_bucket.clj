(ns pinterest-rest-api.specs.age-trends-bucket
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def age-trends-bucket-data
  {
   })

(def age-trends-bucket-spec
  (ds/spec
    {:name ::age-trends-bucket
     :spec age-trends-bucket-data}))
