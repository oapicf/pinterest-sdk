(ns pinterest-rest-api.specs.get-business-employers-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-business-role-binding :refer :all]
            )
  (:import (java.io File)))


(def get-business-employers-200-response-data
  {
   (ds/req :items) (s/coll-of user-business-role-binding-spec)
   (ds/opt :bookmark) string?
   })

(def get-business-employers-200-response-spec
  (ds/spec
    {:name ::get-business-employers-200-response
     :spec get-business-employers-200-response-data}))
