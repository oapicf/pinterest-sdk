(ns pinterest-rest-api.specs.trends-editorial
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword-info :refer :all]
            )
  (:import (java.io File)))


(def trends-editorial-data
  {
   (ds/req :board_url) string?
   (ds/req :description) string?
   (ds/req :interests) (s/coll-of string?)
   (ds/req :pins_url) (s/coll-of string?)
   (ds/req :related_keywords) (s/coll-of keyword-info-spec)
   (ds/req :title) string?
   })

(def trends-editorial-spec
  (ds/spec
    {:name ::trends-editorial
     :spec trends-editorial-data}))
