(ns pinterest-rest-api.specs.ineligible-product-tag-error-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ineligible-product-tag-reason :refer :all]
            )
  (:import (java.io File)))


(def ineligible-product-tag-error-item-data
  {
   (ds/req :error_message) ineligible-product-tag-reason-spec
   (ds/req :pin_id) string?
   })

(def ineligible-product-tag-error-item-spec
  (ds/spec
    {:name ::ineligible-product-tag-error-item
     :spec ineligible-product-tag-error-item-data}))
