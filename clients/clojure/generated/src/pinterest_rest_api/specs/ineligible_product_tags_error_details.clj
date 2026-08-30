(ns pinterest-rest-api.specs.ineligible-product-tags-error-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ineligible-product-tag-error-item :refer :all]
            )
  (:import (java.io File)))


(def ineligible-product-tags-error-details-data
  {
   (ds/req :product_tags) (s/coll-of ineligible-product-tag-error-item-spec)
   })

(def ineligible-product-tags-error-details-spec
  (ds/spec
    {:name ::ineligible-product-tags-error-details
     :spec ineligible-product-tags-error-details-data}))
