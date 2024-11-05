(ns pinterest-rest-api.specs.ssio-account-address
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-account-address-data
  {
   (ds/opt :display) string?
   (ds/opt :purpose) string?
   (ds/opt :address_id) string?
   (ds/opt :order_legal_entity) string?
   })

(def ssio-account-address-spec
  (ds/spec
    {:name ::ssio-account-address
     :spec ssio-account-address-data}))
