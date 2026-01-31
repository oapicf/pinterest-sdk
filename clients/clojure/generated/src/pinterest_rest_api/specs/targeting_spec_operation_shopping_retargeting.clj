(ns pinterest-rest-api.specs.targeting-spec-operation-shopping-retargeting
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-shopping-retargeting :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-operation-shopping-retargeting-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :values) (s/coll-of targeting-spec-shopping-retargeting-spec)
   })

(def targeting-spec-operation-shopping-retargeting-spec
  (ds/spec
    {:name ::targeting-spec-operation-shopping-retargeting
     :spec targeting-spec-operation-shopping-retargeting-data}))
