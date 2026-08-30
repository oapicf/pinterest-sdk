(ns pinterest-rest-api.specs.items-post-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-response :refer :all]
            )
  (:import (java.io File)))


(def items-post-200-response-data
  {
   (ds/req :items) (s/coll-of item-response-spec)
   })

(def items-post-200-response-spec
  (ds/spec
    {:name ::items-post-200-response
     :spec items-post-200-response-data}))
