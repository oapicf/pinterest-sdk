(ns pinterest-rest-api.specs.targeting-spec-operations
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-shopping-retargeting :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-operations-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :values) (s/coll-of targeting-spec-shopping-retargeting-spec)
   (ds/req :value) string?
   })

(def targeting-spec-operations-spec
  (ds/spec
    {:name ::targeting-spec-operations
     :spec targeting-spec-operations-data}))
