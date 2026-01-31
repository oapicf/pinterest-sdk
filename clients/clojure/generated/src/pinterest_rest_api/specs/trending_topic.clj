(ns pinterest-rest-api.specs.trending-topic
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.trending-pin :refer :all]
            )
  (:import (java.io File)))


(def trending-topic-data
  {
   (ds/req :description) string?
   (ds/req :percent_growth_mom) int?
   (ds/req :pins) (s/coll-of trending-pin-spec)
   (ds/req :related_interests) (s/coll-of string?)
   (ds/req :related_searches) (s/coll-of string?)
   (ds/req :time_series) (s/map-of string? float?)
   (ds/req :title) string?
   })

(def trending-topic-spec
  (ds/spec
    {:name ::trending-topic
     :spec trending-topic-data}))
