(ns pinterest-rest-api.specs.bid-floor-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bid-floor-spec :refer :all]
            [pinterest-rest-api.specs.targeting-spec-optimal :refer :all]
            )
  (:import (java.io File)))


(def bid-floor-create-data
  {
   (ds/req :bid_floor_specs) (s/coll-of bid-floor-spec-spec)
   (ds/opt :targeting_spec) targeting-spec-optimal-spec
   })

(def bid-floor-create-spec
  (ds/spec
    {:name ::bid-floor-create
     :spec bid-floor-create-data}))
