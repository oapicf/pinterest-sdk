(ns pinterest-rest-api.specs.ad-group-response-all-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.action-type :refer :all]
            )
  (:import (java.io File)))


(def ad-group-response-all-of-1-data
  {
   (ds/opt :campaign_id) string?
   (ds/opt :billable_event) action-type-spec
   (ds/opt :id) string?
   (ds/opt :type) string?
   (ds/opt :ad_account_id) string?
   (ds/opt :created_time) int?
   (ds/opt :updated_time) int?
   })

(def ad-group-response-all-of-1-spec
  (ds/spec
    {:name ::ad-group-response-all-of-1
     :spec ad-group-response-all-of-1-data}))
