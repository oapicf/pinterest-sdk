(ns pinterest-rest-api.specs.create-asset-access-request-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.create-asset-access-request-item :refer :all]
            )
  (:import (java.io File)))


(def create-asset-access-request-body-data
  {
   (ds/req :asset_requests) (s/coll-of create-asset-access-request-item-spec)
   })

(def create-asset-access-request-body-spec
  (ds/spec
    {:name ::create-asset-access-request-body
     :spec create-asset-access-request-body-data}))
