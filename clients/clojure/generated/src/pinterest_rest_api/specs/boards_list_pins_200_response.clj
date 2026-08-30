(ns pinterest-rest-api.specs.boards-list-pins-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-read :refer :all]
            )
  (:import (java.io File)))


(def boards-list-pins-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of pin-read-spec)
   })

(def boards-list-pins-200-response-spec
  (ds/spec
    {:name ::boards-list-pins-200-response
     :spec boards-list-pins-200-response-data}))
