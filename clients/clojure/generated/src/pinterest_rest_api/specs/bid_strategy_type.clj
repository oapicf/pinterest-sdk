(ns pinterest-rest-api.specs.bid-strategy-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-strategy-type-data
  {
   })

(def bid-strategy-type-spec
  (ds/spec
    {:name ::bid-strategy-type
     :spec bid-strategy-type-data}))
