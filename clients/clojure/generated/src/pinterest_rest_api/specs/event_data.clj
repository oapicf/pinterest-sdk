(ns pinterest-rest-api.specs.event-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.currency :refer :all]
            [pinterest-rest-api.specs.line-item :refer :all]
            )
  (:import (java.io File)))


(def event-data-data
  {
   (ds/opt :currency) currency-spec
   (ds/opt :lead_type) string?
   (ds/opt :line_items) line-item-spec
   (ds/opt :order_id) string?
   (ds/opt :order_quantity) int?
   (ds/opt :page_name) string?
   (ds/opt :promo_code) string?
   (ds/opt :property) string?
   (ds/opt :search_query) string?
   (ds/opt :value) string?
   (ds/opt :video_title) string?
   })

(def event-data-spec
  (ds/spec
    {:name ::event-data
     :spec event-data-data}))
