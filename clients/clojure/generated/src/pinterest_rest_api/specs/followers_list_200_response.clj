(ns pinterest-rest-api.specs.followers-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-summary :refer :all]
            )
  (:import (java.io File)))


(def followers-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of user-summary-spec)
   })

(def followers-list-200-response-spec
  (ds/spec
    {:name ::followers-list-200-response
     :spec followers-list-200-response-data}))
