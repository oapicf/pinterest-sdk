(ns pinterest-rest-api.specs.ad-group-audience-sizing-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-group-audience-sizing-response-data
  {
   (ds/opt :audience_size_lower_bound) float?
   (ds/opt :audience_size_upper_bound) float?
   })

(def ad-group-audience-sizing-response-spec
  (ds/spec
    {:name ::ad-group-audience-sizing-response
     :spec ad-group-audience-sizing-response-data}))
