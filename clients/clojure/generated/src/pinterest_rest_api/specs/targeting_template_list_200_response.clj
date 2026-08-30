(ns pinterest-rest-api.specs.targeting-template-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-template :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of targeting-template-spec)
   })

(def targeting-template-list-200-response-spec
  (ds/spec
    {:name ::targeting-template-list-200-response
     :spec targeting-template-list-200-response-data}))
