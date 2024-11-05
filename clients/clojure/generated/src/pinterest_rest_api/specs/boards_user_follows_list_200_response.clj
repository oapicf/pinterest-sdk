(ns pinterest-rest-api.specs.boards-user-follows-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board :refer :all]
            )
  (:import (java.io File)))


(def boards-user-follows-list-200-response-data
  {
   (ds/req :items) (s/coll-of board-spec)
   (ds/opt :bookmark) string?
   })

(def boards-user-follows-list-200-response-spec
  (ds/spec
    {:name ::boards-user-follows-list-200-response
     :spec boards-user-follows-list-200-response-data}))
