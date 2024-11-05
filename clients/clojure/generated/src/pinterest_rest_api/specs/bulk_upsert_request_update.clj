(ns pinterest-rest-api.specs.bulk-upsert-request-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-update-request :refer :all]
            [pinterest-rest-api.specs.ad-group-update-request :refer :all]
            [pinterest-rest-api.specs.ad-update-request :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-update-request :refer :all]
            [pinterest-rest-api.specs.keyword-update :refer :all]
            )
  (:import (java.io File)))


(def bulk-upsert-request-update-data
  {
   (ds/opt :campaigns) (s/coll-of campaign-update-request-spec)
   (ds/opt :ad_groups) (s/coll-of ad-group-update-request-spec)
   (ds/opt :ads) (s/coll-of ad-update-request-spec)
   (ds/opt :product_groups) (s/coll-of product-group-promotion-update-request-spec)
   (ds/opt :keywords) (s/coll-of keyword-update-spec)
   })

(def bulk-upsert-request-update-spec
  (ds/spec
    {:name ::bulk-upsert-request-update
     :spec bulk-upsert-request-update-data}))
