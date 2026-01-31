(ns pinterest-rest-api.specs.billing-invoice-download-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-invoice-download-response-data
  {
   (ds/opt :download_url) string?
   (ds/opt :id) string?
   })

(def billing-invoice-download-response-spec
  (ds/spec
    {:name ::billing-invoice-download-response
     :spec billing-invoice-download-response-data}))
