(ns pinterest-rest-api.specs.bid-floor-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bid-floor-spec :refer :all]
            [pinterest-rest-api.specs.targeting-spec :refer :all]
            )
  (:import (java.io File)))


(def bid-floor-request-data
  {
   (ds/req :bid_floor_specs) (s/coll-of bid-floor-spec-spec)
   (ds/opt :targeting_spec) targeting-spec-spec
   })

(def bid-floor-request-spec
  (ds/spec
    {:name ::bid-floor-request
     :spec bid-floor-request-data}))
