(ns pinterest-rest-api.specs.invite-exception-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-exception-response-data
  {
   (ds/opt :invite_or_request_id) string?
   (ds/opt :code) int?
   (ds/opt :message) string?
   (ds/opt :users_or_partner_ids) (s/coll-of string?)
   })

(def invite-exception-response-spec
  (ds/spec
    {:name ::invite-exception-response
     :spec invite-exception-response-data}))
