(ns pinterest-rest-api.specs.conversion-events-data-inner-custom-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-events-data-inner-custom-data-contents-inner :refer :all]
            )
  (:import (java.io File)))


(def conversion-events-data-inner-custom-data-data
  {
   (ds/opt :content_brand) string?
   (ds/opt :content_category) string?
   (ds/opt :content_ids) (s/coll-of string?)
   (ds/opt :content_name) string?
   (ds/opt :contents) (s/coll-of conversion-events-data-inner-custom-data-contents-inner-spec)
   (ds/opt :currency) string?
   (ds/opt :external_measurement_id) string?
   (ds/opt :external_measurement_vendor_id) int?
   (ds/opt :np) string?
   (ds/opt :num_items) int?
   (ds/opt :opt_out_type) string?
   (ds/opt :order_id) string?
   (ds/opt :predicted_ltv) string?
   (ds/opt :search_string) string?
   (ds/opt :value) string?
   })

(def conversion-events-data-inner-custom-data-spec
  (ds/spec
    {:name ::conversion-events-data-inner-custom-data
     :spec conversion-events-data-inner-custom-data-data}))
