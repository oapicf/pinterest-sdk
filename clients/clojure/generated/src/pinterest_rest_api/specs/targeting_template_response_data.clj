(ns pinterest-rest-api.specs.targeting-template-response-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.targeting-template-keyword :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            [pinterest-rest-api.specs.targeting-template-audience-sizing :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-response-data-data
  {
   (ds/opt :name) string?
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :targeting_attributes) targeting-spec-spec
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :keywords) (s/coll-of targeting-template-keyword-spec)
   (ds/opt :tracking_urls) tracking-urls-spec
   (ds/opt :id) string?
   (ds/opt :created_time) int?
   (ds/opt :updated_time) int?
   (ds/opt :ad_account_id) string?
   (ds/opt :status) string?
   (ds/opt :sizing) targeting-template-audience-sizing-spec
   })

(def targeting-template-response-data-spec
  (ds/spec
    {:name ::targeting-template-response-data
     :spec targeting-template-response-data-data}))
