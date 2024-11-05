(ns pinterest-rest-api.specs.boards-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board :refer :all]
            )
  (:import (java.io File)))


(def boards-list-200-response-data
  {
   (ds/req :items) (s/coll-of board-spec)
   (ds/opt :bookmark) string?
   })

(def boards-list-200-response-spec
  (ds/spec
    {:name ::boards-list-200-response
     :spec boards-list-200-response-data}))
