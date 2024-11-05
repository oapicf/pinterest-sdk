(ns pinterest-rest-api.specs.conversion-tag-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-tag-response :refer :all]
            )
  (:import (java.io File)))


(def conversion-tag-list-response-data
  {
   (ds/opt :items) (s/coll-of conversion-tag-response-spec)
   })

(def conversion-tag-list-response-spec
  (ds/spec
    {:name ::conversion-tag-list-response
     :spec conversion-tag-list-response-data}))
