(ns pinterest-rest-api.specs.targeting-spec-operation-audience-include
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-list-operation :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-operation-audience-include-data
  {
   (ds/req :field) string?
   (ds/req :operation) targeting-spec-list-operation-spec
   (ds/req :values) (s/coll-of string?)
   })

(def targeting-spec-operation-audience-include-spec
  (ds/spec
    {:name ::targeting-spec-operation-audience-include
     :spec targeting-spec-operation-audience-include-data}))
