(ns pinterest-rest-api.specs.update-business-memberships-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-membership-member :refer :all]
            )
  (:import (java.io File)))


(def update-business-memberships-response-data
  {
   (ds/opt :items) (s/coll-of business-membership-member-spec)
   })

(def update-business-memberships-response-spec
  (ds/spec
    {:name ::update-business-memberships-response
     :spec update-business-memberships-response-data}))
