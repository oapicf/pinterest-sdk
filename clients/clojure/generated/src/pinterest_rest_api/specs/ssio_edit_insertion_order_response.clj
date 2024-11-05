(ns pinterest-rest-api.specs.ssio-edit-insertion-order-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-edit-insertion-order-response-data
  {
   (ds/opt :pin_order_id) string?
   })

(def ssio-edit-insertion-order-response-spec
  (ds/spec
    {:name ::ssio-edit-insertion-order-response
     :spec ssio-edit-insertion-order-response-data}))
