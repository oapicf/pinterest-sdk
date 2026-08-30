(ns pinterest-rest-api.specs.cancel-invite-exception
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cancel-invite-exception-data
  {
   (ds/opt :invite_id) string?
   (ds/opt :message) string?
   })

(def cancel-invite-exception-spec
  (ds/spec
    {:name ::cancel-invite-exception
     :spec cancel-invite-exception-data}))
