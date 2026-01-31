(ns pinterest-rest-api.specs.trending-pin
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trending-pin-data
  {
   (ds/req :height) int?
   (ds/req :id) string?
   (ds/req :src) string?
   (ds/req :width) int?
   })

(def trending-pin-spec
  (ds/spec
    {:name ::trending-pin
     :spec trending-pin-data}))
