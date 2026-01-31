(ns pinterest-rest-api.specs.targeting-spec-operation-gender
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-gender :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-operation-gender-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :values) (s/coll-of targeting-spec-gender-spec)
   })

(def targeting-spec-operation-gender-spec
  (ds/spec
    {:name ::targeting-spec-operation-gender
     :spec targeting-spec-operation-gender-data}))
