(ns pinterest-rest-api.specs.boards-list-pins-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def boards-list-pins-200-response-data
  {
   (ds/req :items) (s/coll-of pin-spec)
   (ds/opt :bookmark) string?
   })

(def boards-list-pins-200-response-spec
  (ds/spec
    {:name ::boards-list-pins-200-response
     :spec boards-list-pins-200-response-data}))
