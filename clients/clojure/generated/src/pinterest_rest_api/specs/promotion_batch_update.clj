(ns pinterest-rest-api.specs.promotion-batch-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.discount-status :refer :all]
            [pinterest-rest-api.specs.promotion-type :refer :all]
            [pinterest-rest-api.specs.promotion-template-value :refer :all]
            )
  (:import (java.io File)))


(def promotion-batch-update-data
  {
   (ds/opt :discount_status) discount-status-spec
   (ds/opt :end_time) int?
   (ds/opt :external_id) string?
   (ds/req :id) string?
   (ds/opt :platform_type) string?
   (ds/opt :promotion_code) string?
   (ds/opt :promotion_custom_id) string?
   (ds/opt :promotion_title) string?
   (ds/opt :promotion_type) promotion-type-spec
   (ds/opt :start_time) int?
   (ds/opt :template_values) (s/coll-of promotion-template-value-spec)
   })

(def promotion-batch-update-spec
  (ds/spec
    {:name ::promotion-batch-update
     :spec promotion-batch-update-data}))
