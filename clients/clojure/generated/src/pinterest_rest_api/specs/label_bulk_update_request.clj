(ns pinterest-rest-api.specs.label-bulk-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-status-bulk-update :refer :all]
            )
  (:import (java.io File)))


(def label-bulk-update-request-data
  {
   (ds/req :id) string?
   (ds/req :parent_id) string?
   (ds/req :status) label-status-bulk-update-spec
   })

(def label-bulk-update-request-spec
  (ds/spec
    {:name ::label-bulk-update-request
     :spec label-bulk-update-request-data}))
