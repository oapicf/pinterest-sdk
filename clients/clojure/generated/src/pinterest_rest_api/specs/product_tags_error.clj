(ns pinterest-rest-api.specs.product-tags-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ineligible-product-tags-error-details :refer :all]
            )
  (:import (java.io File)))


(def product-tags-error-data
  {
   (ds/req :code) int?
   (ds/opt :details) ineligible-product-tags-error-details-spec
   (ds/req :message) string?
   })

(def product-tags-error-spec
  (ds/spec
    {:name ::product-tags-error
     :spec product-tags-error-data}))
