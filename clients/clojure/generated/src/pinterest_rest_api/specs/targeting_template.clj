(ns pinterest-rest-api.specs.targeting-template
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-template-keyword :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.targeting-template-audience-sizing :refer :all]
            [pinterest-rest-api.specs.targeting-template-status :refer :all]
            [pinterest-rest-api.specs.targeting-spec-optimal :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :created_time) int?
   (ds/opt :id) string?
   (ds/opt :keywords) (s/coll-of targeting-template-keyword-spec)
   (ds/req :name) string?
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :sizing) targeting-template-audience-sizing-spec
   (ds/opt :status) targeting-template-status-spec
   (ds/req :targeting_attributes) targeting-spec-optimal-spec
   (ds/opt :tracking_urls) tracking-urls-spec
   (ds/opt :updated_time) int?
   (ds/opt :valid) boolean?
   })

(def targeting-template-spec
  (ds/spec
    {:name ::targeting-template
     :spec targeting-template-data}))
