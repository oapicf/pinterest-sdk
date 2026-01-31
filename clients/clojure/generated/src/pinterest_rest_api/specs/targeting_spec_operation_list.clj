(ns pinterest-rest-api.specs.targeting-spec-operation-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-operation-list-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :values) (s/coll-of string?)
   })

(def targeting-spec-operation-list-spec
  (ds/spec
    {:name ::targeting-spec-operation-list
     :spec targeting-spec-operation-list-data}))
