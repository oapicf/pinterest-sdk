(ns pinterest-rest-api.specs.create-asset-access-request-error-message-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-asset-access-request-error-message-inner-data
  {
   (ds/opt :code) int?
   (ds/opt :messages) (s/coll-of string?)
   })

(def create-asset-access-request-error-message-inner-spec
  (ds/spec
    {:name ::create-asset-access-request-error-message-inner
     :spec create-asset-access-request-error-message-inner-data}))
