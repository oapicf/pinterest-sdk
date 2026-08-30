(ns pinterest-rest-api.specs.delete-business-membership-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-business-membership-member :refer :all]
            )
  (:import (java.io File)))


(def delete-business-membership-body-data
  {
   (ds/req :members) (s/coll-of delete-business-membership-member-spec)
   })

(def delete-business-membership-body-spec
  (ds/spec
    {:name ::delete-business-membership-body
     :spec delete-business-membership-body-data}))
