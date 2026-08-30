(ns pinterest-rest-api.specs.ad-accounts-audience-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.event-data :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs.audience-objective-type :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-audience-rule-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :ad_id) (s/coll-of string?)
   (ds/opt :campaign_id) (s/coll-of string?)
   (ds/opt :country) string?
   (ds/opt :customer_list_id) string?
   (ds/opt :engagement_domain) (s/coll-of string?)
   (ds/opt :engagement_type) string?
   (ds/opt :engager_type) int?
   (ds/opt :event) string?
   (ds/opt :event_data) event-data-spec
   (ds/opt :event_source) any?
   (ds/opt :ingestion_source) any?
   (ds/opt :objective_type) (s/coll-of audience-objective-type-spec)
   (ds/opt :percentage) int?
   (ds/opt :pin_id) (s/coll-of string?)
   (ds/opt :prefill) boolean?
   (ds/opt :retention_days) int?
   (ds/opt :seed_id) (s/coll-of string?)
   (ds/opt :url) (s/coll-of string?)
   (ds/opt :visitor_source_id) string?
   })

(def ad-accounts-audience-rule-spec
  (ds/spec
    {:name ::ad-accounts-audience-rule
     :spec ad-accounts-audience-rule-data}))
