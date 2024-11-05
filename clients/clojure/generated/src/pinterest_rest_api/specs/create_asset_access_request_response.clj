(ns pinterest-rest-api.specs.create-asset-access-request-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.create-asset-access-request-error-message-inner :refer :all]
            )
  (:import (java.io File)))


(def create-asset-access-request-response-data
  {
   (ds/opt :exceptions) (s/coll-of create-asset-access-request-error-message-inner-spec)
   (ds/opt :invites) (s/map-of string? string?)
   })

(def create-asset-access-request-response-spec
  (ds/spec
    {:name ::create-asset-access-request-response
     :spec create-asset-access-request-response-data}))
