(ns pinterest-rest-api.specs.bid-floor
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-floor-data
  {
   (ds/opt :bid_floors) (s/coll-of int?)
   (ds/opt :type) string?
   })

(def bid-floor-spec
  (ds/spec
    {:name ::bid-floor
     :spec bid-floor-data}))
