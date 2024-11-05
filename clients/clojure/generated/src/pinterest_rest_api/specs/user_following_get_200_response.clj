(ns pinterest-rest-api.specs.user-following-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-summary :refer :all]
            )
  (:import (java.io File)))


(def user-following-get-200-response-data
  {
   (ds/req :items) (s/coll-of user-summary-spec)
   (ds/opt :bookmark) string?
   })

(def user-following-get-200-response-spec
  (ds/spec
    {:name ::user-following-get-200-response
     :spec user-following-get-200-response-data}))
