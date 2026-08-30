(ns pinterest-rest-api.specs.invite-data-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-data-response-data
  {
   (ds/opt :invite_expiration) int?
   (ds/opt :invite_status) string?
   (ds/opt :invite_type) string?
   (ds/opt :last_updated_time) int?
   (ds/opt :sent_at) int?
   })

(def invite-data-response-spec
  (ds/spec
    {:name ::invite-data-response
     :spec invite-data-response-data}))
