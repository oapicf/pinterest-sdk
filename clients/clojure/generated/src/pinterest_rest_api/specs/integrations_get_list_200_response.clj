(ns pinterest-rest-api.specs.integrations-get-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.integration-record :refer :all]
            )
  (:import (java.io File)))


(def integrations-get-list-200-response-data
  {
   (ds/req :items) (s/coll-of integration-record-spec)
   (ds/opt :bookmark) string?
   })

(def integrations-get-list-200-response-spec
  (ds/spec
    {:name ::integrations-get-list-200-response
     :spec integrations-get-list-200-response-data}))
