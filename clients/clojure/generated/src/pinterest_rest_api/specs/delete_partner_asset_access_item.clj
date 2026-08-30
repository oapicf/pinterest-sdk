(ns pinterest-rest-api.specs.delete-partner-asset-access-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-partner-asset-access-item-data
  {
   (ds/req :asset_id) string?
   (ds/req :partner_id) string?
   (ds/opt :partner_type) string?
   })

(def delete-partner-asset-access-item-spec
  (ds/spec
    {:name ::delete-partner-asset-access-item
     :spec delete-partner-asset-access-item-data}))
