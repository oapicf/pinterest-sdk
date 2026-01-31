(ns pinterest-rest-api.specs.search-user-pins-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def search-user-pins-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of pin-spec)
   })

(def search-user-pins-list-200-response-spec
  (ds/spec
    {:name ::search-user-pins-list-200-response
     :spec search-user-pins-list-200-response-data}))
