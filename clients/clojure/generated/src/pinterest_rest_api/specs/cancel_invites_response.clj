(ns pinterest-rest-api.specs.cancel-invites-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.cancel-invite-result-item :refer :all]
            )
  (:import (java.io File)))


(def cancel-invites-response-data
  {
   (ds/opt :items) (s/coll-of cancel-invite-result-item-spec)
   })

(def cancel-invites-response-spec
  (ds/spec
    {:name ::cancel-invites-response
     :spec cancel-invites-response-data}))
