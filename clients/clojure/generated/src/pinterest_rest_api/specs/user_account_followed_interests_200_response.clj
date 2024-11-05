(ns pinterest-rest-api.specs.user-account-followed-interests-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.interest :refer :all]
            )
  (:import (java.io File)))


(def user-account-followed-interests-200-response-data
  {
   (ds/req :items) (s/coll-of interest-spec)
   (ds/opt :bookmark) string?
   })

(def user-account-followed-interests-200-response-spec
  (ds/spec
    {:name ::user-account-followed-interests-200-response
     :spec user-account-followed-interests-200-response-data}))
