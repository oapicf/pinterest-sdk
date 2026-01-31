(ns pinterest-rest-api.specs.targeting-spec-operation-age-bucket
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-age-bucket :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-operation-age-bucket-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :values) (s/coll-of targeting-spec-age-bucket-spec)
   })

(def targeting-spec-operation-age-bucket-spec
  (ds/spec
    {:name ::targeting-spec-operation-age-bucket
     :spec targeting-spec-operation-age-bucket-data}))
