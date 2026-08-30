(ns pinterest-rest-api.specs.billing-invoices-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.billing-invoice :refer :all]
            )
  (:import (java.io File)))


(def billing-invoices-get-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of billing-invoice-spec)
   })

(def billing-invoices-get-200-response-spec
  (ds/spec
    {:name ::billing-invoices-get-200-response
     :spec billing-invoices-get-200-response-data}))
