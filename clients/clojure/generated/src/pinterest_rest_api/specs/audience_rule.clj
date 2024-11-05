(ns pinterest-rest-api.specs.audience-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pinterest-tag-event-data :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            )
  (:import (java.io File)))


(def audience-rule-data
  {
   (ds/opt :country) string?
   (ds/opt :customer_list_id) string?
   (ds/opt :engagement_domain) (s/coll-of string?)
   (ds/opt :engagement_type) string?
   (ds/opt :event) string?
   (ds/opt :event_data) pinterest-tag-event-data-spec
   (ds/opt :percentage) int?
   (ds/opt :pin_id) (s/coll-of string?)
   (ds/opt :prefill) boolean?
   (ds/opt :retention_days) int?
   (ds/opt :seed_id) (s/coll-of string?)
   (ds/opt :url) (s/coll-of string?)
   (ds/opt :visitor_source_id) string?
   (ds/opt :event_source) any?
   (ds/opt :ingestion_source) any?
   (ds/opt :engager_type) int?
   (ds/opt :campaign_id) (s/coll-of string?)
   (ds/opt :ad_id) (s/coll-of string?)
   (ds/opt :objective_type) (s/coll-of objective-type-spec)
   (ds/opt :ad_account_id) string?
   })

(def audience-rule-spec
  (ds/spec
    {:name ::audience-rule
     :spec audience-rule-data}))
