(ns pinterest-rest-api.specs.order-line-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-line-status-data
  {
   })

(def order-line-status-spec
  (ds/spec
    {:name ::order-line-status
     :spec order-line-status-data}))
