(ns pinterest-rest-api.specs.asset-group-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            )
  (:import (java.io File)))


(def asset-group-binding-data
  {
   (ds/req :ad_accounts_ids) (s/coll-of string?)
   (ds/req :asset_group_description) string?
   (ds/req :asset_group_name) string?
   (ds/req :asset_group_types) (s/coll-of string?)
   (ds/req :catalogs_ids) (s/coll-of string?)
   (ds/req :created_by) business-access-user-summary-spec
   (ds/req :created_time) int?
   (ds/req :id) string?
   (ds/req :owner) business-access-user-summary-spec
   (ds/req :profiles_ids) (s/coll-of string?)
   (ds/req :updated_time) int?
   })

(def asset-group-binding-spec
  (ds/spec
    {:name ::asset-group-binding
     :spec asset-group-binding-data}))
