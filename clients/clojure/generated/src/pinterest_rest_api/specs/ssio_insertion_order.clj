(ns pinterest-rest-api.specs.ssio-insertion-order
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-insertion-order-data
  {
   (ds/opt :pin_order_id) string?
   })

(def ssio-insertion-order-spec
  (ds/spec
    {:name ::ssio-insertion-order
     :spec ssio-insertion-order-data}))
