(ns pinterest-rest-api.specs.label-bulk-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-create-item :refer :all]
            )
  (:import (java.io File)))


(def label-bulk-create-request-data
  {
   (ds/req :labels) (s/coll-of label-create-item-spec)
   (ds/req :parent_id) string?
   })

(def label-bulk-create-request-spec
  (ds/spec
    {:name ::label-bulk-create-request
     :spec label-bulk-create-request-data}))
