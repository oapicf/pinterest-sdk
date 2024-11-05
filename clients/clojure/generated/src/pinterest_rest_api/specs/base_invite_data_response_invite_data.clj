(ns pinterest-rest-api.specs.base-invite-data-response-invite-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def base-invite-data-response-invite-data-data
  {
   (ds/opt :invite_expiration) int?
   (ds/opt :invite_status) string?
   (ds/opt :invite_type) string?
   (ds/opt :last_updated_time) int?
   (ds/opt :sent_at) int?
   })

(def base-invite-data-response-invite-data-spec
  (ds/spec
    {:name ::base-invite-data-response-invite-data
     :spec base-invite-data-response-invite-data-data}))
