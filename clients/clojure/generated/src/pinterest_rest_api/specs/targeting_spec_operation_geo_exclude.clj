(ns pinterest-rest-api.specs.targeting-spec-operation-geo-exclude
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-list-operation :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-operation-geo-exclude-data
  {
   (ds/req :field) string?
   (ds/req :operation) targeting-spec-list-operation-spec
   (ds/req :values) (s/coll-of string?)
   })

(def targeting-spec-operation-geo-exclude-spec
  (ds/spec
    {:name ::targeting-spec-operation-geo-exclude
     :spec targeting-spec-operation-geo-exclude-data}))
