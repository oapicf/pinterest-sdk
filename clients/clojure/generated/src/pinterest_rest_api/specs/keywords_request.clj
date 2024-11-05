(ns pinterest-rest-api.specs.keywords-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keywords-common :refer :all]
            )
  (:import (java.io File)))


(def keywords-request-data
  {
   (ds/req :keywords) (s/coll-of keywords-common-spec)
   (ds/req :parent_id) string?
   })

(def keywords-request-spec
  (ds/spec
    {:name ::keywords-request
     :spec keywords-request-data}))
