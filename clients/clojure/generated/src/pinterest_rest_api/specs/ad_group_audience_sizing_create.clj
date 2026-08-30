(ns pinterest-rest-api.specs.ad-group-audience-sizing-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-group-audience-sizing-creative-types :refer :all]
            [pinterest-rest-api.specs.ad-group-audience-sizing-keyword :refer :all]
            [pinterest-rest-api.specs.adgroup-placement-group-type :refer :all]
            [pinterest-rest-api.specs.targeting-spec-optimal :refer :all]
            )
  (:import (java.io File)))


(def ad-group-audience-sizing-create-data
  {
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :creative_types) (s/coll-of ad-group-audience-sizing-creative-types-spec)
   (ds/opt :keywords) (s/coll-of ad-group-audience-sizing-keyword-spec)
   (ds/opt :placement_group) adgroup-placement-group-type-spec
   (ds/opt :product_group_ids) (s/coll-of string?)
   (ds/opt :targeting_spec) targeting-spec-optimal-spec
   })

(def ad-group-audience-sizing-create-spec
  (ds/spec
    {:name ::ad-group-audience-sizing-create
     :spec ad-group-audience-sizing-create-data}))
