(ns pinterest-rest-api.specs.ad-response-all-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-promotion-summary-status :refer :all]
            )
  (:import (java.io File)))


(def ad-response-all-of-1-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :campaign_id) string?
   (ds/opt :collection_items_destination_url_template) string?
   (ds/opt :created_time) int?
   (ds/opt :id) string?
   (ds/opt :rejected_reasons) (s/coll-of string?)
   (ds/opt :rejection_labels) (s/coll-of string?)
   (ds/opt :review_status) string?
   (ds/opt :type) string?
   (ds/opt :updated_time) int?
   (ds/opt :summary_status) pin-promotion-summary-status-spec
   })

(def ad-response-all-of-1-spec
  (ds/spec
    {:name ::ad-response-all-of-1
     :spec ad-response-all-of-1-data}))
