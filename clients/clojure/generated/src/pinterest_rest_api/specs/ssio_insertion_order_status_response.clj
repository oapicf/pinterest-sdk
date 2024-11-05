(ns pinterest-rest-api.specs.ssio-insertion-order-status-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-insertion-order-status-response-data
  {
   (ds/opt :pin_order_id) string?
   (ds/opt :status) string?
   (ds/opt :creation_time) string?
   })

(def ssio-insertion-order-status-response-spec
  (ds/spec
    {:name ::ssio-insertion-order-status-response
     :spec ssio-insertion-order-status-response-data}))
