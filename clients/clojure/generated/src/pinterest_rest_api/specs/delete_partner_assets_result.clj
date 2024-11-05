(ns pinterest-rest-api.specs.delete-partner-assets-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-partner-assets-result-data
  {
   (ds/opt :asset_id) string?
   (ds/opt :asset_type) string?
   (ds/opt :permissions) (s/coll-of string?)
   (ds/opt :is_shared_partner) boolean?
   (ds/opt :partner_id) string?
   })

(def delete-partner-assets-result-spec
  (ds/spec
    {:name ::delete-partner-assets-result
     :spec delete-partner-assets-result-data}))
