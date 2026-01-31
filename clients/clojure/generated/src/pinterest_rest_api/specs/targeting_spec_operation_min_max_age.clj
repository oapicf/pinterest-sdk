(ns pinterest-rest-api.specs.targeting-spec-operation-min-max-age
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-operation-min-max-age-data
  {
   (ds/req :field) string?
   (ds/req :operation) string?
   (ds/req :value) string?
   })

(def targeting-spec-operation-min-max-age-spec
  (ds/spec
    {:name ::targeting-spec-operation-min-max-age
     :spec targeting-spec-operation-min-max-age-data}))
