(ns pinterest-rest-api.specs.delete-business-membership-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-business-membership-200-response-data
  {
   (ds/opt :deleted_members) (s/coll-of string?)
   })

(def delete-business-membership-200-response-spec
  (ds/spec
    {:name ::delete-business-membership-200-response
     :spec delete-business-membership-200-response-data}))
