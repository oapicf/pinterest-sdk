(ns pinterest-rest-api.specs.ad-group-audience-sizing-keyword
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.match-type :refer :all]
            )
  (:import (java.io File)))


(def ad-group-audience-sizing-keyword-data
  {
   (ds/req :match_type) match-type-spec
   (ds/req :value) string?
   })

(def ad-group-audience-sizing-keyword-spec
  (ds/spec
    {:name ::ad-group-audience-sizing-keyword
     :spec ad-group-audience-sizing-keyword-data}))
