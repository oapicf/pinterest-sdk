(ns pinterest-rest-api.specs.bulk-upsert-request-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-group-create-request :refer :all]
            [pinterest-rest-api.specs.ad-create-request :refer :all]
            [pinterest-rest-api.specs.campaign-create-request :refer :all]
            [pinterest-rest-api.specs.bulk-upsert-request-create-catalog-product-groups-items :refer :all]
            [pinterest-rest-api.specs.keywords-request :refer :all]
            [pinterest-rest-api.specs.label-bulk-create-request :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-create-request :refer :all]
            [pinterest-rest-api.specs.schedule-create-request :refer :all]
            )
  (:import (java.io File)))


(def bulk-upsert-request-create-data
  {
   (ds/opt :ad_groups) (s/coll-of ad-group-create-request-spec)
   (ds/opt :ads) (s/coll-of ad-create-request-spec)
   (ds/opt :campaigns) (s/coll-of campaign-create-request-spec)
   (ds/opt :catalog_product_groups) (s/coll-of bulk-upsert-request-create-catalog-product-groups-items-spec)
   (ds/opt :keywords) (s/coll-of keywords-request-spec)
   (ds/opt :labels) (s/coll-of label-bulk-create-request-spec)
   (ds/opt :product_groups) (s/coll-of product-group-promotion-create-request-spec)
   (ds/opt :schedules) (s/coll-of schedule-create-request-spec)
   })

(def bulk-upsert-request-create-spec
  (ds/spec
    {:name ::bulk-upsert-request-create
     :spec bulk-upsert-request-create-data}))
