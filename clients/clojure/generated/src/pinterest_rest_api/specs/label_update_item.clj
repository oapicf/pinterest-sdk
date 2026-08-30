(ns pinterest-rest-api.specs.label-update-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-status :refer :all]
            )
  (:import (java.io File)))


(def label-update-item-data
  {
   (ds/req :id) string?
   (ds/opt :status) label-status-spec
   (ds/opt :value) string?
   })

(def label-update-item-spec
  (ds/spec
    {:name ::label-update-item
     :spec label-update-item-data}))
