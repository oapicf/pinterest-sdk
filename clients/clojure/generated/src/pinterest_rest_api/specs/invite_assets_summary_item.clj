(ns pinterest-rest-api.specs.invite-assets-summary-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-assets-summary-item-data
  {
   (ds/opt :id) string?
   (ds/opt :permissions) (s/coll-of string?)
   })

(def invite-assets-summary-item-spec
  (ds/spec
    {:name ::invite-assets-summary-item
     :spec invite-assets-summary-item-data}))
