(ns pinterest-rest-api.specs.targeting-spec-operation-maximum-age
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-operation-maximum-age-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :value) string?
   })

(def targeting-spec-operation-maximum-age-spec
  (ds/spec
    {:name ::targeting-spec-operation-maximum-age
     :spec targeting-spec-operation-maximum-age-data}))
