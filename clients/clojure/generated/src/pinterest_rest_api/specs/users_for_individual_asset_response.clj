(ns pinterest-rest-api.specs.users-for-individual-asset-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def users-for-individual-asset-response-data
  {
   (ds/opt :asset_id) string?
   (ds/opt :member_id) string?
   (ds/opt :permissions) (s/coll-of string?)
   })

(def users-for-individual-asset-response-spec
  (ds/spec
    {:name ::users-for-individual-asset-response
     :spec users-for-individual-asset-response-data}))
