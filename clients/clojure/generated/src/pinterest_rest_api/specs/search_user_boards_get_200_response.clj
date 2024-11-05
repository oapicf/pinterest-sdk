(ns pinterest-rest-api.specs.search-user-boards-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board :refer :all]
            )
  (:import (java.io File)))


(def search-user-boards-get-200-response-data
  {
   (ds/req :items) (s/coll-of board-spec)
   (ds/opt :bookmark) string?
   })

(def search-user-boards-get-200-response-spec
  (ds/spec
    {:name ::search-user-boards-get-200-response
     :spec search-user-boards-get-200-response-data}))
