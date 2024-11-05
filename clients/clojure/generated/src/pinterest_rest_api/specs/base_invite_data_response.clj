(ns pinterest-rest-api.specs.base-invite-data-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.base-invite-data-response-invite-data :refer :all]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            )
  (:import (java.io File)))


(def base-invite-data-response-data
  {
   (ds/opt :id) string?
   (ds/opt :invite_data) base-invite-data-response-invite-data-spec
   (ds/opt :is_received_invite) boolean?
   (ds/opt :user) business-access-user-summary-spec
   })

(def base-invite-data-response-spec
  (ds/spec
    {:name ::base-invite-data-response
     :spec base-invite-data-response-data}))
