(ns pinterest-rest-api.specs.shared-audience-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.role :refer :all]
            )
  (:import (java.io File)))


(def shared-audience-response-data
  {
   (ds/opt :audience_id) string?
   (ds/opt :permissions) (s/coll-of role-spec)
   (ds/opt :recipient_account_ids) (s/coll-of string?)
   })

(def shared-audience-response-spec
  (ds/spec
    {:name ::shared-audience-response
     :spec shared-audience-response-data}))
