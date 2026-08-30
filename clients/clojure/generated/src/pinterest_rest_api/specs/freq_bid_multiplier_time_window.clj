(ns pinterest-rest-api.specs.freq-bid-multiplier-time-window
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def freq-bid-multiplier-time-window-data
  {
   })

(def freq-bid-multiplier-time-window-spec
  (ds/spec
    {:name ::freq-bid-multiplier-time-window
     :spec freq-bid-multiplier-time-window-data}))
