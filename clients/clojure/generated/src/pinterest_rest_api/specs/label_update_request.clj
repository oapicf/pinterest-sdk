(ns pinterest-rest-api.specs.label-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-update-item :refer :all]
            )
  (:import (java.io File)))


(def label-update-request-data
  {
   (ds/req :labels) (s/coll-of label-update-item-spec)
   })

(def label-update-request-spec
  (ds/spec
    {:name ::label-update-request
     :spec label-update-request-data}))
