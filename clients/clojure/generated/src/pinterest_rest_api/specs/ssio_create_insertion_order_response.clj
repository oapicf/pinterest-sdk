(ns pinterest-rest-api.specs.ssio-create-insertion-order-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-create-insertion-order-response-data
  {
   (ds/opt :pin_order_id) string?
   })

(def ssio-create-insertion-order-response-spec
  (ds/spec
    {:name ::ssio-create-insertion-order-response
     :spec ssio-create-insertion-order-response-data}))
