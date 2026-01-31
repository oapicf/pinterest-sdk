(ns pinterest-rest-api.specs.get-business-partners-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-business-role-binding :refer :all]
            )
  (:import (java.io File)))


(def get-business-partners-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of user-business-role-binding-spec)
   })

(def get-business-partners-200-response-spec
  (ds/spec
    {:name ::get-business-partners-200-response
     :spec get-business-partners-200-response-data}))
