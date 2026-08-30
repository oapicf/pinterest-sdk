(ns pinterest-rest-api.specs.targeting-spec-operation-minimum-age
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-operation-minimum-age-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :value) string?
   })

(def targeting-spec-operation-minimum-age-spec
  (ds/spec
    {:name ::targeting-spec-operation-minimum-age
     :spec targeting-spec-operation-minimum-age-data}))
