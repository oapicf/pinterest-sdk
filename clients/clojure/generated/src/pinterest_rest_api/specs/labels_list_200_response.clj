(ns pinterest-rest-api.specs.labels-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label :refer :all]
            )
  (:import (java.io File)))


(def labels-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of label-spec)
   })

(def labels-list-200-response-spec
  (ds/spec
    {:name ::labels-list-200-response
     :spec labels-list-200-response-data}))
