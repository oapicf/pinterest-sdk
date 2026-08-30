(ns pinterest-rest-api.specs.ineligible-product-tag-reason
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ineligible-product-tag-reason-data
  {
   })

(def ineligible-product-tag-reason-spec
  (ds/spec
    {:name ::ineligible-product-tag-reason
     :spec ineligible-product-tag-reason-data}))
