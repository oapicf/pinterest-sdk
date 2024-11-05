(ns pinterest-rest-api.specs.user-websites-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-website-summary :refer :all]
            )
  (:import (java.io File)))


(def user-websites-get-200-response-data
  {
   (ds/req :items) (s/coll-of user-website-summary-spec)
   (ds/opt :bookmark) string?
   })

(def user-websites-get-200-response-spec
  (ds/spec
    {:name ::user-websites-get-200-response
     :spec user-websites-get-200-response-data}))
