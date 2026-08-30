(ns pinterest-rest-api.specs.delete-partner-asset-access-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-partner-asset-access-result-data
  {
   (ds/opt :asset_id) string?
   (ds/opt :asset_type) string?
   (ds/opt :is_shared_partner) boolean?
   (ds/opt :partner_id) string?
   (ds/opt :permissions) (s/coll-of string?)
   })

(def delete-partner-asset-access-result-spec
  (ds/spec
    {:name ::delete-partner-asset-access-result
     :spec delete-partner-asset-access-result-data}))
