(ns pinterest-rest-api.specs.promotion-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.promotion-type :refer :all]
            [pinterest-rest-api.specs.promotion-template-value :refer :all]
            )
  (:import (java.io File)))


(def promotion-create-request-data
  {
   (ds/opt :discount_status) string?
   (ds/opt :end_time) int?
   (ds/opt :external_id) string?
   (ds/opt :platform_type) string?
   (ds/opt :promotion_code) string?
   (ds/opt :promotion_custom_id) string?
   (ds/req :promotion_title) string?
   (ds/req :promotion_type) promotion-type-spec
   (ds/opt :start_time) int?
   (ds/opt :template_values) (s/coll-of promotion-template-value-spec)
   })

(def promotion-create-request-spec
  (ds/spec
    {:name ::promotion-create-request
     :spec promotion-create-request-data}))
