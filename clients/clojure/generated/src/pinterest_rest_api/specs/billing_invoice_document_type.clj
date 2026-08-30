(ns pinterest-rest-api.specs.billing-invoice-document-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-invoice-document-type-data
  {
   })

(def billing-invoice-document-type-spec
  (ds/spec
    {:name ::billing-invoice-document-type
     :spec billing-invoice-document-type-data}))
