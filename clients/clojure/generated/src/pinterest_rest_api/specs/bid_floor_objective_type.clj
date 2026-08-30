(ns pinterest-rest-api.specs.bid-floor-objective-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-floor-objective-type-data
  {
   })

(def bid-floor-objective-type-spec
  (ds/spec
    {:name ::bid-floor-objective-type
     :spec bid-floor-objective-type-data}))
