(ns pinterest-rest-api.specs.bid-options-app-type-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-options-app-type-multipliers-data
  {
   (ds/opt :android_mobile) float?
   (ds/opt :android_tablet) float?
   (ds/opt :ipad) float?
   (ds/opt :iphone) float?
   (ds/opt :web) float?
   (ds/opt :web_mobile) float?
   })

(def bid-options-app-type-multipliers-spec
  (ds/spec
    {:name ::bid-options-app-type-multipliers
     :spec bid-options-app-type-multipliers-data}))
