(ns pinterest-rest-api.specs.brand-account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def brand-account-data
  {
   (ds/req :brand_account_id) string?
   })

(def brand-account-spec
  (ds/spec
    {:name ::brand-account
     :spec brand-account-data}))
