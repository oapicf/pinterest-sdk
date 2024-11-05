(ns pinterest-rest-api.specs.ad-group-audience-sizing-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.targeting-spec :refer :all]
            [pinterest-rest-api.specs.ad-group-audience-sizing-request-keywords-inner :refer :all]
            )
  (:import (java.io File)))


(def ad-group-audience-sizing-request-data
  {
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :creative_types) (s/coll-of string?)
   (ds/opt :targeting_spec) targeting-spec-spec
   (ds/opt :product_group_ids) (s/coll-of string?)
   (ds/opt :keywords) (s/coll-of ad-group-audience-sizing-request-keywords-inner-spec)
   })

(def ad-group-audience-sizing-request-spec
  (ds/spec
    {:name ::ad-group-audience-sizing-request
     :spec ad-group-audience-sizing-request-data}))
