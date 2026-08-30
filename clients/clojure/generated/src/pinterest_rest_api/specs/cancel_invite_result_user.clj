(ns pinterest-rest-api.specs.cancel-invite-result-user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cancel-invite-result-user-data
  {
   (ds/opt :email) string?
   (ds/opt :id) string?
   (ds/opt :username) string?
   })

(def cancel-invite-result-user-spec
  (ds/spec
    {:name ::cancel-invite-result-user
     :spec cancel-invite-result-user-data}))
