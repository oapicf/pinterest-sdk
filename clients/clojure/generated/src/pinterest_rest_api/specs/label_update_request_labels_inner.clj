(ns pinterest-rest-api.specs.label-update-request-labels-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-status :refer :all]
            )
  (:import (java.io File)))


(def label-update-request-labels-inner-data
  {
   (ds/req :id) string?
   (ds/opt :status) label-status-spec
   (ds/opt :value) string?
   })

(def label-update-request-labels-inner-spec
  (ds/spec
    {:name ::label-update-request-labels-inner
     :spec label-update-request-labels-inner-data}))
