(ns pinterest-rest-api.specs.trends-age-bucket
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trends-age-bucket-data
  {
   })

(def trends-age-bucket-spec
  (ds/spec
    {:name ::trends-age-bucket
     :spec trends-age-bucket-data}))
