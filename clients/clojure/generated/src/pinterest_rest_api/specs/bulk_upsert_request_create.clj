(ns pinterest-rest-api.specs.bulk-upsert-request-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-create-request :refer :all]
            [pinterest-rest-api.specs.ad-group-create-request :refer :all]
            [pinterest-rest-api.specs.ad-create-request :refer :all]
            [pinterest-rest-api.specs.product-group-promotion-create-request :refer :all]
            [pinterest-rest-api.specs.keywords-request :refer :all]
            )
  (:import (java.io File)))


(def bulk-upsert-request-create-data
  {
   (ds/opt :campaigns) (s/coll-of campaign-create-request-spec)
   (ds/opt :ad_groups) (s/coll-of ad-group-create-request-spec)
   (ds/opt :ads) (s/coll-of ad-create-request-spec)
   (ds/opt :product_groups) (s/coll-of product-group-promotion-create-request-spec)
   (ds/opt :keywords) (s/coll-of keywords-request-spec)
   })

(def bulk-upsert-request-create-spec
  (ds/spec
    {:name ::bulk-upsert-request-create
     :spec bulk-upsert-request-create-data}))
