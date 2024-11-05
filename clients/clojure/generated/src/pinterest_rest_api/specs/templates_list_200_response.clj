(ns pinterest-rest-api.specs.templates-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.template-response :refer :all]
            )
  (:import (java.io File)))


(def templates-list-200-response-data
  {
   (ds/req :items) (s/coll-of template-response-spec)
   (ds/opt :bookmark) string?
   })

(def templates-list-200-response-spec
  (ds/spec
    {:name ::templates-list-200-response
     :spec templates-list-200-response-data}))
