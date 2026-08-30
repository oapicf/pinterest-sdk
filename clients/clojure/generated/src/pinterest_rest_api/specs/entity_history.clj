(ns pinterest-rest-api.specs.entity-history
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-data-change-history :refer :all]
            [pinterest-rest-api.specs.change-history-operation-type :refer :all]
            )
  (:import (java.io File)))


(def entity-history-data
  {
   (ds/opt :change_timestamp) int?
   (ds/opt :data_changes) (s/coll-of entity-data-change-history-spec)
   (ds/opt :entity_id) string?
   (ds/opt :entity_name) string?
   (ds/opt :ldap) string?
   (ds/opt :operation) change-history-operation-type-spec
   (ds/opt :user_id) string?
   })

(def entity-history-spec
  (ds/spec
    {:name ::entity-history
     :spec entity-history-data}))
