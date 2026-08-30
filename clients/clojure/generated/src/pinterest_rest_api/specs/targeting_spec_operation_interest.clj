(ns pinterest-rest-api.specs.targeting-spec-operation-interest
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-list-operation :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-operation-interest-data
  {
   (ds/req :field) string?
   (ds/req :operation) targeting-spec-list-operation-spec
   (ds/req :values) (s/coll-of string?)
   })

(def targeting-spec-operation-interest-spec
  (ds/spec
    {:name ::targeting-spec-operation-interest
     :spec targeting-spec-operation-interest-data}))
