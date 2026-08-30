(ns pinterest-rest-api.specs.cancel-invite-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-data-response :refer :all]
            [pinterest-rest-api.specs.cancel-invite-result-user :refer :all]
            )
  (:import (java.io File)))


(def cancel-invite-result-data
  {
   (ds/opt :id) string?
   (ds/opt :invite_data) invite-data-response-spec
   (ds/opt :is_received_invite) boolean?
   (ds/opt :user) cancel-invite-result-user-spec
   })

(def cancel-invite-result-spec
  (ds/spec
    {:name ::cancel-invite-result
     :spec cancel-invite-result-data}))
