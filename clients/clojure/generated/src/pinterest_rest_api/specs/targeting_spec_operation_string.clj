(ns pinterest-rest-api.specs.targeting-spec-operation-string
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-operation-string-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :value) string?
   })

(def targeting-spec-operation-string-spec
  (ds/spec
    {:name ::targeting-spec-operation-string
     :spec targeting-spec-operation-string-data}))
