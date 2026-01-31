(ns pinterest-rest-api.specs.brand-accounts-create-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def brand-accounts-create-200-response-data
  {
   (ds/opt :brand_account_id) string?
   })

(def brand-accounts-create-200-response-spec
  (ds/spec
    {:name ::brand-accounts-create-200-response
     :spec brand-accounts-create-200-response-data}))
