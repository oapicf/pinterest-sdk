(ns pinterest-rest-api.specs.label-bulk-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def label-bulk-update-request-data
  {
   (ds/req :id) string?
   (ds/opt :status) string?
   (ds/opt :value) string?
   })

(def label-bulk-update-request-spec
  (ds/spec
    {:name ::label-bulk-update-request
     :spec label-bulk-update-request-data}))
