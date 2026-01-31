(ns pinterest-rest-api.specs.asset-group-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            )
  (:import (java.io File)))


(def asset-group-binding-data
  {
   (ds/opt :ad_accounts_ids) (s/coll-of string?)
   (ds/opt :asset_group_description) string?
   (ds/opt :asset_group_name) string?
   (ds/opt :asset_group_types) (s/coll-of string?)
   (ds/opt :catalogs_ids) (s/coll-of string?)
   (ds/opt :created_by) business-access-user-summary-spec
   (ds/opt :created_time) int?
   (ds/opt :id) string?
   (ds/opt :owner) business-access-user-summary-spec
   (ds/opt :profiles_ids) (s/coll-of string?)
   (ds/opt :updated_time) int?
   })

(def asset-group-binding-spec
  (ds/spec
    {:name ::asset-group-binding
     :spec asset-group-binding-data}))
