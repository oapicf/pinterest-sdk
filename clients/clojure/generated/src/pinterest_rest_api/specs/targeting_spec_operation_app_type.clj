(ns pinterest-rest-api.specs.targeting-spec-operation-app-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-list-operation :refer :all]
            [pinterest-rest-api.specs.targeting-spec-app-type :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-operation-app-type-data
  {
   (ds/req :field) string?
   (ds/req :operation) targeting-spec-list-operation-spec
   (ds/req :values) (s/coll-of targeting-spec-app-type-spec)
   })

(def targeting-spec-operation-app-type-spec
  (ds/spec
    {:name ::targeting-spec-operation-app-type
     :spec targeting-spec-operation-app-type-data}))
